package com.accp.common.dao;

import com.accp.common.pojo.Clashfund;

public interface IClashfundDAO {
    int deleteByPrimaryKey(String cfid);

    int insert(Clashfund record);

    int insertSelective(Clashfund record);

    Clashfund selectByPrimaryKey(String cfid);

    int updateByPrimaryKeySelective(Clashfund record);

    int updateByPrimaryKey(Clashfund record);
}