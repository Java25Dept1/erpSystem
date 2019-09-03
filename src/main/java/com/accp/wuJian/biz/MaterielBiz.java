package com.accp.wuJian.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.common.pojo.Materiel;
import com.accp.wuJian.dao.MaterielDao;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MaterielBiz {
	@Autowired
	private MaterielDao dao;
	
	public List<Materiel> quertAllByName(String name){
		QueryWrapper<Materiel> qw = Wrappers.query();
		if(!"".equals(name)&&name!=null) {
			qw.likeRight("matid", name);
		}
		return dao.selectList(qw);
	}
	
	public void modityMateriel(String matid,Double price) {
		Materiel m = dao.selectById(matid);
		m.setMattaveragecost(price);
		m.setMattalcost(m.getMatravailable()*price);
		dao.updateById(m);
	}
}
