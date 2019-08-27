package com.accp.common.dao;

import com.accp.common.pojo.Stockrecede;

public interface IStockrecedeDAO {
    int deleteByPrimaryKey(String recid);

    int insert(Stockrecede record);

    int insertSelective(Stockrecede record);

    Stockrecede selectByPrimaryKey(String recid);

    int updateByPrimaryKeySelective(Stockrecede record);

    int updateByPrimaryKey(Stockrecede record);
}