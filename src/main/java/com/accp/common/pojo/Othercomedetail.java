package com.accp.common.pojo;

import java.io.Serializable;

/**
 * othercomedetail  其它入库明细表 
 * @author 
 */
public class Othercomedetail implements Serializable {
	/**
     * 其它入库主表id
     */
    private String othcomeid;

    /**
     * 栏号
     */
    private String othcomeno;

    public String getOthcomeid() {
        return othcomeid;
    }

    public void setOthcomeid(String othcomeid) {
        this.othcomeid = othcomeid;
    }

    public String getOthcomeno() {
        return othcomeno;
    }

    public void setOthcomeno(String othcomeno) {
        this.othcomeno = othcomeno;
    }
	
	/**
     * 物料编号
     */
    private String othcomemertialsid;

    /**
     * 物料名称
     */
    private String othcomemertialname;

    /**
     * 规格型号
     */
    private String othcometypes;

    /**
     * 单位
     */
    private String othcomeunits;

    /**
     * 数量
     */
    private Integer othcomeamount;

    /**
     * 备注
     */
    private String othcomeremark;

    /**
     * 单价
     */
    private Double othprice;

    /**
     * 金额
     */
    private Double othmoney;

    /**
     * 批号
     */
    private String othph;

    private static final long serialVersionUID = 1L;

    public String getOthcomemertialsid() {
        return othcomemertialsid;
    }

    public void setOthcomemertialsid(String othcomemertialsid) {
        this.othcomemertialsid = othcomemertialsid;
    }

    public String getOthcomemertialname() {
        return othcomemertialname;
    }

    public void setOthcomemertialname(String othcomemertialname) {
        this.othcomemertialname = othcomemertialname;
    }

    public String getOthcometypes() {
        return othcometypes;
    }

    public void setOthcometypes(String othcometypes) {
        this.othcometypes = othcometypes;
    }

    public String getOthcomeunits() {
        return othcomeunits;
    }

    public void setOthcomeunits(String othcomeunits) {
        this.othcomeunits = othcomeunits;
    }

    public Integer getOthcomeamount() {
        return othcomeamount;
    }

    public void setOthcomeamount(Integer othcomeamount) {
        this.othcomeamount = othcomeamount;
    }

    public String getOthcomeremark() {
        return othcomeremark;
    }

    public void setOthcomeremark(String othcomeremark) {
        this.othcomeremark = othcomeremark;
    }

    public Double getOthprice() {
        return othprice;
    }

    public void setOthprice(Double othprice) {
        this.othprice = othprice;
    }

    public Double getOthmoney() {
        return othmoney;
    }

    public void setOthmoney(Double othmoney) {
        this.othmoney = othmoney;
    }

    public String getOthph() {
        return othph;
    }

    public void setOthph(String othph) {
        this.othph = othph;
    }

	public Othercomedetail() {
		super();
	}

	public Othercomedetail(String othcomeid, String othcomeno, String othcomemertialsid, String othcomemertialname,
			String othcometypes, String othcomeunits, Integer othcomeamount, String othcomeremark, Double othprice,
			Double othmoney, String othph) {
		super();
		this.othcomeid = othcomeid;
		this.othcomeno = othcomeno;
		this.othcomemertialsid = othcomemertialsid;
		this.othcomemertialname = othcomemertialname;
		this.othcometypes = othcometypes;
		this.othcomeunits = othcomeunits;
		this.othcomeamount = othcomeamount;
		this.othcomeremark = othcomeremark;
		this.othprice = othprice;
		this.othmoney = othmoney;
		this.othph = othph;
	}

	public Othercomedetail(String othcomeno, String othcomemertialsid, String othcomemertialname, String othcometypes,
			String othcomeunits, Integer othcomeamount, String othcomeremark, Double othprice, Double othmoney,
			String othph) {
		super();
		this.othcomeno = othcomeno;
		this.othcomemertialsid = othcomemertialsid;
		this.othcomemertialname = othcomemertialname;
		this.othcometypes = othcometypes;
		this.othcomeunits = othcomeunits;
		this.othcomeamount = othcomeamount;
		this.othcomeremark = othcomeremark;
		this.othprice = othprice;
		this.othmoney = othmoney;
		this.othph = othph;
	}

	public Othercomedetail(String othcomemertialsid, String othcomemertialname, String othcometypes,
			String othcomeunits, Integer othcomeamount, String othcomeremark, Double othprice, Double othmoney,
			String othph) {
		super();
		this.othcomemertialsid = othcomemertialsid;
		this.othcomemertialname = othcomemertialname;
		this.othcometypes = othcometypes;
		this.othcomeunits = othcomeunits;
		this.othcomeamount = othcomeamount;
		this.othcomeremark = othcomeremark;
		this.othprice = othprice;
		this.othmoney = othmoney;
		this.othph = othph;
	}

	@Override
	public String toString() {
		return "Othercomedetail [othcomeid=" + othcomeid + ", othcomeno=" + othcomeno + ", othcomemertialsid="
				+ othcomemertialsid + ", othcomemertialname=" + othcomemertialname + ", othcometypes=" + othcometypes
				+ ", othcomeunits=" + othcomeunits + ", othcomeamount=" + othcomeamount + ", othcomeremark="
				+ othcomeremark + ", othprice=" + othprice + ", othmoney=" + othmoney + ", othph=" + othph + "]";
	}
    
    
}