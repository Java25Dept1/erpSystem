package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * clashfund  应收冲款单主表
 * @author 
 */
public class Clashfund implements Serializable {
    /**
     * 应收冲款单单号（根据日期）
     */
    private String cfid;

    /**
     * 单据日期
     */
    private Date cfdate;

    /**
     * 客户ID
     */
    private String purveyid;

    /**
     * 客户名称
     */
    private String purveyname;

    /**
     * 结算方式1
     */
    private String cfstrike1;

    /**
     * 结算方式2
     */
    private String cfstrike2;

    /**
     * 结算方式3
     */
    private String cfstrike3;

    /**
     * 金额1
     */
    private Double cfmoney1;

    /**
     * 金额2
     */
    private Double cfmoney2;

    /**
     * 金额3
     */
    private Double cfmoney3;

    /**
     * 制单人员
     */
    private String cfmakeing;

    /**
     * 制单人所属部门
     */
    private String cfdept;

    /**
     * 部门ID （伪ID）
     */
    private String stodeptid;

    /**
     * 审核人员
     */
    private String cfcheckman;

    /**
     * 备注
     */
    private String cfremark;

    /**
     * 是否审核
     */
    private Integer isaditing;

    /**
     * 默认1不删除，0：删除	标识是否删除
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

    public String getCfid() {
        return cfid;
    }

    public void setCfid(String cfid) {
        this.cfid = cfid;
    }

    public Date getCfdate() {
        return cfdate;
    }

    public void setCfdate(Date cfdate) {
        this.cfdate = cfdate;
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

    public String getCfstrike1() {
        return cfstrike1;
    }

    public void setCfstrike1(String cfstrike1) {
        this.cfstrike1 = cfstrike1;
    }

    public String getCfstrike2() {
        return cfstrike2;
    }

    public void setCfstrike2(String cfstrike2) {
        this.cfstrike2 = cfstrike2;
    }

    public String getCfstrike3() {
        return cfstrike3;
    }

    public void setCfstrike3(String cfstrike3) {
        this.cfstrike3 = cfstrike3;
    }

    public Double getCfmoney1() {
        return cfmoney1;
    }

    public void setCfmoney1(Double cfmoney1) {
        this.cfmoney1 = cfmoney1;
    }

    public Double getCfmoney2() {
        return cfmoney2;
    }

    public void setCfmoney2(Double cfmoney2) {
        this.cfmoney2 = cfmoney2;
    }

    public Double getCfmoney3() {
        return cfmoney3;
    }

    public void setCfmoney3(Double cfmoney3) {
        this.cfmoney3 = cfmoney3;
    }

    public String getCfmakeing() {
        return cfmakeing;
    }

    public void setCfmakeing(String cfmakeing) {
        this.cfmakeing = cfmakeing;
    }

    public String getCfdept() {
        return cfdept;
    }

    public void setCfdept(String cfdept) {
        this.cfdept = cfdept;
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid;
    }

    public String getCfcheckman() {
        return cfcheckman;
    }

    public void setCfcheckman(String cfcheckman) {
        this.cfcheckman = cfcheckman;
    }

    public String getCfremark() {
        return cfremark;
    }

    public void setCfremark(String cfremark) {
        this.cfremark = cfremark;
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

	public Clashfund() {
		super();
	}

	public Clashfund(String cfid, Date cfdate, String purveyid, String purveyname, String cfstrike1, String cfstrike2,
			String cfstrike3, Double cfmoney1, Double cfmoney2, Double cfmoney3, String cfmakeing, String cfdept,
			String stodeptid, String cfcheckman, String cfremark, Integer isaditing, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.cfid = cfid;
		this.cfdate = cfdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.cfstrike1 = cfstrike1;
		this.cfstrike2 = cfstrike2;
		this.cfstrike3 = cfstrike3;
		this.cfmoney1 = cfmoney1;
		this.cfmoney2 = cfmoney2;
		this.cfmoney3 = cfmoney3;
		this.cfmakeing = cfmakeing;
		this.cfdept = cfdept;
		this.stodeptid = stodeptid;
		this.cfcheckman = cfcheckman;
		this.cfremark = cfremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Clashfund(Date cfdate, String purveyid, String purveyname, String cfstrike1, String cfstrike2,
			String cfstrike3, Double cfmoney1, Double cfmoney2, Double cfmoney3, String cfmakeing, String cfdept,
			String stodeptid, String cfcheckman, String cfremark, Integer isaditing, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.cfdate = cfdate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.cfstrike1 = cfstrike1;
		this.cfstrike2 = cfstrike2;
		this.cfstrike3 = cfstrike3;
		this.cfmoney1 = cfmoney1;
		this.cfmoney2 = cfmoney2;
		this.cfmoney3 = cfmoney3;
		this.cfmakeing = cfmakeing;
		this.cfdept = cfdept;
		this.stodeptid = stodeptid;
		this.cfcheckman = cfcheckman;
		this.cfremark = cfremark;
		this.isaditing = isaditing;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}