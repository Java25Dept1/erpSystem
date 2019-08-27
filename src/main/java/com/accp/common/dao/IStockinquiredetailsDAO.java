package com.accp.common.dao;

import com.accp.common.pojo.Stockinquiredetails;

public interface IStockinquiredetailsDAO {

    int insert(Stockinquiredetails record);

    int insertSelective(Stockinquiredetails record);


    int updateByPrimaryKeySelective(Stockinquiredetails record);

    int updateByPrimaryKey(Stockinquiredetails record);
}