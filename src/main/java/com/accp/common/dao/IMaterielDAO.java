package com.accp.common.dao;

import com.accp.common.pojo.Materiel;

public interface IMaterielDAO {
    int deleteByPrimaryKey(String matid);

    int insert(Materiel record);

    int insertSelective(Materiel record);

    Materiel selectByPrimaryKey(String matid);

    int updateByPrimaryKeySelective(Materiel record);

    int updateByPrimaryKey(Materiel record);
}