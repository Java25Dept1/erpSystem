package com.accp.common.dao;

import com.accp.common.pojo.Accountmoneydetail;

public interface IAccountmoneydetailDAO {
    int deleteByPrimaryKey(Integer storageid);

    int insert(Accountmoneydetail record);

    int insertSelective(Accountmoneydetail record);

    Accountmoneydetail selectByPrimaryKey(Integer storageid);

    int updateByPrimaryKeySelective(Accountmoneydetail record);

    int updateByPrimaryKey(Accountmoneydetail record);
}