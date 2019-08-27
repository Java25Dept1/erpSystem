package com.accp.common.pojo;

import java.io.Serializable;

/**
 * selectdet  销售发票内容明细表   
 * @author 
 */
public class Selectdet implements Serializable {
	/**
     * 单据号码sellissueorder(billId)
     */
    private String billid;

    /**
     * 栏号
     */
    private Integer cotemark;

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public Integer getCotemark() {
        return cotemark;
    }

    public void setCotemark(Integer cotemark) {
        this.cotemark = cotemark;
    }
	
	/**
     * 物料编号Materiel(matid)
     */
    private String matid;

    /**
     * 物料名称
     */
    private String matname;

    /**
     * 规格型号
     */
    private String matspec;

    /**
     * 单位名称
     */
    private String matunit;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 折扣前单价
     */
    private Double agioagoprice;

    /**
     * 折数
     */
    private Double agio;

    /**
     * 单价
     */
    private Double price;

    /**
     * 金额
     */
    private Double money;

    /**
     * 税率
     */
    private Double cess;

    /**
     * 税额
     */
    private Double taxmoney;

    /**
     * 含税金额
     */
    private Double intaxmoney;

    /**
     * 实际成本
     */
    private Double factcost;

    /**
     * 标准成本
     */
    private Double criterioncost;

    /**
     * 来源单别
     */
    private String sinname;

    /**
     * 来源单号
     */
    private String originbillid;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getMatid() {
        return matid;
    }

    public void setMatid(String matid) {
        this.matid = matid;
    }

    public String getMatname() {
        return matname;
    }

    public void setMatname(String matname) {
        this.matname = matname;
    }

    public String getMatspec() {
        return matspec;
    }

    public void setMatspec(String matspec) {
        this.matspec = matspec;
    }

    public String getMatunit() {
        return matunit;
    }

    public void setMatunit(String matunit) {
        this.matunit = matunit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getAgioagoprice() {
        return agioagoprice;
    }

    public void setAgioagoprice(Double agioagoprice) {
        this.agioagoprice = agioagoprice;
    }

    public Double getAgio() {
        return agio;
    }

    public void setAgio(Double agio) {
        this.agio = agio;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getCess() {
        return cess;
    }

    public void setCess(Double cess) {
        this.cess = cess;
    }

    public Double getTaxmoney() {
        return taxmoney;
    }

    public void setTaxmoney(Double taxmoney) {
        this.taxmoney = taxmoney;
    }

    public Double getIntaxmoney() {
        return intaxmoney;
    }

    public void setIntaxmoney(Double intaxmoney) {
        this.intaxmoney = intaxmoney;
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

    public String getSinname() {
        return sinname;
    }

    public void setSinname(String sinname) {
        this.sinname = sinname;
    }

    public String getOriginbillid() {
        return originbillid;
    }

    public void setOriginbillid(String originbillid) {
        this.originbillid = originbillid;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Selectdet() {
		super();
	}

	public Selectdet(String billid, Integer cotemark, String matid, String matname, String matspec, String matunit,
			Integer number, Double agioagoprice, Double agio, Double price, Double money, Double cess, Double taxmoney,
			Double intaxmoney, Double factcost, Double criterioncost, String sinname, String originbillid,
			Integer enables) {
		super();
		this.billid = billid;
		this.cotemark = cotemark;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.matunit = matunit;
		this.number = number;
		this.agioagoprice = agioagoprice;
		this.agio = agio;
		this.price = price;
		this.money = money;
		this.cess = cess;
		this.taxmoney = taxmoney;
		this.intaxmoney = intaxmoney;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
		this.sinname = sinname;
		this.originbillid = originbillid;
		this.enables = enables;
	}

	public Selectdet(Integer cotemark, String matid, String matname, String matspec, String matunit, Integer number,
			Double agioagoprice, Double agio, Double price, Double money, Double cess, Double taxmoney,
			Double intaxmoney, Double factcost, Double criterioncost, String sinname, String originbillid,
			Integer enables) {
		super();
		this.cotemark = cotemark;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.matunit = matunit;
		this.number = number;
		this.agioagoprice = agioagoprice;
		this.agio = agio;
		this.price = price;
		this.money = money;
		this.cess = cess;
		this.taxmoney = taxmoney;
		this.intaxmoney = intaxmoney;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
		this.sinname = sinname;
		this.originbillid = originbillid;
		this.enables = enables;
	}

	public Selectdet(Integer cotemark, String matname, String matspec, String matunit, Integer number,
			Double agioagoprice, Double agio, Double price, Double money, Double cess, Double taxmoney,
			Double intaxmoney, Double factcost, Double criterioncost, String sinname, String originbillid,
			Integer enables) {
		super();
		this.cotemark = cotemark;
		this.matname = matname;
		this.matspec = matspec;
		this.matunit = matunit;
		this.number = number;
		this.agioagoprice = agioagoprice;
		this.agio = agio;
		this.price = price;
		this.money = money;
		this.cess = cess;
		this.taxmoney = taxmoney;
		this.intaxmoney = intaxmoney;
		this.factcost = factcost;
		this.criterioncost = criterioncost;
		this.sinname = sinname;
		this.originbillid = originbillid;
		this.enables = enables;
	}
    
    
}