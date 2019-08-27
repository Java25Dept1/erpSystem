package com.accp.common.dao;

import com.accp.common.pojo.Advance;

public interface IAdvanceDAO {
    int deleteByPrimaryKey(String advid);

    int insert(Advance record);

    int insertSelective(Advance record);

    Advance selectByPrimaryKey(String advid);

    int updateByPrimaryKeySelective(Advance record);

    int updateByPrimaryKey(Advance record);
}