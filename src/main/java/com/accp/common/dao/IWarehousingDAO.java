package com.accp.common.dao;

import com.accp.common.pojo.Warehousing;

public interface IWarehousingDAO {
    int deleteByPrimaryKey(String warid);

    int insert(Warehousing record);

    int insertSelective(Warehousing record);

    Warehousing selectByPrimaryKey(String warid);

    int updateByPrimaryKeySelective(Warehousing record);

    int updateByPrimaryKey(Warehousing record);
}