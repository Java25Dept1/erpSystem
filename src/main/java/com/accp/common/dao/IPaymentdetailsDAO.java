package com.accp.common.dao;

import com.accp.common.pojo.Paymentdetails;

public interface IPaymentdetailsDAO {

    int insert(Paymentdetails record);

    int insertSelective(Paymentdetails record);


    int updateByPrimaryKeySelective(Paymentdetails record);

    int updateByPrimaryKey(Paymentdetails record);
}