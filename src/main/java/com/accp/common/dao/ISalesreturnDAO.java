package com.accp.common.dao;

import com.accp.common.pojo.Salesreturn;

public interface ISalesreturnDAO {
    int deleteByPrimaryKey(String sretid);

    int insert(Salesreturn record);

    int insertSelective(Salesreturn record);

    Salesreturn selectByPrimaryKey(String sretid);

    int updateByPrimaryKeySelective(Salesreturn record);

    int updateByPrimaryKey(Salesreturn record);
}