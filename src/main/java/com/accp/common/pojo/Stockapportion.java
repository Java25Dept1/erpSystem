package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockapportion  采购分摊主表  
 * @author 
 */
public class Stockapportion implements Serializable {
    /**
     * 采购分摊单号
     */
    private String appid;

    /**
     * 分摊日期
     */
    private Date appdate;

    /**
     *  分摊方式
     */
    private String wisname;

    /**
     * 待摊金额
     */
    private Double appamtmoney;

    /**
     * 制单人员
     */
    private String makeperson;

    /**
     * 复核人员
     */
    private String auditingperson;

    /**
     * 是否已审核
     */
    private String estate;

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

    private static final long serialVersionUID = 1L;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Date getAppdate() {
        return appdate;
    }

    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    public String getWisname() {
        return wisname;
    }

    public void setWisname(String wisname) {
        this.wisname = wisname;
    }

    public Double getAppamtmoney() {
        return appamtmoney;
    }

    public void setAppamtmoney(Double appamtmoney) {
        this.appamtmoney = appamtmoney;
    }

    public String getMakeperson() {
        return makeperson;
    }

    public void setMakeperson(String makeperson) {
        this.makeperson = makeperson;
    }

    public String getAuditingperson() {
        return auditingperson;
    }

    public void setAuditingperson(String auditingperson) {
        this.auditingperson = auditingperson;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
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

	public Stockapportion() {
		super();
	}

	public Stockapportion(String appid, Date appdate, String wisname, Double appamtmoney, String makeperson,
			String auditingperson, String estate, Integer enables, String safetyone, String safetytwo) {
		super();
		this.appid = appid;
		this.appdate = appdate;
		this.wisname = wisname;
		this.appamtmoney = appamtmoney;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.estate = estate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Stockapportion(Date appdate, String wisname, Double appamtmoney, String makeperson, String auditingperson,
			String estate, Integer enables, String safetyone, String safetytwo) {
		super();
		this.appdate = appdate;
		this.wisname = wisname;
		this.appamtmoney = appamtmoney;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.estate = estate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Stockapportion [appid=" + appid + ", appdate=" + appdate + ", wisname=" + wisname + ", appamtmoney="
				+ appamtmoney + ", makeperson=" + makeperson + ", auditingperson=" + auditingperson + ", estate="
				+ estate + ", enables=" + enables + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo + "]";
	}
    
    
}