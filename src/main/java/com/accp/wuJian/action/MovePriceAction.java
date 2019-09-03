package com.accp.wuJian.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.common.pojo.Generalledger;
import com.accp.common.pojo.Materiel;
import com.accp.common.pojo.Minusandadddetail;
import com.accp.common.pojo.Moveprice;
import com.accp.common.pojo.Movepricedetail;
import com.accp.wuJian.biz.GeneralledgerBiz;
import com.accp.wuJian.biz.MaterielBiz;
import com.accp.wuJian.biz.MinusandadddetailBiz;
import com.accp.wuJian.biz.MovePriceBiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/MovePrice")
public class MovePriceAction {
	@Autowired
	private MovePriceBiz biz;
	@Autowired
	private MaterielBiz biz1;
	@Autowired
	private MinusandadddetailBiz biz2;
	
	@GetMapping("/selectMovePrice")
	public PageInfo<Moveprice> selectMovePrice(Integer pageNum){
		if(pageNum==0) {
			pageNum = biz.queryLastNum();
		}
		return biz.queryAll(pageNum,1);
	}
	
	@GetMapping("/deleteMovePrice")
	public void selectMovePrice(String moveorderno){
		biz.removeMovePrice(moveorderno);
	}
	
	@PostMapping("/updateMovePrice")
	public void updateMovePrice(@RequestBody Moveprice moveprice) {
		biz.modifyMovePrice(moveprice);
//		for (Movepricedetail price1 : moveprice.getDetails()) {
//			biz1.modityMateriel(price1.getMovematerielno(), price1.getMoveprice());
//			Minusandadddetail min = new Minusandadddetail();
//			min.setAftermath(price1.getMovestocks());
//			min.setMatypeid(price1.getMovematerielno());
//			min.setMatypename(price1.getMovematerielname());
//			min.setMinusaddid(price1.getMoveinile());
//			min.setMinusdate(moveprice.getMovedate());
//			min.setMoneys(price1.getMovemoveprice());
//			min.setOriginid(moveprice.getMoveorderno());
//			min.setOrigintype("调价表");
//			min.setStoid("2222");
//			min.setStoname("厦门总仓");
//			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//			try {
//				min.setStoragedate(df.parse(df.format(new Date())));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			biz2.addMinusandadddetail(min);
//		}
	}
	@PostMapping("/insertMovePrice")
	public void insertMovePrice(@RequestBody Moveprice moveprice) {
		biz.addMovePrice(moveprice);
		for (Movepricedetail price1 : moveprice.getDetails()) {
			biz1.modityMateriel(price1.getMovematerielno(), price1.getMoveprice());
			Minusandadddetail min = new Minusandadddetail();
			min.setAftermath(price1.getMovestocks());
			min.setMatypeid(price1.getMovematerielno());
			min.setMatypename(price1.getMovematerielname());
			min.setMinusaddid(price1.getMoveinile());
			min.setMinusdate(moveprice.getMovedate());
			min.setMoneys(price1.getMovemoveprice());
			min.setOriginid(moveprice.getMoveorderno());
			min.setOrigintype("调价表");
			min.setStoid("2222");
			min.setStoname("厦门总仓");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			try {
				min.setStoragedate(df.parse(df.format(new Date())));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			biz2.addMinusandadddetail(min);
		}
	}
	@GetMapping("/selectMateriel")
	public List<Materiel> selectMateriel(String name){
		return biz1.quertAllByName(name);
	}
}
