package com.accp.common.dao;

import com.accp.common.pojo.Storage;

public interface IStorageDAO {
    int deleteByPrimaryKey(String stoid);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(String stoid);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}