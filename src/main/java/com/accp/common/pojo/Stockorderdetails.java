package com.accp.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * stockorderdetails  采购订单明细表
 * @author 
 */
public class Stockorderdetails implements Serializable {

	 /**
     * 单据号
     */
    private String sodid;

    /**
     * 栏号
     */
    private Integer sodlineid;

    public String getSodid() {
        return sodid;
    }

    public void setSodid(String sodid) {
        this.sodid = sodid;
    }

    public Integer getSodlineid() {
        return sodlineid;
    }

    public void setSodlineid(Integer sodlineid) {
        this.sodlineid = sodlineid;
    }
	/**
     * 物料编号
     */
    private String sodmaterielid;

    /**
     * (物料名称)
     */
    private String sodmatid;

    /**
     * (规格型号)
     */
    private String sodspec;

    /**
     * 数量
     */
    private Integer sodamount;

    /**
     * 折扣前单价
     */
    private BigDecimal sodpreprice;

    /**
     * 折数（%）
     */
    private Integer sodagio;

    /**
     * 单价
     */
    private BigDecimal sodprice;

    /**
     * 金额
     */
    private BigDecimal sodsum;

    /**
     * 税率（%）
     */
    private Integer sodcess;

    /**
     * (税额)
     */
    private BigDecimal sodsumcess;

    /**
     * (含税金额）
     */
    private BigDecimal sodsumprice;

    /**
     * 预入库日
     */
    private Date sodpreincomestorage;

    /**
     * 是否赠品
     */
    private String sodpresent;

    /**
     * (来源单别)
     */
    private String sodorigintype;

    /**
     * (来源单号)
     */
    private String sodorigin;

    /**
     * 标识是否删除
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

    /**
     * 扩展字段0
     */
    private String extend0;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    /**
     * 扩展字段4
     */
    private String extend4;

    private static final long serialVersionUID = 1L;

    public String getSodmaterielid() {
        return sodmaterielid;
    }

    public void setSodmaterielid(String sodmaterielid) {
        this.sodmaterielid = sodmaterielid;
    }

    public String getSodmatid() {
        return sodmatid;
    }

    public void setSodmatid(String sodmatid) {
        this.sodmatid = sodmatid;
    }

    public String getSodspec() {
        return sodspec;
    }

    public void setSodspec(String sodspec) {
        this.sodspec = sodspec;
    }

    public Integer getSodamount() {
        return sodamount;
    }

    public void setSodamount(Integer sodamount) {
        this.sodamount = sodamount;
    }

    public BigDecimal getSodpreprice() {
        return sodpreprice;
    }

    public void setSodpreprice(BigDecimal sodpreprice) {
        this.sodpreprice = sodpreprice;
    }

    public Integer getSodagio() {
        return sodagio;
    }

    public void setSodagio(Integer sodagio) {
        this.sodagio = sodagio;
    }

    public BigDecimal getSodprice() {
        return sodprice;
    }

    public void setSodprice(BigDecimal sodprice) {
        this.sodprice = sodprice;
    }

    public BigDecimal getSodsum() {
        return sodsum;
    }

    public void setSodsum(BigDecimal sodsum) {
        this.sodsum = sodsum;
    }

    public Integer getSodcess() {
        return sodcess;
    }

    public void setSodcess(Integer sodcess) {
        this.sodcess = sodcess;
    }

    public BigDecimal getSodsumcess() {
        return sodsumcess;
    }

    public void setSodsumcess(BigDecimal sodsumcess) {
        this.sodsumcess = sodsumcess;
    }

    public BigDecimal getSodsumprice() {
        return sodsumprice;
    }

    public void setSodsumprice(BigDecimal sodsumprice) {
        this.sodsumprice = sodsumprice;
    }

    public Date getSodpreincomestorage() {
        return sodpreincomestorage;
    }

    public void setSodpreincomestorage(Date sodpreincomestorage) {
        this.sodpreincomestorage = sodpreincomestorage;
    }

    public String getSodpresent() {
        return sodpresent;
    }

    public void setSodpresent(String sodpresent) {
        this.sodpresent = sodpresent;
    }

    public String getSodorigintype() {
        return sodorigintype;
    }

    public void setSodorigintype(String sodorigintype) {
        this.sodorigintype = sodorigintype;
    }

