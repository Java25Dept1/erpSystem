package com.accp.common.pojo;

import java.io.Serializable;

/**
 * otheroutdetail  其它出库明细表
 * @author 
 */
public class Otheroutdetail implements Serializable {
	/**
     * 单据号码(其它出库主表id)
     */
    private String otheroutid;

    /**
     * 栏号
     */
    private String othoutlineno;

    public String getOtheroutid() {
        return otheroutid;
    }

    public void setOtheroutid(String otheroutid) {
        this.otheroutid = otheroutid;
    }

    public String getOthoutlineno() {
        return othoutlineno;
    }

    public void setOthoutlineno(String othoutlineno) {
        this.othoutlineno = othoutlineno;
    }
	
	/**
     * 物料编号
     */
    private String othoutmertialsid;

    /**
     * 物料名称
     */
    private String othoutmertialname;

    /**
     * 规格型号
     */
    private String othouttypes;

    /**
     * 单位
     */
    private String othoutunits;

    /**
     * 数量
     */
    private Integer othoutamount;

    /**
     * 备注
     */
    private String othoutremark;

    /**
     * 批号
     */
    private Integer othph;

    private static final long serialVersionUID = 1L;

    public String getOthoutmertialsid() {
        return othoutmertialsid;
    }

    public void setOthoutmertialsid(String othoutmertialsid) {
        this.othoutmertialsid = othoutmertialsid;
    }

    public String getOthoutmertialname() {
        return othoutmertialname;
    }

    public void setOthoutmertialname(String othoutmertialname) {
        this.othoutmertialname = othoutmertialname;
    }

    public String getOthouttypes() {
        return othouttypes;
    }

    public void setOthouttypes(String othouttypes) {
        this.othouttypes = othouttypes;
    }

    public String getOthoutunits() {
        return othoutunits;
    }

    public void setOthoutunits(String othoutunits) {
        this.othoutunits = othoutunits;
    }

    public Integer getOthoutamount() {
        return othoutamount;
    }

    public void setOthoutamount(Integer othoutamount) {
        this.othoutamount = othoutamount;
    }

    public String getOthoutremark() {
        return othoutremark;
    }

    public void setOthoutremark(String othoutremark) {
        this.othoutremark = othoutremark;
    }

    public Integer getOthph() {
        return othph;
    }

    public void setOthph(Integer othph) {
        this.othph = othph;
    }

	public Otheroutdetail() {
		super();
	}

	public Otheroutdetail(String otheroutid, String othoutlineno, String othoutmertialsid, String othoutmertialname,
			String othouttypes, String othoutunits, Integer othoutamount, String othoutremark, Integer othph) {
		super();
		this.otheroutid = otheroutid;
		this.othoutlineno = othoutlineno;
		this.othoutmertialsid = othoutmertialsid;
		this.othoutmertialname = othoutmertialname;
		this.othouttypes = othouttypes;
		this.othoutunits = othoutunits;
		this.othoutamount = othoutamount;
		this.othoutremark = othoutremark;
		this.othph = othph;
	}

	public Otheroutdetail(String othoutlineno, String othoutmertialsid, String othoutmertialname, String othouttypes,
			String othoutunits, Integer othoutamount, String othoutremark, Integer othph) {
		super();
		this.othoutlineno = othoutlineno;
		this.othoutmertialsid = othoutmertialsid;
		this.othoutmertialname = othoutmertialname;
		this.othouttypes = othouttypes;
		this.othoutunits = othoutunits;
		this.othoutamount = othoutamount;
		this.othoutremark = othoutremark;
		this.othph = othph;
	}

	public Otheroutdetail(String othoutmertialsid, String othoutmertialname, String othouttypes, String othoutunits,
			Integer othoutamount, String othoutremark, Integer othph) {
		super();
		this.othoutmertialsid = othoutmertialsid;
		this.othoutmertialname = othoutmertialname;
		this.othouttypes = othouttypes;
		this.othoutunits = othoutunits;
		this.othoutamount = othoutamount;
		this.othoutremark = othoutremark;
		this.othph = othph;
	}

	@Override
	public String toString() {
		return "Otheroutdetail [otheroutid=" + otheroutid + ", othoutlineno=" + othoutlineno + ", othoutmertialsid="
				+ othoutmertialsid + ", othoutmertialname=" + othoutmertialname + ", othouttypes=" + othouttypes
				+ ", othoutunits=" + othoutunits + ", othoutamount=" + othoutamount + ", othoutremark=" + othoutremark
				+ ", othph=" + othph + "]";
	}
    
    
}