package com.accp.common.dao;

import com.accp.common.pojo.Generalledger;

public interface IGeneralledgerDAO {

    int insert(Generalledger record);

    int insertSelective(Generalledger record);


    int updateByPrimaryKeySelective(Generalledger record);

    int updateByPrimaryKey(Generalledger record);
}