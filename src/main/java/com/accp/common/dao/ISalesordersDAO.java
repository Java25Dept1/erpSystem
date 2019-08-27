package com.accp.common.dao;

import com.accp.common.pojo.Salesorders;

public interface ISalesordersDAO {
    int deleteByPrimaryKey(String salid);

    int insert(Salesorders record);

    int insertSelective(Salesorders record);

    Salesorders selectByPrimaryKey(String salid);

    int updateByPrimaryKeySelective(Salesorders record);

    int updateByPrimaryKey(Salesorders record);
}