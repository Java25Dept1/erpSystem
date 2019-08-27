package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * otheroutmain  其它出库主表
 * @author 
 */
public class Otheroutmain implements Serializable {
    /**
     * 编号
     */
    private String othid;

    /**
     * 单据日期
     */
    private Date othdate;

    /**
     * 出库类型id
     */
    private String othouttypeid;

    /**
     * 仓库
     */
    private String othstore;

    /**
     * 出库人名
     */
    private String othoutname;

    /**
     * 所属部门
     */
    private String othdept;

    /**
     * 制单人员
     */
    private String othmakemanid;

    /**
     * 复核人员
     */
    private String othrepeatuserid;

    /**
     * 单据号码
     */
    private String othidno;

    /**
     * 凭证编号
     */
    private String othbzid;

    private static final long serialVersionUID = 1L;

    public String getOthid() {
        return othid;
    }

    public void setOthid(String othid) {
        this.othid = othid;
    }

    public Date getOthdate() {
        return othdate;
    }

    public void setOthdate(Date othdate) {
        this.othdate = othdate;
    }

    public String getOthouttypeid() {
        return othouttypeid;
    }

    public void setOthouttypeid(String othouttypeid) {
        this.othouttypeid = othouttypeid;
    }

    public String getOthstore() {
        return othstore;
    }

    public void setOthstore(String othstore) {
        this.othstore = othstore;
    }

    public String getOthoutname() {
        return othoutname;
    }

    public void setOthoutname(String othoutname) {
        this.othoutname = othoutname;
    }

    public String getOthdept() {
        return othdept;
    }

    public void setOthdept(String othdept) {
        this.othdept = othdept;
    }

    public String getOthmakemanid() {
        return othmakemanid;
    }

    public void setOthmakemanid(String othmakemanid) {
        this.othmakemanid = othmakemanid;
    }

    public String getOthrepeatuserid() {
        return othrepeatuserid;
    }

    public void setOthrepeatuserid(String othrepeatuserid) {
        this.othrepeatuserid = othrepeatuserid;
    }

    public String getOthidno() {
        return othidno;
    }

    public void setOthidno(String othidno) {
        this.othidno = othidno;
    }

    public String getOthbzid() {
        return othbzid;
    }

    public void setOthbzid(String othbzid) {
        this.othbzid = othbzid;
    }

	public Otheroutmain() {
		super();
	}

	public Otheroutmain(String othid, Date othdate, String othouttypeid, String othstore, String othoutname,
			String othdept, String othmakemanid, String othrepeatuserid, String othidno, String othbzid) {
		super();
		this.othid = othid;
		this.othdate = othdate;
		this.othouttypeid = othouttypeid;
		this.othstore = othstore;
		this.othoutname = othoutname;
		this.othdept = othdept;
		this.othmakemanid = othmakemanid;
		this.othrepeatuserid = othrepeatuserid;
		this.othidno = othidno;
		this.othbzid = othbzid;
	}

	public Otheroutmain(Date othdate, String othouttypeid, String othstore, String othoutname, String othdept,
			String othmakemanid, String othrepeatuserid, String othidno, String othbzid) {
		super();
		this.othdate = othdate;
		this.othouttypeid = othouttypeid;
		this.othstore = othstore;
		this.othoutname = othoutname;
		this.othdept = othdept;
		this.othmakemanid = othmakemanid;
		this.othrepeatuserid = othrepeatuserid;
		this.othidno = othidno;
		this.othbzid = othbzid;
	}
    
    
}