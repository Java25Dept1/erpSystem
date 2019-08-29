package com.accp.common.pojo;

import java.io.Serializable;

/**
 * salesorders  销售订单类型 
 * @author 
 */
public class Salesorders implements Serializable {
    /**
     * 类型编号
     */
    private String salid;

    /**
     * 类型名称
     */
    private String salname;

    /**
     * 英文名称
     */
    private String salengname;

    /**
     * 备注
     */
    private String salmale;

    private static final long serialVersionUID = 1L;

    public String getSalid() {
        return salid;
    }

    public void setSalid(String salid) {
        this.salid = salid;
    }

    public String getSalname() {
        return salname;
    }

    public void setSalname(String salname) {
        this.salname = salname;
    }

    public String getSalengname() {
        return salengname;
    }

    public void setSalengname(String salengname) {
        this.salengname = salengname;
    }

    public String getSalmale() {
        return salmale;
    }

    public void setSalmale(String salmale) {
        this.salmale = salmale;
    }

	public Salesorders() {
		super();
	}

	public Salesorders(String salid, String salname, String salengname, String salmale) {
		super();
		this.salid = salid;
		this.salname = salname;
		this.salengname = salengname;
		this.salmale = salmale;
	}

	public Salesorders(String salname, String salengname, String salmale) {
		super();
		this.salname = salname;
		this.salengname = salengname;
		this.salmale = salmale;
	}

	@Override
	public String toString() {
		return "Salesorders [salid=" + salid + ", salname=" + salname + ", salengname=" + salengname + ", salmale="
				+ salmale + "]";
	}
    
    
}