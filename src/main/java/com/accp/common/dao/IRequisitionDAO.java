package com.accp.common.dao;

import com.accp.common.pojo.Requisition;

public interface IRequisitionDAO {
    int deleteByPrimaryKey(String reqid);

    int insert(Requisition record);

    int insertSelective(Requisition record);

    Requisition selectByPrimaryKey(String reqid);

    int updateByPrimaryKeySelective(Requisition record);

    int updateByPrimaryKey(Requisition record);
}