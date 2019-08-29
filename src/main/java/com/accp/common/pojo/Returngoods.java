package com.accp.common.pojo;

import java.io.Serializable;

/** 
 * returngoods  采购退货类型
 * @author 
 */
public class Returngoods implements Serializable {
    /**
     * 类型编号
     */
    private String retid;

    /**
     * 类型名称
     */
    private String retname;

    /**
     * 英文名称
     */
    private String retengname;

    /**
     * 备注
     */
    private String retmale;

    private static final long serialVersionUID = 1L;

    public String getRetid() {
        return retid;
    }

    public void setRetid(String retid) {
        this.retid = retid;
    }

    public String getRetname() {
        return retname;
    }

    public void setRetname(String retname) {
        this.retname = retname;
    }

    public String getRetengname() {
        return retengname;
    }

    public void setRetengname(String retengname) {
        this.retengname = retengname;
    }

    public String getRetmale() {
        return retmale;
    }

    public void setRetmale(String retmale) {
        this.retmale = retmale;
    }

	public Returngoods() {
		super();
	}

	public Returngoods(String retid, String retname, String retengname, String retmale) {
		super();
		this.retid = retid;
		this.retname = retname;
		this.retengname = retengname;
		this.retmale = retmale;
	}

	public Returngoods(String retname, String retengname, String retmale) {
		super();
		this.retname = retname;
		this.retengname = retengname;
		this.retmale = retmale;
	}

	@Override
	public String toString() {
		return "Returngoods [retid=" + retid + ", retname=" + retname + ", retengname=" + retengname + ", retmale="
				+ retmale + "]";
	}
    
    
}