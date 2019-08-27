package com.accp.common.dao;

import com.accp.common.pojo.Stockstoragetable;

public interface IStockstoragetableDAO {
    int deleteByPrimaryKey(String stockstorageno);

    int insert(Stockstoragetable record);

    int insertSelective(Stockstoragetable record);

    Stockstoragetable selectByPrimaryKey(String stockstorageno);

    int updateByPrimaryKeySelective(Stockstoragetable record);

    int updateByPrimaryKey(Stockstoragetable record);
}