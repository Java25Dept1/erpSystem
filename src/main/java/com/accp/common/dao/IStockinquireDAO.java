package com.accp.common.dao;

import com.accp.common.pojo.Stockinquire;

public interface IStockinquireDAO {
    int deleteByPrimaryKey(String stoid);

    int insert(Stockinquire record);

    int insertSelective(Stockinquire record);

    Stockinquire selectByPrimaryKey(String stoid);

    int updateByPrimaryKeySelective(Stockinquire record);

    int updateByPrimaryKey(Stockinquire record);
}