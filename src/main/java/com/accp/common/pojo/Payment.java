package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * payment  应付冲款单主表 
 * @author 
 */
public class Payment implements Serializable {
    /**
     * 应付冲款单单号
     */
    private String payid;

    /**
     * 单据日期
     */
    private Date paydate;

    /**
     * 供应商ID
     */
    private String purveyid;

    /**
     * 供应商名称
     */
    private String purveyname;

    /**
     * 结算方式1
     */
    private String paystrike1;

    /**
     * 结算方式2
     */
    private String paystrike2;

    /**
     * 结算方式3
     */
    private String paystrike3;

    /**
     * 金额1
     */
    private Double paymoney1;

    /**
     * 金额2
     */
    private Double paymoney2;

    /**
     * 金额3
     */
    private Double paymoney3;

    /**
     * 制单人员
     */
    private String paymakeing;

    /**
     * 制单人所属部门
     */
    private String paydept;

    /**
     * 部门ID （伪ID）
     */
    private String stodeptid;

    /**
     * 审核人员
     */
    private String paycheckman;

    /**
     * 备注
     */
    private String payremark;

    /**
     * 是否审核
     */
    private Integer isaditing;

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

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getPurveyid() {
        return purveyid;
    }

    public void setPurveyid(String purveyid) {
        this.purveyid = purveyid;
    }

    public String getPurveyname() {
        return purveyname;
    }

    public void setPurveyname(String purveyname) {
        this.purveyname = purveyname;
    }

    public String getPaystrike1() {
        return paystrike1;
    }

    public void setPaystrike1(String paystrike1) {
        this.paystrike1 = paystrike1;
    }

    public String getPaystrike2() {
        return paystrike2;
    }

    public void setPaystrike2(String paystrike2) {
        this.paystrike2 = paystrike2;
    }

    public String getPaystrike3() {
        return paystrike3;
    }

    public void setPaystrike3(String paystrike3) {
        this.paystrike3 = paystrike3;
    }

    public Double getPaymoney1() {
        return paymoney1;
    }

    public void setPaymoney1(Double paymoney1) {
        this.paymoney1 = paymoney1;
    }

    public Double getPaymoney2() {
        return paymoney2;
    }

    public void setPaymoney2(Double paymoney2) {
        this.paymoney2 = paymoney2;
    }

    public Double getPaymoney3() {
        return paymoney3;
    }

    public void setPaymoney3(Double paymoney3) {
        this.paymoney3 = paymoney3;
    }

    public String getPaymakeing() {
        return paymakeing;
    }

    public void setPaymakeing(String paymakeing) {
        this.paymakeing = paymakeing;
    }

    public String getPaydept() {
        return paydept;
    }

    public void setPaydept(String paydept) {
        this.paydept = paydept;
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid;
    }

    public String getPaycheckman() {
        return paycheckman;
    }

    public void setPaycheckman(String paycheckman) {
        this.paycheckman = paycheckman;
    }

    public String getPayremark() {
        return payremark;
    }

    public void setPayremark(String payremark) {
        this.payremark = payremark;
    }

    public Integer getIsaditing() {
        return isaditing;
    }

    public void setIsaditing(Integer isaditing) {
        this.isaditing = isaditing;
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

	public Payment() {
		super();
	}

	public Payment(String payid, Date paydate, String purveyid, String purveyname, String paystrike1, String paystrike2,
			String paystrike3, Double paymoney1, Double paymoney2, Double paymoney3, String paymakeing, String paydept,
			String stodeptid, String paycheckman, String payremark, Integer isaditing, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.payid = payid;
		this.paydate = paydate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.paystrike1 = paystrike1;
		this.paystrike2 = paystrike2;
		this.paystrike3 = paystrike3;
		this.paymoney1 = paymoney1;
		this.paymoney2 = paymoney2;
		this.paymoney3 = paymoney3;
		this.paymakeing = paymakeing;
		this.paydept = paydept;
		this.stodeptid = stodeptid;
		this.paycheckman = paycheckman;
		this.payremark = payremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Payment(Date paydate, String purveyid, String purveyname, String paystrike1, String paystrike2,
			String paystrike3, Double paymoney1, Double paymoney2, Double paymoney3, String paymakeing, String paydept,
			String stodeptid, String paycheckman, String payremark, Integer isaditing, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.paydate = paydate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.paystrike1 = paystrike1;
		this.paystrike2 = paystrike2;
		this.paystrike3 = paystrike3;
		this.paymoney1 = paymoney1;
		this.paymoney2 = paymoney2;
		this.paymoney3 = paymoney3;
		this.paymakeing = paymakeing;
		this.paydept = paydept;
		this.stodeptid = stodeptid;
		this.paycheckman = paycheckman;
		this.payremark = payremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Payment [payid=" + payid + ", paydate=" + paydate + ", purveyid=" + purveyid + ", purveyname="
				+ purveyname + ", paystrike1=" + paystrike1 + ", paystrike2=" + paystrike2 + ", paystrike3="
				+ paystrike3 + ", paymoney1=" + paymoney1 + ", paymoney2=" + paymoney2 + ", paymoney3=" + paymoney3
				+ ", paymakeing=" + paymakeing + ", paydept=" + paydept + ", stodeptid=" + stodeptid + ", paycheckman="
				+ paycheckman + ", payremark=" + payremark + ", isaditing=" + isaditing + ", enables=" + enables
				+ ", safetyone=" + safetyone + ", safetytwo=" + safetytwo + "]";
	}
    
    
}