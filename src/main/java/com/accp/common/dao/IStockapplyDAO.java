package com.accp.common.dao;

import com.accp.common.pojo.Stockapply;

public interface IStockapplyDAO {
    int deleteByPrimaryKey(String appid);

    int insert(Stockapply record);

    int insertSelective(Stockapply record);

    Stockapply selectByPrimaryKey(String appid);

    int updateByPrimaryKeySelective(Stockapply record);

    int updateByPrimaryKey(Stockapply record);
}