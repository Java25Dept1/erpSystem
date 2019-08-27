package com.accp.common.dao;

import com.accp.common.pojo.Sellorde;

public interface ISellordeDAO {
    int deleteByPrimaryKey(Integer seid);

    int insert(Sellorde record);

    int insertSelective(Sellorde record);

    Sellorde selectByPrimaryKey(Integer seid);

    int updateByPrimaryKeySelective(Sellorde record);

    int updateByPrimaryKey(Sellorde record);
}