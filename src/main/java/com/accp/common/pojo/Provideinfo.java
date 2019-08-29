package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * provideinfo  供应商主文件设定   
 * @author 
 */
public class Provideinfo implements Serializable {
    /**
     * 供应商编号
     */
    private String peoid;

    /**
     * 供应商全称
     */
    private String peoname;

    /**
     * 供应商简称
     */
    private String peoshortname;

    /**
     * 英文简称
     */
    private String peoabbreviation;

    /**
     * 英文全称
     */
    private String peofullname;

    /**
     * 帐款归属
     */
    private String peoascription;

    /**
     * 供应商类型表id
     */
    private String peopeeid;

    /**
     * 供应商类型表名称（新增）
     */
    private String peopeename;

    /**
     * 地区
     */
    private String peoarea;

    /**
     * 币别
     */
    private String peocurrency;

    /**
     * 负责人
     */
    private String peoprincipal;

    /**
     * 联系人
     */
    private String peolinkman;

    /**
     * 联系电话一
     */
    private String peophoneone;

    /**
     * 联系电话二
     */
    private String peophonetwo;

    /**
     * 联系电话三
     */
    private String peophonethree;

    /**
     * 移动电话
     */
    private String peomobilephone;

    /**
     * 银行帐号
     */
    private String peobankaccounts;

    /**
     * 开户银行
     */
    private String peoopenbank;

    /**
     * 采购人员
     */
    private String peopersonnel;

    /**
     * 税务登记表
     */
    private String peoregistration;

    /**
     * 行业别
     */
    private String peocalling;

    /**
     * 电子邮件
     */
    private String peoemail;

    /**
     * 网址
     */
    private String peoweb;

    /**
     * 传真号码
     */
    private String peofaxes;

    /**
     * 最初采购入库日
     */
    private Date peoldoutdate;

    /**
     * 最初采购退货日
     */
    private Date peoldodate;

    /**
     * 最近采购入库日
     */
    private Date peonewoutdate;

    /**
     * 最近采购退货日
     */
    private Date peonewodate;

    /**
     * 单价是否含税
     */
    private String peoincluded;

    /**
     * 终止交易日期
     */
    private String peoterminadate;

    /**
     * 帐款额度
     */
    private Double peozhangkuanedu;

    /**
     * 剩余额度
     */
    private Double peoremainedu;

    /**
     * 付款条件
     */
    private String peopayment;

    /**
     * 每月结帐日
     */
    private Double peomonthreckoning;

    /**
     * 信用等级
     */
    private String peocreditrating;

    /**
     * 发票类型
     */
    private String peoinvoicetype;

    /**
     * 期初预付款
     */
    private Double peoqcprepaymoney;

    /**
     * 期初应付款
     */
    private Double peoqcdealmoney;

    /**
     * 期末预付款
     */
    private Double peoqmprepaymoney;

    /**
     * 期末应付款
     */
    private Double peoqmdealmoney;

    /**
     * 预付账款科目
     */
    private String peoadvance;

    /**
     * 应付账款科目
     */
    private String peoaccounts;

    /**
     * 应付暂估科目
     */
    private String peoassessed;

    /**
     * 自定义栏一
     */
    private String peocustombarone;

    /**
     * 自定义栏二
     */
    private String peocustombartow;

    /**
     * 备注
     */
    private String peoremark;

    private static final long serialVersionUID = 1L;

    public String getPeoid() {
        return peoid;
    }

    public void setPeoid(String peoid) {
        this.peoid = peoid;
    }

    public String getPeoname() {
        return peoname;
    }

    public void setPeoname(String peoname) {
        this.peoname = peoname;
    }

    public String getPeoshortname() {
        return peoshortname;
    }

    public void setPeoshortname(String peoshortname) {
        this.peoshortname = peoshortname;
    }

    public String getPeoabbreviation() {
        return peoabbreviation;
    }

