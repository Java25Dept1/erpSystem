package com.accp.common.pojo;

/**
 * advancegatherdetails  取用预收明细表
 * @author 
 */
public class Advancegatherdetails{
	 /**
     * 预付款主表单号
     */
    private String adcid;

    /**
     * 行号
     */
    private Integer adcdetid;

    public String getAdcid() {
        return adcid;
    }

    public void setAdcid(String adcid) {
        this.adcid = adcid;
    }

    public Integer getAdcdetid() {
        return adcdetid;
    }

    public void setAdcdetid(Integer adcdetid) {
        this.adcdetid = adcdetid;
    }
	
	/**
     * 预付金额
     */
    private Double adcdetmoney;

    /**
     * 来源单别（销售订单）
     */
    private String adcdetoddtype;

    /**
     * 来源单号（销售订单据号码）
     */
    private String adcdetoddid;

    /**
     * 摘要
     */
    private String adcdetdegest;

    /**
     * 预付余额
     */
    private Double adcdetbalance;

    /**
     * 标识是否删除  默认1不删除，0：删除
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


    public Double getAdcdetmoney() {
        return adcdetmoney;
    }

    public void setAdcdetmoney(Double adcdetmoney) {
        this.adcdetmoney = adcdetmoney;
    }

    public String getAdcdetoddtype() {
        return adcdetoddtype;
    }

    public void setAdcdetoddtype(String adcdetoddtype) {
        this.adcdetoddtype = adcdetoddtype;
    }

    public String getAdcdetoddid() {
        return adcdetoddid;
    }

    public void setAdcdetoddid(String adcdetoddid) {
        this.adcdetoddid = adcdetoddid;
    }

    public String getAdcdetdegest() {
        return adcdetdegest;
    }

    public void setAdcdetdegest(String adcdetdegest) {
        this.adcdetdegest = adcdetdegest;
    }

    public Double getAdcdetbalance() {
        return adcdetbalance;
    }

    public void setAdcdetbalance(Double adcdetbalance) {
        this.adcdetbalance = adcdetbalance;
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

	public Advancegatherdetails() {
		super();
	}

	public Advancegatherdetails(String adcid, Integer adcdetid, Double adcdetmoney, String adcdetoddtype,
			String adcdetoddid, String adcdetdegest, Double adcdetbalance, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.adcid = adcid;
		this.adcdetid = adcdetid;
		this.adcdetmoney = adcdetmoney;
		this.adcdetoddtype = adcdetoddtype;
		this.adcdetoddid = adcdetoddid;
		this.adcdetdegest = adcdetdegest;
		this.adcdetbalance = adcdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advancegatherdetails(Double adcdetmoney, String adcdetoddtype, String adcdetoddid, String adcdetdegest,
			Double adcdetbalance, Integer enables, String safetyone, String safetytwo) {
		super();
		this.adcdetmoney = adcdetmoney;
		this.adcdetoddtype = adcdetoddtype;
		this.adcdetoddid = adcdetoddid;
		this.adcdetdegest = adcdetdegest;
		this.adcdetbalance = adcdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}