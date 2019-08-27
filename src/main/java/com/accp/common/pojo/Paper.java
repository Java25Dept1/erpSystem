package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * paper  销售发票主表 
 * @author 
 */
public class Paper implements Serializable {
    /**
     * 单据号码
     */
    private String billid;

    /**
     * 单据日期
     */
    private Date billdate;

    /**
     * 单据类型singleType(sinId)
     */
    private Integer sinid;

    /**
     * 客户编号client(cliid)
     */
    private String cliid;

    /**
     * 客户简称
     */
    private String clishortname;

    /**
     * 地址编号
     */
    private String cliplaceid;

    /**
     * 地址
     */
    private String cliplace;

    /**
     * 有效日期
     */
    private Date effectdate;

    /**
     * 币别
     */
    private String currencytype;

    /**
     * 单价是否含税
     */
    private String pricewhethertax;

    /**
     * 仓库编号   
     */
    private String stoid;

    /**
     * 仓库名称
     */
    private String stoname;

    /**
     * 销售核对状态
     */
    private Integer wherecheck;

    /**
     * 业务人员编号，也就是人员编号employee(empid)
     */
    private String empid;

    /**
     * 业务人员
     */
    private String empname;

    /**
     * 部门编号depttab(depid)
     */
    private String depid;

    /**
     * 所属部门
     */
    private String depname;

    /**
     * 制单人员
     */
    private String makeempname;

    /**
     * 复核人员
     */
    private String auditingempname;

    /**
     * 审核状态
     */
    private Integer checkstate;

    /**
     * 标识是否删除
     */
    private Integer enable;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合计金额
     */
    private Double totalmoney;

    /**
     * 合计税额
     */
    private Double totaltax;

    /**
     * 合计含税金额
     */
    private Double totaltaxmoney;

    private static final long serialVersionUID = 1L;

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Integer getSinid() {
        return sinid;
    }

    public void setSinid(Integer sinid) {
        this.sinid = sinid;
    }

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid;
    }

    public String getClishortname() {
        return clishortname;
    }

    public void setClishortname(String clishortname) {
        this.clishortname = clishortname;
    }

    public String getCliplaceid() {
        return cliplaceid;
    }

    public void setCliplaceid(String cliplaceid) {
        this.cliplaceid = cliplaceid;
    }

    public String getCliplace() {
        return cliplace;
    }

    public void setCliplace(String cliplace) {
        this.cliplace = cliplace;
    }

    public Date getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(Date effectdate) {
        this.effectdate = effectdate;
    }

    public String getCurrencytype() {
        return currencytype;
    }

    public void setCurrencytype(String currencytype) {
        this.currencytype = currencytype;
    }

    public String getPricewhethertax() {
        return pricewhethertax;
    }

    public void setPricewhethertax(String pricewhethertax) {
        this.pricewhethertax = pricewhethertax;
    }

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public String getStoname() {
        return stoname;
    }

    public void setStoname(String stoname) {
        this.stoname = stoname;
    }

    public Integer getWherecheck() {
        return wherecheck;
    }

    public void setWherecheck(Integer wherecheck) {
        this.wherecheck = wherecheck;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getMakeempname() {
        return makeempname;
    }

    public void setMakeempname(String makeempname) {
        this.makeempname = makeempname;
    }

    public String getAuditingempname() {
        return auditingempname;
    }

    public void setAuditingempname(String auditingempname) {
        this.auditingempname = auditingempname;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Double getTotaltax() {
        return totaltax;
    }

    public void setTotaltax(Double totaltax) {
        this.totaltax = totaltax;
    }

    public Double getTotaltaxmoney() {
        return totaltaxmoney;
    }

    public void setTotaltaxmoney(Double totaltaxmoney) {
        this.totaltaxmoney = totaltaxmoney;
    }

	public Paper() {
		super();
	}

	public Paper(String billid, Date billdate, Integer sinid, String cliid, String clishortname, String cliplaceid,
			String cliplace, Date effectdate, String currencytype, String pricewhethertax, String stoid, String stoname,
			Integer wherecheck, String empid, String empname, String depid, String depname, String makeempname,
			String auditingempname, Integer checkstate, Integer enable, String remark, Double totalmoney,
			Double totaltax, Double totaltaxmoney) {
		super();
		this.billid = billid;
		this.billdate = billdate;
		this.sinid = sinid;
		this.cliid = cliid;
		this.clishortname = clishortname;
		this.cliplaceid = cliplaceid;
		this.cliplace = cliplace;
		this.effectdate = effectdate;
		this.currencytype = currencytype;
		this.pricewhethertax = pricewhethertax;
		this.stoid = stoid;
		this.stoname = stoname;
		this.wherecheck = wherecheck;
		this.empid = empid;
		this.empname = empname;
		this.depid = depid;
		this.depname = depname;
		this.makeempname = makeempname;
		this.auditingempname = auditingempname;
		this.checkstate = checkstate;
		this.enable = enable;
		this.remark = remark;
		this.totalmoney = totalmoney;
		this.totaltax = totaltax;
		this.totaltaxmoney = totaltaxmoney;
	}


	public Paper(Date billdate, Integer sinid, String cliid, String clishortname, String cliplaceid, String cliplace,
			Date effectdate, String currencytype, String pricewhethertax, String stoid, String stoname,
			Integer wherecheck, String empid, String empname, String depid, String depname, String makeempname,
			String auditingempname, Integer checkstate, Integer enable, String remark, Double totalmoney,
			Double totaltax, Double totaltaxmoney) {
		super();
		this.billdate = billdate;
		this.sinid = sinid;
		this.cliid = cliid;
		this.clishortname = clishortname;
		this.cliplaceid = cliplaceid;
		this.cliplace = cliplace;
		this.effectdate = effectdate;
		this.currencytype = currencytype;
		this.pricewhethertax = pricewhethertax;
		this.stoid = stoid;
		this.stoname = stoname;
		this.wherecheck = wherecheck;
		this.empid = empid;
		this.empname = empname;
		this.depid = depid;
		this.depname = depname;
		this.makeempname = makeempname;
		this.auditingempname = auditingempname;
		this.checkstate = checkstate;
		this.enable = enable;
		this.remark = remark;
		this.totalmoney = totalmoney;
		this.totaltax = totaltax;
		this.totaltaxmoney = totaltaxmoney;
	}
    
    
}