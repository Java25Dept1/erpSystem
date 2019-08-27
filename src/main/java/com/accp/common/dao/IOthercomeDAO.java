package com.accp.common.dao;

import com.accp.common.pojo.Othercome;

public interface IOthercomeDAO {
    int deleteByPrimaryKey(String othcomeid);

    int insert(Othercome record);

    int insertSelective(Othercome record);

    Othercome selectByPrimaryKey(String othcomeid);

    int updateByPrimaryKeySelective(Othercome record);

    int updateByPrimaryKey(Othercome record);
}