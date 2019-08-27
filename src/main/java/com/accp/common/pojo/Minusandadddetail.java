package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * minusandadddetail  库存进出明细表 
 * @author 
 */
public class Minusandadddetail implements Serializable {
    /**
     * 主键ID
     */
    private Integer minusaddid;

    /**
     * 单据日期
     */
    private Date minusdate;

    /**
     * 物料编号
     */
    private String matypeid;

    /**
     * 物料名称
     */
    private String matypename;

    /**
     * 本期入库数量
     */
    private Integer minusadd;

    /**
     * 本期出库数量
     */
    private Integer minusremove;

    /**
     * 单价
     */
    private Double unitprice;

    /**
     * 金额
     */
    private Double moneys;

    /**
     * 时间
     */
    private Date storagedate;

    /**
     * 仓库ID
     */
    private String stoid;

    /**
     * 仓库名称
     */
    private String stoname;

    /**
     * 来源单别
     */
    private String origintype;

    /**
     * 来源单号
     */
    private String originid;

    /**
     * 期末结存
     */
    private Integer aftermath;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public Integer getMinusaddid() {
        return minusaddid;
    }

    public void setMinusaddid(Integer minusaddid) {
        this.minusaddid = minusaddid;
    }

    public Date getMinusdate() {
        return minusdate;
    }

    public void setMinusdate(Date minusdate) {
        this.minusdate = minusdate;
    }

    public String getMatypeid() {
        return matypeid;
    }

    public void setMatypeid(String matypeid) {
        this.matypeid = matypeid;
    }

    public String getMatypename() {
        return matypename;
    }

    public void setMatypename(String matypename) {
        this.matypename = matypename;
    }

    public Integer getMinusadd() {
        return minusadd;
    }

    public void setMinusadd(Integer minusadd) {
        this.minusadd = minusadd;
    }

    public Integer getMinusremove() {
        return minusremove;
    }

    public void setMinusremove(Integer minusremove) {
        this.minusremove = minusremove;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getMoneys() {
        return moneys;
    }

    public void setMoneys(Double moneys) {
        this.moneys = moneys;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public String getStoname() {
        return stoname;
    }

    public void setStoname(String stoname) {
        this.stoname = stoname;
    }

    public String getOrigintype() {
        return origintype;
    }

    public void setOrigintype(String origintype) {
        this.origintype = origintype;
    }

    public String getOriginid() {
        return originid;
    }

    public void setOriginid(String originid) {
        this.originid = originid;
    }

    public Integer getAftermath() {
        return aftermath;
    }

    public void setAftermath(Integer aftermath) {
        this.aftermath = aftermath;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Minusandadddetail() {
		super();
	}

	public Minusandadddetail(Integer minusaddid, Date minusdate, String matypeid, String matypename, Integer minusadd,
			Integer minusremove, Double unitprice, Double moneys, Date storagedate, String stoid, String stoname,
			String origintype, String originid, Integer aftermath, Integer enables) {
		super();
		this.minusaddid = minusaddid;
		this.minusdate = minusdate;
		this.matypeid = matypeid;
		this.matypename = matypename;
		this.minusadd = minusadd;
		this.minusremove = minusremove;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.storagedate = storagedate;
		this.stoid = stoid;
		this.stoname = stoname;
		this.origintype = origintype;
		this.originid = originid;
		this.aftermath = aftermath;
		this.enables = enables;
	}

	public Minusandadddetail(Date minusdate, String matypeid, String matypename, Integer minusadd, Integer minusremove,
			Double unitprice, Double moneys, Date storagedate, String stoid, String stoname, String origintype,
			String originid, Integer aftermath, Integer enables) {
		super();
		this.minusdate = minusdate;
		this.matypeid = matypeid;
		this.matypename = matypename;
		this.minusadd = minusadd;
		this.minusremove = minusremove;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.storagedate = storagedate;
		this.stoid = stoid;
		this.stoname = stoname;
		this.origintype = origintype;
		this.originid = originid;
		this.aftermath = aftermath;
		this.enables = enables;
	}

	public Minusandadddetail(Date minusdate, String matypename, Integer minusadd, Integer minusremove, Double unitprice,
			Double moneys, Date storagedate, String stoid, String stoname, String origintype, String originid,
			Integer aftermath, Integer enables) {
		super();
		this.minusdate = minusdate;
		this.matypename = matypename;
		this.minusadd = minusadd;
		this.minusremove = minusremove;
		this.unitprice = unitprice;
		this.moneys = moneys;
		this.storagedate = storagedate;
		this.stoid = stoid;
		this.stoname = stoname;
		this.origintype = origintype;
		this.originid = originid;
		this.aftermath = aftermath;
		this.enables = enables;
	}
    
    
}