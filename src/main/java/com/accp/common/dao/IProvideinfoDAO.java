package com.accp.common.dao;

import com.accp.common.pojo.Provideinfo;

public interface IProvideinfoDAO {
    int deleteByPrimaryKey(String peoid);

    int insert(Provideinfo record);

    int insertSelective(Provideinfo record);

    Provideinfo selectByPrimaryKey(String peoid);

    int updateByPrimaryKeySelective(Provideinfo record);

    int updateByPrimaryKey(Provideinfo record);
}