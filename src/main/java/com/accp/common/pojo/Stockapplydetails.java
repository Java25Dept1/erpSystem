package com.accp.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * stockapplydetails  采购请购明细表   
 * @author 
 */
public class Stockapplydetails implements Serializable {
	/**
     * 请购单编号
     */
    private String appid;

    /**
     * 行号
     */
    private Integer apdrows;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Integer getApdrows() {
        return apdrows;
    }

    public void setApdrows(Integer apdrows) {
        this.apdrows = apdrows;
    }
	
	/**
     * 物料编号(伪外：物料主文件)
     */
    private String apdmateridlid;

    /**
     * 物料名称
     */
    private String apdmateridlname;

    /**
     * 规格型号
     */
    private String apdmodel;

    /**
     * 单位名称
     */
    private String apdunit;

    /**
     * 数量
     */
    private Integer apdnum;

    /**
     * 标准进价
     */
    private BigDecimal apdstandardprice;

    /**
     * 标准进价金额
     */
    private BigDecimal apdstandardmoney;

    /**
     * 单价
     */
    private BigDecimal apdprice;

    /**
     * 进价金额
     */
    private BigDecimal apdintomoney;

    /**
     * 需求日期
     */
    private Date apddemanddate;

    /**
     * 建议采购日期
     */
    private Date apdstockdate;

    /**
     * 未采购数量
     */
    private Integer apdnotnum;

    /**
     * 来源单别
     */
    private String apdoriginid;

    /**
     * 来源单号
     */
    private String apdorigintype;

    /**
     * 备注
     */
    private String apdremark;

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

    public String getApdmateridlid() {
        return apdmateridlid;
    }

    public void setApdmateridlid(String apdmateridlid) {
        this.apdmateridlid = apdmateridlid;
    }

    public String getApdmateridlname() {
        return apdmateridlname;
    }

    public void setApdmateridlname(String apdmateridlname) {
        this.apdmateridlname = apdmateridlname;
    }

    public String getApdmodel() {
        return apdmodel;
    }

    public void setApdmodel(String apdmodel) {
        this.apdmodel = apdmodel;
    }

    public String getApdunit() {
        return apdunit;
    }

    public void setApdunit(String apdunit) {
        this.apdunit = apdunit;
    }

    public Integer getApdnum() {
        return apdnum;
    }

    public void setApdnum(Integer apdnum) {
        this.apdnum = apdnum;
    }

    public BigDecimal getApdstandardprice() {
        return apdstandardprice;
    }

    public void setApdstandardprice(BigDecimal apdstandardprice) {
        this.apdstandardprice = apdstandardprice;
    }

    public BigDecimal getApdstandardmoney() {
        return apdstandardmoney;
    }

    public void setApdstandardmoney(BigDecimal apdstandardmoney) {
        this.apdstandardmoney = apdstandardmoney;
    }

    public BigDecimal getApdprice() {
        return apdprice;
    }

    public void setApdprice(BigDecimal apdprice) {
        this.apdprice = apdprice;
    }

    public BigDecimal getApdintomoney() {
        return apdintomoney;
    }

    public void setApdintomoney(BigDecimal apdintomoney) {
        this.apdintomoney = apdintomoney;
    }

    public Date getApddemanddate() {
        return apddemanddate;
    }

    public void setApddemanddate(Date apddemanddate) {
        this.apddemanddate = apddemanddate;
    }

    public Date getApdstockdate() {
        return apdstockdate;
    }

    public void setApdstockdate(Date apdstockdate) {
        this.apdstockdate = apdstockdate;
    }

    public Integer getApdnotnum() {
        return apdnotnum;
    }

    public void setApdnotnum(Integer apdnotnum) {
        this.apdnotnum = apdnotnum;
    }

    public String getApdoriginid() {
        return apdoriginid;
    }

    public void setApdoriginid(String apdoriginid) {
        this.apdoriginid = apdoriginid;
    }

    public String getApdorigintype() {
        return apdorigintype;
    }

    public void setApdorigintype(String apdorigintype) {
        this.apdorigintype = apdorigintype;
    }

    public String getApdremark() {
        return apdremark;
    }

    public void setApdremark(String apdremark) {
        this.apdremark = apdremark;
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

	public Stockapplydetails() {
		super();
	}

	public Stockapplydetails(String appid, Integer apdrows, String apdmateridlid, String apdmateridlname,
			String apdmodel, String apdunit, Integer apdnum, BigDecimal apdstandardprice, BigDecimal apdstandardmoney,
			BigDecimal apdprice, BigDecimal apdintomoney, Date apddemanddate, Date apdstockdate, Integer apdnotnum,
			String apdoriginid, String apdorigintype, String apdremark, Integer enables, String safetyone,
			String safetytwo, String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.appid = appid;
		this.apdrows = apdrows;
		this.apdmateridlid = apdmateridlid;
		this.apdmateridlname = apdmateridlname;
		this.apdmodel = apdmodel;
		this.apdunit = apdunit;
		this.apdnum = apdnum;
		this.apdstandardprice = apdstandardprice;
		this.apdstandardmoney = apdstandardmoney;
		this.apdprice = apdprice;
		this.apdintomoney = apdintomoney;
		this.apddemanddate = apddemanddate;
		this.apdstockdate = apdstockdate;
		this.apdnotnum = apdnotnum;
		this.apdoriginid = apdoriginid;
		this.apdorigintype = apdorigintype;
		this.apdremark = apdremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockapplydetails(Integer apdrows, String apdmateridlid, String apdmateridlname, String apdmodel,
			String apdunit, Integer apdnum, BigDecimal apdstandardprice, BigDecimal apdstandardmoney,
			BigDecimal apdprice, BigDecimal apdintomoney, Date apddemanddate, Date apdstockdate, Integer apdnotnum,
			String apdoriginid, String apdorigintype, String apdremark, Integer enables, String safetyone,
			String safetytwo, String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.apdrows = apdrows;
		this.apdmateridlid = apdmateridlid;
		this.apdmateridlname = apdmateridlname;
		this.apdmodel = apdmodel;
		this.apdunit = apdunit;
		this.apdnum = apdnum;
		this.apdstandardprice = apdstandardprice;
		this.apdstandardmoney = apdstandardmoney;
		this.apdprice = apdprice;
		this.apdintomoney = apdintomoney;
		this.apddemanddate = apddemanddate;
		this.apdstockdate = apdstockdate;
		this.apdnotnum = apdnotnum;
		this.apdoriginid = apdoriginid;
		this.apdorigintype = apdorigintype;
		this.apdremark = apdremark;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockapplydetails(String apdmateridlid, String apdmateridlname, String apdmodel, String apdunit,
			Integer apdnum, BigDecimal apdstandardprice, BigDecimal apdstandardmoney, BigDecimal apdprice,
			BigDecimal apdintomoney, Date apddemanddate, Date apdstockdate, Integer apdnotnum, String apdoriginid,
			String apdorigintype, String apdremark, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.apdmateridlid = apdmateridlid;
		this.apdmateridlname = apdmateridlname;
		this.apdmodel = apdmodel;
		this.apdunit = apdunit;
		this.apdnum = apdnum;
		this.apdstandardprice = apdstandardprice;
		this.apdstandardmoney = apdstandardmoney;
		this.apdprice = apdprice;
		this.apdintomoney = apdintomoney;
		this.apddemanddate = apddemanddate;
		this.apdstockdate = apdstockdate;
		this.apdnotnum = apdnotnum;
		this.apdoriginid = apdoriginid;
		this.apdorigintype = apdorigintype;
		this.apdremark = apdremark;
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