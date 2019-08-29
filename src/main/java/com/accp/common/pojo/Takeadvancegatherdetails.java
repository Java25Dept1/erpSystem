package com.accp.common.pojo;

import java.io.Serializable;

/**
 * takeadvancegatherdetails  取用预收明细表
 * @author 
 */
public class Takeadvancegatherdetails implements Serializable {
	/**
     * 应收冲款单主单号
     */
    private String tadid;

    /**
     * 行号
     */
    private String tadkid;

    public String getTadid() {
        return tadid;
    }

    public void setTadid(String tadid) {
        this.tadid = tadid;
    }

    public String getTadkid() {
        return tadkid;
    }

    public void setTadkid(String tadkid) {
        this.tadkid = tadkid;
    }
	
	/**
     * 来源预收单单别(预收单)
     */
    private String tagadname;

    /**
     * 来源预收单号
     */
    private String tagadid;

    /**
     * 预付余额
     */
    private Double tagbalance;

    /**
     * 取用预付金额
     */
    private Double tagtakemoney;

    /**
     * 部门id
     */
    private String tagdeptid;

    /**
     * 部门名称
     */
    private String tagdeptname;

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

    public String getTagadname() {
        return tagadname;
    }

    public void setTagadname(String tagadname) {
        this.tagadname = tagadname;
    }

    public String getTagadid() {
        return tagadid;
    }

    public void setTagadid(String tagadid) {
        this.tagadid = tagadid;
    }

    public Double getTagbalance() {
        return tagbalance;
    }

    public void setTagbalance(Double tagbalance) {
        this.tagbalance = tagbalance;
    }

    public Double getTagtakemoney() {
        return tagtakemoney;
    }

    public void setTagtakemoney(Double tagtakemoney) {
        this.tagtakemoney = tagtakemoney;
    }

    public String getTagdeptid() {
        return tagdeptid;
    }

    public void setTagdeptid(String tagdeptid) {
        this.tagdeptid = tagdeptid;
    }

    public String getTagdeptname() {
        return tagdeptname;
    }

    public void setTagdeptname(String tagdeptname) {
        this.tagdeptname = tagdeptname;
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

	public Takeadvancegatherdetails() {
		super();
	}

	public Takeadvancegatherdetails(String tadid, String tadkid, String tagadname, String tagadid, Double tagbalance,
			Double tagtakemoney, String tagdeptid, String tagdeptname, String fromdiscription, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.tadid = tadid;
		this.tadkid = tadkid;
		this.tagadname = tagadname;
		this.tagadid = tagadid;
		this.tagbalance = tagbalance;
		this.tagtakemoney = tagtakemoney;
		this.tagdeptid = tagdeptid;
		this.tagdeptname = tagdeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Takeadvancegatherdetails(String tadkid, String tagadname, String tagadid, Double tagbalance,
			Double tagtakemoney, String tagdeptid, String tagdeptname, String fromdiscription, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.tadkid = tadkid;
		this.tagadname = tagadname;
		this.tagadid = tagadid;
		this.tagbalance = tagbalance;
		this.tagtakemoney = tagtakemoney;
		this.tagdeptid = tagdeptid;
		this.tagdeptname = tagdeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Takeadvancegatherdetails(String tagadname, String tagadid, Double tagbalance, Double tagtakemoney,
			String tagdeptid, String tagdeptname, String fromdiscription, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.tagadname = tagadname;
		this.tagadid = tagadid;
		this.tagbalance = tagbalance;
		this.tagtakemoney = tagtakemoney;
		this.tagdeptid = tagdeptid;
		this.tagdeptname = tagdeptname;
		this.fromdiscription = fromdiscription;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Takeadvancegatherdetails [tadid=" + tadid + ", tadkid=" + tadkid + ", tagadname=" + tagadname
				+ ", tagadid=" + tagadid + ", tagbalance=" + tagbalance + ", tagtakemoney=" + tagtakemoney
				+ ", tagdeptid=" + tagdeptid + ", tagdeptname=" + tagdeptname + ", fromdiscription=" + fromdiscription
				+ ", enables=" + enables + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo + "]";
	}
    
    
}