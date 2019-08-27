package com.accp.common.dao;

import com.accp.common.pojo.Takeadvancedetails;

public interface ITakeadvancedetailsDAO {

    int insert(Takeadvancedetails record);

    int insertSelective(Takeadvancedetails record);


    int updateByPrimaryKeySelective(Takeadvancedetails record);

    int updateByPrimaryKey(Takeadvancedetails record);
}