    public String getSodorigin() {
        return sodorigin;
    }

    public void setSodorigin(String sodorigin) {
        this.sodorigin = sodorigin;
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

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

	public Stockorderdetails() {
		super();
	}

	public Stockorderdetails(String sodid, Integer sodlineid, String sodmaterielid, String sodmatid, String sodspec,
			Integer sodamount, BigDecimal sodpreprice, Integer sodagio, BigDecimal sodprice, BigDecimal sodsum,
			Integer sodcess, BigDecimal sodsumcess, BigDecimal sodsumprice, Date sodpreincomestorage, String sodpresent,
			String sodorigintype, String sodorigin, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.sodid = sodid;
		this.sodlineid = sodlineid;
		this.sodmaterielid = sodmaterielid;
		this.sodmatid = sodmatid;
		this.sodspec = sodspec;
		this.sodamount = sodamount;
		this.sodpreprice = sodpreprice;
		this.sodagio = sodagio;
		this.sodprice = sodprice;
		this.sodsum = sodsum;
		this.sodcess = sodcess;
		this.sodsumcess = sodsumcess;
		this.sodsumprice = sodsumprice;
		this.sodpreincomestorage = sodpreincomestorage;
		this.sodpresent = sodpresent;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockorderdetails(Integer sodlineid, String sodmaterielid, String sodmatid, String sodspec,
			Integer sodamount, BigDecimal sodpreprice, Integer sodagio, BigDecimal sodprice, BigDecimal sodsum,
			Integer sodcess, BigDecimal sodsumcess, BigDecimal sodsumprice, Date sodpreincomestorage, String sodpresent,
			String sodorigintype, String sodorigin, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.sodlineid = sodlineid;
		this.sodmaterielid = sodmaterielid;
		this.sodmatid = sodmatid;
		this.sodspec = sodspec;
		this.sodamount = sodamount;
		this.sodpreprice = sodpreprice;
		this.sodagio = sodagio;
		this.sodprice = sodprice;
		this.sodsum = sodsum;
		this.sodcess = sodcess;
		this.sodsumcess = sodsumcess;
		this.sodsumprice = sodsumprice;
		this.sodpreincomestorage = sodpreincomestorage;
		this.sodpresent = sodpresent;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockorderdetails(String sodmaterielid, String sodmatid, String sodspec, Integer sodamount,
			BigDecimal sodpreprice, Integer sodagio, BigDecimal sodprice, BigDecimal sodsum, Integer sodcess,
			BigDecimal sodsumcess, BigDecimal sodsumprice, Date sodpreincomestorage, String sodpresent,
			String sodorigintype, String sodorigin, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.sodmaterielid = sodmaterielid;
		this.sodmatid = sodmatid;
		this.sodspec = sodspec;
		this.sodamount = sodamount;
		this.sodpreprice = sodpreprice;
		this.sodagio = sodagio;
		this.sodprice = sodprice;
		this.sodsum = sodsum;
		this.sodcess = sodcess;
		this.sodsumcess = sodsumcess;
		this.sodsumprice = sodsumprice;
		this.sodpreincomestorage = sodpreincomestorage;
		this.sodpresent = sodpresent;
		this.sodorigintype = sodorigintype;
		this.sodorigin = sodorigin;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	@Override
	public String toString() {
		return "Stockorderdetails [sodid=" + sodid + ", sodlineid=" + sodlineid + ", sodmaterielid=" + sodmaterielid
				+ ", sodmatid=" + sodmatid + ", sodspec=" + sodspec + ", sodamount=" + sodamount + ", sodpreprice="
				+ sodpreprice + ", sodagio=" + sodagio + ", sodprice=" + sodprice + ", sodsum=" + sodsum + ", sodcess="
				+ sodcess + ", sodsumcess=" + sodsumcess + ", sodsumprice=" + sodsumprice + ", sodpreincomestorage="
				+ sodpreincomestorage + ", sodpresent=" + sodpresent + ", sodorigintype=" + sodorigintype
				+ ", sodorigin=" + sodorigin + ", enables=" + enables + ", safetyone=" + safetyone + ", safetytwo="
				+ safetytwo + ", extend0=" + extend0 + ", extend1=" + extend1 + ", extend2=" + extend2 + ", extend3="
				+ extend3 + ", extend4=" + extend4 + "]";
	}
    
    
}