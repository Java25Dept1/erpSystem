package com.accp.common.pojo;

import java.io.Serializable;

/**
 * salesstock  销售出库单类型 
 * @author 
 */
public class Salesstock implements Serializable {
    /**
     * 类型编号
     */
    private String stoid;

    /**
     * 类型名称
     */
    private String stoname;

    /**
     * 英文名称
     */
    private String stoengname;

    /**
     * 备注
     */
    private String stomale;

    private static final long serialVersionUID = 1L;

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

    public String getStoengname() {
        return stoengname;
    }

    public void setStoengname(String stoengname) {
        this.stoengname = stoengname;
    }

    public String getStomale() {
        return stomale;
    }

    public void setStomale(String stomale) {
        this.stomale = stomale;
    }

	public Salesstock() {
		super();
	}

	public Salesstock(String stoid, String stoname, String stoengname, String stomale) {
		super();
		this.stoid = stoid;
		this.stoname = stoname;
		this.stoengname = stoengname;
		this.stomale = stomale;
	}

	public Salesstock(String stoname, String stoengname, String stomale) {
		super();
		this.stoname = stoname;
		this.stoengname = stoengname;
		this.stomale = stomale;
	}
    
    
}