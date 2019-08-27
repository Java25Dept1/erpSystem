package com.accp.common.dao;

import com.accp.common.pojo.Stockstoragedetails;

public interface IStockstoragedetailsDAO {

    int insert(Stockstoragedetails record);

    int insertSelective(Stockstoragedetails record);


    int updateByPrimaryKeySelective(Stockstoragedetails record);

    int updateByPrimaryKey(Stockstoragedetails record);
}