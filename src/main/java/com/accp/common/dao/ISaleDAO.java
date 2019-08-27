package com.accp.common.dao;

import com.accp.common.pojo.Sale;

public interface ISaleDAO {
    int deleteByPrimaryKey(Integer smid);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}