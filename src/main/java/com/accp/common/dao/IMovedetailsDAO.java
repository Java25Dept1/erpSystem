package com.accp.common.dao;

import com.accp.common.pojo.Movedetails;

public interface IMovedetailsDAO {
    int deleteByPrimaryKey(String mdsno);

    int insert(Movedetails record);

    int insertSelective(Movedetails record);

    Movedetails selectByPrimaryKey(String mdsno);

    int updateByPrimaryKeySelective(Movedetails record);

    int updateByPrimaryKey(Movedetails record);
}