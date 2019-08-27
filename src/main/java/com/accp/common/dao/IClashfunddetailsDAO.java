package com.accp.common.dao;

import com.accp.common.pojo.Clashfunddetails;

public interface IClashfunddetailsDAO {

    int insert(Clashfunddetails record);

    int insertSelective(Clashfunddetails record);


    int updateByPrimaryKeySelective(Clashfunddetails record);

    int updateByPrimaryKey(Clashfunddetails record);
}