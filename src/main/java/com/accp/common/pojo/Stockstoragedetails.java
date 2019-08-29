package com.accp.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * stockstoragedetails  采购入库明细  
 * @author 
 */
public class Stockstoragedetails implements Serializable {
	/**
     * 引用采购入库单单号
     */
    private String storagedetailno;

    /**
     * 行号
     */
    private Integer rowno;

    public String getStoragedetailno() {
        return storagedetailno;
    }

    public void setStoragedetailno(String storagedetailno) {
        this.storagedetailno = storagedetailno;
    }

    public Integer getRowno() {
        return rowno;
    }

    public void setRowno(Integer rowno) {
        this.rowno = rowno;
    }
	
	/**
     * 引用物料文件ID
     */
    private String materielid;

    /**
     * 物料名称
     */
    private String materielname;

    /**
     * 规格型号
     */
    private String types;

    /**
     * 单位
     */
    private String units;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 折扣前单价
     */
    private BigDecimal rebateprice;

    /**
     * 折扣
     */
    private BigDecimal rebate;

    /**
     * 单价
     */
    private BigDecimal unitprice;

    /**
     * 金额
     */
    private BigDecimal moneys;

    /**
     * 税率
     */
    private Integer cess;

    /**
     * 税额
     */
    private BigDecimal tax;

    /**
     * 含税金额
     */
    private BigDecimal taxmoneys;

    /**
     * 来源单别
     */
    private String origintype;

    /**
     * 来源单号
     */
    private String originno;

    /**
     * 是否赠品
     */
    private String present;

    /**
     * 分摊费用
     */
    private BigDecimal apportionmoney;

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

    public String getMaterielid() {
        return materielid;
    }

    public void setMaterielid(String materielid) {
        this.materielid = materielid;
    }

    public String getMaterielname() {
        return materielname;
    }

    public void setMaterielname(String materielname) {
        this.materielname = materielname;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getRebateprice() {
        return rebateprice;
    }

    public void setRebateprice(BigDecimal rebateprice) {
        this.rebateprice = rebateprice;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getMoneys() {
        return moneys;
    }

    public void setMoneys(BigDecimal moneys) {
        this.moneys = moneys;
    }

    public Integer getCess() {
        return cess;
    }

    public void setCess(Integer cess) {
        this.cess = cess;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTaxmoneys() {
        return taxmoneys;
    }

    public void setTaxmoneys(BigDecimal taxmoneys) {
        this.taxmoneys = taxmoneys;
    }

    public String getOrigintype() {
        return origintype;
    }

    public void setOrigintype(String origintype) {
        this.origintype = origintype;
    }

    public String getOriginno() {
        return originno;
    }

    public void setOriginno(String originno) {
        this.originno = originno;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public BigDecimal getApportionmoney() {
        return apportionmoney;
    }

    public void setApportionmoney(BigDecimal apportionmoney) {
        this.apportionmoney = apportionmoney;
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

	public Stockstoragedetails() {
		super();
	}

	public Stockstoragedetails(String storagedetailno, Integer rowno, String materielid, String materielname,
			String types, String units, Integer amount, BigDecimal rebateprice, BigDecimal rebate, BigDecimal unitprice,
			BigDecimal moneys, Integer cess, BigDecimal tax, BigDecimal taxmoneys, String origintype, String originno,
			String present, BigDecimal apportionmoney, Integer enables, String safetyone, String safetytwo,
			String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.storagedetailno = storagedetailno;
		this.rowno = rowno;
		this.materielid = materielid;
		this.materielname = materielname;
		this.types = types;
		this.units = units;
		this.amount = amount;
		this.rebateprice = rebateprice;
		this.rebate = rebate;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.cess = cess;
		this.tax = tax;
		this.taxmoneys = taxmoneys;
		this.origintype = origintype;
		this.originno = originno;
		this.present = present;
		this.apportionmoney = apportionmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockstoragedetails(Integer rowno, String materielid, String materielname, String types, String units,
			Integer amount, BigDecimal rebateprice, BigDecimal rebate, BigDecimal unitprice, BigDecimal moneys,
			Integer cess, BigDecimal tax, BigDecimal taxmoneys, String origintype, String originno, String present,
			BigDecimal apportionmoney, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.rowno = rowno;
		this.materielid = materielid;
		this.materielname = materielname;
		this.types = types;
		this.units = units;
		this.amount = amount;
		this.rebateprice = rebateprice;
		this.rebate = rebate;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.cess = cess;
		this.tax = tax;
		this.taxmoneys = taxmoneys;
		this.origintype = origintype;
		this.originno = originno;
		this.present = present;
		this.apportionmoney = apportionmoney;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockstoragedetails(String materielid, String materielname, String types, String units, Integer amount,
			BigDecimal rebateprice, BigDecimal rebate, BigDecimal unitprice, BigDecimal moneys, Integer cess,
			BigDecimal tax, BigDecimal taxmoneys, String origintype, String originno, String present,
			BigDecimal apportionmoney, Integer enables, String safetyone, String safetytwo, String extend0,
			String extend1, String extend2, String extend3, String extend4) {
		super();
		this.materielid = materielid;
		this.materielname = materielname;
		this.types = types;
		this.units = units;
		this.amount = amount;
		this.rebateprice = rebateprice;
		this.rebate = rebate;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.cess = cess;
		this.tax = tax;
		this.taxmoneys = taxmoneys;
		this.origintype = origintype;
		this.originno = originno;
		this.present = present;
		this.apportionmoney = apportionmoney;
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
		return "Stockstoragedetails [storagedetailno=" + storagedetailno + ", rowno=" + rowno + ", materielid="
				+ materielid + ", materielname=" + materielname + ", types=" + types + ", units=" + units + ", amount="
				+ amount + ", rebateprice=" + rebateprice + ", rebate=" + rebate + ", unitprice=" + unitprice
				+ ", moneys=" + moneys + ", cess=" + cess + ", tax=" + tax + ", taxmoneys=" + taxmoneys
				+ ", origintype=" + origintype + ", originno=" + originno + ", present=" + present + ", apportionmoney="
				+ apportionmoney + ", enables=" + enables + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo
				+ ", extend0=" + extend0 + ", extend1=" + extend1 + ", extend2=" + extend2 + ", extend3=" + extend3
				+ ", extend4=" + extend4 + "]";
	}
    
    
}