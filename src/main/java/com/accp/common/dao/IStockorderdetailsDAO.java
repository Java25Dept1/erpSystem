package com.accp.common.dao;

import com.accp.common.pojo.Stockorderdetails;

public interface IStockorderdetailsDAO {

    int insert(Stockorderdetails record);

    int insertSelective(Stockorderdetails record);


    int updateByPrimaryKeySelective(Stockorderdetails record);

    int updateByPrimaryKey(Stockorderdetails record);
}