package com.accp.common.dao;

import com.accp.common.pojo.Sellissueorderdetails;

public interface ISellissueorderdetailsDAO {

    int insert(Sellissueorderdetails record);

    int insertSelective(Sellissueorderdetails record);


    int updateByPrimaryKeySelective(Sellissueorderdetails record);

    int updateByPrimaryKey(Sellissueorderdetails record);
}