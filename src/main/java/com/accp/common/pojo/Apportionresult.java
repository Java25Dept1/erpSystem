package com.accp.common.pojo;

import java.io.Serializable;

/**
 * apportionresult  采购分摊结果明细表
 * @author 
 */
public class Apportionresult implements Serializable {
	@Override
	public String toString() {
		return "Apportionresult [atiid=" + atiid + ", atisequ=" + atisequ + ", storageid=" + storageid + ", matid="
				+ matid + ", matname=" + matname + ", matspec=" + matspec + ", stockprice=" + stockprice + ", atinum="
				+ atinum + ", ademoney=" + ademoney + ", enables=" + enables + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + "]";
	}

	/**
     * 采购分摊单号(采购分摊外键)
     */
    private String atiid;

    /**
     * 序号
     */
    private Integer atisequ;

    public String getAtiid() {
        return atiid;
    }

    public void setAtiid(String atiid) {
        this.atiid = atiid;
    }

    public Integer getAtisequ() {
        return atisequ;
    }

    public void setAtisequ(Integer atisequ) {
        this.atisequ = atisequ;
    }
	
	/**
     * 采购入库单
     */
    private String storageid;

    /**
     * 物料编号
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
     * 采购金额
     */
    private Double stockprice;

    /**
     * 数量
     */
    private Integer atinum;

    /**
     * 分摊金额
     */
    private Double ademoney;

    /**
     * 默认1不删除，0：删除	标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段
     */
    private String safetyone;

    /**
     * 保留字段
     */
    private String safetytwo;

    private static final long serialVersionUID = 1L;

    public String getStorageid() {
        return storageid;
    }

    public void setStorageid(String storageid) {
        this.storageid = storageid;
    }

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

    public Double getStockprice() {
        return stockprice;
    }

    public void setStockprice(Double stockprice) {
        this.stockprice = stockprice;
    }

    public Integer getAtinum() {
        return atinum;
    }

    public void setAtinum(Integer atinum) {
        this.atinum = atinum;
    }

    public Double getAdemoney() {
        return ademoney;
    }

    public void setAdemoney(Double ademoney) {
        this.ademoney = ademoney;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone;
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo;
    }

	public Apportionresult() {
		super();
	}

	public Apportionresult(String atiid, Integer atisequ, String storageid, String matid, String matname,
			String matspec, Double stockprice, Integer atinum, Double ademoney, Integer enables, String safetyone,
			String safetytwo) {
		super();
		this.atiid = atiid;
		this.atisequ = atisequ;
		this.storageid = storageid;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.stockprice = stockprice;
		this.atinum = atinum;
		this.ademoney = ademoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Apportionresult(String storageid, String matid, String matname, String matspec, Double stockprice,
			Integer atinum, Double ademoney, Integer enables, String safetyone, String safetytwo) {
		super();
		this.storageid = storageid;
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.stockprice = stockprice;
		this.atinum = atinum;
		this.ademoney = ademoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}