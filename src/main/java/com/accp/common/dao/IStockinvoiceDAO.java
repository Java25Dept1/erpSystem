package com.accp.common.dao;

import com.accp.common.pojo.Stockinvoice;

public interface IStockinvoiceDAO {

    int insert(Stockinvoice record);

    int insertSelective(Stockinvoice record);

    int updateByPrimaryKeySelective(Stockinvoice record);

    int updateByPrimaryKeyWithBLOBs(Stockinvoice record);

    int updateByPrimaryKey(Stockinvoice record);
}