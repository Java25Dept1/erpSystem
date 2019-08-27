package com.accp.common.pojo;

import java.io.Serializable;

/**
 * saleobey  销售报价明细表
 * @author 
 */
public class Saleobey implements Serializable {
	/**
     * 编号
     */
    private Integer sono;

    /**
     * 栏号
     */
    private String soid;

    public Integer getSono() {
        return sono;
    }

    public void setSono(Integer sono) {
        this.sono = sono;
    }

    public String getSoid() {
        return soid;
    }

    public void setSoid(String soid) {
        this.soid = soid;
    }
	
	/**
     * 物料编号
     */
    private String sowlid;

    /**
     * 物料名称
     */
    private String sowlname;

    /**
     * 规格型号
     */
    private String sotype;

    /**
     * 单位名称
     */
    private Integer sodwname;

    /**
     * 数量
     */
    private String sonumber;

    /**
     * 折扣前单价
     */
    private Double sozkprice;

    /**
     * 折数
     */
    private Double sozs;

    /**
     * 单价
     */
    private Double soprice;

    /**
     * 金额
     */
    private Double somoney;

    /**
     * 税率
     */
    private Double sosl;

    /**
     * 税额
     */
    private Double sopaid;

    /**
     * 含税金额
     */
    private Double soamount;

    /**
     * 分配赠品
     */
    private String sozp;

    /**
     * 分录备注
     */
    private String soremark;

    /**
     * 实际成本
     */
    private Double factcost;

    /**
     * 标准成本
     */
    private Double criterioncost;

    private static final long serialVersionUID = 1L;

    public String getSowlid() {
        return sowlid;
    }

    public void setSowlid(String sowlid) {
        this.sowlid = sowlid;
    }

    public String getSowlname() {
        return sowlname;
    }

    public void setSowlname(String sowlname) {
        this.sowlname = sowlname;
    }

    public String getSotype() {
        return sotype;
    }

    public void setSotype(String sotype) {
        this.sotype = sotype;
    }

    public Integer getSodwname() {
        return sodwname;
    }

    public void setSodwname(Integer sodwname) {
        this.sodwname = sodwname;
    }

    public String getSonumber() {
        return sonumber;
    }

    public void setSonumber(String sonumber) {
        this.sonumber = sonumber;
    }

    public Double getSozkprice() {
        return sozkprice;
    }

    public void setSozkprice(Double sozkprice) {
        this.sozkprice = sozkprice;
    }

    public Double getSozs() {
        return sozs;
    }

    public void setSozs(Double sozs) {
        this.sozs = sozs;
    }

    public Double getSoprice() {
        return soprice;
    }

    public void setSoprice(Double soprice) {
        this.soprice = soprice;
    }

    public Double getSomoney() {
        return somoney;
    }

    public void setSomoney(Double somoney) {
        this.somoney = somoney;
    }

    public Double getSosl() {
        return sosl;
    }

    public void setSosl(Double sosl) {
        this.sosl = sosl;
    }

    public Double getSopaid() {
        return sopaid;
    }

    public void setSopaid(Double sopaid) {
        this.sopaid = sopaid;
    }

    public Double getSoamount() {
        return soamount;
    }

    public void setSoamount(Double soamount) {
        this.soamount = soamount;
    }

    public String getSozp() {
        return sozp;
    }

    public void setSozp(String sozp) {
        this.sozp = sozp;
    }

    public String getSoremark() {
        return soremark;
    }

    public void setSoremark(String soremark) {
        this.soremark = soremark;
    }

    public Double getFactcost() {
        return factcost;
    }

    public void setFactcost(Double factcost) {
        this.factcost = factcost;
    }

    public Double getCriterioncost() {
        return criterioncost;
    }

    public void setCriterioncost(Double criterioncost) {
        this.criterioncost = criterioncost;
    }

	public Saleobey() {
		super();
	}

	public Saleobey(Integer sono, String soid, String sowlid, String sowlname, String sotype, Integer sodwname,
			String sonumber, Double sozkprice, Double sozs, Double soprice, Double somoney, Double sosl, Double sopaid,
			Double soamount, String sozp, String soremark, Double factcost, Double criterioncost) {
		super();
		this.sono = sono;
		this.soid = soid;
		this.sowlid = sowlid;
		this.sowlname = sowlname;
		this.sotype = sotype;
		this.sodwname = sodwname;
		this.sonumber = sonumber;
		this.sozkprice = sozkprice;
		this.sozs = sozs;
		this.soprice = soprice;
		this.somoney = somoney;
		this.sosl = sosl;
		this.sopaid = sopaid;
		this.soamount = soamount;
		this.sozp = sozp;
		this.soremark = soremark;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
	}

	public Saleobey(String soid, String sowlid, String sowlname, String sotype, Integer sodwname, String sonumber,
			Double sozkprice, Double sozs, Double soprice, Double somoney, Double sosl, Double sopaid, Double soamount,
			String sozp, String soremark, Double factcost, Double criterioncost) {
		super();
		this.soid = soid;
		this.sowlid = sowlid;
		this.sowlname = sowlname;
		this.sotype = sotype;
		this.sodwname = sodwname;
		this.sonumber = sonumber;
		this.sozkprice = sozkprice;
		this.sozs = sozs;
		this.soprice = soprice;
		this.somoney = somoney;
		this.sosl = sosl;
		this.sopaid = sopaid;
		this.soamount = soamount;
		this.sozp = sozp;
		this.soremark = soremark;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
	}

	public Saleobey(String sowlid, String sowlname, String sotype, Integer sodwname, String sonumber, Double sozkprice,
			Double sozs, Double soprice, Double somoney, Double sosl, Double sopaid, Double soamount, String sozp,
			String soremark, Double factcost, Double criterioncost) {
		super();
		this.sowlid = sowlid;
		this.sowlname = sowlname;
		this.sotype = sotype;
		this.sodwname = sodwname;
		this.sonumber = sonumber;
		this.sozkprice = sozkprice;
		this.sozs = sozs;
		this.soprice = soprice;
		this.somoney = somoney;
		this.sosl = sosl;
		this.sopaid = sopaid;
		this.soamount = soamount;
		this.sozp = sozp;
		this.soremark = soremark;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
	}
    
    
}