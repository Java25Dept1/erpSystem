package com.accp.common.dao;

import com.accp.common.pojo.Orderdetails;

public interface IOrderdetailsDAO {

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);


    int updateByPrimaryKeySelective(Orderdetails record);

    int updateByPrimaryKey(Orderdetails record);
}