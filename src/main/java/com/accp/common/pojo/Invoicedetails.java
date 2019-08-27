package com.accp.common.pojo;

import java.io.Serializable;

/**
 * invoicedetails  采购发票详细表
 * @author 
 */
public class Invoicedetails implements Serializable {
    
	private String storagedetailno;

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
	
	private String materielid;

    private String materielname;

    private String types;

    private String units;

    private Integer amount;

    private Integer rebateprice;

    private Integer rebate;

    private Integer unitprice;

    private Integer moneys;

    private Integer cess;

    private Integer tax;

    private String taxmoneys;

    private String originno;

    private String present;

    private Integer lqty;

    private Integer enables;

    private String safetyone;

    private String safetytwo;

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

    public Integer getRebateprice() {
        return rebateprice;
    }

    public void setRebateprice(Integer rebateprice) {
        this.rebateprice = rebateprice;
    }

    public Integer getRebate() {
        return rebate;
    }

    public void setRebate(Integer rebate) {
        this.rebate = rebate;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getMoneys() {
        return moneys;
    }

    public void setMoneys(Integer moneys) {
        this.moneys = moneys;
    }

    public Integer getCess() {
        return cess;
    }

    public void setCess(Integer cess) {
        this.cess = cess;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getTaxmoneys() {
        return taxmoneys;
    }

    public void setTaxmoneys(String taxmoneys) {
        this.taxmoneys = taxmoneys;
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

    public Integer getLqty() {
        return lqty;
    }

    public void setLqty(Integer lqty) {
        this.lqty = lqty;
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

	public Invoicedetails() {
		super();
	}

	public Invoicedetails(String storagedetailno, Integer rowno, String materielid, String materielname, String types,
			String units, Integer amount, Integer rebateprice, Integer rebate, Integer unitprice, Integer moneys,
			Integer cess, Integer tax, String taxmoneys, String originno, String present, Integer lqty, Integer enables,
			String safetyone, String safetytwo) {
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
		this.originno = originno;
		this.present = present;
		this.lqty = lqty;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Invoicedetails(Integer rowno, String materielid, String materielname, String types, String units,
			Integer amount, Integer rebateprice, Integer rebate, Integer unitprice, Integer moneys, Integer cess,
			Integer tax, String taxmoneys, String originno, String present, Integer lqty, Integer enables,
			String safetyone, String safetytwo) {
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
		this.originno = originno;
		this.present = present;
		this.lqty = lqty;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}

	public Invoicedetails(String materielid, String materielname, String types, String units, Integer amount,
			Integer rebateprice, Integer rebate, Integer unitprice, Integer moneys, Integer cess, Integer tax,
			String taxmoneys, String originno, String present, Integer lqty, Integer enables, String safetyone,
			String safetytwo) {
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
		this.originno = originno;
		this.present = present;
		this.lqty = lqty;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
	}
    
    
}