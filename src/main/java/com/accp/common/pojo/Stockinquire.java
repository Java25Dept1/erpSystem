package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockinquire  采购询价主表  
 * @author 
 */
public class Stockinquire implements Serializable {
    /**
     * 询价单编号
     */
    private String stoid;

    /**
     * 供应商
     */
    private String stopname;

    /**
     * 伪外键(供应商主文件)
     */
    private String stopid;

    /**
     * 供应商地址
     */
    private String stopaddress;

    /**
     * 单据日期
     */
    private Date sotdate;

    /**
     * 有效日期
     */
    private Date stoavdate;

    /**
     * 是否含税(含税/未含税)
     */
    private String stoistax;

    /**
     * 送货地址
     */
    private String stodaddress;

    /**
     * 制单人员
     */
    private String stomakeperson;

    /**
     * 复核人员
     */
    private String stoauditingperson;

    /**
     * 采购人员
     */
    private String stostockperson;

    /**
     * 伪外键(请购人员外键)
     */
    private String stopersonid;

    /**
     * 所属部门
     */
    private String stodept;

    /**
     * 伪外键(所属部门外键)
     */
    private String stodeptid;

    /**
     * 审核状态：未审核/已审核/无效
     */
    private String stoauditing;

    /**
     * 保存（“采购询价单”）
     */
    private String stockinquirename;

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

    /**
     * 扩展字段0
     */
    private String extend0;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    /**
     * 扩展字段4
     */
    private String extend4;

    private static final long serialVersionUID = 1L;

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public String getStopname() {
        return stopname;
    }

    public void setStopname(String stopname) {
        this.stopname = stopname;
    }

    public String getStopid() {
        return stopid;
    }

    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    public String getStopaddress() {
        return stopaddress;
    }

    public void setStopaddress(String stopaddress) {
        this.stopaddress = stopaddress;
    }

    public Date getSotdate() {
        return sotdate;
    }

    public void setSotdate(Date sotdate) {
        this.sotdate = sotdate;
    }

    public Date getStoavdate() {
        return stoavdate;
    }

    public void setStoavdate(Date stoavdate) {
        this.stoavdate = stoavdate;
    }

    public String getStoistax() {
        return stoistax;
    }

    public void setStoistax(String stoistax) {
        this.stoistax = stoistax;
    }

    public String getStodaddress() {
        return stodaddress;
    }

    public void setStodaddress(String stodaddress) {
        this.stodaddress = stodaddress;
    }

    public String getStomakeperson() {
        return stomakeperson;
    }

    public void setStomakeperson(String stomakeperson) {
        this.stomakeperson = stomakeperson;
    }

    public String getStoauditingperson() {
        return stoauditingperson;
    }

    public void setStoauditingperson(String stoauditingperson) {
        this.stoauditingperson = stoauditingperson;
    }

    public String getStostockperson() {
        return stostockperson;
    }

    public void setStostockperson(String stostockperson) {
        this.stostockperson = stostockperson;
    }

    public String getStopersonid() {
        return stopersonid;
    }

    public void setStopersonid(String stopersonid) {
        this.stopersonid = stopersonid;
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

    public String getStoauditing() {
        return stoauditing;
    }

    public void setStoauditing(String stoauditing) {
        this.stoauditing = stoauditing;
    }

    public String getStockinquirename() {
        return stockinquirename;
    }

    public void setStockinquirename(String stockinquirename) {
        this.stockinquirename = stockinquirename;
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

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

	public Stockinquire() {
		super();
	}

	public Stockinquire(String stoid, String stopname, String stopid, String stopaddress, Date sotdate, Date stoavdate,
			String stoistax, String stodaddress, String stomakeperson, String stoauditingperson, String stostockperson,
			String stopersonid, String stodept, String stodeptid, String stoauditing, String stockinquirename,
			Integer enables, String safetyone, String safetytwo, String extend0, String extend1, String extend2,
			String extend3, String extend4) {
		super();
		this.stoid = stoid;
		this.stopname = stopname;
		this.stopid = stopid;
		this.stopaddress = stopaddress;
		this.sotdate = sotdate;
		this.stoavdate = stoavdate;
		this.stoistax = stoistax;
		this.stodaddress = stodaddress;
		this.stomakeperson = stomakeperson;
		this.stoauditingperson = stoauditingperson;
		this.stostockperson = stostockperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoauditing = stoauditing;
		this.stockinquirename = stockinquirename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockinquire(String stopname, String stopid, String stopaddress, Date sotdate, Date stoavdate,
			String stoistax, String stodaddress, String stomakeperson, String stoauditingperson, String stostockperson,
			String stopersonid, String stodept, String stodeptid, String stoauditing, String stockinquirename,
			Integer enables, String safetyone, String safetytwo, String extend0, String extend1, String extend2,
			String extend3, String extend4) {
		super();
		this.stopname = stopname;
		this.stopid = stopid;
		this.stopaddress = stopaddress;
		this.sotdate = sotdate;
		this.stoavdate = stoavdate;
		this.stoistax = stoistax;
		this.stodaddress = stodaddress;
		this.stomakeperson = stomakeperson;
		this.stoauditingperson = stoauditingperson;
		this.stostockperson = stostockperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoauditing = stoauditing;
		this.stockinquirename = stockinquirename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	@Override
	public String toString() {
		return "Stockinquire [stoid=" + stoid + ", stopname=" + stopname + ", stopid=" + stopid + ", stopaddress="
				+ stopaddress + ", sotdate=" + sotdate + ", stoavdate=" + stoavdate + ", stoistax=" + stoistax
				+ ", stodaddress=" + stodaddress + ", stomakeperson=" + stomakeperson + ", stoauditingperson="
				+ stoauditingperson + ", stostockperson=" + stostockperson + ", stopersonid=" + stopersonid
				+ ", stodept=" + stodept + ", stodeptid=" + stodeptid + ", stoauditing=" + stoauditing
				+ ", stockinquirename=" + stockinquirename + ", enables=" + enables + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + ", extend0=" + extend0 + ", extend1=" + extend1 + ", extend2=" + extend2
				+ ", extend3=" + extend3 + ", extend4=" + extend4 + "]";
	}
    
    
}