package com.accp.common.pojo;

import java.io.Serializable;

/**
 * providetype  供应商类型设定
 * @author 
 */
public class Providetype implements Serializable {
    /**
     * 类别编号
     */
    private String peeid;

    /**
     * 类别名称
     */
    private String peename;

    /**
     * 类别英文名称
     */
    private String peeename;

    /**
     * 备注
     */
    private String peeremark;

    private static final long serialVersionUID = 1L;

    public String getPeeid() {
        return peeid;
    }

    public void setPeeid(String peeid) {
        this.peeid = peeid;
    }

    public String getPeename() {
        return peename;
    }

    public void setPeename(String peename) {
        this.peename = peename;
    }

    public String getPeeename() {
        return peeename;
    }

    public void setPeeename(String peeename) {
        this.peeename = peeename;
    }

    public String getPeeremark() {
        return peeremark;
    }

    public void setPeeremark(String peeremark) {
        this.peeremark = peeremark;
    }

	public Providetype() {
		super();
	}

	public Providetype(String peeid, String peename, String peeename, String peeremark) {
		super();
		this.peeid = peeid;
		this.peename = peename;
		this.peeename = peeename;
		this.peeremark = peeremark;
	}

	public Providetype(String peename, String peeename, String peeremark) {
		super();
		this.peename = peename;
		this.peeename = peeename;
		this.peeremark = peeremark;
	}
    
    
}