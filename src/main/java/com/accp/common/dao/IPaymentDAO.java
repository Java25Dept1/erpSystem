package com.accp.common.dao;

import com.accp.common.pojo.Payment;

public interface IPaymentDAO {
    int deleteByPrimaryKey(String payid);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(String payid);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}