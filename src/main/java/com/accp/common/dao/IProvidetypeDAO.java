package com.accp.common.dao;

import com.accp.common.pojo.Providetype;

public interface IProvidetypeDAO {
    int deleteByPrimaryKey(String peeid);

    int insert(Providetype record);

    int insertSelective(Providetype record);

    Providetype selectByPrimaryKey(String peeid);

    int updateByPrimaryKeySelective(Providetype record);

    int updateByPrimaryKey(Providetype record);
}