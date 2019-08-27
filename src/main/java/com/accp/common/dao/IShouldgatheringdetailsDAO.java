package com.accp.common.dao;

import com.accp.common.pojo.Shouldgatheringdetails;

public interface IShouldgatheringdetailsDAO {
    int deleteByPrimaryKey(Integer minusaddid);

    int insert(Shouldgatheringdetails record);

    int insertSelective(Shouldgatheringdetails record);

    Shouldgatheringdetails selectByPrimaryKey(Integer minusaddid);

    int updateByPrimaryKeySelective(Shouldgatheringdetails record);

    int updateByPrimaryKey(Shouldgatheringdetails record);
}