    public void setPeoabbreviation(String peoabbreviation) {
        this.peoabbreviation = peoabbreviation;
    }

    public String getPeofullname() {
        return peofullname;
    }

    public void setPeofullname(String peofullname) {
        this.peofullname = peofullname;
    }

    public String getPeoascription() {
        return peoascription;
    }

    public void setPeoascription(String peoascription) {
        this.peoascription = peoascription;
    }

    public String getPeopeeid() {
        return peopeeid;
    }

    public void setPeopeeid(String peopeeid) {
        this.peopeeid = peopeeid;
    }

    public String getPeopeename() {
        return peopeename;
    }

    public void setPeopeename(String peopeename) {
        this.peopeename = peopeename;
    }

    public String getPeoarea() {
        return peoarea;
    }

    public void setPeoarea(String peoarea) {
        this.peoarea = peoarea;
    }

    public String getPeocurrency() {
        return peocurrency;
    }

    public void setPeocurrency(String peocurrency) {
        this.peocurrency = peocurrency;
    }

    public String getPeoprincipal() {
        return peoprincipal;
    }

    public void setPeoprincipal(String peoprincipal) {
        this.peoprincipal = peoprincipal;
    }

    public String getPeolinkman() {
        return peolinkman;
    }

    public void setPeolinkman(String peolinkman) {
        this.peolinkman = peolinkman;
    }

    public String getPeophoneone() {
        return peophoneone;
    }

    public void setPeophoneone(String peophoneone) {
        this.peophoneone = peophoneone;
    }

    public String getPeophonetwo() {
        return peophonetwo;
    }

    public void setPeophonetwo(String peophonetwo) {
        this.peophonetwo = peophonetwo;
    }

    public String getPeophonethree() {
        return peophonethree;
    }

    public void setPeophonethree(String peophonethree) {
        this.peophonethree = peophonethree;
    }

    public String getPeomobilephone() {
        return peomobilephone;
    }

    public void setPeomobilephone(String peomobilephone) {
        this.peomobilephone = peomobilephone;
    }

    public String getPeobankaccounts() {
        return peobankaccounts;
    }

    public void setPeobankaccounts(String peobankaccounts) {
        this.peobankaccounts = peobankaccounts;
    }

    public String getPeoopenbank() {
        return peoopenbank;
    }

    public void setPeoopenbank(String peoopenbank) {
        this.peoopenbank = peoopenbank;
    }

    public String getPeopersonnel() {
        return peopersonnel;
    }

    public void setPeopersonnel(String peopersonnel) {
        this.peopersonnel = peopersonnel;
    }

    public String getPeoregistration() {
        return peoregistration;
    }

    public void setPeoregistration(String peoregistration) {
        this.peoregistration = peoregistration;
    }

    public String getPeocalling() {
        return peocalling;
    }

    public void setPeocalling(String peocalling) {
        this.peocalling = peocalling;
    }

    public String getPeoemail() {
        return peoemail;
    }

    public void setPeoemail(String peoemail) {
        this.peoemail = peoemail;
    }

    public String getPeoweb() {
        return peoweb;
    }

    public void setPeoweb(String peoweb) {
        this.peoweb = peoweb;
    }

    public String getPeofaxes() {
        return peofaxes;
    }

    public void setPeofaxes(String peofaxes) {
        this.peofaxes = peofaxes;
    }

    public Date getPeoldoutdate() {
        return peoldoutdate;
    }

    public void setPeoldoutdate(Date peoldoutdate) {
        this.peoldoutdate = peoldoutdate;
    }

    public Date getPeoldodate() {
        return peoldodate;
    }

    public void setPeoldodate(Date peoldodate) {
        this.peoldodate = peoldodate;
    }

    public Date getPeonewoutdate() {
        return peonewoutdate;
    }

    public void setPeonewoutdate(Date peonewoutdate) {
        this.peonewoutdate = peonewoutdate;
    }

    public Date getPeonewodate() {
        return peonewodate;
    }

