package com.accp.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * stockinquiredetails  采购询价明细表  
 * @author 
 */
public class Stockinquiredetails implements Serializable {
	/**
     * 询价单编号
     */
    private String stoid;

    /**
     * 行号
     */
    private Integer sdarows;

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public Integer getSdarows() {
        return sdarows;
    }

    public void setSdarows(Integer sdarows) {
        this.sdarows = sdarows;
    }
	
	/**
     * 物料编号
     */
    private String sdamaterielid;

    /**
     * 物料名称
     */
    private String sdamateridlname;

    /**
     * 规格型号
     */
    private String sdamodel;

    /**
     * 单位名称
     */
    private String sdaunit;

    /**
     * 数量
     */
    private Integer sdanum;

    /**
     * 折前单价
     */
    private BigDecimal sdaagioes;

    /**
     * 折数(%)
     */
    private Integer sdaagiocess;

    /**
     * 单价
     */
    private BigDecimal sdaprice;

    /**
     * 金额
     */
    private BigDecimal sdamoney;

    /**
     * 税率(%)
     */
    private Integer sdacess;

    /**
     * 税额
     */
    private BigDecimal sdataxmoney;

    /**
     * 含税金额
     */
    private BigDecimal sdataxmoneys;

    /**
     * 赠品：是/否
     */
    private Integer sdaislargess;

    /**
     * 来源单号
     */
    private String sdaoriginid;

    /**
     * 来源单别
     */
    private String sdaorigintype;

    /**
     * 备注
     */
    private String sdaremark;

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

    public String getSdamaterielid() {
        return sdamaterielid;
    }

    public void setSdamaterielid(String sdamaterielid) {
        this.sdamaterielid = sdamaterielid;
    }

    public String getSdamateridlname() {
        return sdamateridlname;
    }

    public void setSdamateridlname(String sdamateridlname) {
        this.sdamateridlname = sdamateridlname;
    }

    public String getSdamodel() {
        return sdamodel;
    }

    public void setSdamodel(String sdamodel) {
        this.sdamodel = sdamodel;
    }

    public String getSdaunit() {
        return sdaunit;
    }

    public void setSdaunit(String sdaunit) {
        this.sdaunit = sdaunit;
    }

    public Integer getSdanum() {
        return sdanum;
    }

    public void setSdanum(Integer sdanum) {
        this.sdanum = sdanum;
    }

    public BigDecimal getSdaagioes() {
        return sdaagioes;
    }

    public void setSdaagioes(BigDecimal sdaagioes) {
        this.sdaagioes = sdaagioes;
    }

    public Integer getSdaagiocess() {
        return sdaagiocess;
    }

    public void setSdaagiocess(Integer sdaagiocess) {
        this.sdaagiocess = sdaagiocess;
    }

    public BigDecimal getSdaprice() {
        return sdaprice;
    }

    public void setSdaprice(BigDecimal sdaprice) {
        this.sdaprice = sdaprice;
    }

    public BigDecimal getSdamoney() {
        return sdamoney;
    }

    public void setSdamoney(BigDecimal sdamoney) {
        this.sdamoney = sdamoney;
    }

    public Integer getSdacess() {
        return sdacess;
    }

    public void setSdacess(Integer sdacess) {
        this.sdacess = sdacess;
    }

    public BigDecimal getSdataxmoney() {
        return sdataxmoney;
    }

    public void setSdataxmoney(BigDecimal sdataxmoney) {
        this.sdataxmoney = sdataxmoney;
    }

    public BigDecimal getSdataxmoneys() {
        return sdataxmoneys;
    }

    public void setSdataxmoneys(BigDecimal sdataxmoneys) {
        this.sdataxmoneys = sdataxmoneys;
    }

    public Integer getSdaislargess() {
        return sdaislargess;
    }

    public void setSdaislargess(Integer sdaislargess) {
        this.sdaislargess = sdaislargess;
    }

    public String getSdaoriginid() {
        return sdaoriginid;
    }

    public void setSdaoriginid(String sdaoriginid) {
        this.sdaoriginid = sdaoriginid;
    }

    public String getSdaorigintype() {
        return sdaorigintype;
    }

