package com.accp.wuJian.dao;

import com.accp.common.pojo.Minusandadddetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface MinusandadddetailDAO extends BaseMapper<Minusandadddetail>{
    int deleteByPrimaryKey(Integer minusaddid);

    int insertSelective(Minusandadddetail record);

    Minusandadddetail selectByPrimaryKey(Integer minusaddid);

    int updateByPrimaryKeySelective(Minusandadddetail record);
}