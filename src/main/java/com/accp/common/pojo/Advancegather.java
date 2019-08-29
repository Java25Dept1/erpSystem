package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * advancegather  预收款主表
 * @author 
 */
public class Advancegather implements Serializable {
    /**
     * 预付单单号
     */
    private String adcid;

    /**
     * 单据日期
     */
    private Date adcdate;

    /**
     * 客户编号   client(cliid)
     */
    private String purveyid;

    /**
     * 客户名称
     */
    private String purveyname;

    /**
     * 结算方式1
     */
    private String adcstrike1;

    /**
     * 结算方式2
     */
    private String adcstrike2;

    /**
     * 结算方式3
     */
    private String adcstrike3;

    /**
     * 金额1
     */
    private Double adcmoney1;

    /**
     * 金额2
     */
    private Double adcmoney2;

    /**
     * 金额3
     */
    private Double adcmoney3;

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
    private String adcmakeing;

    /**
     * 制单人所属部门
     */
    private String stodept;

    /**
     * 部门ID（部门表）
     */
    private String stodeptid;

    /**
     * 复核人员（当前登录人）
     */
    private String adccheckman;

    /**
     * 备注
     */
    private String adcremark;

    /**
     * 是否审核
     */
    private Integer isaditing;

    /**
     * 审核状态  默认0未审核，1：审核
     */
    private Integer checkstate;

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
    
    private List<Advancegatherdetails> details;
    
    

    public Advancegather(Date adcdate, String purveyid, String purveyname, String adcstrike1, String adcstrike2,
			String adcstrike3, Double adcmoney1, Double adcmoney2, Double adcmoney3, String advcurrencytype,
			Double exchangerate, String adcmakeing, String stodept, String stodeptid, String adccheckman,
			String adcremark, Integer isaditing, Integer checkstate, Integer enables, String safetyone,
			String safetytwo, List<Advancegatherdetails> details) {
		super();
		this.adcdate = adcdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.adcstrike1 = adcstrike1;
		this.adcstrike2 = adcstrike2;
		this.adcstrike3 = adcstrike3;
		this.adcmoney1 = adcmoney1;
		this.adcmoney2 = adcmoney2;
		this.adcmoney3 = adcmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.adcmakeing = adcmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.adccheckman = adccheckman;
		this.adcremark = adcremark;
		this.isaditing = isaditing;
		this.checkstate = checkstate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.details = details;
	}

	public Advancegather(String adcid, Date adcdate, String purveyid, String purveyname, String adcstrike1,
			String adcstrike2, String adcstrike3, Double adcmoney1, Double adcmoney2, Double adcmoney3,
			String advcurrencytype, Double exchangerate, String adcmakeing, String stodept, String stodeptid,
			String adccheckman, String adcremark, Integer isaditing, Integer checkstate, Integer enables,
			String safetyone, String safetytwo, List<Advancegatherdetails> details) {
		super();
		this.adcid = adcid;
		this.adcdate = adcdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.adcstrike1 = adcstrike1;
		this.adcstrike2 = adcstrike2;
		this.adcstrike3 = adcstrike3;
		this.adcmoney1 = adcmoney1;
		this.adcmoney2 = adcmoney2;
		this.adcmoney3 = adcmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.adcmakeing = adcmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.adccheckman = adccheckman;
		this.adcremark = adcremark;
		this.isaditing = isaditing;
		this.checkstate = checkstate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.details = details;
	}

	public List<Advancegatherdetails> getDetails() {
		return details;
	}

	public void setDetails(List<Advancegatherdetails> details) {
		this.details = details;
	}

	private static final long serialVersionUID = 1L;

    public String getAdcid() {
        return adcid;
    }

    public void setAdcid(String adcid) {
        this.adcid = adcid;
    }

    public Date getAdcdate() {
        return adcdate;
    }

