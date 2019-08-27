package com.accp.common.dao;

import com.accp.common.pojo.Measurement;

public interface IMeasurementDAO {
    int deleteByPrimaryKey(String unitid);

    int insert(Measurement record);

    int insertSelective(Measurement record);

    Measurement selectByPrimaryKey(String unitid);

    int updateByPrimaryKeySelective(Measurement record);

    int updateByPrimaryKey(Measurement record);
}