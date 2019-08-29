package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * paymentdetails  应付冲款单明细表
 * @author 
 */
public class Paymentdetails implements Serializable {
    
	/**
     * 应付冲款单主单号
     */
    private String payid;

    /**
     * 行号
     */
    private String paydetid;

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getPaydetid() {
        return paydetid;
    }

    public void setPaydetid(String paydetid) {
        this.paydetid = paydetid;
    }
	/**
     * 原单日期
     */
    private Date psourcedate;

    /**
     * 来源单别
     */
    private String paydetoddtype;

    /**
     * 来源单号
     */
    private String paydetoddid;

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
    private String paydeptid;

    /**
     * 部门名称
     */
    private String paydeptname;

    /**
     * 采购人员
     */
    private String stoperson;

    /**
     * 币别
     */
    private String adcurrency;

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
    private Double payzr;

    /**
     * 冲款金额
     */
    private Double paydetmoney;

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

    public Date getPsourcedate() {
        return psourcedate;
    }

    public void setPsourcedate(Date psourcedate) {
        this.psourcedate = psourcedate;
    }

    public String getPaydetoddtype() {
        return paydetoddtype;
    }

    public void setPaydetoddtype(String paydetoddtype) {
        this.paydetoddtype = paydetoddtype;
    }

    public String getPaydetoddid() {
        return paydetoddid;
    }

    public void setPaydetoddid(String paydetoddid) {
        this.paydetoddid = paydetoddid;
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

    public String getStoperson() {
        return stoperson;
    }

    public void setStoperson(String stoperson) {
        this.stoperson = stoperson;
    }

    public String getAdcurrency() {
        return adcurrency;
    }

    public void setAdcurrency(String adcurrency) {
        this.adcurrency = adcurrency;
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

    public Double getPayzr() {
        return payzr;
    }

    public void setPayzr(Double payzr) {
        this.payzr = payzr;
    }

    public Double getPaydetmoney() {
        return paydetmoney;
    }

    public void setPaydetmoney(Double paydetmoney) {
        this.paydetmoney = paydetmoney;
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

	public Paymentdetails() {
		super();
	}

	public Paymentdetails(String payid, String paydetid, Date psourcedate, String paydetoddtype, String paydetoddid,
			String dealobjectid, String dealobjectname, String paydeptid, String paydeptname, String stoperson,
			String adcurrency, Double exchangerate, Double formeroddmoney, Double ncebalance, Double payzr,
			Double paydetmoney, Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.payid = payid;
		this.paydetid = paydetid;
		this.psourcedate = psourcedate;
		this.paydetoddtype = paydetoddtype;
		this.paydetoddid = paydetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.stoperson = stoperson;
		this.adcurrency = adcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.payzr = payzr;
		this.paydetmoney = paydetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Paymentdetails(String paydetid, Date psourcedate, String paydetoddtype, String paydetoddid,
			String dealobjectid, String dealobjectname, String paydeptid, String paydeptname, String stoperson,
			String adcurrency, Double exchangerate, Double formeroddmoney, Double ncebalance, Double payzr,
			Double paydetmoney, Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.paydetid = paydetid;
		this.psourcedate = psourcedate;
		this.paydetoddtype = paydetoddtype;
		this.paydetoddid = paydetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.stoperson = stoperson;
		this.adcurrency = adcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.payzr = payzr;
		this.paydetmoney = paydetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Paymentdetails(Date psourcedate, String paydetoddtype, String paydetoddid, String dealobjectid,
			String dealobjectname, String paydeptid, String paydeptname, String stoperson, String adcurrency,
			Double exchangerate, Double formeroddmoney, Double ncebalance, Double payzr, Double paydetmoney,
			Double rushmoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.psourcedate = psourcedate;
		this.paydetoddtype = paydetoddtype;
		this.paydetoddid = paydetoddid;
		this.dealobjectid = dealobjectid;
		this.dealobjectname = dealobjectname;
		this.paydeptid = paydeptid;
		this.paydeptname = paydeptname;
		this.stoperson = stoperson;
		this.adcurrency = adcurrency;
		this.exchangerate = exchangerate;
		this.formeroddmoney = formeroddmoney;
		this.ncebalance = ncebalance;
		this.payzr = payzr;
		this.paydetmoney = paydetmoney;
		this.rushmoney = rushmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Paymentdetails [payid=" + payid + ", paydetid=" + paydetid + ", psourcedate=" + psourcedate
				+ ", paydetoddtype=" + paydetoddtype + ", paydetoddid=" + paydetoddid + ", dealobjectid=" + dealobjectid
				+ ", dealobjectname=" + dealobjectname + ", paydeptid=" + paydeptid + ", paydeptname=" + paydeptname
				+ ", stoperson=" + stoperson + ", adcurrency=" + adcurrency + ", exchangerate=" + exchangerate
				+ ", formeroddmoney=" + formeroddmoney + ", ncebalance=" + ncebalance + ", payzr=" + payzr
				+ ", paydetmoney=" + paydetmoney + ", rushmoney=" + rushmoney + ", enables=" + enables + ", safetyone="
				+ safetyone + ", safetytwo=" + safetytwo + "]";
	}
    
    
}