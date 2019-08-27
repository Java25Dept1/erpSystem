package com.accp.common.dao;

import com.accp.common.pojo.Saleobey;

public interface ISaleobeyDAO {

    int insert(Saleobey record);

    int insertSelective(Saleobey record);


    int updateByPrimaryKeySelective(Saleobey record);

    int updateByPrimaryKey(Saleobey record);
}