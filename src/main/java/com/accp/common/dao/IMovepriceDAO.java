package com.accp.common.dao;

import com.accp.common.pojo.Moveprice;

public interface IMovepriceDAO {
    int deleteByPrimaryKey(String moveorderno);

    int insert(Moveprice record);

    int insertSelective(Moveprice record);

    Moveprice selectByPrimaryKey(String moveorderno);

    int updateByPrimaryKeySelective(Moveprice record);

    int updateByPrimaryKey(Moveprice record);
}