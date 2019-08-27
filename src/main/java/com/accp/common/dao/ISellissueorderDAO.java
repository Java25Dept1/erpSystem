package com.accp.common.dao;

import com.accp.common.pojo.Sellissueorder;

public interface ISellissueorderDAO {
    int deleteByPrimaryKey(String billid);

    int insert(Sellissueorder record);

    int insertSelective(Sellissueorder record);

    Sellissueorder selectByPrimaryKey(String billid);

    int updateByPrimaryKeySelective(Sellissueorder record);

    int updateByPrimaryKey(Sellissueorder record);
}