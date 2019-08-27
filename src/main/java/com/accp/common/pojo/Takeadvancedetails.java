package com.accp.common.pojo;

import java.io.Serializable;

/**
 * takeadvancedetails  取用预付明细表
 * @author 
 */
public class Takeadvancedetails implements Serializable {
	/**
     * payid
     */
    private String payid;

    /**
     * 行号
     */
    private String takid;

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getTakid() {
        return takid;
    }

    public void setTakid(String takid) {
        this.takid = takid;
    }
	
	/**
     * 来源预付单单别
     */
    private String advid;

    /**
     * 来源预付单号
     */
    private String advdetid;

    /**
     * 预付余额
     */
    private Double paybalance;

    /**
     * 取用预付金额
     */
    private Double takadvmoney;

    /**
     * 部门id
     */
    private String paydeptid;

    /**
     * 部门名称
     */
    private String paydeptname;

    /**
     * 来源摘要
     */
    private String fromdiscription;

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

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid;
    }

    public String getAdvdetid() {
        return advdetid;
    }

    public void setAdvdetid(String advdetid) {
        this.advdetid = advdetid;
    }

    public Double getPaybalance() {
        return paybalance;
    }

    public void setPaybalance(Double paybalance) {
        this.paybalance = paybalance;
    }

    public Double getTakadvmoney() {
        return takadvmoney;
    }

    public void setTakadvmoney(Double takadvmoney) {
        this.takadvmoney = takadvmoney;
    }

    public String getPaydeptid() {
        return paydeptid;
    }

    public void setPaydeptid(String paydeptid) {
        this.paydeptid = paydeptid;
    }

    public String getPaydeptname() {
        return paydeptname;
    }

    public void setPaydeptname(String paydeptname) {
        this.paydeptname = paydeptname;
    }

    public String getFromdiscription() {
        return fromdiscription;
    }

    public void setFromdiscription(String fromdiscription) {
        this.fromdiscription = fromdiscription;
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

	public Takeadvancedetails() {
		super();
	}

	public Takeadvancedetails(String payid, String takid, String advid, String advdetid, Double paybalance,
			Double takadvmoney, String paydeptid, String paydeptname, String fromdiscription, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.payid = payid;
		this.takid = takid;
		this.advid = advid;
		this.advdetid = advdetid;
		this.paybalance = paybalance;
		this.takadvmoney = takadvmoney;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Takeadvancedetails(String takid, String advid, String advdetid, Double paybalance, Double takadvmoney,
			String paydeptid, String paydeptname, String fromdiscription, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.takid = takid;
		this.advid = advid;
		this.advdetid = advdetid;
		this.paybalance = paybalance;
		this.takadvmoney = takadvmoney;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Takeadvancedetails(String advid, String advdetid, Double paybalance, Double takadvmoney, String paydeptid,
			String paydeptname, String fromdiscription, Integer enables, String safetyone, String safetytwo) {
		super();
		this.advid = advid;
		this.advdetid = advdetid;
		this.paybalance = paybalance;
		this.takadvmoney = takadvmoney;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}