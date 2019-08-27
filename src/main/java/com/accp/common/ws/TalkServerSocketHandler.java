package com.accp.common.ws;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component //代表组件，交给spring进行管理，相当于controller
@ServerEndpoint("/ws/talk/{username}") //地址  username只能在open中获取
public class TalkServerSocketHandler {
	
	private final static Map<String, Session> userMap = new ConcurrentHashMap<String, Session>();//同步锁机制 
	
	
	@OnOpen //建立连接
	public void onOpen(@PathParam("username") String username, Session session) {
		System.out.println("接受一个客户端：" + session.getId());
		userMap.put(username, session);
	}
	
	@OnClose  //关闭连接
	public void onClose(@PathParam("username") String username, Session session) {
		System.out.println("丢失一个客户端：" + session.getId());
		userMap.remove(username);
	}
	
	@OnMessage  //参数位置很重要，不能错，先放String 然后放session
	public void onMessage(@PathParam("username") String username, String msg, Session session) {
		if("ping".equals(msg)) {
			return;
		}
		
		System.out.println("接受一个客户端【"+session.getId()+"】信息：" + msg);
		//回复信息
		//获得同步回复（失败会报异常）
		try {
//			if(msg.indexOf("装备") != -1) {
//				session.getBasicRemote().sendText("天星科技公司客服为您服务,装备可以打造！");
//			}else if(msg.indexOf("sa") != -1) {
//				session.getBasicRemote().sendText("天星科技公司客服为您服务,你才傻哦！");
//			}else if(msg.indexOf("充值") != -1) {
//				session.getBasicRemote().sendText("天星科技公司客服为您服务,支持微信支付宝和银行卡！");
//			}else {
//				session.getBasicRemote().sendText("天星科技公司客服为您服务,请说出关键词！");
//			}
//			session.getBasicRemote().sendText("天星科技公司客服为您服务！");
			
			if(msg.lastIndexOf("#") != -1) {
				String cnts[] = msg.split("#");
				this.sendAllUsers(cnts[0], username);
			}if(msg.lastIndexOf("@") != -1) {
				String cnts[] = msg.split("@");
				for (int i = 1; i < cnts.length; i++) {
					this.sendUser(cnts[0], cnts[i], username);
				}
				
			}else {
				Map<String, String> map = new HashMap<String, String>();
				map.put("user", "天星科技公司客服");
				map.put("msg", "天星科技公司客服为您服务！");
				session.getBasicRemote().sendText(JSON.toJSONString(map));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	/**
	 * 单独@某人
	 * @param msg
	 * @param username
	 * @param user
	 */
	private void sendUser(String msg, String username, String user) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user", user);
		map.put("msg", msg);
		try {
			userMap.get(username).getBasicRemote().sendText(JSON.toJSONString(map));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return;
		}
	
	}
	
	/**
	 * 群发消息
	 * @param msg
	 * @param user
	 */
	private void sendAllUsers(String msg, String user) {
		for (Session s : userMap.values()) {
			try {
				Map<String, String> map = new HashMap<String, String>();
				map.put("user", user);
				map.put("msg", msg);
				s.getBasicRemote().sendText(JSON.toJSONString(map));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
	}

}
