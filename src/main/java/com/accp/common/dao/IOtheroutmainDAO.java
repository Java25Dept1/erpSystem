package com.accp.common.dao;

import com.accp.common.pojo.Otheroutmain;

public interface IOtheroutmainDAO {
    int deleteByPrimaryKey(String othid);

    int insert(Otheroutmain record);

    int insertSelective(Otheroutmain record);

    Otheroutmain selectByPrimaryKey(String othid);

    int updateByPrimaryKeySelective(Otheroutmain record);

    int updateByPrimaryKey(Otheroutmain record);
}