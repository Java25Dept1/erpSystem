package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * client  客户主文件设定
 * @author  
 */
public class Client implements Serializable {
    /**
     * 客户编号
     */
    private String cliid;

    /**
     * 客户类别Id
     */
    private String clitypeid;

    /**
     * 账款归属
     */
    private String cliaccounts;

    /**
     * 客户全称
     */
    private String cliname;

    /**
     * 客户简称
     */
    private String clishortname;

    /**
     * 地方（具体）
     */
    private String cliaddress;

    /**
     * 地区
     */
    private String cliarea;

    /**
     * 英文全称
     */
    private String cliename;

    /**
     * 英文简称
     */
    private String clieshortname;

    /**
     * 负责人
     */
    private String cliprincipal;

    /**
     * 联系人
     */
    private String clilinkman;

    /**
     * 联系电话一
     */
    private String cliphoneone;

    /**
     * 联系电话二
     */
    private String cliphonetwo;

    /**
     * 联系电话三
     */
    private String cliphonethree;

    /**
     * 银行帐号
     */
    private String clibankaccounts;

    /**
     * 开户银行
     */
    private String cliopenbank;

    /**
     * 税务登记号
     */
    private String clidouble;

    /**
     * 行业别
     */
    private String clicategory;

    /**
     * 业务人员id
     */
    private String cliempid;

    /**
     * 业务人员
     */
    private String cliempname;

    /**
     * 移动电话
     */
    private String climobilephone;

    /**
     * 电子邮件
     */
    private String cliemail;

    /**
     * 网址
     */
    private String cliweb;

    /**
     * 传真号码
     */
    private String clifaxes;

    /**
     * 最初销售出货日
     */
    private Date clioldoutdate;

    /**
     * 最初销售退货日
     */
    private Date clioldodate;

    /**
     * 最近销售出货日
     */
    private Date clinewoutdate;

    /**
     * 最近销售退货日
     */
    private Date clinewodate;

    /**
     * 折数(%)
     */
    private String clidiscount;

    /**
     * 售价等级
     */
    private String clipricestep;

    /**
     * 客户建立日
     */
    private Date clicreatedate;

    /**
     * 单价是否含税
     */
    private String cliunitprice;

    /**
     * 潜在客户编号
     */
    private String clicustomerdouble;

    /**
     * 最近预约拜访
     */
    private Date cliaappoment;

    /**
     * 预约拜访
     */
    private Date cliappoment;

    /**
     * 终止交易日
     */
    private Date clistopdate;

    /**
     * 账款额度
     */
    private String clizhangkuanedu;

    /**
     * 剩余额度
     */
    private String cliremainedu;

    /**
     * 收款条件（天）
     */
    private String clicondition;

    /**
     * 每月结账日
     */
    private Date climonthreckoning;

    /**
     * 信用等级
     */
    private String clicreditstep;

    /**
     * 发票类型
     */
    private String cliinvoice;

    /**
     * 应收款科目
     */
    private String clireceivables;

    /**
     * 期初预收款
     */
    private Double cliqcpremoney;

    /**
     * 期初应收款
     */
    private Double cliqcdealmoney;

    /**
     * 期末预收款
     */
    private Double cliqmpremoney;

    /**
     * 期末应收款
     */
    private Double cliqmdealmoney;

    /**
     * 预收款科目
     */
    private String cliadvancee;

    /**
     * 自定义栏一
     */
    private String clicolumnoneone;

    /**
     * 自定义栏二
     */
    private String clicolumnonetow;

    /**
     * 备注
     */
    private String cliotherremark;

