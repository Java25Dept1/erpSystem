package com.accp.common.dao;

import com.accp.common.pojo.Materieltype;

public interface IMaterieltypeDAO {
    int deleteByPrimaryKey(String matypeid);

    int insert(Materieltype record);

    int insertSelective(Materieltype record);

    Materieltype selectByPrimaryKey(String matypeid);

    int updateByPrimaryKeySelective(Materieltype record);

    int updateByPrimaryKey(Materieltype record);
}