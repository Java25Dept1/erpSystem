package com.accp.common.dao;

import com.accp.common.pojo.Paper;

public interface IPaperDAO {
    int deleteByPrimaryKey(String billid);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(String billid);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}