package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * othercome  其它入库主表  
 * @author 
 */
public class Othercome implements Serializable {
    /**
     * 单据号码(系统自带)
     */
    private String othcomeid;

    /**
     * 单据日期
     */
    private Date othcomedate;

    /**
     * 入库类型
     */
    private String othcometypeid;

    /**
     * 仓库
     */
    private String othcomestore;

    /**
     * 入库人员
     */
    private String othcomename;

    /**
     * 所属部门
     */
    private String othcomedept;

    /**
     * 制单人员
     */
    private String othcomemakemanid;

    /**
     * 复核人员
     */
    private String othcomerepeatuserid;

    private static final long serialVersionUID = 1L;

    public String getOthcomeid() {
        return othcomeid;
    }

    public void setOthcomeid(String othcomeid) {
        this.othcomeid = othcomeid;
    }

    public Date getOthcomedate() {
        return othcomedate;
    }

    public void setOthcomedate(Date othcomedate) {
        this.othcomedate = othcomedate;
    }

    public String getOthcometypeid() {
        return othcometypeid;
    }

    public void setOthcometypeid(String othcometypeid) {
        this.othcometypeid = othcometypeid;
    }

    public String getOthcomestore() {
        return othcomestore;
    }

    public void setOthcomestore(String othcomestore) {
        this.othcomestore = othcomestore;
    }

    public String getOthcomename() {
        return othcomename;
    }

    public void setOthcomename(String othcomename) {
        this.othcomename = othcomename;
    }

    public String getOthcomedept() {
        return othcomedept;
    }

    public void setOthcomedept(String othcomedept) {
        this.othcomedept = othcomedept;
    }

    public String getOthcomemakemanid() {
        return othcomemakemanid;
    }

    public void setOthcomemakemanid(String othcomemakemanid) {
        this.othcomemakemanid = othcomemakemanid;
    }

    public String getOthcomerepeatuserid() {
        return othcomerepeatuserid;
    }

    public void setOthcomerepeatuserid(String othcomerepeatuserid) {
        this.othcomerepeatuserid = othcomerepeatuserid;
    }

	public Othercome() {
		super();
	}

	public Othercome(String othcomeid, Date othcomedate, String othcometypeid, String othcomestore, String othcomename,
			String othcomedept, String othcomemakemanid, String othcomerepeatuserid) {
		super();
		this.othcomeid = othcomeid;
		this.othcomedate = othcomedate;
		this.othcometypeid = othcometypeid;
		this.othcomestore = othcomestore;
		this.othcomename = othcomename;
		this.othcomedept = othcomedept;
		this.othcomemakemanid = othcomemakemanid;
		this.othcomerepeatuserid = othcomerepeatuserid;
	}

	public Othercome(Date othcomedate, String othcometypeid, String othcomestore, String othcomename,
			String othcomedept, String othcomemakemanid, String othcomerepeatuserid) {
		super();
		this.othcomedate = othcomedate;
		this.othcometypeid = othcometypeid;
		this.othcomestore = othcomestore;
		this.othcomename = othcomename;
		this.othcomedept = othcomedept;
		this.othcomemakemanid = othcomemakemanid;
		this.othcomerepeatuserid = othcomerepeatuserid;
	}

	@Override
	public String toString() {
		return "Othercome [othcomeid=" + othcomeid + ", othcomedate=" + othcomedate + ", othcometypeid=" + othcometypeid
				+ ", othcomestore=" + othcomestore + ", othcomename=" + othcomename + ", othcomedept=" + othcomedept
				+ ", othcomemakemanid=" + othcomemakemanid + ", othcomerepeatuserid=" + othcomerepeatuserid + "]";
	}
    
    
}