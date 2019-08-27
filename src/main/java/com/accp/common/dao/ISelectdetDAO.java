package com.accp.common.dao;

import com.accp.common.pojo.Selectdet;

public interface ISelectdetDAO {

    int insert(Selectdet record);

    int insertSelective(Selectdet record);


    int updateByPrimaryKeySelective(Selectdet record);

    int updateByPrimaryKey(Selectdet record);
}