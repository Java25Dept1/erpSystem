package com.accp.common.dao;

import com.accp.common.pojo.Advancegather;

public interface IAdvancegatherDAO {
    int deleteByPrimaryKey(String adcid);

    int insert(Advancegather record);

    int insertSelective(Advancegather record);

    Advancegather selectByPrimaryKey(String adcid);

    int updateByPrimaryKeySelective(Advancegather record);

    int updateByPrimaryKey(Advancegather record);
}