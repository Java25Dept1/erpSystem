package com.accp.common.dao;

import com.accp.common.pojo.Stockorder;

public interface IStockorderDAO {
    int deleteByPrimaryKey(String stoid);

    int insert(Stockorder record);

    int insertSelective(Stockorder record);

    Stockorder selectByPrimaryKey(String stoid);

    int updateByPrimaryKeySelective(Stockorder record);

    int updateByPrimaryKey(Stockorder record);
}