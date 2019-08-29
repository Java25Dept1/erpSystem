package com.accp.common.pojo;

import java.io.Serializable;

/**
 * checkdetail  盘点明细表
 * @author 
 */
public class Checkdetail implements Serializable {
	 /**
     * 盘点单的流水号check(cheid)
     */
    private String cheid;

    /**
     * 栏号
     */
    private Integer chelineid;


    public String getCheid() {
        return cheid;
    }

    public void setCheid(String cheid) {
        this.cheid = cheid;
    }

    public Integer getChelineid() {
        return chelineid;
    }

    public void setChelineid(Integer chelineid) {
        this.chelineid = chelineid;
    }
	
	/**
     * 物料的编号Materiel(matid)
     */
    private String chematerielid;

    /**
     * 物料的名称
     */
    private String chematerielname;

    /**
     * 单位名称
     */
    private String cheunitname;

    /**
     * 账面数量
     */
    private Integer cheaccountqty;

    /**
     * 盘点数量
     */
    private Integer checheckqty;

    /**
     * 盈亏数量
     */
    private Integer cheprofitandlossqty;

    /**
     * 盈亏金额
     */
    private Double cheprofitandlossmoney;

    /**
     * 单价
     */
    private Double cheprice;

    /**
     * 备注
     */
    private String cheremark;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getChematerielid() {
        return chematerielid;
    }

    public void setChematerielid(String chematerielid) {
        this.chematerielid = chematerielid;
    }

    public String getChematerielname() {
        return chematerielname;
    }

    public void setChematerielname(String chematerielname) {
        this.chematerielname = chematerielname;
    }

    public String getCheunitname() {
        return cheunitname;
    }

    public void setCheunitname(String cheunitname) {
        this.cheunitname = cheunitname;
    }

    public Integer getCheaccountqty() {
        return cheaccountqty;
    }

    public void setCheaccountqty(Integer cheaccountqty) {
        this.cheaccountqty = cheaccountqty;
    }

    public Integer getChecheckqty() {
        return checheckqty;
    }

    public void setChecheckqty(Integer checheckqty) {
        this.checheckqty = checheckqty;
    }

    public Integer getCheprofitandlossqty() {
        return cheprofitandlossqty;
    }

    public void setCheprofitandlossqty(Integer cheprofitandlossqty) {
        this.cheprofitandlossqty = cheprofitandlossqty;
    }

    public Double getCheprofitandlossmoney() {
        return cheprofitandlossmoney;
    }

    public void setCheprofitandlossmoney(Double cheprofitandlossmoney) {
        this.cheprofitandlossmoney = cheprofitandlossmoney;
    }

    public Double getCheprice() {
        return cheprice;
    }

    public void setCheprice(Double cheprice) {
        this.cheprice = cheprice;
    }

    public String getCheremark() {
        return cheremark;
    }

    public void setCheremark(String cheremark) {
        this.cheremark = cheremark;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Checkdetail() {
		super();
	}

	public Checkdetail(String cheid, Integer chelineid, String chematerielid, String chematerielname,
			String cheunitname, Integer cheaccountqty, Integer checheckqty, Integer cheprofitandlossqty,
			Double cheprofitandlossmoney, Double cheprice, String cheremark, Integer enables) {
		super();
		this.cheid = cheid;
		this.chelineid = chelineid;
		this.chematerielid = chematerielid;
		this.chematerielname = chematerielname;
		this.cheunitname = cheunitname;
		this.cheaccountqty = cheaccountqty;
		this.checheckqty = checheckqty;
		this.cheprofitandlossqty = cheprofitandlossqty;
		this.cheprofitandlossmoney = cheprofitandlossmoney;
		this.cheprice = cheprice;
		this.cheremark = cheremark;
		this.enables = enables;
	}

	@Override
	public String toString() {
		return "Checkdetail [cheid=" + cheid + ", chelineid=" + chelineid + ", chematerielid=" + chematerielid
				+ ", chematerielname=" + chematerielname + ", cheunitname=" + cheunitname + ", cheaccountqty="
				+ cheaccountqty + ", checheckqty=" + checheckqty + ", cheprofitandlossqty=" + cheprofitandlossqty
				+ ", cheprofitandlossmoney=" + cheprofitandlossmoney + ", cheprice=" + cheprice + ", cheremark="
				+ cheremark + ", enables=" + enables + "]";
	}

	public Checkdetail(String chematerielid, String chematerielname, String cheunitname, Integer cheaccountqty,
			Integer checheckqty, Integer cheprofitandlossqty, Double cheprofitandlossmoney, Double cheprice,
			String cheremark, Integer enables) {
		super();
		this.chematerielid = chematerielid;
		this.chematerielname = chematerielname;
		this.cheunitname = cheunitname;
		this.cheaccountqty = cheaccountqty;
		this.checheckqty = checheckqty;
		this.cheprofitandlossqty = cheprofitandlossqty;
		this.cheprofitandlossmoney = cheprofitandlossmoney;
		this.cheprice = cheprice;
		this.cheremark = cheremark;
		this.enables = enables;
	}

	public Checkdetail(Integer chelineid, String chematerielid, String chematerielname, String cheunitname,
			Integer cheaccountqty, Integer checheckqty, Integer cheprofitandlossqty, Double cheprofitandlossmoney,
			Double cheprice, String cheremark, Integer enables) {
		super();
		this.chelineid = chelineid;
		this.chematerielid = chematerielid;
		this.chematerielname = chematerielname;
		this.cheunitname = cheunitname;
		this.cheaccountqty = cheaccountqty;
		this.checheckqty = checheckqty;
		this.cheprofitandlossqty = cheprofitandlossqty;
		this.cheprofitandlossmoney = cheprofitandlossmoney;
		this.cheprice = cheprice;
		this.cheremark = cheremark;
		this.enables = enables;
	}
    
    
}