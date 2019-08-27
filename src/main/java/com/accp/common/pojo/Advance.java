package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * advance  预付款主表
 * @author 
 */
public class Advance implements Serializable {
    /**
     * 预付单单号
     */
    private String advid;

    /**
     * 单据日期
     */
    private Date advdate;

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
    private String advstrike1;

    /**
     * 结算方式2
     */
    private String advstrike2;

    /**
     * 结算方式3
     */
    private String advstrike3;

    /**
     * 金额1
     */
    private Double advmoney1;

    /**
     * 金额2
     */
    private Double advmoney2;

    /**
     * 金额3
     */
    private Double advmoney3;

    /**
     * 币别
     */
    private String advcurrencytype;

    /**
     * 汇率
     */
    private Double exchangerate;

    /**
     * 制单人员
     */
    private String advmakeing;

    /**
     * 制单人所属部门
     */
    private String stodept;

    /**
     * 部门ID
     */
    private String stodeptid;

    /**
     * 复核人员
     */
    private String advcheckman;

    /**
     * 备注
     */
    private String advremark;

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
     * 保留字段2
     */
    private String safetytwo;

    private static final long serialVersionUID = 1L;

    public String getAdvid() {
        return advid;
    }

    public void setAdvid(String advid) {
        this.advid = advid;
    }

    public Date getAdvdate() {
        return advdate;
    }

    public void setAdvdate(Date advdate) {
        this.advdate = advdate;
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

    public String getAdvstrike1() {
        return advstrike1;
    }

    public void setAdvstrike1(String advstrike1) {
        this.advstrike1 = advstrike1;
    }

    public String getAdvstrike2() {
        return advstrike2;
    }

    public void setAdvstrike2(String advstrike2) {
        this.advstrike2 = advstrike2;
    }

    public String getAdvstrike3() {
        return advstrike3;
    }

    public void setAdvstrike3(String advstrike3) {
        this.advstrike3 = advstrike3;
    }

    public Double getAdvmoney1() {
        return advmoney1;
    }

    public void setAdvmoney1(Double advmoney1) {
        this.advmoney1 = advmoney1;
    }

    public Double getAdvmoney2() {
        return advmoney2;
    }

    public void setAdvmoney2(Double advmoney2) {
        this.advmoney2 = advmoney2;
    }

    public Double getAdvmoney3() {
        return advmoney3;
    }

    public void setAdvmoney3(Double advmoney3) {
        this.advmoney3 = advmoney3;
    }

    public String getAdvcurrencytype() {
        return advcurrencytype;
    }

    public void setAdvcurrencytype(String advcurrencytype) {
        this.advcurrencytype = advcurrencytype;
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    public String getAdvmakeing() {
        return advmakeing;
    }

    public void setAdvmakeing(String advmakeing) {
        this.advmakeing = advmakeing;
    }

    public String getStodept() {
        return stodept;
    }

    public void setStodept(String stodept) {
        this.stodept = stodept;
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid;
    }

    public String getAdvcheckman() {
        return advcheckman;
    }

    public void setAdvcheckman(String advcheckman) {
        this.advcheckman = advcheckman;
    }

    public String getAdvremark() {
        return advremark;
    }

    public void setAdvremark(String advremark) {
        this.advremark = advremark;
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

	public Advance() {
		super();
	}

	public Advance(String advid, Date advdate, String purveyid, String purveyname, String advstrike1, String advstrike2,
			String advstrike3, Double advmoney1, Double advmoney2, Double advmoney3, String advcurrencytype,
			Double exchangerate, String advmakeing, String stodept, String stodeptid, String advcheckman,
			String advremark, Integer isaditing, Integer enables, String safetyone, String safetytwo) {
		super();
		this.advid = advid;
		this.advdate = advdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.advstrike1 = advstrike1;
		this.advstrike2 = advstrike2;
		this.advstrike3 = advstrike3;
		this.advmoney1 = advmoney1;
		this.advmoney2 = advmoney2;
		this.advmoney3 = advmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.advmakeing = advmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.advcheckman = advcheckman;
		this.advremark = advremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advance(Date advdate, String purveyid, String purveyname, String advstrike1, String advstrike2,
			String advstrike3, Double advmoney1, Double advmoney2, Double advmoney3, String advcurrencytype,
			Double exchangerate, String advmakeing, String stodept, String stodeptid, String advcheckman,
			String advremark, Integer isaditing, Integer enables, String safetyone, String safetytwo) {
		super();
		this.advdate = advdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.advstrike1 = advstrike1;
		this.advstrike2 = advstrike2;
		this.advstrike3 = advstrike3;
		this.advmoney1 = advmoney1;
		this.advmoney2 = advmoney2;
		this.advmoney3 = advmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.advmakeing = advmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.advcheckman = advcheckman;
		this.advremark = advremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advance(Date advdate, String purveyid, String purveyname, String advstrike1, String advstrike2,
			String advstrike3, Double advmoney1, Double advmoney2, Double advmoney3, String advcurrencytype,
			Double exchangerate, String advmakeing, String stodept, String stodeptid, String advcheckman,
			String advremark, Integer isaditing) {
		super();
		this.advdate = advdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.advstrike1 = advstrike1;
		this.advstrike2 = advstrike2;
		this.advstrike3 = advstrike3;
		this.advmoney1 = advmoney1;
		this.advmoney2 = advmoney2;
		this.advmoney3 = advmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.advmakeing = advmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.advcheckman = advcheckman;
		this.advremark = advremark;
		this.isaditing = isaditing;
	}

	public Advance(Date advdate, String purveyid, String purveyname, String advstrike1, String advstrike2,
			String advstrike3, Double advmoney1, Double advmoney2, Double advmoney3, String advcurrencytype,
			Double exchangerate, String advmakeing, String stodept, String stodeptid, String advcheckman,
			String advremark, Integer isaditing, Integer enables) {
		super();
		this.advdate = advdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.advstrike1 = advstrike1;
		this.advstrike2 = advstrike2;
		this.advstrike3 = advstrike3;
		this.advmoney1 = advmoney1;
		this.advmoney2 = advmoney2;
		this.advmoney3 = advmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.advmakeing = advmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.advcheckman = advcheckman;
		this.advremark = advremark;
		this.isaditing = isaditing;
		this.enables = enables;
	}
    
    
}