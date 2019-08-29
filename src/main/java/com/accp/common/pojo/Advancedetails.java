package com.accp.common.pojo;


/**
 * advancedetails  预付款明细表
 * @author 
 */
public class Advancedetails {
	/**
     * 预付款主表单号advance(advid)
     */
    private String advid;

    /**
     * 行号
     */
    private Integer advdetid;
	
	/**
     * 预付金额
     */
    private Double advdetmoney;

    /**
     * 来源单别(采购订单)
     */
    private String advdetoddtype;

    /**
     * 来源单号(采购订单据号码)
     */
    private String advdetoddid;

    /**
     * 摘要
     */
    private String advdetdegest;

    /**
     * 预付余额
     */
    private Double advdetbalance;

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
    
    

    public String getAdvid() {
		return advid;
	}

	public void setAdvid(String advid) {
		this.advid = advid;
	}

	public Integer getAdvdetid() {
		return advdetid;
	}

	public void setAdvdetid(Integer advdetid) {
		this.advdetid = advdetid;
	}

    public Double getAdvdetmoney() {
        return advdetmoney;
    }

    public void setAdvdetmoney(Double advdetmoney) {
        this.advdetmoney = advdetmoney;
    }

    public String getAdvdetoddtype() {
        return advdetoddtype;
    }

    public void setAdvdetoddtype(String advdetoddtype) {
        this.advdetoddtype = advdetoddtype;
    }

    public String getAdvdetoddid() {
        return advdetoddid;
    }

    public void setAdvdetoddid(String advdetoddid) {
        this.advdetoddid = advdetoddid;
    }

    public String getAdvdetdegest() {
        return advdetdegest;
    }

    public void setAdvdetdegest(String advdetdegest) {
        this.advdetdegest = advdetdegest;
    }

    public Double getAdvdetbalance() {
        return advdetbalance;
    }

    public void setAdvdetbalance(Double advdetbalance) {
        this.advdetbalance = advdetbalance;
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

	public Advancedetails() {
		super();
	}

	public Advancedetails(Double advdetmoney, String advdetoddtype, String advdetoddid, String advdetdegest,
			Double advdetbalance, Integer enables, String safetyone, String safetytwo) {
		super();
		this.advdetmoney = advdetmoney;
		this.advdetoddtype = advdetoddtype;
		this.advdetoddid = advdetoddid;
		this.advdetdegest = advdetdegest;
		this.advdetbalance = advdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advancedetails(Double advdetmoney, String advdetoddtype, String advdetdegest, Double advdetbalance,
			Integer enables, String safetyone, String safetytwo) {
		super();
		this.advdetmoney = advdetmoney;
		this.advdetoddtype = advdetoddtype;
		this.advdetdegest = advdetdegest;
		this.advdetbalance = advdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advancedetails(String advid, Integer advdetid, Double advdetmoney, String advdetoddtype, String advdetoddid,
			String advdetdegest, Double advdetbalance, Integer enables, String safetyone, String safetytwo) {
		super();
		this.advid = advid;
		this.advdetid = advdetid;
		this.advdetmoney = advdetmoney;
		this.advdetoddtype = advdetoddtype;
		this.advdetoddid = advdetoddid;
		this.advdetdegest = advdetdegest;
		this.advdetbalance = advdetbalance;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Advancedetails [advid=" + advid + ", advdetid=" + advdetid + ", advdetmoney=" + advdetmoney
				+ ", advdetoddtype=" + advdetoddtype + ", advdetoddid=" + advdetoddid + ", advdetdegest=" + advdetdegest
				+ ", advdetbalance=" + advdetbalance + ", enables=" + enables + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + "]";
	}
	
	

}