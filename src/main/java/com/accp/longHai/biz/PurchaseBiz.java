package com.accp.longHai.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.longHai.dao.PurchaseDao;
import com.accp.longHai.dao.StockapplyPlusDao;
import com.accp.longHai.dao.StockapplydetailsPlusDao;
import com.accp.longHai.dao.StockapplytypeDao;
import com.accp.longHai.pojo.DepttabPojo;
import com.accp.longHai.pojo.EmployeePojo;
import com.accp.longHai.pojo.MaterielPojo;
import com.accp.longHai.pojo.MaterieltypePojo;
import com.accp.longHai.pojo.StockapplyPojo;
import com.accp.longHai.pojo.StockapplydetailsPojo;
import com.accp.longHai.pojo.StockapplytypePojo;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @program: erp->PurchaseBiz
 * @description: 采购请购biz
 * @author(作者): Charon
 * @create: 2019-08-29 21:39
 **/
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PurchaseBiz {
    @Resource
    private PurchaseDao dao;

    //采购请购类型表
    @Resource
    private StockapplytypeDao stockapplytypeDao;
    //采购请购主表
    @Resource
    private StockapplyPlusDao stockapplyPlusDao;
    //采购请求详表
    @Resource
    private StockapplydetailsPlusDao stockapplydetailsPlusDao;

    /**
     * @Description: 查询所有人员
     * @Param: []
     * @return: java.util.List<com.accp.longHai.pojo.EmployeePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/29
     */
    public List<EmployeePojo> findEmployeePojos() {
        return dao.findEmployeePojos();
    }

    /**
     * @Description: 查询所有部门
     * @Param: []
     * @return: java.util.List<com.accp.longHai.pojo.DepttabPojo>
     * @Author: Charon.棋
     * @Date: 2019/8/29
     */
    public List<DepttabPojo> findDepttabPojos() {
        return dao.findDepttabPojos();
    }

    /**
     * @Description:带条件查询采购请购类型
     * @Param: one 类型(1编号,2名称) , tow条件(1.模糊,2.等于,3.不等于) , three值
     * @return: java.util.List<com.accp.longHai.pojo.StockapplytypePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
   public List<StockapplytypePojo> findLikeStockapplytypePojos(String []arr) {
    	String one=arr[0];
    	String tow=arr[1];
    	String three=arr[2];
    	List<StockapplytypePojo> list = null;
        if ("1".equals(one)) {
            if ("1".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().like("reqid", three));
            } else if ("2".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().eq("reqid", three));
            } else if ("3".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().ne("reqid", three));
            }
        } else if ("2".equals(one)) {
            if ("1".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().like("reqname", three));
            } else if ("2".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().eq("reqname", three));
            } else if ("3".equals(tow)) {
                list = stockapplytypeDao.selectList(new QueryWrapper<StockapplytypePojo>().ne("reqname", three));
            }
        }
        return list;
    }

    /**
     * @Description: 查询最后一条请购单号
     * @Param: []
     * @return: java.lang.String
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    public String findAppid() {
        return dao.findAppid();
    }

    /**
     * @Description: 查询所有物料类别
     * @Param: []
     * @return: java.util.List<com.accp.longHai.pojo.MaterieltypePojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    public List<MaterieltypePojo> findMaterieltypePojos() {
        return dao.findMaterieltypePojos();
    }

    /**
     * @Description: 根据物料类别id 查询物料
     * @Param: [one]>物料类别编号
     * @return: java.util.List<com.accp.longHai.pojo.MaterielPojo>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    public List<MaterielPojo> findOnMaterielPojos(String one) {
        return dao.findOnMaterielPojos(one);
    }

    /**
     * @Description: 新增请购表的主表
     * @Param: [stockapply]>请购单主表对象
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public int addStockapply(StockapplyPojo stockapply) {
        try {
            int i = stockapplyPlusDao.insert(stockapply);
            return i;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @Description: 新增请购表的祥表
     * @Param: [StockapplydetailsPojo]>请购单祥表对象
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public int addStockapplydetails(StockapplydetailsPojo stockapplydetails) {
        try {
            int i = stockapplydetailsPlusDao.insert(stockapplydetails);
            return i;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @Description: 修改采购请购单主表
     * @Param: [Stockapplydetails] > 主表对象包含id
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public int modifyStockapply(StockapplyPojo stockapplyPojo) {
        try {
            QueryWrapper<StockapplyPojo> query = new QueryWrapper<StockapplyPojo>();
            query.lambda().eq(StockapplyPojo::getAppid, stockapplyPojo.getAppid());
            int i = stockapplyPlusDao.update(stockapplyPojo, query);
            return i;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @Description:修改采购请购单的详表
     * @Param: [stockapplydetailsPojo] >>>> 祥表对象包含id
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public int modifyStockapplydetails(StockapplydetailsPojo stockapplydetailsPojo) {
    	UpdateWrapper<StockapplydetailsPojo> qw=Wrappers.update();
    	qw.eq("appid",stockapplydetailsPojo.getAppid());
    	return stockapplydetailsPlusDao.delete(qw);
    }
    

    /**
     * @Description: 根据采购请购单编号删除采购请购单
     * @Param: [one]  >> 请购单编号
     * @return: java.util.Map<java.lang.String, java.lang.String>
     * @Author: Charon.棋
     * @Date: 2019/8/30
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public int deleteStockapply(String one) {
        //先删除详表
    	UpdateWrapper<StockapplydetailsPojo> qw=Wrappers.update();
    	qw.eq("appid",one);
        if(stockapplydetailsPlusDao.delete(qw) > 0){
            //删除主表
            return stockapplyPlusDao.deleteById(one);
        }
        return 0;
    }
    /**
     * 查询主表 (可根据编号 单况 请购类型 申请人 请购日期)
     * */
    public PageInfo<StockapplyPojo> getStockApply(Integer c,Integer s ,StockapplyPojo stockApply){
    	PageHelper.startPage(c,s);
    	//查询构造器
    	QueryWrapper<StockapplyPojo> qw=Wrappers.query();
    	qw.like(StringUtils.checkValNotNull(stockApply.getAppid()),"appid", stockApply.getAppid())
    	.eq(StringUtils.checkValNotNull( stockApply.getAppcircs()),"appcircs", stockApply.getAppcircs())
    	.like(StringUtils.checkValNotNull(stockApply.getApptype()),"apptype",stockApply.getApptype())
    	.like(StringUtils.checkValNotNull(stockApply.getApppersonid()),"Apppersonid", stockApply.getApppersonid())
    	.between(StringUtils.checkValNotNull(stockApply.getAppdate()), "Appdate", stockApply.getAppdate(),stockApply.getExtend4());
    	return new PageInfo<>(stockapplyPlusDao.selectList(qw));
    }
    /**
     * 查询详表 
     * */
    public List<StockapplydetailsPojo> getStockApplyDetails(String appid){
    	QueryWrapper<StockapplydetailsPojo> qw=Wrappers.query();
    	qw.eq("appid",appid);
    	return stockapplydetailsPlusDao.selectList(qw);
    }
}
