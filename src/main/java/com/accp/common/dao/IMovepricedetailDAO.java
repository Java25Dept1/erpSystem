package com.accp.common.dao;

import com.accp.common.pojo.Movepricedetail;

public interface IMovepricedetailDAO {

    int insert(Movepricedetail record);

    int insertSelective(Movepricedetail record);


    int updateByPrimaryKeySelective(Movepricedetail record);

    int updateByPrimaryKey(Movepricedetail record);
}