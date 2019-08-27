package com.accp.common.dao;

import com.accp.common.pojo.Supplieraddress;

public interface ISupplieraddressDAO {
    int deleteByPrimaryKey(String suaddrid);

    int insert(Supplieraddress record);

    int insertSelective(Supplieraddress record);

    Supplieraddress selectByPrimaryKey(String suaddrid);

    int updateByPrimaryKeySelective(Supplieraddress record);

    int updateByPrimaryKey(Supplieraddress record);
}