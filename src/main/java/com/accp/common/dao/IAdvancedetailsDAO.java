package com.accp.common.dao;

import com.accp.common.pojo.Advancedetails;

public interface IAdvancedetailsDAO {

    int insert(Advancedetails record);

    int insertSelective(Advancedetails record);


    int updateByPrimaryKeySelective(Advancedetails record);

    int updateByPrimaryKey(Advancedetails record);
}