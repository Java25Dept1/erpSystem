package com.accp.common.dao;

import com.accp.common.pojo.Returngoods;

public interface IReturngoodsDAO {
    int deleteByPrimaryKey(String retid);

    int insert(Returngoods record);

    int insertSelective(Returngoods record);

    Returngoods selectByPrimaryKey(String retid);

    int updateByPrimaryKeySelective(Returngoods record);

    int updateByPrimaryKey(Returngoods record);
}