package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * orderdetails  销售订单明细表
 * @author 
 */
public class Orderdetails implements Serializable {
	/**
     * 编号
     */
    private Integer odid;

    /**
     * 栏号
     */
    private String odno;

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public String getOdno() {
        return odno;
    }

    public void setOdno(String odno) {
        this.odno = odno;
    }
	
	/**
     * 物料编号
     */
    private String odwlid;

    /**
     * 物料名称
     */
    private String odwlname;

    /**
     * 规格型号
     */
    private String odtype;

    /**
     * 单位名称
     */
    private Integer oddwname;

    /**
     * 数量
     */
    private String odnumber;

    /**
     * 折扣前单价
     */
    private Double odzkprice;

    /**
     * 折数
     */
    private Double odzs;

    /**
     * 单价
     */
    private Double odprice;

    /**
     * 金额
     */
    private Double odmoney;

    /**
     * 税率
     */
    private Double odsl;

    /**
     * 税额
     */
    private Double odpaid;

    /**
     * 含税金额
     */
    private Double odamount;

    /**
     * 分配赠品
     */
    private String odzp;

    /**
     * 分录备注
     */
    private String odremark;

    /**
     * 预出库日
     */
    private Date odyckdate;

    /**
     * 未出库数量
     */
    private String odwcknumber;

    /**
     * 物料组合
     */
    private String odcomb;

    /**
     * 物料单别
     */
    private String oddb;

    /**
     * 物料单号
     */
    private String oddh;

    /**
     * 生产
     */
    private String odsc;

    /**
     * 排成单号
     */
    private String odpcdh;

    /**
     * 以生产数量
     */
    private Integer odproduction;

    private static final long serialVersionUID = 1L;

    public String getOdwlid() {
        return odwlid;
    }

    public void setOdwlid(String odwlid) {
        this.odwlid = odwlid;
    }

    public String getOdwlname() {
        return odwlname;
    }

    public void setOdwlname(String odwlname) {
        this.odwlname = odwlname;
    }

    public String getOdtype() {
        return odtype;
    }

    public void setOdtype(String odtype) {
        this.odtype = odtype;
    }

    public Integer getOddwname() {
        return oddwname;
    }

    public void setOddwname(Integer oddwname) {
        this.oddwname = oddwname;
    }

    public String getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(String odnumber) {
        this.odnumber = odnumber;
    }

    public Double getOdzkprice() {
        return odzkprice;
    }

    public void setOdzkprice(Double odzkprice) {
        this.odzkprice = odzkprice;
    }

    public Double getOdzs() {
        return odzs;
    }

    public void setOdzs(Double odzs) {
        this.odzs = odzs;
    }

    public Double getOdprice() {
        return odprice;
    }

    public void setOdprice(Double odprice) {
        this.odprice = odprice;
    }

    public Double getOdmoney() {
        return odmoney;
    }

    public void setOdmoney(Double odmoney) {
        this.odmoney = odmoney;
    }

    public Double getOdsl() {
        return odsl;
    }

    public void setOdsl(Double odsl) {
        this.odsl = odsl;
    }

    public Double getOdpaid() {
        return odpaid;
    }

    public void setOdpaid(Double odpaid) {
        this.odpaid = odpaid;
    }

    public Double getOdamount() {
        return odamount;
    }

    public void setOdamount(Double odamount) {
        this.odamount = odamount;
    }

    public String getOdzp() {
        return odzp;
    }

    public void setOdzp(String odzp) {
        this.odzp = odzp;
    }

    public String getOdremark() {
        return odremark;
    }

    public void setOdremark(String odremark) {
        this.odremark = odremark;
    }

    public Date getOdyckdate() {
        return odyckdate;
    }

    public void setOdyckdate(Date odyckdate) {
        this.odyckdate = odyckdate;
    }

    public String getOdwcknumber() {
        return odwcknumber;
    }

    public void setOdwcknumber(String odwcknumber) {
        this.odwcknumber = odwcknumber;
    }

    public String getOdcomb() {
        return odcomb;
    }

    public void setOdcomb(String odcomb) {
        this.odcomb = odcomb;
    }

    public String getOddb() {
        return oddb;
    }

    public void setOddb(String oddb) {
        this.oddb = oddb;
    }

    public String getOddh() {
        return oddh;
    }

    public void setOddh(String oddh) {
        this.oddh = oddh;
    }

    public String getOdsc() {
        return odsc;
    }

    public void setOdsc(String odsc) {
        this.odsc = odsc;
    }

    public String getOdpcdh() {
        return odpcdh;
    }

    public void setOdpcdh(String odpcdh) {
        this.odpcdh = odpcdh;
    }

