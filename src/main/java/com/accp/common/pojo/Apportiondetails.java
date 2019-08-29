package com.accp.common.pojo;

import java.io.Serializable;

/**
 * apportiondetails  采购分摊费用明细表
 * @author 
 */
public class Apportiondetails implements Serializable {
	/**
     * 采购分摊单号(采购分摊外键)
     */
    private String adeid;

    /**
     * 序号
     */
    private Integer adesequ;

    public String getAdeid() {
        return adeid;
    }

    public void setAdeid(String adeid) {
        this.adeid = adeid;
    }

    public Integer getAdesequ() {
        return adesequ;
    }

    public void setAdesequ(Integer adesequ) {
        this.adesequ = adesequ;
    }
	
	/**
     *  费用编号
     */
    private String adeexesid;

    /**
     * 费用名称
     */
    private String adeexesname;

    /**
     * 金额
     */
    private Double adeamtmoney;

    /**
     * 币别
     */
    private String adcurrency;

    /**
     * 金额本位币
     */
    private Double adstandardcurrency;

    /**
     * 默认1不删除，0：删除	标识是否删除
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

    public String getAdeexesid() {
        return adeexesid;
    }

    public void setAdeexesid(String adeexesid) {
        this.adeexesid = adeexesid;
    }

    public String getAdeexesname() {
        return adeexesname;
    }

    public void setAdeexesname(String adeexesname) {
        this.adeexesname = adeexesname;
    }

    public Double getAdeamtmoney() {
        return adeamtmoney;
    }

    public void setAdeamtmoney(Double adeamtmoney) {
        this.adeamtmoney = adeamtmoney;
    }

    public String getAdcurrency() {
        return adcurrency;
    }

    public void setAdcurrency(String adcurrency) {
        this.adcurrency = adcurrency;
    }

    public Double getAdstandardcurrency() {
        return adstandardcurrency;
    }

    public void setAdstandardcurrency(Double adstandardcurrency) {
        this.adstandardcurrency = adstandardcurrency;
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

	public Apportiondetails() {
		super();
	}

	public Apportiondetails(String adeid, Integer adesequ, String adeexesid, String adeexesname, Double adeamtmoney,
			String adcurrency, Double adstandardcurrency, Integer enables, String safetyone, String safetytwo) {
		super();
		this.adeid = adeid;
		this.adesequ = adesequ;
		this.adeexesid = adeexesid;
		this.adeexesname = adeexesname;
		this.adeamtmoney = adeamtmoney;
		this.adcurrency = adcurrency;
		this.adstandardcurrency = adstandardcurrency;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Apportiondetails(String adeexesname, Double adeamtmoney, String adcurrency, Double adstandardcurrency,
			Integer enables, String safetyone, String safetytwo) {
		super();
		this.adeexesname = adeexesname;
		this.adeamtmoney = adeamtmoney;
		this.adcurrency = adcurrency;
		this.adstandardcurrency = adstandardcurrency;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Apportiondetails [adeid=" + adeid + ", adesequ=" + adesequ + ", adeexesid=" + adeexesid
				+ ", adeexesname=" + adeexesname + ", adeamtmoney=" + adeamtmoney + ", adcurrency=" + adcurrency
				+ ", adstandardcurrency=" + adstandardcurrency + ", enables=" + enables + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + "]";
	}
    
    
}
