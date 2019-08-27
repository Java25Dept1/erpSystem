package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * clashfunddetails
 * @author 
 */
public class Clashfunddetails implements Serializable {
	/**
     * 应收冲款单主单号clashfund (cfid)
     */
    private String cfdid;

    /**
     * 行号
     */
    private String cfddetid;

    public String getCfdid() {
        return cfdid;
    }

    public void setCfdid(String cfdid) {
        this.cfdid = cfdid;
    }

    public String getCfddetid() {
        return cfddetid;
    }

    public void setCfddetid(String cfddetid) {
        this.cfddetid = cfddetid;
    }
	
	/**
     * 来源单号日期
     */
    private Date cfdsourcedate;

    /**
     * 来源单别（销售发票）
     */
    private String cfddetoddtype;

    /**
     * 来源单号
     */
    private String cfddetoddid;

    /**
     * 交易对象 编号
     */
    private String dealobjectid;

    /**
     * 交易对象名称
     */
    private String dealobjectname;

    /**
     * 部门编号
     */
    private String cfddeptid;

    /**
     * 部门名称
     */
    private String cfddeptname;

    /**
     * 采购人员
     */
    private String stoperson;

    /**
     * 币别
     */
    private String cfdcurrency;

    /**
     * 汇率
     */
    private Double exchangerate;

    /**
     * 原单金额
     */
    private Double formeroddmoney;

    /**
     * 现行余额
     */
    private Double ncebalance;

    /**
     * 折让金额
     */
    private Double cfdzr;

    /**
     * 冲款金额
     */
    private Double cfddetmoney;

    /**
     * 冲抵金额
     */
    private Double rushmoney;

    /**
     * 标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段1
     */
    private String safetyone;

    /**
     * 保留字段1
     */
    private String safetytwo;

    private static final long serialVersionUID = 1L;

    public Date getCfdsourcedate() {
        return cfdsourcedate;
    }

    public void setCfdsourcedate(Date cfdsourcedate) {
        this.cfdsourcedate = cfdsourcedate;
    }

    public String getCfddetoddtype() {
        return cfddetoddtype;
    }

    public void setCfddetoddtype(String cfddetoddtype) {
        this.cfddetoddtype = cfddetoddtype;
    }

    public String getCfddetoddid() {
        return cfddetoddid;
    }

    public void setCfddetoddid(String cfddetoddid) {
        this.cfddetoddid = cfddetoddid;
    }

    public String getDealobjectid() {
        return dealobjectid;
    }

    public void setDealobjectid(String dealobjectid) {
        this.dealobjectid = dealobjectid;
    }

    public String getDealobjectname() {
        return dealobjectname;
    }

    public void setDealobjectname(String dealobjectname) {
        this.dealobjectname = dealobjectname;
    }

    public String getCfddeptid() {
        return cfddeptid;
    }

    public void setCfddeptid(String cfddeptid) {
        this.cfddeptid = cfddeptid;
    }

    public String getCfddeptname() {
        return cfddeptname;
    }

    public void setCfddeptname(String cfddeptname) {
        this.cfddeptname = cfddeptname;
    }

    public String getStoperson() {
        return stoperson;
    }

    public void setStoperson(String stoperson) {
        this.stoperson = stoperson;
    }

    public String getCfdcurrency() {
        return cfdcurrency;
    }

    public void setCfdcurrency(String cfdcurrency) {
        this.cfdcurrency = cfdcurrency;
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    public Double getFormeroddmoney() {
        return formeroddmoney;
    }

    public void setFormeroddmoney(Double formeroddmoney) {
        this.formeroddmoney = formeroddmoney;
    }

    public Double getNcebalance() {
        return ncebalance;
    }

    public void setNcebalance(Double ncebalance) {
        this.ncebalance = ncebalance;
    }

    public Double getCfdzr() {
        return cfdzr;
    }

    public void setCfdzr(Double cfdzr) {
        this.cfdzr = cfdzr;
    }

    public Double getCfddetmoney() {
        return cfddetmoney;
    }

    public void setCfddetmoney(Double cfddetmoney) {
        this.cfddetmoney = cfddetmoney;
    }

    public Double getRushmoney() {
        return rushmoney;
    }

    public void setRushmoney(Double rushmoney) {
        this.rushmoney = rushmoney;
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

	public Clashfunddetails() {
		super();
	}

	public Clashfunddetails(String cfdid, String cfddetid, Date cfdsourcedate, String cfddetoddtype, String cfddetoddid,
			String dealobjectid, String dealobjectname, String cfddeptid, String cfddeptname, String stoperson,
			String cfdcurrency, Double exchangerate, Double formeroddmoney, Double ncebalance, Double cfdzr,
			Double cfddetmoney, Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.cfdid = cfdid;
		this.cfddetid = cfddetid;
		this.cfdsourcedate = cfdsourcedate;
		this.cfddetoddtype = cfddetoddtype;
		this.cfddetoddid = cfddetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.cfddeptid = cfddeptid;
		this.cfddeptname = cfddeptname;
		this.stoperson = stoperson;
		this.cfdcurrency = cfdcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.cfdzr = cfdzr;
		this.cfddetmoney = cfddetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Clashfunddetails(String cfddetid, Date cfdsourcedate, String cfddetoddtype, String cfddetoddid,
			String dealobjectid, String dealobjectname, String cfddeptid, String cfddeptname, String stoperson,
			String cfdcurrency, Double exchangerate, Double formeroddmoney, Double ncebalance, Double cfdzr,
			Double cfddetmoney, Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.cfddetid = cfddetid;
		this.cfdsourcedate = cfdsourcedate;
		this.cfddetoddtype = cfddetoddtype;
		this.cfddetoddid = cfddetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.cfddeptid = cfddeptid;
		this.cfddeptname = cfddeptname;
		this.stoperson = stoperson;
		this.cfdcurrency = cfdcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.cfdzr = cfdzr;
		this.cfddetmoney = cfddetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Clashfunddetails(Date cfdsourcedate, String cfddetoddtype, String cfddetoddid, String dealobjectid,
			String dealobjectname, String cfddeptid, String cfddeptname, String stoperson, String cfdcurrency,
			Double exchangerate, Double formeroddmoney, Double ncebalance, Double cfdzr, Double cfddetmoney,
			Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.cfdsourcedate = cfdsourcedate;
		this.cfddetoddtype = cfddetoddtype;
		this.cfddetoddid = cfddetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.cfddeptid = cfddeptid;
		this.cfddeptname = cfddeptname;
		this.stoperson = stoperson;
		this.cfdcurrency = cfdcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.cfdzr = cfdzr;
		this.cfddetmoney = cfddetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}