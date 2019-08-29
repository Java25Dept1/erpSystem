package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockapply  采购请购主表
 * @author 
 */
public class Stockapply implements Serializable {
    /**
     * 请购单编号
     */
    private String appid;

    /**
     * 请购单日期
     */
    private Date appdate;

    /**
     * 请购采购类型
     */
    private String apptype;

    /**
     * 单况：已结案/未结案/无效
     */
    private Integer appcircs;

    /**
     * 请购人员
     */
    private String appperson;

    /**
     * 伪外键：请购人员id
     */
    private String apppersonid;

    /**
     * 请购部门
     */
    private String appdept;

    /**
     * 伪外键：请购部门id
     */
    private String appdeptid;

    /**
     * 制单人员
     */
    private String appmaker;

    /**
     * 复核人员
     */
    private String appauditingperson;

    /**
     * 审核状态：未审核/已审核/无效
     */
    private String appauditing;

    /**
     * 保存（“采购请购”）
     */
    private String stockapplyname;

    /**
     * 标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段 保存（“采购请购”）
     */
    private String safetyone;

    /**
     * 保留字段
     */
    private String safetytwo;

    /**
     * 扩展字段0
     */
    private String extend0;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    /**
     * 扩展字段4
     */
    private String extend4;

    private static final long serialVersionUID = 1L;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Date getAppdate() {
        return appdate;
    }

    public void setAppdate(Date appdate) {
        this.appdate = appdate;
    }

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype;
    }

    public Integer getAppcircs() {
        return appcircs;
    }

    public void setAppcircs(Integer appcircs) {
        this.appcircs = appcircs;
    }

    public String getAppperson() {
        return appperson;
    }

    public void setAppperson(String appperson) {
        this.appperson = appperson;
    }

    public String getApppersonid() {
        return apppersonid;
    }

    public void setApppersonid(String apppersonid) {
        this.apppersonid = apppersonid;
    }

    public String getAppdept() {
        return appdept;
    }

    public void setAppdept(String appdept) {
        this.appdept = appdept;
    }

    public String getAppdeptid() {
        return appdeptid;
    }

    public void setAppdeptid(String appdeptid) {
        this.appdeptid = appdeptid;
    }

    public String getAppmaker() {
        return appmaker;
    }

    public void setAppmaker(String appmaker) {
        this.appmaker = appmaker;
    }

    public String getAppauditingperson() {
        return appauditingperson;
    }

    public void setAppauditingperson(String appauditingperson) {
        this.appauditingperson = appauditingperson;
    }

    public String getAppauditing() {
        return appauditing;
    }

    public void setAppauditing(String appauditing) {
        this.appauditing = appauditing;
    }

    public String getStockapplyname() {
        return stockapplyname;
    }

    public void setStockapplyname(String stockapplyname) {
        this.stockapplyname = stockapplyname;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone;
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo;
    }

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

	public Stockapply() {
		super();
	}

	public Stockapply(String appid, Date appdate, String apptype, Integer appcircs, String appperson,
			String apppersonid, String appdept, String appdeptid, String appmaker, String appauditingperson,
			String appauditing, String stockapplyname, Integer enables, String safetyone, String safetytwo,
			String extend0, String extend1, String extend2, String extend3, String extend4) {
		super();
		this.appid = appid;
		this.appdate = appdate;
		this.apptype = apptype;
		this.appcircs = appcircs;
		this.appperson = appperson;
		this.apppersonid = apppersonid;
		this.appdept = appdept;
		this.appdeptid = appdeptid;
		this.appmaker = appmaker;
		this.appauditingperson = appauditingperson;
		this.appauditing = appauditing;
		this.stockapplyname = stockapplyname;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockapply(Date appdate, String apptype, Integer appcircs, String appperson, String apppersonid,
			String appdept, String appdeptid, String appmaker, String appauditingperson, String appauditing,
			String stockapplyname, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4) {
		super();
		this.appdate = appdate;
		this.apptype = apptype;
		this.appcircs = appcircs;
		this.appperson = appperson;
		this.apppersonid = apppersonid;
		this.appdept = appdept;
		this.appdeptid = appdeptid;
		this.appmaker = appmaker;
		this.appauditingperson = appauditingperson;
		this.appauditing = appauditing;
		this.stockapplyname = stockapplyname;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	@Override
	public String toString() {
		return "Stockapply [appid=" + appid + ", appdate=" + appdate + ", apptype=" + apptype + ", appcircs=" + appcircs
				+ ", appperson=" + appperson + ", apppersonid=" + apppersonid + ", appdept=" + appdept + ", appdeptid="
				+ appdeptid + ", appmaker=" + appmaker + ", appauditingperson=" + appauditingperson + ", appauditing="
				+ appauditing + ", stockapplyname=" + stockapplyname + ", enables=" + enables + ", safetyone="
				+ safetyone + ", safetytwo=" + safetytwo + ", extend0=" + extend0 + ", extend1=" + extend1
				+ ", extend2=" + extend2 + ", extend3=" + extend3 + ", extend4=" + extend4 + "]";
	}
    
    
}