    public void setPeonewodate(Date peonewodate) {
        this.peonewodate = peonewodate;
    }

    public String getPeoincluded() {
        return peoincluded;
    }

    public void setPeoincluded(String peoincluded) {
        this.peoincluded = peoincluded;
    }

    public String getPeoterminadate() {
        return peoterminadate;
    }

    public void setPeoterminadate(String peoterminadate) {
        this.peoterminadate = peoterminadate;
    }

    public Double getPeozhangkuanedu() {
        return peozhangkuanedu;
    }

    public void setPeozhangkuanedu(Double peozhangkuanedu) {
        this.peozhangkuanedu = peozhangkuanedu;
    }

    public Double getPeoremainedu() {
        return peoremainedu;
    }

    public void setPeoremainedu(Double peoremainedu) {
        this.peoremainedu = peoremainedu;
    }

    public String getPeopayment() {
        return peopayment;
    }

    public void setPeopayment(String peopayment) {
        this.peopayment = peopayment;
    }

    public Double getPeomonthreckoning() {
        return peomonthreckoning;
    }

    public void setPeomonthreckoning(Double peomonthreckoning) {
        this.peomonthreckoning = peomonthreckoning;
    }

    public String getPeocreditrating() {
        return peocreditrating;
    }

    public void setPeocreditrating(String peocreditrating) {
        this.peocreditrating = peocreditrating;
    }

    public String getPeoinvoicetype() {
        return peoinvoicetype;
    }

    public void setPeoinvoicetype(String peoinvoicetype) {
        this.peoinvoicetype = peoinvoicetype;
    }

    public Double getPeoqcprepaymoney() {
        return peoqcprepaymoney;
    }

    public void setPeoqcprepaymoney(Double peoqcprepaymoney) {
        this.peoqcprepaymoney = peoqcprepaymoney;
    }

    public Double getPeoqcdealmoney() {
        return peoqcdealmoney;
    }

    public void setPeoqcdealmoney(Double peoqcdealmoney) {
        this.peoqcdealmoney = peoqcdealmoney;
    }

    public Double getPeoqmprepaymoney() {
        return peoqmprepaymoney;
    }

    public void setPeoqmprepaymoney(Double peoqmprepaymoney) {
        this.peoqmprepaymoney = peoqmprepaymoney;
    }

    public Double getPeoqmdealmoney() {
        return peoqmdealmoney;
    }

    public void setPeoqmdealmoney(Double peoqmdealmoney) {
        this.peoqmdealmoney = peoqmdealmoney;
    }

    public String getPeoadvance() {
        return peoadvance;
    }

    public void setPeoadvance(String peoadvance) {
        this.peoadvance = peoadvance;
    }

    public String getPeoaccounts() {
        return peoaccounts;
    }

    public void setPeoaccounts(String peoaccounts) {
        this.peoaccounts = peoaccounts;
    }

    public String getPeoassessed() {
        return peoassessed;
    }

    public void setPeoassessed(String peoassessed) {
        this.peoassessed = peoassessed;
    }

    public String getPeocustombarone() {
        return peocustombarone;
    }

    public void setPeocustombarone(String peocustombarone) {
        this.peocustombarone = peocustombarone;
    }

    public String getPeocustombartow() {
        return peocustombartow;
    }

    public void setPeocustombartow(String peocustombartow) {
        this.peocustombartow = peocustombartow;
    }

    public String getPeoremark() {
        return peoremark;
    }

    public void setPeoremark(String peoremark) {
        this.peoremark = peoremark;
    }

	public Provideinfo() {
		super();
	}