    public void setAdcdate(Date adcdate) {
        this.adcdate = adcdate;
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

    public String getAdcstrike1() {
        return adcstrike1;
    }

    public void setAdcstrike1(String adcstrike1) {
        this.adcstrike1 = adcstrike1;
    }

    public String getAdcstrike2() {
        return adcstrike2;
    }

    public void setAdcstrike2(String adcstrike2) {
        this.adcstrike2 = adcstrike2;
    }

    public String getAdcstrike3() {
        return adcstrike3;
    }

    public void setAdcstrike3(String adcstrike3) {
        this.adcstrike3 = adcstrike3;
    }

    public Double getAdcmoney1() {
        return adcmoney1;
    }

    public void setAdcmoney1(Double adcmoney1) {
        this.adcmoney1 = adcmoney1;
    }

    public Double getAdcmoney2() {
        return adcmoney2;
    }

    public void setAdcmoney2(Double adcmoney2) {
        this.adcmoney2 = adcmoney2;
    }

    public Double getAdcmoney3() {
        return adcmoney3;
    }

    public void setAdcmoney3(Double adcmoney3) {
        this.adcmoney3 = adcmoney3;
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

    public String getAdcmakeing() {
        return adcmakeing;
    }

    public void setAdcmakeing(String adcmakeing) {
        this.adcmakeing = adcmakeing;
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

    public String getAdccheckman() {
        return adccheckman;
    }

    public void setAdccheckman(String adccheckman) {
        this.adccheckman = adccheckman;
    }

    public String getAdcremark() {
        return adcremark;
    }

    public void setAdcremark(String adcremark) {
        this.adcremark = adcremark;
    }

    public Integer getIsaditing() {
        return isaditing;
    }

    public void setIsaditing(Integer isaditing) {
        this.isaditing = isaditing;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
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

	public Advancegather() {
		super();
	}

	public Advancegather(String adcid, Date adcdate, String purveyid, String purveyname, String adcstrike1,
			String adcstrike2, String adcstrike3, Double adcmoney1, Double adcmoney2, Double adcmoney3,
			String advcurrencytype, Double exchangerate, String adcmakeing, String stodept, String stodeptid,
			String adccheckman, String adcremark, Integer isaditing, Integer checkstate, Integer enables,
			String safetyone, String safetytwo) {
		super();
		this.adcid = adcid;
		this.adcdate = adcdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.adcstrike1 = adcstrike1;
		this.adcstrike2 = adcstrike2;
		this.adcstrike3 = adcstrike3;
		this.adcmoney1 = adcmoney1;
		this.adcmoney2 = adcmoney2;
		this.adcmoney3 = adcmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.adcmakeing = adcmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.adccheckman = adccheckman;
		this.adcremark = adcremark;
		this.isaditing = isaditing;
		this.checkstate = checkstate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Advancegather(Date adcdate, String purveyid, String purveyname, String adcstrike1, String adcstrike2,
			String adcstrike3, Double adcmoney1, Double adcmoney2, Double adcmoney3, String advcurrencytype,
			Double exchangerate, String adcmakeing, String stodept, String stodeptid, String adccheckman,
			String adcremark, Integer isaditing, Integer checkstate, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.adcdate = adcdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.adcstrike1 = adcstrike1;
		this.adcstrike2 = adcstrike2;
		this.adcstrike3 = adcstrike3;
		this.adcmoney1 = adcmoney1;
		this.adcmoney2 = adcmoney2;
		this.adcmoney3 = adcmoney3;
		this.advcurrencytype = advcurrencytype;
		this.exchangerate = exchangerate;
		this.adcmakeing = adcmakeing;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.adccheckman = adccheckman;
		this.adcremark = adcremark;
		this.isaditing = isaditing;
		this.checkstate = checkstate;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	@Override
	public String toString() {
		return "Advancegather [adcid=" + adcid + ", adcdate=" + adcdate + ", purveyid=" + purveyid + ", purveyname="
				+ purveyname + ", adcstrike1=" + adcstrike1 + ", adcstrike2=" + adcstrike2 + ", adcstrike3="
				+ adcstrike3 + ", adcmoney1=" + adcmoney1 + ", adcmoney2=" + adcmoney2 + ", adcmoney3=" + adcmoney3
				+ ", advcurrencytype=" + advcurrencytype + ", exchangerate=" + exchangerate + ", adcmakeing="
				+ adcmakeing + ", stodept=" + stodept + ", stodeptid=" + stodeptid + ", adccheckman=" + adccheckman
				+ ", adcremark=" + adcremark + ", isaditing=" + isaditing + ", checkstate=" + checkstate + ", enables="
				+ enables + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo + "]";
	}
    
    
}