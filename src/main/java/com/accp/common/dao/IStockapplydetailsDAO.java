package com.accp.common.dao;

import com.accp.common.pojo.Stockapplydetails;

public interface IStockapplydetailsDAO {

    int insert(Stockapplydetails record);

    int insertSelective(Stockapplydetails record);


    int updateByPrimaryKeySelective(Stockapplydetails record);

    int updateByPrimaryKey(Stockapplydetails record);
}