	public Provideinfo(String peoid, String peoname, String peoshortname, String peoabbreviation, String peofullname,
			String peoascription, String peopeeid, String peopeename, String peoarea, String peocurrency,
			String peoprincipal, String peolinkman, String peophoneone, String peophonetwo, String peophonethree,
			String peomobilephone, String peobankaccounts, String peoopenbank, String peopersonnel,
			String peoregistration, String peocalling, String peoemail, String peoweb, String peofaxes,
			Date peoldoutdate, Date peoldodate, Date peonewoutdate, Date peonewodate, String peoincluded,
			String peoterminadate, Double peozhangkuanedu, Double peoremainedu, String peopayment,
			Double peomonthreckoning, String peocreditrating, String peoinvoicetype, Double peoqcprepaymoney,
			Double peoqcdealmoney, Double peoqmprepaymoney, Double peoqmdealmoney, String peoadvance,
			String peoaccounts, String peoassessed, String peocustombarone, String peocustombartow, String peoremark) {
		super();
		this.peoid = peoid;
		this.peoname = peoname;
		this.peoshortname = peoshortname;
		this.peoabbreviation = peoabbreviation;
		this.peofullname = peofullname;
		this.peoascription = peoascription;
		this.peopeeid = peopeeid;
		this.peopeename = peopeename;
		this.peoarea = peoarea;
		this.peocurrency = peocurrency;
		this.peoprincipal = peoprincipal;
		this.peolinkman = peolinkman;
		this.peophoneone = peophoneone;
		this.peophonetwo = peophonetwo;
		this.peophonethree = peophonethree;
		this.peomobilephone = peomobilephone;
		this.peobankaccounts = peobankaccounts;
		this.peoopenbank = peoopenbank;
		this.peopersonnel = peopersonnel;
		this.peoregistration = peoregistration;
		this.peocalling = peocalling;
		this.peoemail = peoemail;
		this.peoweb = peoweb;
		this.peofaxes = peofaxes;
		this.peoldoutdate = peoldoutdate;
		this.peoldodate = peoldodate;
		this.peonewoutdate = peonewoutdate;
		this.peonewodate = peonewodate;
		this.peoincluded = peoincluded;
		this.peoterminadate = peoterminadate;
		this.peozhangkuanedu = peozhangkuanedu;
		this.peoremainedu = peoremainedu;
		this.peopayment = peopayment;
		this.peomonthreckoning = peomonthreckoning;
		this.peocreditrating = peocreditrating;
		this.peoinvoicetype = peoinvoicetype;
		this.peoqcprepaymoney = peoqcprepaymoney;
		this.peoqcdealmoney = peoqcdealmoney;
		this.peoqmprepaymoney = peoqmprepaymoney;
		this.peoqmdealmoney = peoqmdealmoney;
		this.peoadvance = peoadvance;
		this.peoaccounts = peoaccounts;
		this.peoassessed = peoassessed;
		this.peocustombarone = peocustombarone;
		this.peocustombartow = peocustombartow;
		this.peoremark = peoremark;
	}

