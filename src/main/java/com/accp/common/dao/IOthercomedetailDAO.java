package com.accp.common.dao;

import com.accp.common.pojo.Othercomedetail;

public interface IOthercomedetailDAO {

    int insert(Othercomedetail record);

    int insertSelective(Othercomedetail record);


    int updateByPrimaryKeySelective(Othercomedetail record);

    int updateByPrimaryKey(Othercomedetail record);
}