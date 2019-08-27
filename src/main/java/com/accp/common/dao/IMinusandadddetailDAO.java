package com.accp.common.dao;

import com.accp.common.pojo.Minusandadddetail;

public interface IMinusandadddetailDAO {
    int deleteByPrimaryKey(Integer minusaddid);

    int insert(Minusandadddetail record);

    int insertSelective(Minusandadddetail record);

    Minusandadddetail selectByPrimaryKey(Integer minusaddid);

    int updateByPrimaryKeySelective(Minusandadddetail record);

    int updateByPrimaryKey(Minusandadddetail record);
}