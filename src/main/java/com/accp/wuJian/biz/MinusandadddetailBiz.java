package com.accp.wuJian.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.common.pojo.Minusandadddetail;
import com.accp.wuJian.dao.MinusandadddetailDAO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MinusandadddetailBiz {
	@Autowired
	private MinusandadddetailDAO dao;
	
	public void addMinusandadddetail(Minusandadddetail min) {
		dao.insertSelective(min);
	}
}
