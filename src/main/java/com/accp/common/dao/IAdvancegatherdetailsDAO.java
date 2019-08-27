package com.accp.common.dao;

import com.accp.common.pojo.Advancegatherdetails;

public interface IAdvancegatherdetailsDAO {

    int insert(Advancegatherdetails record);

    int insertSelective(Advancegatherdetails record);


    int updateByPrimaryKeySelective(Advancegatherdetails record);

    int updateByPrimaryKey(Advancegatherdetails record);
}