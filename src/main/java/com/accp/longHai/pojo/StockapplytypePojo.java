package com.accp.longHai.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "requisition")
public class StockapplytypePojo {
    @TableId(value = "reqid")
    private String reqid;

    private String reqname;

    private String reqengname;

    private String reqmale;

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

	public StockapplytypePojo() {
		super();
	}

    
}