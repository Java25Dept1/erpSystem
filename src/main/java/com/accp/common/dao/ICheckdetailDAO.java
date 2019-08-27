package com.accp.common.dao;

import com.accp.common.pojo.Checkdetail;

public interface ICheckdetailDAO {

    int insert(Checkdetail record);

    int insertSelective(Checkdetail record);


    int updateByPrimaryKeySelective(Checkdetail record);

    int updateByPrimaryKey(Checkdetail record);
}