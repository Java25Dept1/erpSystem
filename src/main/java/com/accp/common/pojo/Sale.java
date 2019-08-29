package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * sale  销售报价表 
 * @author 
 */
public class Sale implements Serializable {
    /**
     * 主表编号
     */
    private Integer smid;

    /**
     * 客户名称
     */
    private String smcustomername;

    /**
     * 地址1
     */
    private String smaddress;

    /**
     * 地址2
     */
    private String smaddresstwo;

    /**
     * 是否含税
     */
    private String smtax;

    /**
     * 单据日期
     */
    private Date smdate;

    /**
     * 单据号码
     */
    private String smnumber;

    /**
     * 币别
     */
    private String smcurrency;

    /**
     * 汇率
     */
    private String smparities;

    /**
     * 客户编号
     */
    private String cliid;

    /**
     * 单据类型
     */
    private Integer smtype;

    /**
     * 业务人员编号
     */
    private Integer empid;

    /**
     * 业务人员名称
     */
    private String empname;

    /**
     * 部门编号
     */
    private Integer depid;

    /**
     * 所属部门
     */
    private String depname;

    /**
     * 制单人员
     */
    private String makeempname;

    /**
     * 审核人员
     */
    private String auditingempname;

    /**
     * 审核状态
     */
    private Integer checkstate;

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

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public String getSmcustomername() {
        return smcustomername;
    }

    public void setSmcustomername(String smcustomername) {
        this.smcustomername = smcustomername;
    }

    public String getSmaddress() {
        return smaddress;
    }

    public void setSmaddress(String smaddress) {
        this.smaddress = smaddress;
    }

    public String getSmaddresstwo() {
        return smaddresstwo;
    }

    public void setSmaddresstwo(String smaddresstwo) {
        this.smaddresstwo = smaddresstwo;
    }

    public String getSmtax() {
        return smtax;
    }

    public void setSmtax(String smtax) {
        this.smtax = smtax;
    }

    public Date getSmdate() {
        return smdate;
    }

    public void setSmdate(Date smdate) {
        this.smdate = smdate;
    }

    public String getSmnumber() {
        return smnumber;
    }

    public void setSmnumber(String smnumber) {
        this.smnumber = smnumber;
    }

    public String getSmcurrency() {
        return smcurrency;
    }

    public void setSmcurrency(String smcurrency) {
        this.smcurrency = smcurrency;
    }

    public String getSmparities() {
        return smparities;
    }

    public void setSmparities(String smparities) {
        this.smparities = smparities;
    }

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid;
    }

    public Integer getSmtype() {
        return smtype;
    }

    public void setSmtype(Integer smtype) {
        this.smtype = smtype;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
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

	public Sale() {
		super();
	}

	public Sale(Integer smid, String smcustomername, String smaddress, String smaddresstwo, String smtax, Date smdate,
			String smnumber, String smcurrency, String smparities, String cliid, Integer smtype, Integer empid,
			String empname, Integer depid, String depname, String makeempname, String auditingempname,
			Integer checkstate, Double totalmoney, Double totaltax, Double totaltaxmoney) {
		super();
		this.smid = smid;
		this.smcustomername = smcustomername;
		this.smaddress = smaddress;
		this.smaddresstwo = smaddresstwo;
		this.smtax = smtax;
		this.smdate = smdate;
		this.smnumber = smnumber;
		this.smcurrency = smcurrency;
		this.smparities = smparities;
		this.cliid = cliid;
		this.smtype = smtype;
		this.empid = empid;
		this.empname = empname;
		this.depid = depid;
		this.depname = depname;
		this.makeempname = makeempname;
		this.auditingempname = auditingempname;
		this.checkstate = checkstate;
		this.totalmoney = totalmoney;
		this.totaltax = totaltax;
		this.totaltaxmoney = totaltaxmoney;
	}

	public Sale(String smcustomername, String smaddress, String smaddresstwo, String smtax, Date smdate,
			String smnumber, String smcurrency, String smparities, String cliid, Integer smtype, Integer empid,
			String empname, Integer depid, String depname, String makeempname, String auditingempname,
			Integer checkstate, Double totalmoney, Double totaltax, Double totaltaxmoney) {
		super();
		this.smcustomername = smcustomername;
		this.smaddress = smaddress;
		this.smaddresstwo = smaddresstwo;
		this.smtax = smtax;
		this.smdate = smdate;
		this.smnumber = smnumber;
		this.smcurrency = smcurrency;
		this.smparities = smparities;
		this.cliid = cliid;
		this.smtype = smtype;
		this.empid = empid;
		this.empname = empname;
		this.depid = depid;
		this.depname = depname;
		this.makeempname = makeempname;
		this.auditingempname = auditingempname;
		this.checkstate = checkstate;
		this.totalmoney = totalmoney;
		this.totaltax = totaltax;
		this.totaltaxmoney = totaltaxmoney;
	}

	@Override
	public String toString() {
		return "Sale [smid=" + smid + ", smcustomername=" + smcustomername + ", smaddress=" + smaddress
				+ ", smaddresstwo=" + smaddresstwo + ", smtax=" + smtax + ", smdate=" + smdate + ", smnumber="
				+ smnumber + ", smcurrency=" + smcurrency + ", smparities=" + smparities + ", cliid=" + cliid
				+ ", smtype=" + smtype + ", empid=" + empid + ", empname=" + empname + ", depid=" + depid + ", depname="
				+ depname + ", makeempname=" + makeempname + ", auditingempname=" + auditingempname + ", checkstate="
				+ checkstate + ", totalmoney=" + totalmoney + ", totaltax=" + totaltax + ", totaltaxmoney="
				+ totaltaxmoney + "]";
	}
    
    
}