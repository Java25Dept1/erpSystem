package com.accp.common.dao;

import com.accp.common.pojo.Otherreceipts;

public interface IOtherreceiptsDAO {
    int deleteByPrimaryKey(String oreid);

    int insert(Otherreceipts record);

    int insertSelective(Otherreceipts record);

    Otherreceipts selectByPrimaryKey(String oreid);

    int updateByPrimaryKeySelective(Otherreceipts record);

    int updateByPrimaryKey(Otherreceipts record);
}