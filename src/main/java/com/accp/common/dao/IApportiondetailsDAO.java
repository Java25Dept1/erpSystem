package com.accp.common.dao;

import com.accp.common.pojo.Apportiondetails;

public interface IApportiondetailsDAO {

    int insert(Apportiondetails record);

    int insertSelective(Apportiondetails record);


    int updateByPrimaryKeySelective(Apportiondetails record);

    int updateByPrimaryKey(Apportiondetails record);
}