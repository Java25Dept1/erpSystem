package com.accp.common.dao;

import com.accp.common.pojo.Stockapportion;

public interface IStockapportionDAO {
    int deleteByPrimaryKey(String appid);

    int insert(Stockapportion record);

    int insertSelective(Stockapportion record);

    Stockapportion selectByPrimaryKey(String appid);

    int updateByPrimaryKeySelective(Stockapportion record);

    int updateByPrimaryKey(Stockapportion record);
}