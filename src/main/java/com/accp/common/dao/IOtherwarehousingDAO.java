package com.accp.common.dao;

import com.accp.common.pojo.Otherwarehousing;

public interface IOtherwarehousingDAO {
    int deleteByPrimaryKey(String owaid);

    int insert(Otherwarehousing record);

    int insertSelective(Otherwarehousing record);

    Otherwarehousing selectByPrimaryKey(String owaid);

    int updateByPrimaryKeySelective(Otherwarehousing record);

    int updateByPrimaryKey(Otherwarehousing record);
}