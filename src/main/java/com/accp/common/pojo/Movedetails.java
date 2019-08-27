package com.accp.common.pojo;

import java.io.Serializable;

/**
 * movedetails  调拨单明细表
 * @author 
 */
public class Movedetails implements Serializable {
    /**
     * 单号
     */
    private String mdsno;

    /**
     * 单据号码(单号)
     */
    private String mdsmseno;

    /**
     * 物料编号
     */
    private String mdsmaterieltype;

    /**
     * 物料名称
     */
    private String mdsmaterielname;

    /**
     * 物料规格
     */
    private String mdsmaterielspecs;

    /**
     * 单位
     */
    private String mdsmaterielunit;

    /**
     * 数量
     */
    private Integer mdsmaterielnum;

    /**
     * 现行平均成本（出库）
     */
    private Double mdsavgcost;

    /**
     * 总现行平均成本
     */
    private Double mdscost;

    /**
     * 备注
     */
    private String mdsremark;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getMdsno() {
        return mdsno;
    }

    public void setMdsno(String mdsno) {
        this.mdsno = mdsno;
    }

    public String getMdsmseno() {
        return mdsmseno;
    }

    public void setMdsmseno(String mdsmseno) {
        this.mdsmseno = mdsmseno;
    }

    public String getMdsmaterieltype() {
        return mdsmaterieltype;
    }

    public void setMdsmaterieltype(String mdsmaterieltype) {
        this.mdsmaterieltype = mdsmaterieltype;
    }

    public String getMdsmaterielname() {
        return mdsmaterielname;
    }

    public void setMdsmaterielname(String mdsmaterielname) {
        this.mdsmaterielname = mdsmaterielname;
    }

    public String getMdsmaterielspecs() {
        return mdsmaterielspecs;
    }

    public void setMdsmaterielspecs(String mdsmaterielspecs) {
        this.mdsmaterielspecs = mdsmaterielspecs;
    }

    public String getMdsmaterielunit() {
        return mdsmaterielunit;
    }

    public void setMdsmaterielunit(String mdsmaterielunit) {
        this.mdsmaterielunit = mdsmaterielunit;
    }

    public Integer getMdsmaterielnum() {
        return mdsmaterielnum;
    }

    public void setMdsmaterielnum(Integer mdsmaterielnum) {
        this.mdsmaterielnum = mdsmaterielnum;
    }

    public Double getMdsavgcost() {
        return mdsavgcost;
    }

    public void setMdsavgcost(Double mdsavgcost) {
        this.mdsavgcost = mdsavgcost;
    }

    public Double getMdscost() {
        return mdscost;
    }

    public void setMdscost(Double mdscost) {
        this.mdscost = mdscost;
    }

    public String getMdsremark() {
        return mdsremark;
    }

    public void setMdsremark(String mdsremark) {
        this.mdsremark = mdsremark;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Movedetails() {
		super();
	}

	public Movedetails(String mdsno, String mdsmseno, String mdsmaterieltype, String mdsmaterielname,
			String mdsmaterielspecs, String mdsmaterielunit, Integer mdsmaterielnum, Double mdsavgcost, Double mdscost,
			String mdsremark, Integer enables) {
		super();
		this.mdsno = mdsno;
		this.mdsmseno = mdsmseno;
		this.mdsmaterieltype = mdsmaterieltype;
		this.mdsmaterielname = mdsmaterielname;
		this.mdsmaterielspecs = mdsmaterielspecs;
		this.mdsmaterielunit = mdsmaterielunit;
		this.mdsmaterielnum = mdsmaterielnum;
		this.mdsavgcost = mdsavgcost;
		this.mdscost = mdscost;
		this.mdsremark = mdsremark;
		this.enables = enables;
	}

	public Movedetails(String mdsmseno, String mdsmaterieltype, String mdsmaterielname, String mdsmaterielspecs,
			String mdsmaterielunit, Integer mdsmaterielnum, Double mdsavgcost, Double mdscost, String mdsremark,
			Integer enables) {
		super();
		this.mdsmseno = mdsmseno;
		this.mdsmaterieltype = mdsmaterieltype;
		this.mdsmaterielname = mdsmaterielname;
		this.mdsmaterielspecs = mdsmaterielspecs;
		this.mdsmaterielunit = mdsmaterielunit;
		this.mdsmaterielnum = mdsmaterielnum;
		this.mdsavgcost = mdsavgcost;
		this.mdscost = mdscost;
		this.mdsremark = mdsremark;
		this.enables = enables;
	}

	public Movedetails(String mdsmaterieltype, String mdsmaterielname, String mdsmaterielspecs, String mdsmaterielunit,
			Integer mdsmaterielnum, Double mdsavgcost, Double mdscost, String mdsremark, Integer enables) {
		super();
		this.mdsmaterieltype = mdsmaterieltype;
		this.mdsmaterielname = mdsmaterielname;
		this.mdsmaterielspecs = mdsmaterielspecs;
		this.mdsmaterielunit = mdsmaterielunit;
		this.mdsmaterielnum = mdsmaterielnum;
		this.mdsavgcost = mdsavgcost;
		this.mdscost = mdscost;
		this.mdsremark = mdsremark;
		this.enables = enables;
	}
    
    
}