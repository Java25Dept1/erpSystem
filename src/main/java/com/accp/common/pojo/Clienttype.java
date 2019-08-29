package com.accp.common.pojo;

import java.io.Serializable;

/**
 * clienttype  客户类别设定
 * @author 
 */
public class Clienttype implements Serializable {
    /**
     * 类别编号
     */
    private String clitypeid;

    /**
     * 类别名称
     */
    private String clitypename;

    /**
     * 英文名称
     */
    private String clitypeename;

    /**
     * 备注
     */
    private String cliremark;

    private static final long serialVersionUID = 1L;

    public String getClitypeid() {
        return clitypeid;
    }

    public void setClitypeid(String clitypeid) {
        this.clitypeid = clitypeid;
    }

    public String getClitypename() {
        return clitypename;
    }

    public void setClitypename(String clitypename) {
        this.clitypename = clitypename;
    }

    public String getClitypeename() {
        return clitypeename;
    }

    public void setClitypeename(String clitypeename) {
        this.clitypeename = clitypeename;
    }

    public String getCliremark() {
        return cliremark;
    }

    public void setCliremark(String cliremark) {
        this.cliremark = cliremark;
    }

	public Clienttype() {
		super();
	}

	public Clienttype(String clitypeid, String clitypename, String clitypeename, String cliremark) {
		super();
		this.clitypeid = clitypeid;
		this.clitypename = clitypename;
		this.clitypeename = clitypeename;
		this.cliremark = cliremark;
	}

	public Clienttype(String clitypename, String clitypeename, String cliremark) {
		super();
		this.clitypename = clitypename;
		this.clitypeename = clitypeename;
		this.cliremark = cliremark;
	}

	@Override
	public String toString() {
		return "Clienttype [clitypeid=" + clitypeid + ", clitypename=" + clitypename + ", clitypeename=" + clitypeename
				+ ", cliremark=" + cliremark + "]";
	}
    
    
}