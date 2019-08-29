package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * sellorde  销售订单表
 * @author 
 */
public class Sellorde implements Serializable {
    /**
     * 主表编号
     */
    private Integer seid;

    /**
     * 客户名称
     */
    private String secustomername;

    /**
     * 地址1
     */
    private String seaddress;

    /**
     * 地址2
     */
    private String seaddresstwo;

    /**
     * 销售类型
     */
    private String setype;

    /**
     * 是否含税
     */
    private String setax;

    /**
     * 单况
     */
    private String sestatus;

    /**
     * 单据日期
     */
    private Date sedate;

    /**
     * 单据号码
     */
    private String senumber;

    /**
     * 客户订单
     */
    private String seorder;

    /**
     * 币别
     */
    private String securrency;

    /**
     * 汇率
     */
    private String separities;

    /**
     * 业务人员编号
     */
    private Integer empid;

    /**
     * 业务人员
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
     * 复核人员
     */
    private String auditingempname;

    /**
     * 审核状态
     */
    private String checkstate;

    /**
     * 合计金额
     */
    private Integer totalmoney;

    /**
     * 合计税额
     */
    private Integer totaltax;

    /**
     * 合计含税金额
     */
    private Integer totaltaxmoney;

    private static final long serialVersionUID = 1L;

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public String getSecustomername() {
        return secustomername;
    }

    public void setSecustomername(String secustomername) {
        this.secustomername = secustomername;
    }

    public String getSeaddress() {
        return seaddress;
    }

    public void setSeaddress(String seaddress) {
        this.seaddress = seaddress;
    }

    public String getSeaddresstwo() {
        return seaddresstwo;
    }

    public void setSeaddresstwo(String seaddresstwo) {
        this.seaddresstwo = seaddresstwo;
    }

    public String getSetype() {
        return setype;
    }

    public void setSetype(String setype) {
        this.setype = setype;
    }

    public String getSetax() {
        return setax;
    }

    public void setSetax(String setax) {
        this.setax = setax;
    }

    public String getSestatus() {
        return sestatus;
    }

    public void setSestatus(String sestatus) {
        this.sestatus = sestatus;
    }

    public Date getSedate() {
        return sedate;
    }

    public void setSedate(Date sedate) {
        this.sedate = sedate;
    }

    public String getSenumber() {
        return senumber;
    }

    public void setSenumber(String senumber) {
        this.senumber = senumber;
    }

    public String getSeorder() {
        return seorder;
    }

    public void setSeorder(String seorder) {
        this.seorder = seorder;
    }

    public String getSecurrency() {
        return securrency;
    }

    public void setSecurrency(String securrency) {
        this.securrency = securrency;
    }

    public String getSeparities() {
        return separities;
    }

    public void setSeparities(String separities) {
        this.separities = separities;
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

    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getTotaltax() {
        return totaltax;
    }

    public void setTotaltax(Integer totaltax) {
        this.totaltax = totaltax;
    }

    public Integer getTotaltaxmoney() {
        return totaltaxmoney;
    }

    public void setTotaltaxmoney(Integer totaltaxmoney) {
        this.totaltaxmoney = totaltaxmoney;
    }

	public Sellorde() {
		super();
	}

	public Sellorde(Integer seid, String secustomername, String seaddress, String seaddresstwo, String setype,
			String setax, String sestatus, Date sedate, String senumber, String seorder, String securrency,
			String separities, Integer empid, String empname, Integer depid, String depname, String makeempname,
			String auditingempname, String checkstate, Integer totalmoney, Integer totaltax, Integer totaltaxmoney) {
		super();
		this.seid = seid;
		this.secustomername = secustomername;
		this.seaddress = seaddress;
		this.seaddresstwo = seaddresstwo;
		this.setype = setype;
		this.setax = setax;
		this.sestatus = sestatus;
		this.sedate = sedate;
		this.senumber = senumber;
		this.seorder = seorder;
		this.securrency = securrency;
		this.separities = separities;
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

	public Sellorde(String secustomername, String seaddress, String seaddresstwo, String setype, String setax,
			String sestatus, Date sedate, String senumber, String seorder, String securrency, String separities,
			Integer empid, String empname, Integer depid, String depname, String makeempname, String auditingempname,
			String checkstate, Integer totalmoney, Integer totaltax, Integer totaltaxmoney) {
		super();
		this.secustomername = secustomername;
		this.seaddress = seaddress;
		this.seaddresstwo = seaddresstwo;
		this.setype = setype;
		this.setax = setax;
		this.sestatus = sestatus;
		this.sedate = sedate;
		this.senumber = senumber;
		this.seorder = seorder;
		this.securrency = securrency;
		this.separities = separities;
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
		return "Sellorde [seid=" + seid + ", secustomername=" + secustomername + ", seaddress=" + seaddress
				+ ", seaddresstwo=" + seaddresstwo + ", setype=" + setype + ", setax=" + setax + ", sestatus="
				+ sestatus + ", sedate=" + sedate + ", senumber=" + senumber + ", seorder=" + seorder + ", securrency="
				+ securrency + ", separities=" + separities + ", empid=" + empid + ", empname=" + empname + ", depid="
				+ depid + ", depname=" + depname + ", makeempname=" + makeempname + ", auditingempname="
				+ auditingempname + ", checkstate=" + checkstate + ", totalmoney=" + totalmoney + ", totaltax="
				+ totaltax + ", totaltaxmoney=" + totaltaxmoney + "]";
	}
    
    
}