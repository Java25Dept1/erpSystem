package com.accp.common.dao;

import com.accp.common.pojo.Purchasingorder;

public interface IPurchasingorderDAO {
    int deleteByPrimaryKey(String purid);

    int insert(Purchasingorder record);

    int insertSelective(Purchasingorder record);

    Purchasingorder selectByPrimaryKey(String purid);

    int updateByPrimaryKeySelective(Purchasingorder record);

    int updateByPrimaryKey(Purchasingorder record);
}