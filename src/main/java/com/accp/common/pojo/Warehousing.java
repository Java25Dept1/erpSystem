package com.accp.common.pojo;

import java.io.Serializable;

/**
 * warehousing  采购入库类型     
 * @author 
 */
public class Warehousing implements Serializable {
    /**
     * 类型编号
     */
    private String warid;

    /**
     * 类型名称
     */
    private String warname;

    /**
     * 英文名称
     */
    private String warengname;

    /**
     * 备注
     */
    private String warmale;

    private static final long serialVersionUID = 1L;

    public String getWarid() {
        return warid;
    }

    public void setWarid(String warid) {
        this.warid = warid;
    }

    public String getWarname() {
        return warname;
    }

    public void setWarname(String warname) {
        this.warname = warname;
    }

    public String getWarengname() {
        return warengname;
    }

    public void setWarengname(String warengname) {
        this.warengname = warengname;
    }

    public String getWarmale() {
        return warmale;
    }

    public void setWarmale(String warmale) {
        this.warmale = warmale;
    }

	public Warehousing() {
		super();
	}

	public Warehousing(String warid, String warname, String warengname, String warmale) {
		super();
		this.warid = warid;
		this.warname = warname;
		this.warengname = warengname;
		this.warmale = warmale;
	}

	public Warehousing(String warname, String warengname, String warmale) {
		super();
		this.warname = warname;
		this.warengname = warengname;
		this.warmale = warmale;
	}

	@Override
	public String toString() {
		return "Warehousing [warid=" + warid + ", warname=" + warname + ", warengname=" + warengname + ", warmale="
				+ warmale + "]";
	}
    
	
}