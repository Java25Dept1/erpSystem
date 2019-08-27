package com.accp.common.dao;

import com.accp.common.pojo.Selectpaper;

public interface ISelectpaperDAO {

    int insert(Selectpaper record);

    int insertSelective(Selectpaper record);


    int updateByPrimaryKeySelective(Selectpaper record);

    int updateByPrimaryKey(Selectpaper record);
}