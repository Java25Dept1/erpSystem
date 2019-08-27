package com.accp.common.dao;

import com.accp.common.pojo.Movestorage;

public interface IMovestorageDAO {
    int deleteByPrimaryKey(String mseno);

    int insert(Movestorage record);

    int insertSelective(Movestorage record);

    Movestorage selectByPrimaryKey(String mseno);

    int updateByPrimaryKeySelective(Movestorage record);

    int updateByPrimaryKey(Movestorage record);
}