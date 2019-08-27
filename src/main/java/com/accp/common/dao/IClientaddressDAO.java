package com.accp.common.dao;

import com.accp.common.pojo.Clientaddress;

public interface IClientaddressDAO {
    int deleteByPrimaryKey(String cliaddrid);

    int insert(Clientaddress record);

    int insertSelective(Clientaddress record);

    Clientaddress selectByPrimaryKey(String cliaddrid);

    int updateByPrimaryKeySelective(Clientaddress record);

    int updateByPrimaryKey(Clientaddress record);
}