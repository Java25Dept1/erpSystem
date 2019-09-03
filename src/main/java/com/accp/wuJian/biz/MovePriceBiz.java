package com.accp.wuJian.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.common.pojo.Moveprice;
import com.accp.common.pojo.Movepricedetail;
import com.accp.wuJian.dao.MovePriceDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MovePriceBiz {
	@Autowired
	private MovePriceDao dao;
	
	public PageInfo<Moveprice> queryAll(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Moveprice>(dao.selectAll());
	}
	public Integer queryLastNum(){
		return dao.selectlastNum();
	}
	public Integer removeMovePrice(String moveorderno) {
		return dao.deleteByPrimaryKey(moveorderno);
	}
	public Integer removeDetail(String moveorderno) {
		return dao.deleteDetailByPrimaryKey(moveorderno);
	}
	public Integer modifyMovePrice(Moveprice record) {
		dao.deleteDetailByPrimaryKey(record.getMoveorderno());
		for (Movepricedetail aa : record.getDetails()) {
			dao.insertDetailSelective(aa);
		}
		return dao.updateByPrimaryKeySelective(record);
	}
	public void addMovePrice(Moveprice record) {
		for (Movepricedetail aa : record.getDetails()) {
			dao.insertDetailSelective(aa);
		}
		dao.insertSelective(record);
	}
}
