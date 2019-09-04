package com.accp.longHai.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.longHai.biz.PurchaseBiz;
import com.accp.longHai.pojo.DepttabPojo;
import com.accp.longHai.pojo.EmployeePojo;
import com.accp.longHai.pojo.MaterielPojo;
import com.accp.longHai.pojo.MaterieltypePojo;
import com.accp.longHai.pojo.StockapplyPojo;
import com.accp.longHai.pojo.StockapplydetailsPojo;
import com.accp.longHai.pojo.StockapplytypePojo;
import com.alibaba.fastjson.JSON;

/**
 * @program: erp->PurchaseAction
 * @description: 采购请购单
 * @author(作者): Charon
 * @create: 2019-08-29 21:12
 **/
@ResponseBody
@Controller
@CrossOrigin
@RequestMapping("/purchase")
public class PurchaseAction {
    @Autowired
    private PurchaseBiz biz;

    /**
     * @Description: 查询所有人员
     * @Param: []
     * @return: java.util.List<com.accp.erp.liqi.pojo.EmployeePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/29
     */
    @RequestMapping(value = "findEmployeePojos")
    public List<EmployeePojo> findEmployeePojos() {
        return biz.findEmployeePojos();
    }

    /**
     * @Description: 查询所有部门
     * @Param: []
     * @return: java.util.List<com.accp.erp.liqi.pojo.DepttabPojo>
     * @Author: Charon.棋
     * @Date: 2019/8/29
     */
    @RequestMapping("findDepttabPojos")
    public List<DepttabPojo> findDepttabPojos() {
        return biz.findDepttabPojos();
    }

    /**
     * @Description:带条件查询采购请购类型
     * @Param: one 类型(1编号,2名称) , tow条件(1.模糊,2.等于,3.不等于) , three值
     * @return: java.util.List<com.accp.erp.liqi.pojo.StockapplytypePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("findLikeStockapplytypePojos")
    public List<StockapplytypePojo> findLikeStockapplytypePojos(@RequestBody()String [] arr) {
        return biz.findLikeStockapplytypePojos(arr);
    }

    /**
     * @Description: 查询最后一条请购单号
     * @Param: []
     * @return: java.lang.String
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("findAppid")
    public String findAppid() {
        return biz.findAppid();
    }

    /**
     * @Description: 查询所有物料类别
     * @Param: []
     * @return: java.util.List<com.accp.erp.liqi.pojo.MaterieltypePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("findMaterieltypePojos")
    public List<MaterieltypePojo> findMaterieltypePojos() {
        return biz.findMaterieltypePojos();
    }

    /**
     * @Description: 根据物料类别id 查询物料
     * @Param: [one]>物料类别编号
     * @return: java.util.List<com.accp.erp.liqi.pojo.MaterielPojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("findOnMaterielPojos")
    public List<MaterielPojo> findOnMaterielPojos(String one) {
        return biz.findOnMaterielPojos(one);
    }


    /**
     * @Description: 新增请购表的主表
     * @Param: [stockapply]>请购单主表对象
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("addStockapply")
    public Map<String, String> addStockapply(@RequestBody StockapplyPojo stockapply) {
        Map<String, String> msg = new HashMap<>();
        try {
        	if (biz.addStockapply(stockapply) > 0) {
                msg.put("code", "200");
                msg.put("msg", "添加成功");
            } else {
                msg.put("code", "404");
                msg.put("msg", "添加失败");
            }
        } catch (Exception e) {
            msg.put("code", "500");
            msg.put("msg", "服务器错误");
        }
        return msg;
    }

    /**
     * @Description: 新增请购表的祥表
     * @Param: [StockapplydetailsPojo]>请购单祥表对象
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @RequestMapping("addStockapplydetails")
    public Map<String, String> addStockapplydetails(@RequestBody() StockapplydetailsPojo Stockapplydetails) {
        Map<String, String> msg = new HashMap<>();
        try {
        	System.out.println(JSON.toJSONString(Stockapplydetails));
            if (biz.addStockapplydetails(Stockapplydetails) > 0) {
                msg.put("code", "200");
                msg.put("msg", "添加成功");
            } else {
                msg.put("code", "404");
                msg.put("msg", "添加失败");
            }
        } catch (Exception e) {
            msg.put("code", "500");
            msg.put("msg", "服务器错误");
        }
        return msg;
    }

    /**
    * @Description: 修改采购请购单主表
    * @Param: [Stockapplydetails] > 主表对象包含id
    * @return: java.util.Map<java.lang.String,java.lang.String>
    * @Author: Charon.棋
    * @Date: 2019/8/30
    */
    @RequestMapping("modifyStockapply")
    public Map<String,String> modifyStockapply(StockapplyPojo stockapplyPojo){
        Map<String, String> msg = new HashMap<>();
        try {
            if(biz.modifyStockapply(stockapplyPojo) > 0){
                msg.put("code", "200");
                msg.put("msg", "修改成功");
            } else {
                msg.put("code", "404");
                msg.put("msg", "修改失败");
            }
        } catch (Exception e) {
            msg.put("code", "500");
            msg.put("msg", "服务器错误");
        }
        return msg;
    }

    /**
    * @Description:修改采购请购单的详表
    * @Param: [stockapplydetailsPojo] >>>> 祥表对象包含id
    * @return: java.util.Map<java.lang.String,java.lang.String>
    * @Author: Charon.棋
    * @Date: 2019/8/30
    */
    @RequestMapping("modifyStockapplydetails")
    public Map<String,String> modifyStockapplydetails(StockapplydetailsPojo stockapplydetailsPojo){
        Map<String,String> msg = new HashMap<>();
        try {
            if(biz.modifyStockapplydetails(stockapplydetailsPojo) > 0){
                msg.put("code", "200");
                msg.put("msg", "修改成功");
            } else {
                msg.put("code", "404");
                msg.put("msg", "修改失败");
            }
        } catch (Exception e) {
            msg.put("code", "500");
            msg.put("msg", "服务器错误");
        }
        return msg;
    }

    /**
    * @Description: 根据采购请购单编号删除采购请购单
    * @Param: [one]  >> 请购单编号
    * @return: java.util.Map<java.lang.String,java.lang.String>
    * @Author: Charon.棋
    * @Date: 2019/8/30
    */
    public Map<String,String> deleteStockapply(String one){
        Map<String,String> msg = new HashMap<>();
        try {
            if(biz.deleteStockapply(one) >0){
                msg.put("code", "200");
                msg.put("msg", "删除成功");
            } else {
                msg.put("code", "404");
                msg.put("msg", "删除失败");
            }
        } catch (Exception e) {
            msg.put("code", "500");
            msg.put("msg", "服务器错误");
        }
        return msg;
    }
}
