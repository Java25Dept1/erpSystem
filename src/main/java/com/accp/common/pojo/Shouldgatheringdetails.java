package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * shouldgatheringdetails  销售账款明细表
 * @author 
 */
public class Shouldgatheringdetails implements Serializable {
    /**
     * 主键ID
     */
    private Integer minusaddid;

    /**
     * 来源单别（销售发票、退货）
     */
    private Integer sinid;

    /**
     * 来源单别名称
     */
    private String sinname;

    /**
     * 来源单号
     */
    private String originbillid;

    /**
     * 来源单据日期
     */
    private Date nwdate;

    /**
     * 客户编号client(cliid)
     */
    private String cliid;

    /**
     * 日期
     */
    private Date showdate;

    /**
     * 原单金额
     */
    private Double originddmoney;

    /**
     * 现行余额
     */
    private Double currentlybalance;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getMinusaddid() {
        return minusaddid;
    }

    public void setMinusaddid(Integer minusaddid) {
        this.minusaddid = minusaddid;
    }

    public Integer getSinid() {
        return sinid;
    }

    public void setSinid(Integer sinid) {
        this.sinid = sinid;
    }

    public String getSinname() {
        return sinname;
    }

    public void setSinname(String sinname) {
        this.sinname = sinname;
    }

    public String getOriginbillid() {
        return originbillid;
    }

    public void setOriginbillid(String originbillid) {
        this.originbillid = originbillid;
    }

    public Date getNwdate() {
        return nwdate;
    }

    public void setNwdate(Date nwdate) {
        this.nwdate = nwdate;
    }

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid;
    }

    public Date getShowdate() {
        return showdate;
    }

    public void setShowdate(Date showdate) {
        this.showdate = showdate;
    }

    public Double getOriginddmoney() {
        return originddmoney;
    }

    public void setOriginddmoney(Double originddmoney) {
        this.originddmoney = originddmoney;
    }

    public Double getCurrentlybalance() {
        return currentlybalance;
    }

    public void setCurrentlybalance(Double currentlybalance) {
        this.currentlybalance = currentlybalance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

	public Shouldgatheringdetails() {
		super();
	}

	public Shouldgatheringdetails(Integer minusaddid, Integer sinid, String sinname, String originbillid, Date nwdate,
			String cliid, Date showdate, Double originddmoney, Double currentlybalance, String remark, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.minusaddid = minusaddid;
		this.sinid = sinid;
		this.sinname = sinname;
		this.originbillid = originbillid;
		this.nwdate = nwdate;
		this.cliid = cliid;
		this.showdate = showdate;
		this.originddmoney = originddmoney;
		this.currentlybalance = currentlybalance;
		this.remark = remark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Shouldgatheringdetails(Integer sinid, String sinname, String originbillid, Date nwdate, String cliid,
			Date showdate, Double originddmoney, Double currentlybalance, String remark, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.sinid = sinid;
		this.sinname = sinname;
		this.originbillid = originbillid;
		this.nwdate = nwdate;
		this.cliid = cliid;
		this.showdate = showdate;
		this.originddmoney = originddmoney;
		this.currentlybalance = currentlybalance;
		this.remark = remark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}