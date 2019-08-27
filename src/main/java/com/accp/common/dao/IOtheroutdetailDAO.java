package com.accp.common.dao;

import com.accp.common.pojo.Otheroutdetail;

public interface IOtheroutdetailDAO {

    int insert(Otheroutdetail record);

    int insertSelective(Otheroutdetail record);


    int updateByPrimaryKeySelective(Otheroutdetail record);

    int updateByPrimaryKey(Otheroutdetail record);
}