package com.accp.common.dao;

import com.accp.common.pojo.Checked;

public interface ICheckedDAO {

    int insert(Checked record);

    int insertSelective(Checked record);


    int updateByPrimaryKeySelective(Checked record);

    int updateByPrimaryKey(Checked record);
}