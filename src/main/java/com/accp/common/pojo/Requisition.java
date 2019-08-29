package com.accp.common.pojo;

import java.io.Serializable;

/**
 * requisition  采购请购类型
 * @author 
 */
public class Requisition implements Serializable {
    /**
     * 类型编号
     */
    private String reqid;

    /**
     * 类型名称
     */
    private String reqname;

    /**
     * 英文名称
     */
    private String reqengname;

    /**
     * 备注
     */
    private String reqmale;

    private static final long serialVersionUID = 1L;

    public String getReqid() {
        return reqid;
    }

    public void setReqid(String reqid) {
        this.reqid = reqid;
    }

    public String getReqname() {
        return reqname;
    }

    public void setReqname(String reqname) {
        this.reqname = reqname;
    }

    public String getReqengname() {
        return reqengname;
    }

    public void setReqengname(String reqengname) {
        this.reqengname = reqengname;
    }

    public String getReqmale() {
        return reqmale;
    }

    public void setReqmale(String reqmale) {
        this.reqmale = reqmale;
    }

	public Requisition() {
		super();
	}

	public Requisition(String reqid, String reqname, String reqengname, String reqmale) {
		super();
		this.reqid = reqid;
		this.reqname = reqname;
		this.reqengname = reqengname;
		this.reqmale = reqmale;
	}

	public Requisition(String reqname, String reqengname, String reqmale) {
		super();
		this.reqname = reqname;
		this.reqengname = reqengname;
		this.reqmale = reqmale;
	}

	@Override
	public String toString() {
		return "Requisition [reqid=" + reqid + ", reqname=" + reqname + ", reqengname=" + reqengname + ", reqmale="
				+ reqmale + "]";
	}
    
    
}