    public void setSdaorigintype(String sdaorigintype) {
        this.sdaorigintype = sdaorigintype;
    }

    public String getSdaremark() {
        return sdaremark;
    }

    public void setSdaremark(String sdaremark) {
        this.sdaremark = sdaremark;
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

	public Stockinquiredetails() {
		super();
	}

	public Stockinquiredetails(String stoid, Integer sdarows, String sdamaterielid, String sdamateridlname,
			String sdamodel, String sdaunit, Integer sdanum, BigDecimal sdaagioes, Integer sdaagiocess,
			BigDecimal sdaprice, BigDecimal sdamoney, Integer sdacess, BigDecimal sdataxmoney, BigDecimal sdataxmoneys,
			Integer sdaislargess, String sdaoriginid, String sdaorigintype, String sdaremark, Integer enables,
			String safetyone, String safetytwo, String extend0, String extend1, String extend2, String extend3,
			String extend4) {
		super();
		this.stoid = stoid;
		this.sdarows = sdarows;
		this.sdamaterielid = sdamaterielid;
		this.sdamateridlname = sdamateridlname;
		this.sdamodel = sdamodel;
		this.sdaunit = sdaunit;
		this.sdanum = sdanum;
		this.sdaagioes = sdaagioes;
		this.sdaagiocess = sdaagiocess;
		this.sdaprice = sdaprice;
		this.sdamoney = sdamoney;
		this.sdacess = sdacess;
		this.sdataxmoney = sdataxmoney;
		this.sdataxmoneys = sdataxmoneys;
		this.sdaislargess = sdaislargess;
		this.sdaoriginid = sdaoriginid;
		this.sdaorigintype = sdaorigintype;
		this.sdaremark = sdaremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockinquiredetails(Integer sdarows, String sdamaterielid, String sdamateridlname, String sdamodel,
			String sdaunit, Integer sdanum, BigDecimal sdaagioes, Integer sdaagiocess, BigDecimal sdaprice,
			BigDecimal sdamoney, Integer sdacess, BigDecimal sdataxmoney, BigDecimal sdataxmoneys, Integer sdaislargess,
			String sdaoriginid, String sdaorigintype, String sdaremark, Integer enables, String safetyone,
			String safetytwo, String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.sdarows = sdarows;
		this.sdamaterielid = sdamaterielid;
		this.sdamateridlname = sdamateridlname;
		this.sdamodel = sdamodel;
		this.sdaunit = sdaunit;
		this.sdanum = sdanum;
		this.sdaagioes = sdaagioes;
		this.sdaagiocess = sdaagiocess;
		this.sdaprice = sdaprice;
		this.sdamoney = sdamoney;
		this.sdacess = sdacess;
		this.sdataxmoney = sdataxmoney;
		this.sdataxmoneys = sdataxmoneys;
		this.sdaislargess = sdaislargess;
		this.sdaoriginid = sdaoriginid;
		this.sdaorigintype = sdaorigintype;
		this.sdaremark = sdaremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockinquiredetails(String sdamaterielid, String sdamateridlname, String sdamodel, String sdaunit,
			Integer sdanum, BigDecimal sdaagioes, Integer sdaagiocess, BigDecimal sdaprice, BigDecimal sdamoney,
			Integer sdacess, BigDecimal sdataxmoney, BigDecimal sdataxmoneys, Integer sdaislargess, String sdaoriginid,
			String sdaorigintype, String sdaremark, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.sdamaterielid = sdamaterielid;
		this.sdamateridlname = sdamateridlname;
		this.sdamodel = sdamodel;
		this.sdaunit = sdaunit;
		this.sdanum = sdanum;
		this.sdaagioes = sdaagioes;
		this.sdaagiocess = sdaagiocess;
		this.sdaprice = sdaprice;
		this.sdamoney = sdamoney;
		this.sdacess = sdacess;
		this.sdataxmoney = sdataxmoney;
		this.sdataxmoneys = sdataxmoneys;
		this.sdaislargess = sdaislargess;
		this.sdaoriginid = sdaoriginid;
		this.sdaorigintype = sdaorigintype;
		this.sdaremark = sdaremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}
    
    
}