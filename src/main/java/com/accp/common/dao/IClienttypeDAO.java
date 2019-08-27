package com.accp.common.dao;

import com.accp.common.pojo.Clienttype;

public interface IClienttypeDAO {
    int deleteByPrimaryKey(String clitypeid);

    int insert(Clienttype record);

    int insertSelective(Clienttype record);

    Clienttype selectByPrimaryKey(String clitypeid);

    int updateByPrimaryKeySelective(Clienttype record);

    int updateByPrimaryKey(Clienttype record);
}