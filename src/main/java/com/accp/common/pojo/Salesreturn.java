package com.accp.common.pojo;

import java.io.Serializable;

/**
 * salesreturn  销售退货单类型
 * @author  
 */
public class Salesreturn implements Serializable {
    /**
     * 类型编号
     */
    private String sretid;

    /**
     * 类型名称
     */
    private String sretname;

    /**
     * 英文名称
     */
    private String sretengname;

    /**
     * 备注
     */
    private String sretmale;

    private static final long serialVersionUID = 1L;

    public String getSretid() {
        return sretid;
    }

    public void setSretid(String sretid) {
        this.sretid = sretid;
    }

    public String getSretname() {
        return sretname;
    }

    public void setSretname(String sretname) {
        this.sretname = sretname;
    }

    public String getSretengname() {
        return sretengname;
    }

    public void setSretengname(String sretengname) {
        this.sretengname = sretengname;
    }

    public String getSretmale() {
        return sretmale;
    }

    public void setSretmale(String sretmale) {
        this.sretmale = sretmale;
    }

	public Salesreturn() {
		super();
	}

	public Salesreturn(String sretid, String sretname, String sretengname, String sretmale) {
		super();
		this.sretid = sretid;
		this.sretname = sretname;
		this.sretengname = sretengname;
		this.sretmale = sretmale;
	}

	public Salesreturn(String sretname, String sretengname, String sretmale) {
		super();
		this.sretname = sretname;
		this.sretengname = sretengname;
		this.sretmale = sretmale;
	}

	@Override
	public String toString() {
		return "Salesreturn [sretid=" + sretid + ", sretname=" + sretname + ", sretengname=" + sretengname
				+ ", sretmale=" + sretmale + "]";
	}
    
    
}