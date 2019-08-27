package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockstoragetable  采购入库主表 
 * @author 
 */
public class Stockstoragetable implements Serializable {
    /**
     * 单号（自动生成）
     */
    private String stockstorageno;

    /**
     * 单据日期
     */
    private Date storagedate;

    /**
     * 供货商ID
     */
    private String purveyid;

    /**
     * 供货商名称
     */
    private String purveyname;

    /**
     * 供货商地址
     */
    private String purveyaddress;

    /**
     * 仓库ID
     */
    private String depotid;

    /**
     * 仓库名称
     */
    private String depotname;

    /**
     * 单价是否含税
     */
    private String pricerevenue;

    /**
     * 采购人员
     */
    private String stoperson;

    /**
     * 采购人员所属部门名称
     */
    private String stodept;

    /**
     * 部门ID
     */
    private String stodeptid;

    /**
     * 审核人员ID
     */
    private String audituserid;

    /**
     * 复核人员ID
     */
    private String repeatuserid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 单据状态（是否以审核）
     */
    private Integer estate;

    /**
     * 保存（“采购入库单”）
     */
    private String stockstoragetablename;

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

    public String getStockstorageno() {
        return stockstorageno;
    }

    public void setStockstorageno(String stockstorageno) {
        this.stockstorageno = stockstorageno;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
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

    public String getPurveyaddress() {
        return purveyaddress;
    }

    public void setPurveyaddress(String purveyaddress) {
        this.purveyaddress = purveyaddress;
    }

    public String getDepotid() {
        return depotid;
    }

    public void setDepotid(String depotid) {
        this.depotid = depotid;
    }

    public String getDepotname() {
        return depotname;
    }

    public void setDepotname(String depotname) {
        this.depotname = depotname;
    }

    public String getPricerevenue() {
        return pricerevenue;
    }

    public void setPricerevenue(String pricerevenue) {
        this.pricerevenue = pricerevenue;
    }

    public String getStoperson() {
        return stoperson;
    }

    public void setStoperson(String stoperson) {
        this.stoperson = stoperson;
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

    public String getAudituserid() {
        return audituserid;
    }

    public void setAudituserid(String audituserid) {
        this.audituserid = audituserid;
    }

    public String getRepeatuserid() {
        return repeatuserid;
    }

    public void setRepeatuserid(String repeatuserid) {
        this.repeatuserid = repeatuserid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEstate() {
        return estate;
    }

    public void setEstate(Integer estate) {
        this.estate = estate;
    }

    public String getStockstoragetablename() {
        return stockstoragetablename;
    }

    public void setStockstoragetablename(String stockstoragetablename) {
        this.stockstoragetablename = stockstoragetablename;
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

	public Stockstoragetable() {
		super();
	}

	public Stockstoragetable(String stockstorageno, Date storagedate, String purveyid, String purveyname,
			String purveyaddress, String depotid, String depotname, String pricerevenue, String stoperson,
			String stodept, String stodeptid, String audituserid, String repeatuserid, String remark, Integer estate,
			String stockstoragetablename, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.stockstorageno = stockstorageno;
		this.storagedate = storagedate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.purveyaddress = purveyaddress;
		this.depotid = depotid;
		this.depotname = depotname;
		this.pricerevenue = pricerevenue;
		this.stoperson = stoperson;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.audituserid = audituserid;
		this.repeatuserid = repeatuserid;
		this.remark = remark;
		this.estate = estate;
		this.stockstoragetablename = stockstoragetablename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockstoragetable(Date storagedate, String purveyid, String purveyname, String purveyaddress, String depotid,
			String depotname, String pricerevenue, String stoperson, String stodept, String stodeptid,
			String audituserid, String repeatuserid, String remark, Integer estate, String stockstoragetablename,
			Integer enables, String safetyone, String safetytwo, String extend0, String extend1, String extend2,
			String extend3, String extend4) {
		super();
		this.storagedate = storagedate;
		this.purveyid = purveyid;
		this.purveyname = purveyname;
		this.purveyaddress = purveyaddress;
		this.depotid = depotid;
		this.depotname = depotname;
		this.pricerevenue = pricerevenue;
		this.stoperson = stoperson;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.audituserid = audituserid;
		this.repeatuserid = repeatuserid;
		this.remark = remark;
		this.estate = estate;
		this.stockstoragetablename = stockstoragetablename;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}
    
    
}