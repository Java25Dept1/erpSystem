package com.accp.common.dao;

import com.accp.common.pojo.Recededetails;

public interface IRecededetailsDAO {

    int insert(Recededetails record);

    int insertSelective(Recededetails record);


    int updateByPrimaryKeySelective(Recededetails record);

    int updateByPrimaryKey(Recededetails record);
}