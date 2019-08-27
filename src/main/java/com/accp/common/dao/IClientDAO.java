package com.accp.common.dao;

import com.accp.common.pojo.Client;

public interface IClientDAO {
    int deleteByPrimaryKey(String cliid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String cliid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}