    private static final long serialVersionUID = 1L;

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid;
    }

    public String getClitypeid() {
        return clitypeid;
    }

    public void setClitypeid(String clitypeid) {
        this.clitypeid = clitypeid;
    }

    public String getCliaccounts() {
        return cliaccounts;
    }

    public void setCliaccounts(String cliaccounts) {
        this.cliaccounts = cliaccounts;
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname;
    }

    public String getClishortname() {
        return clishortname;
    }

    public void setClishortname(String clishortname) {
        this.clishortname = clishortname;
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress;
    }

    public String getCliarea() {
        return cliarea;
    }

    public void setCliarea(String cliarea) {
        this.cliarea = cliarea;
    }

    public String getCliename() {
        return cliename;
    }

    public void setCliename(String cliename) {
        this.cliename = cliename;
    }

    public String getClieshortname() {
        return clieshortname;
    }

    public void setClieshortname(String clieshortname) {
        this.clieshortname = clieshortname;
    }

    public String getCliprincipal() {
        return cliprincipal;
    }

    public void setCliprincipal(String cliprincipal) {
        this.cliprincipal = cliprincipal;
    }

    public String getClilinkman() {
        return clilinkman;
    }

    public void setClilinkman(String clilinkman) {
        this.clilinkman = clilinkman;
    }

    public String getCliphoneone() {
        return cliphoneone;
    }

    public void setCliphoneone(String cliphoneone) {
        this.cliphoneone = cliphoneone;
    }

    public String getCliphonetwo() {
        return cliphonetwo;
    }

    public void setCliphonetwo(String cliphonetwo) {
        this.cliphonetwo = cliphonetwo;
    }

    public String getCliphonethree() {
        return cliphonethree;
    }

    public void setCliphonethree(String cliphonethree) {
        this.cliphonethree = cliphonethree;
    }

    public String getClibankaccounts() {
        return clibankaccounts;
    }

    public void setClibankaccounts(String clibankaccounts) {
        this.clibankaccounts = clibankaccounts;
    }

    public String getCliopenbank() {
        return cliopenbank;
    }

    public void setCliopenbank(String cliopenbank) {
        this.cliopenbank = cliopenbank;
    }

    public String getClidouble() {
        return clidouble;
    }

    public void setClidouble(String clidouble) {
        this.clidouble = clidouble;
    }

    public String getClicategory() {
        return clicategory;
    }

    public void setClicategory(String clicategory) {
        this.clicategory = clicategory;
    }

    public String getCliempid() {
        return cliempid;
    }

    public void setCliempid(String cliempid) {
        this.cliempid = cliempid;
    }

    public String getCliempname() {
        return cliempname;
    }

    public void setCliempname(String cliempname) {
        this.cliempname = cliempname;
    }

    public String getClimobilephone() {
        return climobilephone;
    }

    public void setClimobilephone(String climobilephone) {
        this.climobilephone = climobilephone;
    }

    public String getCliemail() {
        return cliemail;
    }

    public void setCliemail(String cliemail) {
        this.cliemail = cliemail;
    }

    public String getCliweb() {
        return cliweb;
    }

    public void setCliweb(String cliweb) {
        this.cliweb = cliweb;
    }

    public String getClifaxes() {
        return clifaxes;
    }

    public void setClifaxes(String clifaxes) {
        this.clifaxes = clifaxes;
    }

    public Date getClioldoutdate() {
        return clioldoutdate;
    }

    public void setClioldoutdate(Date clioldoutdate) {
        this.clioldoutdate = clioldoutdate;
    }

    public Date getClioldodate() {
        return clioldodate;
    }

    public void setClioldodate(Date clioldodate) {
        this.clioldodate = clioldodate;
    }

    public Date getClinewoutdate() {
        return clinewoutdate;
    }

    public void setClinewoutdate(Date clinewoutdate) {
        this.clinewoutdate = clinewoutdate;
    }

    public Date getClinewodate() {
        return clinewodate;
    }

    public void setClinewodate(Date clinewodate) {
        this.clinewodate = clinewodate;
    }

    public String getClidiscount() {
        return clidiscount;
    }

    public void setClidiscount(String clidiscount) {
        this.clidiscount = clidiscount;
    }

    public String getClipricestep() {
        return clipricestep;
    }

    public void setClipricestep(String clipricestep) {
        this.clipricestep = clipricestep;
    }

    public Date getClicreatedate() {
        return clicreatedate;
    }

    public void setClicreatedate(Date clicreatedate) {
        this.clicreatedate = clicreatedate;
    }

    public String getCliunitprice() {
        return cliunitprice;
    }

    public void setCliunitprice(String cliunitprice) {
        this.cliunitprice = cliunitprice;
    }

    public String getClicustomerdouble() {
        return clicustomerdouble;
    }

    public void setClicustomerdouble(String clicustomerdouble) {
        this.clicustomerdouble = clicustomerdouble;
    }

    public Date getCliaappoment() {
        return cliaappoment;
    }

    public void setCliaappoment(Date cliaappoment) {
        this.cliaappoment = cliaappoment;
    }

    public Date getCliappoment() {
        return cliappoment;
    }

    public void setCliappoment(Date cliappoment) {
        this.cliappoment = cliappoment;
    }

    public Date getClistopdate() {
        return clistopdate;
    }

    public void setClistopdate(Date clistopdate) {
        this.clistopdate = clistopdate;
    }

    public String getClizhangkuanedu() {
        return clizhangkuanedu;
    }

    public void setClizhangkuanedu(String clizhangkuanedu) {
        this.clizhangkuanedu = clizhangkuanedu;
    }

    public String getCliremainedu() {
        return cliremainedu;
    }

    public void setCliremainedu(String cliremainedu) {
        this.cliremainedu = cliremainedu;
    }

    public String getClicondition() {
        return clicondition;
    }

    public void setClicondition(String clicondition) {
        this.clicondition = clicondition;
    }

    public Date getClimonthreckoning() {
        return climonthreckoning;
    }

    public void setClimonthreckoning(Date climonthreckoning) {
        this.climonthreckoning = climonthreckoning;
    }

    public String getClicreditstep() {
        return clicreditstep;
    }

    public void setClicreditstep(String clicreditstep) {
        this.clicreditstep = clicreditstep;
    }

    public String getCliinvoice() {
        return cliinvoice;
    }

    public void setCliinvoice(String cliinvoice) {
        this.cliinvoice = cliinvoice;
    }

    public String getClireceivables() {
        return clireceivables;
    }

    public void setClireceivables(String clireceivables) {
        this.clireceivables = clireceivables;
    }

    public Double getCliqcpremoney() {
        return cliqcpremoney;
    }

    public void setCliqcpremoney(Double cliqcpremoney) {
        this.cliqcpremoney = cliqcpremoney;
    }

    public Double getCliqcdealmoney() {
        return cliqcdealmoney;
    }

    public void setCliqcdealmoney(Double cliqcdealmoney) {
        this.cliqcdealmoney = cliqcdealmoney;
    }

    public Double getCliqmpremoney() {
        return cliqmpremoney;
    }

    public void setCliqmpremoney(Double cliqmpremoney) {
        this.cliqmpremoney = cliqmpremoney;
    }

    public Double getCliqmdealmoney() {
        return cliqmdealmoney;
    }

    public void setCliqmdealmoney(Double cliqmdealmoney) {
        this.cliqmdealmoney = cliqmdealmoney;
    }

    public String getCliadvancee() {
        return cliadvancee;
    }

    public void setCliadvancee(String cliadvancee) {
        this.cliadvancee = cliadvancee;
    }

    public String getClicolumnoneone() {
        return clicolumnoneone;
    }

    public void setClicolumnoneone(String clicolumnoneone) {
        this.clicolumnoneone = clicolumnoneone;
    }

    public String getClicolumnonetow() {
        return clicolumnonetow;
    }

    public void setClicolumnonetow(String clicolumnonetow) {
        this.clicolumnonetow = clicolumnonetow;
    }

    public String getCliotherremark() {
        return cliotherremark;
    }

    public void setCliotherremark(String cliotherremark) {
        this.cliotherremark = cliotherremark;
    }

	public Client() {
		super();
	}

	public Client(String cliid, String clitypeid, String cliaccounts, String cliname, String clishortname,
			String cliaddress, String cliarea, String cliename, String clieshortname, String cliprincipal,
			String clilinkman, String cliphoneone, String cliphonetwo, String cliphonethree, String clibankaccounts,
			String cliopenbank, String clidouble, String clicategory, String cliempid, String cliempname,
			String climobilephone, String cliemail, String cliweb, String clifaxes, Date clioldoutdate,
			Date clioldodate, Date clinewoutdate, Date clinewodate, String clidiscount, String clipricestep,
			Date clicreatedate, String cliunitprice, String clicustomerdouble, Date cliaappoment, Date cliappoment,
			Date clistopdate, String clizhangkuanedu, String cliremainedu, String clicondition, Date climonthreckoning,
			String clicreditstep, String cliinvoice, String clireceivables, Double cliqcpremoney, Double cliqcdealmoney,
			Double cliqmpremoney, Double cliqmdealmoney, String cliadvancee, String clicolumnoneone,
			String clicolumnonetow, String cliotherremark) {
		super();
		this.cliid = cliid;
		this.clitypeid = clitypeid;
		this.cliaccounts = cliaccounts;
		this.cliname = cliname;
		this.clishortname = clishortname;
		this.cliaddress = cliaddress;
		this.cliarea = cliarea;
		this.cliename = cliename;
		this.clieshortname = clieshortname;
		this.cliprincipal = cliprincipal;
		this.clilinkman = clilinkman;
		this.cliphoneone = cliphoneone;
		this.cliphonetwo = cliphonetwo;
		this.cliphonethree = cliphonethree;
		this.clibankaccounts = clibankaccounts;
		this.cliopenbank = cliopenbank;
		this.clidouble = clidouble;
		this.clicategory = clicategory;
		this.cliempid = cliempid;
		this.cliempname = cliempname;
		this.climobilephone = climobilephone;
		this.cliemail = cliemail;
		this.cliweb = cliweb;
		this.clifaxes = clifaxes;
		this.clioldoutdate = clioldoutdate;
		this.clioldodate = clioldodate;
		this.clinewoutdate = clinewoutdate;
		this.clinewodate = clinewodate;
		this.clidiscount = clidiscount;
		this.clipricestep = clipricestep;
		this.clicreatedate = clicreatedate;
		this.cliunitprice = cliunitprice;
		this.clicustomerdouble = clicustomerdouble;
		this.cliaappoment = cliaappoment;
		this.cliappoment = cliappoment;
		this.clistopdate = clistopdate;
		this.clizhangkuanedu = clizhangkuanedu;
		this.cliremainedu = cliremainedu;
		this.clicondition = clicondition;
		this.climonthreckoning = climonthreckoning;
		this.clicreditstep = clicreditstep;
		this.cliinvoice = cliinvoice;
		this.clireceivables = clireceivables;
		this.cliqcpremoney = cliqcpremoney;
		this.cliqcdealmoney = cliqcdealmoney;
		this.cliqmpremoney = cliqmpremoney;
		this.cliqmdealmoney = cliqmdealmoney;
		this.cliadvancee = cliadvancee;
		this.clicolumnoneone = clicolumnoneone;
		this.clicolumnonetow = clicolumnonetow;
		this.cliotherremark = cliotherremark;
	}

	public Client(String clitypeid, String cliaccounts, String cliname, String clishortname, String cliaddress,
			String cliarea, String cliename, String clieshortname, String cliprincipal, String clilinkman,
			String cliphoneone, String cliphonetwo, String cliphonethree, String clibankaccounts, String cliopenbank,
			String clidouble, String clicategory, String cliempid, String cliempname, String climobilephone,
			String cliemail, String cliweb, String clifaxes, Date clioldoutdate, Date clioldodate, Date clinewoutdate,
			Date clinewodate, String clidiscount, String clipricestep, Date clicreatedate, String cliunitprice,
			String clicustomerdouble, Date cliaappoment, Date cliappoment, Date clistopdate, String clizhangkuanedu,
			String cliremainedu, String clicondition, Date climonthreckoning, String clicreditstep, String cliinvoice,
			String clireceivables, Double cliqcpremoney, Double cliqcdealmoney, Double cliqmpremoney,
			Double cliqmdealmoney, String cliadvancee, String clicolumnoneone, String clicolumnonetow,
			String cliotherremark) {
		super();
		this.clitypeid = clitypeid;
		this.cliaccounts = cliaccounts;
		this.cliname = cliname;
		this.clishortname = clishortname;
		this.cliaddress = cliaddress;
		this.cliarea = cliarea;
		this.cliename = cliename;
		this.clieshortname = clieshortname;
		this.cliprincipal = cliprincipal;
		this.clilinkman = clilinkman;
		this.cliphoneone = cliphoneone;
		this.cliphonetwo = cliphonetwo;
		this.cliphonethree = cliphonethree;
		this.clibankaccounts = clibankaccounts;
		this.cliopenbank = cliopenbank;
		this.clidouble = clidouble;
		this.clicategory = clicategory;
		this.cliempid = cliempid;
		this.cliempname = cliempname;
		this.climobilephone = climobilephone;
		this.cliemail = cliemail;
		this.cliweb = cliweb;
		this.clifaxes = clifaxes;
		this.clioldoutdate = clioldoutdate;
		this.clioldodate = clioldodate;
		this.clinewoutdate = clinewoutdate;
		this.clinewodate = clinewodate;
		this.clidiscount = clidiscount;
		this.clipricestep = clipricestep;
		this.clicreatedate = clicreatedate;
		this.cliunitprice = cliunitprice;
		this.clicustomerdouble = clicustomerdouble;
		this.cliaappoment = cliaappoment;
		this.cliappoment = cliappoment;
		this.clistopdate = clistopdate;
		this.clizhangkuanedu = clizhangkuanedu;
		this.cliremainedu = cliremainedu;
		this.clicondition = clicondition;
		this.climonthreckoning = climonthreckoning;
		this.clicreditstep = clicreditstep;
		this.cliinvoice = cliinvoice;
		this.clireceivables = clireceivables;
		this.cliqcpremoney = cliqcpremoney;
		this.cliqcdealmoney = cliqcdealmoney;
		this.cliqmpremoney = cliqmpremoney;
		this.cliqmdealmoney = cliqmdealmoney;
		this.cliadvancee = cliadvancee;
		this.clicolumnoneone = clicolumnoneone;
		this.clicolumnonetow = clicolumnonetow;
		this.cliotherremark = cliotherremark;
	}
    
    
}