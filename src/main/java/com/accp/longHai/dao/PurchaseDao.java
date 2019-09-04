package com.accp.longHai.dao;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Select;

import com.accp.longHai.pojo.DepttabPojo;
import com.accp.longHai.pojo.EmployeePojo;
import com.accp.longHai.pojo.MaterielPojo;
import com.accp.longHai.pojo.MaterieltypePojo;

/**
 * @program: erp->PurchaseDao
 * @description: 采购请购单
 * @author(作者): Charon
 * @create: 2019-08-29 22:41
 **/
public interface PurchaseDao {
    List<DepttabPojo> findDepttabPojos();
    List<EmployeePojo> findEmployeePojos();
    @Select("SELECT appid FROM `stockapply` ORDER BY appid DESC LIMIT 1")
    String findAppid();
    @Select("SELECT * FROM Materieltype")
    List<MaterieltypePojo> findMaterieltypePojos();
    List<MaterielPojo> findOnMaterielPojos(@PathParam("one") String one);
}
