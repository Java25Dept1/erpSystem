package com.accp.common.pojo;

import java.io.Serializable;

/**
 * measurement
 * @author 
 */
public class Measurement implements Serializable {
    /**
     * 单位编号                      
     */
    private String unitid;

    /**
     * 单位名称
     */
    private String unitname;

    /**
     * 英文名称
     */
    private String unitengname;

    /**
     * 备注
     */
    private String unitremark;

    private static final long serialVersionUID = 1L;

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUnitengname() {
        return unitengname;
    }

    public void setUnitengname(String unitengname) {
        this.unitengname = unitengname;
    }

    public String getUnitremark() {
        return unitremark;
    }

    public void setUnitremark(String unitremark) {
        this.unitremark = unitremark;
    }

	public Measurement() {
		super();
	}

	public Measurement(String unitid, String unitname, String unitengname, String unitremark) {
		super();
		this.unitid = unitid;
		this.unitname = unitname;
		this.unitengname = unitengname;
		this.unitremark = unitremark;
	}

	public Measurement(String unitname, String unitengname, String unitremark) {
		super();
		this.unitname = unitname;
		this.unitengname = unitengname;
		this.unitremark = unitremark;
	}
    
    
}