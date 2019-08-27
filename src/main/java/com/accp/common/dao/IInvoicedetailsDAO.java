package com.accp.common.dao;

import com.accp.common.pojo.Invoicedetails;

public interface IInvoicedetailsDAO {

    int insert(Invoicedetails record);

    int insertSelective(Invoicedetails record);

    int updateByPrimaryKeySelective(Invoicedetails record);

    int updateByPrimaryKey(Invoicedetails record);
}