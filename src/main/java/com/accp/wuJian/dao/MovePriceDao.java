package com.accp.wuJian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.common.pojo.Moveprice;
import com.accp.common.pojo.Movepricedetail;

public interface MovePriceDao{
    	
    List<Moveprice> selectAll();
    
    int deleteByPrimaryKey(String moveorderno);
    
    int deleteDetailByPrimaryKey(String moveorderno);

    int insertDetailSelective(Movepricedetail record);

    int insertSelective(Moveprice record);
    
    int selectlastNum();

    Moveprice selectByPrimaryKey(String moveorderno);

    int updateByPrimaryKeySelective(Moveprice record);
}