    public Integer getOdproduction() {
        return odproduction;
    }

    public void setOdproduction(Integer odproduction) {
        this.odproduction = odproduction;
    }

	public Orderdetails() {
		super();
	}

	public Orderdetails(Integer odid, String odno, String odwlid, String odwlname, String odtype, Integer oddwname,
			String odnumber, Double odzkprice, Double odzs, Double odprice, Double odmoney, Double odsl, Double odpaid,
			Double odamount, String odzp, String odremark, Date odyckdate, String odwcknumber, String odcomb,
			String oddb, String oddh, String odsc, String odpcdh, Integer odproduction) {
		super();
		this.odid = odid;
		this.odno = odno;
		this.odwlid = odwlid;
		this.odwlname = odwlname;
		this.odtype = odtype;
		this.oddwname = oddwname;
		this.odnumber = odnumber;
		this.odzkprice = odzkprice;
		this.odzs = odzs;
		this.odprice = odprice;
		this.odmoney = odmoney;
		this.odsl = odsl;
		this.odpaid = odpaid;
		this.odamount = odamount;
		this.odzp = odzp;
		this.odremark = odremark;
		this.odyckdate = odyckdate;
		this.odwcknumber = odwcknumber;
		this.odcomb = odcomb;
		this.oddb = oddb;
		this.oddh = oddh;
		this.odsc = odsc;
		this.odpcdh = odpcdh;
		this.odproduction = odproduction;
	}

	public Orderdetails(String odno, String odwlid, String odwlname, String odtype, Integer oddwname, String odnumber,
			Double odzkprice, Double odzs, Double odprice, Double odmoney, Double odsl, Double odpaid, Double odamount,
			String odzp, String odremark, Date odyckdate, String odwcknumber, String odcomb, String oddb, String oddh,
			String odsc, String odpcdh, Integer odproduction) {
		super();
		this.odno = odno;
		this.odwlid = odwlid;
		this.odwlname = odwlname;
		this.odtype = odtype;
		this.oddwname = oddwname;
		this.odnumber = odnumber;
		this.odzkprice = odzkprice;
		this.odzs = odzs;
		this.odprice = odprice;
		this.odmoney = odmoney;
		this.odsl = odsl;
		this.odpaid = odpaid;
		this.odamount = odamount;
		this.odzp = odzp;
		this.odremark = odremark;
		this.odyckdate = odyckdate;
		this.odwcknumber = odwcknumber;
		this.odcomb = odcomb;
		this.oddb = oddb;
		this.oddh = oddh;
		this.odsc = odsc;
		this.odpcdh = odpcdh;
		this.odproduction = odproduction;
	}

	public Orderdetails(String odwlid, String odwlname, String odtype, Integer oddwname, String odnumber,
			Double odzkprice, Double odzs, Double odprice, Double odmoney, Double odsl, Double odpaid, Double odamount,
			String odzp, String odremark, Date odyckdate, String odwcknumber, String odcomb, String oddb, String oddh,
			String odsc, String odpcdh, Integer odproduction) {
		super();
		this.odwlid = odwlid;
		this.odwlname = odwlname;
		this.odtype = odtype;
		this.oddwname = oddwname;
		this.odnumber = odnumber;
		this.odzkprice = odzkprice;
		this.odzs = odzs;
		this.odprice = odprice;
		this.odmoney = odmoney;
		this.odsl = odsl;
		this.odpaid = odpaid;
		this.odamount = odamount;
		this.odzp = odzp;
		this.odremark = odremark;
		this.odyckdate = odyckdate;
		this.odwcknumber = odwcknumber;
		this.odcomb = odcomb;
		this.oddb = oddb;
		this.oddh = oddh;
		this.odsc = odsc;
		this.odpcdh = odpcdh;
		this.odproduction = odproduction;
	}

	@Override
	public String toString() {
		return "Orderdetails [odid=" + odid + ", odno=" + odno + ", odwlid=" + odwlid + ", odwlname=" + odwlname
				+ ", odtype=" + odtype + ", oddwname=" + oddwname + ", odnumber=" + odnumber + ", odzkprice="
				+ odzkprice + ", odzs=" + odzs + ", odprice=" + odprice + ", odmoney=" + odmoney + ", odsl=" + odsl
				+ ", odpaid=" + odpaid + ", odamount=" + odamount + ", odzp=" + odzp + ", odremark=" + odremark
				+ ", odyckdate=" + odyckdate + ", odwcknumber=" + odwcknumber + ", odcomb=" + odcomb + ", oddb=" + oddb
				+ ", oddh=" + oddh + ", odsc=" + odsc + ", odpcdh=" + odpcdh + ", odproduction=" + odproduction + "]";
	}
    
    
}