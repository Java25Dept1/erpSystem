package com.accp.common.dao;

import com.accp.common.pojo.Sellcancel;

public interface ISellcancelDAO {
    int deleteByPrimaryKey(String billid);

    int insert(Sellcancel record);

    int insertSelective(Sellcancel record);

    Sellcancel selectByPrimaryKey(String billid);

    int updateByPrimaryKeySelective(Sellcancel record);

    int updateByPrimaryKey(Sellcancel record);
}