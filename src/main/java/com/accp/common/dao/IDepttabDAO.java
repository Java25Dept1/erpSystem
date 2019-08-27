package com.accp.common.dao;

import com.accp.common.pojo.Depttab;

public interface IDepttabDAO {
    int deleteByPrimaryKey(String depid);

    int insert(Depttab record);

    int insertSelective(Depttab record);

    Depttab selectByPrimaryKey(String depid);

    int updateByPrimaryKeySelective(Depttab record);

    int updateByPrimaryKey(Depttab record);
}