package com.accp.common.dao;

import com.accp.common.pojo.Apportionresult;

public interface IApportionresultDAO {

    int insert(Apportionresult record);

    int insertSelective(Apportionresult record);


    int updateByPrimaryKeySelective(Apportionresult record);

    int updateByPrimaryKey(Apportionresult record);
}