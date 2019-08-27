package com.accp.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * recededetails  采购退货明细表  
 * @author 
 */
public class Recededetails implements Serializable {
	/**
     * 采购退货单号(stockrecede外键)
     */
    private String recid;

    /**
     * 序号(联合主键)
     */
    private Integer detsequ;

    public String getRecid() {
        return recid;
    }

    public void setRecid(String recid) {
        this.recid = recid;
    }

    public Integer getDetsequ() {
        return detsequ;
    }

    public void setDetsequ(Integer detsequ) {
        this.detsequ = detsequ;
    }
	
	/**
     * 物料编号(非外键)
     */
    private String matid;

    /**
     * 物料名称
     */
    private String matname;

    /**
     * 规格型号
     */
    private String matspec;

    /**
     * 数量
     */
    private Integer detnum;

    /**
     * 折扣前单价
     */
    private BigDecimal detagioprice;

    /**
     * 折数
     */
    private Integer detdiscount;

    /**
     * 单价
     */
    private BigDecimal detprice;

    /**
     * 金额
     */
    private BigDecimal detamtmoney;

    /**
     * 税率
     */
    private Integer depcess;

    /**
     * 税额
     */
    private BigDecimal depcessmoney;

    /**
     * 是否赠品
     */
    private Integer deplargess;

    /**
     * 来源单别
     */
    private String sodorigintype;

    /**
     * 来源单号
     */
    private String sodorigin;

    /**
     * 标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段
     */
    private String safetyone;

    /**
     * 保留字段
     */
    private String safetytwo;

    /**
     * 扩展字段0
     */
    private String extend0;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    /**
     * 扩展字段4
     */
    private String extend4;

    private static final long serialVersionUID = 1L;

    public String getMatid() {
        return matid;
    }

    public void setMatid(String matid) {
        this.matid = matid;
    }

    public String getMatname() {
        return matname;
    }

    public void setMatname(String matname) {
        this.matname = matname;
    }

    public String getMatspec() {
        return matspec;
    }

    public void setMatspec(String matspec) {
        this.matspec = matspec;
    }

    public Integer getDetnum() {
        return detnum;
    }

    public void setDetnum(Integer detnum) {
        this.detnum = detnum;
    }

    public BigDecimal getDetagioprice() {
        return detagioprice;
    }

    public void setDetagioprice(BigDecimal detagioprice) {
        this.detagioprice = detagioprice;
    }

    public Integer getDetdiscount() {
        return detdiscount;
    }

    public void setDetdiscount(Integer detdiscount) {
        this.detdiscount = detdiscount;
    }

    public BigDecimal getDetprice() {
        return detprice;
    }

    public void setDetprice(BigDecimal detprice) {
        this.detprice = detprice;
    }

    public BigDecimal getDetamtmoney() {
        return detamtmoney;
    }

    public void setDetamtmoney(BigDecimal detamtmoney) {
        this.detamtmoney = detamtmoney;
    }

    public Integer getDepcess() {
        return depcess;
    }

    public void setDepcess(Integer depcess) {
        this.depcess = depcess;
    }

    public BigDecimal getDepcessmoney() {
        return depcessmoney;
    }

    public void setDepcessmoney(BigDecimal depcessmoney) {
        this.depcessmoney = depcessmoney;
    }

    public Integer getDeplargess() {
        return deplargess;
    }

    public void setDeplargess(Integer deplargess) {
        this.deplargess = deplargess;
    }

    public String getSodorigintype() {
        return sodorigintype;
    }

    public void setSodorigintype(String sodorigintype) {
        this.sodorigintype = sodorigintype;
    }

    public String getSodorigin() {
        return sodorigin;
    }

    public void setSodorigin(String sodorigin) {
        this.sodorigin = sodorigin;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone;
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo;
    }

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

	public Recededetails() {
		super();
	}

	public Recededetails(String recid, Integer detsequ, String matid, String matname, String matspec, Integer detnum,
			BigDecimal detagioprice, Integer detdiscount, BigDecimal detprice, BigDecimal detamtmoney, Integer depcess,
			BigDecimal depcessmoney, Integer deplargess, String sodorigintype, String sodorigin, Integer enables,
			String safetyone, String safetytwo, String extend0, String extend1, String extend2, String extend3,
			String extend4) {
		super();
		this.recid = recid;
		this.detsequ = detsequ;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.detnum = detnum;
		this.detagioprice = detagioprice;
		this.detdiscount = detdiscount;
		this.detprice = detprice;
		this.detamtmoney = detamtmoney;
		this.depcess = depcess;
		this.depcessmoney = depcessmoney;
		this.deplargess = deplargess;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Recededetails(Integer detsequ, String matid, String matname, String matspec, Integer detnum,
			BigDecimal detagioprice, Integer detdiscount, BigDecimal detprice, BigDecimal detamtmoney, Integer depcess,
			BigDecimal depcessmoney, Integer deplargess, String sodorigintype, String sodorigin, Integer enables,
			String safetyone, String safetytwo, String extend0, String extend1, String extend2, String extend3,
			String extend4) {
		super();
		this.detsequ = detsequ;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.detnum = detnum;
		this.detagioprice = detagioprice;
		this.detdiscount = detdiscount;
		this.detprice = detprice;
		this.detamtmoney = detamtmoney;
		this.depcess = depcess;
		this.depcessmoney = depcessmoney;
		this.deplargess = deplargess;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Recededetails(String matid, String matname, String matspec, Integer detnum, BigDecimal detagioprice,
			Integer detdiscount, BigDecimal detprice, BigDecimal detamtmoney, Integer depcess, BigDecimal depcessmoney,
			Integer deplargess, String sodorigintype, String sodorigin, Integer enables, String safetyone,
			String safetytwo, String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.detnum = detnum;
		this.detagioprice = detagioprice;
		this.detdiscount = detdiscount;
		this.detprice = detprice;
		this.detamtmoney = detamtmoney;
		this.depcess = depcess;
		this.depcessmoney = depcessmoney;
		this.deplargess = deplargess;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}
    
    
}