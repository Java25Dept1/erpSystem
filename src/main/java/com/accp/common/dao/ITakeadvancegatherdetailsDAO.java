package com.accp.common.dao;

import com.accp.common.pojo.Takeadvancegatherdetails;

public interface ITakeadvancegatherdetailsDAO {

    int insert(Takeadvancegatherdetails record);

    int insertSelective(Takeadvancegatherdetails record);


    int updateByPrimaryKeySelective(Takeadvancegatherdetails record);

    int updateByPrimaryKey(Takeadvancegatherdetails record);
}