	public Provideinfo(String peoname, String peoshortname, String peoabbreviation, String peofullname,
			String peoascription, String peopeeid, String peopeename, String peoarea, String peocurrency,
			String peoprincipal, String peolinkman, String peophoneone, String peophonetwo, String peophonethree,
			String peomobilephone, String peobankaccounts, String peoopenbank, String peopersonnel,
			String peoregistration, String peocalling, String peoemail, String peoweb, String peofaxes,
			Date peoldoutdate, Date peoldodate, Date peonewoutdate, Date peonewodate, String peoincluded,
			String peoterminadate, Double peozhangkuanedu, Double peoremainedu, String peopayment,
			Double peomonthreckoning, String peocreditrating, String peoinvoicetype, Double peoqcprepaymoney,
			Double peoqcdealmoney, Double peoqmprepaymoney, Double peoqmdealmoney, String peoadvance,
			String peoaccounts, String peoassessed, String peocustombarone, String peocustombartow, String peoremark) {
		super();
		this.peoname = peoname;
		this.peoshortname = peoshortname;
		this.peoabbreviation = peoabbreviation;
		this.peofullname = peofullname;
		this.peoascription = peoascription;
		this.peopeeid = peopeeid;
		this.peopeename = peopeename;
		this.peoarea = peoarea;
		this.peocurrency = peocurrency;
		this.peoprincipal = peoprincipal;
		this.peolinkman = peolinkman;
		this.peophoneone = peophoneone;
		this.peophonetwo = peophonetwo;
		this.peophonethree = peophonethree;
		this.peomobilephone = peomobilephone;
		this.peobankaccounts = peobankaccounts;
		this.peoopenbank = peoopenbank;
		this.peopersonnel = peopersonnel;
		this.peoregistration = peoregistration;
		this.peocalling = peocalling;
		this.peoemail = peoemail;
		this.peoweb = peoweb;
		this.peofaxes = peofaxes;
		this.peoldoutdate = peoldoutdate;
		this.peoldodate = peoldodate;
		this.peonewoutdate = peonewoutdate;
		this.peonewodate = peonewodate;
		this.peoincluded = peoincluded;
		this.peoterminadate = peoterminadate;
		this.peozhangkuanedu = peozhangkuanedu;
		this.peoremainedu = peoremainedu;
		this.peopayment = peopayment;
		this.peomonthreckoning = peomonthreckoning;
		this.peocreditrating = peocreditrating;
		this.peoinvoicetype = peoinvoicetype;
		this.peoqcprepaymoney = peoqcprepaymoney;
		this.peoqcdealmoney = peoqcdealmoney;
		this.peoqmprepaymoney = peoqmprepaymoney;
		this.peoqmdealmoney = peoqmdealmoney;
		this.peoadvance = peoadvance;
		this.peoaccounts = peoaccounts;
		this.peoassessed = peoassessed;
		this.peocustombarone = peocustombarone;
		this.peocustombartow = peocustombartow;
		this.peoremark = peoremark;
	}

	@Override
	public String toString() {
		return "Provideinfo [peoid=" + peoid + ", peoname=" + peoname + ", peoshortname=" + peoshortname
				+ ", peoabbreviation=" + peoabbreviation + ", peofullname=" + peofullname + ", peoascription="
				+ peoascription + ", peopeeid=" + peopeeid + ", peopeename=" + peopeename + ", peoarea=" + peoarea
				+ ", peocurrency=" + peocurrency + ", peoprincipal=" + peoprincipal + ", peolinkman=" + peolinkman
				+ ", peophoneone=" + peophoneone + ", peophonetwo=" + peophonetwo + ", peophonethree=" + peophonethree
				+ ", peomobilephone=" + peomobilephone + ", peobankaccounts=" + peobankaccounts + ", peoopenbank="
				+ peoopenbank + ", peopersonnel=" + peopersonnel + ", peoregistration=" + peoregistration
				+ ", peocalling=" + peocalling + ", peoemail=" + peoemail + ", peoweb=" + peoweb + ", peofaxes="
				+ peofaxes + ", peoldoutdate=" + peoldoutdate + ", peoldodate=" + peoldodate + ", peonewoutdate="
				+ peonewoutdate + ", peonewodate=" + peonewodate + ", peoincluded=" + peoincluded + ", peoterminadate="
				+ peoterminadate + ", peozhangkuanedu=" + peozhangkuanedu + ", peoremainedu=" + peoremainedu
				+ ", peopayment=" + peopayment + ", peomonthreckoning=" + peomonthreckoning + ", peocreditrating="
				+ peocreditrating + ", peoinvoicetype=" + peoinvoicetype + ", peoqcprepaymoney=" + peoqcprepaymoney
				+ ", peoqcdealmoney=" + peoqcdealmoney + ", peoqmprepaymoney=" + peoqmprepaymoney + ", peoqmdealmoney="
				+ peoqmdealmoney + ", peoadvance=" + peoadvance + ", peoaccounts=" + peoaccounts + ", peoassessed="
				+ peoassessed + ", peocustombarone=" + peocustombarone + ", peocustombartow=" + peocustombartow
				+ ", peoremark=" + peoremark + "]";
	}
    
    
}