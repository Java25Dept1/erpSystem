package com.accp.common.dao;

import com.accp.common.pojo.Sellcanceldetails;

public interface ISellcanceldetailsDAO {

    int insert(Sellcanceldetails record);

    int insertSelective(Sellcanceldetails record);


    int updateByPrimaryKeySelective(Sellcanceldetails record);

    int updateByPrimaryKey(Sellcanceldetails record);
}