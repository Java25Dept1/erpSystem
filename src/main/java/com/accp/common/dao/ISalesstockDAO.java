package com.accp.common.dao;

import com.accp.common.pojo.Salesstock;

public interface ISalesstockDAO {
    int deleteByPrimaryKey(String stoid);

    int insert(Salesstock record);

    int insertSelective(Salesstock record);

    Salesstock selectByPrimaryKey(String stoid);

    int updateByPrimaryKeySelective(Salesstock record);

    int updateByPrimaryKey(Salesstock record);
}