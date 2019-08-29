package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockrecede  采购退货主表
 * @author 
 */
public class Stockrecede implements Serializable {
    /**
     * 采购退货单号
     */
    private String recid;

    /**
     * 单据日期
     */
    private Date recdate;

    /**
     * 供应商编号
     */
    private String peoid;

    /**
     * 供货商名称
     */
    private String purveyname;

    /**
     * 供应商地址
     */
    private String peoaddress;

    /**
     * 仓库编号
     */
    private String stoid;

    /**
     * 仓库名称
     */
    private String depotname;

    /**
     * 单价是否含税
     */
    private Integer containtax;

    /**
     * 是否重新入库
     */
    private Integer anewstorage;

    /**
     * 采购人员姓名
     */
    private String stoperson;

    /**
     * 采购人员ID
     */
    private String stopersonid;

    /**
     * 请购部门
     */
    private String stodept;

    /**
     * 部门编号
     */
    private String stodeptid;

    /**
     * 制单人员
     */
    private String makeperson;

    /**
     * 复核人员
     */
    private String auditingperson;

    /**
     * 备注
     */
    private String recremark;

    /**
     * 单据状态( 是否已经审核)
     */
    private String estate;

    /**
     * 保存（“采购退货单”）
     */
    private String stockrecedename;

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

    public String getRecid() {
        return recid;
    }

    public void setRecid(String recid) {
        this.recid = recid;
    }

    public Date getRecdate() {
        return recdate;
    }

    public void setRecdate(Date recdate) {
        this.recdate = recdate;
    }

    public String getPeoid() {
        return peoid;
    }

    public void setPeoid(String peoid) {
        this.peoid = peoid;
    }

    public String getPurveyname() {
        return purveyname;
    }

    public void setPurveyname(String purveyname) {
        this.purveyname = purveyname;
    }

    public String getPeoaddress() {
        return peoaddress;
    }

    public void setPeoaddress(String peoaddress) {
        this.peoaddress = peoaddress;
    }

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public String getDepotname() {
        return depotname;
    }

    public void setDepotname(String depotname) {
        this.depotname = depotname;
    }

    public Integer getContaintax() {
        return containtax;
    }

    public void setContaintax(Integer containtax) {
        this.containtax = containtax;
    }

    public Integer getAnewstorage() {
        return anewstorage;
    }

    public void setAnewstorage(Integer anewstorage) {
        this.anewstorage = anewstorage;
    }

    public String getStoperson() {
        return stoperson;
    }

    public void setStoperson(String stoperson) {
        this.stoperson = stoperson;
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

    public String getRecremark() {
        return recremark;
    }

    public void setRecremark(String recremark) {
        this.recremark = recremark;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getStockrecedename() {
        return stockrecedename;
    }

    public void setStockrecedename(String stockrecedename) {
        this.stockrecedename = stockrecedename;
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

	public Stockrecede() {
		super();
	}

	public Stockrecede(String recid, Date recdate, String peoid, String purveyname, String peoaddress, String stoid,
			String depotname, Integer containtax, Integer anewstorage, String stoperson, String stopersonid,
			String stodept, String stodeptid, String makeperson, String auditingperson, String recremark, String estate,
			String stockrecedename, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4) {
		super();
		this.recid = recid;
		this.recdate = recdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.peoaddress = peoaddress;
		this.stoid = stoid;
		this.depotname = depotname;
		this.containtax = containtax;
		this.anewstorage = anewstorage;
		this.stoperson = stoperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.recremark = recremark;
		this.estate = estate;
		this.stockrecedename = stockrecedename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockrecede(Date recdate, String peoid, String purveyname, String peoaddress, String stoid, String depotname,
			Integer containtax, Integer anewstorage, String stoperson, String stopersonid, String stodept,
			String stodeptid, String makeperson, String auditingperson, String recremark, String estate,
			String stockrecedename, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4) {
		super();
		this.recdate = recdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.peoaddress = peoaddress;
		this.stoid = stoid;
		this.depotname = depotname;
		this.containtax = containtax;
		this.anewstorage = anewstorage;
		this.stoperson = stoperson;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.makeperson = makeperson;
		this.auditingperson = auditingperson;
		this.recremark = recremark;
		this.estate = estate;
		this.stockrecedename = stockrecedename;
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
		return "Stockrecede [recid=" + recid + ", recdate=" + recdate + ", peoid=" + peoid + ", purveyname="
				+ purveyname + ", peoaddress=" + peoaddress + ", stoid=" + stoid + ", depotname=" + depotname
				+ ", containtax=" + containtax + ", anewstorage=" + anewstorage + ", stoperson=" + stoperson
				+ ", stopersonid=" + stopersonid + ", stodept=" + stodept + ", stodeptid=" + stodeptid + ", makeperson="
				+ makeperson + ", auditingperson=" + auditingperson + ", recremark=" + recremark + ", estate=" + estate
				+ ", stockrecedename=" + stockrecedename + ", enables=" + enables + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + ", extend0=" + extend0 + ", extend1=" + extend1 + ", extend2=" + extend2
				+ ", extend3=" + extend3 + ", extend4=" + extend4 + "]";
	}
    
    
}