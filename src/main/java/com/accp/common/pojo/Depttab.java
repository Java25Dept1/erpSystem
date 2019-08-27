package com.accp.common.pojo;

import java.io.Serializable;

/**
 * depttab  部门设定  
 * @author 
 */
public class Depttab implements Serializable {
    /**
     * 部门编号
     */
    private String depid;

    /**
     * 部门名称
     */
    private String depname;

    /**
     * 英文名称
     */
    private String engname;

    /**
     * 编制人数（男）(女)
     */
    private String male;

    /**
     * 工资方案
     */
    private String salyarytypeid;

    /**
     * 行事历
     */
    private String calid;

    /**
     * 备注
     */
    private String depremark;

    private static final long serialVersionUID = 1L;

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getSalyarytypeid() {
        return salyarytypeid;
    }

    public void setSalyarytypeid(String salyarytypeid) {
        this.salyarytypeid = salyarytypeid;
    }

    public String getCalid() {
        return calid;
    }

    public void setCalid(String calid) {
        this.calid = calid;
    }

    public String getDepremark() {
        return depremark;
    }

    public void setDepremark(String depremark) {
        this.depremark = depremark;
    }

	public Depttab() {
		super();
	}

	public Depttab(String depid, String depname, String engname, String male, String salyarytypeid, String calid,
			String depremark) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.engname = engname;
		this.male = male;
		this.salyarytypeid = salyarytypeid;
		this.calid = calid;
		this.depremark = depremark;
	}

	public Depttab(String depname, String engname, String male, String salyarytypeid, String calid, String depremark) {
		super();
		this.depname = depname;
		this.engname = engname;
		this.male = male;
		this.salyarytypeid = salyarytypeid;
		this.calid = calid;
		this.depremark = depremark;
	}
    
    
}