package com.accp.longHai.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
@TableName(value="stockapply")
public class StockapplyPojo {
	@TableId
    private String appid;

    private Date appdate;

    private String apptype;

    private Integer appcircs;

    private String appperson;

    private String apppersonid;

    private String appdept;

    private String appdeptid;

    private String appmaker;

    private String appauditingperson;

    private String appauditing;

    private String stockapplyname;

    private Integer enables;

    private String safetyone;

    private String safetytwo;

    private String extend0;

    private String extend1;

    private String extend2;

    private String extend3;

    private String extend4;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
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
        this.apptype = apptype == null ? null : apptype.trim();
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
        this.appperson = appperson == null ? null : appperson.trim();
    }

    public String getApppersonid() {
        return apppersonid;
    }

    public void setApppersonid(String apppersonid) {
        this.apppersonid = apppersonid == null ? null : apppersonid.trim();
    }

    public String getAppdept() {
        return appdept;
    }

    public void setAppdept(String appdept) {
        this.appdept = appdept == null ? null : appdept.trim();
    }

    public String getAppdeptid() {
        return appdeptid;
    }

    public void setAppdeptid(String appdeptid) {
        this.appdeptid = appdeptid == null ? null : appdeptid.trim();
    }

    public String getAppmaker() {
        return appmaker;
    }

    public void setAppmaker(String appmaker) {
        this.appmaker = appmaker == null ? null : appmaker.trim();
    }

    public String getAppauditingperson() {
        return appauditingperson;
    }

    public void setAppauditingperson(String appauditingperson) {
        this.appauditingperson = appauditingperson == null ? null : appauditingperson.trim();
    }

    public String getAppauditing() {
        return appauditing;
    }

    public void setAppauditing(String appauditing) {
        this.appauditing = appauditing == null ? null : appauditing.trim();
    }

    public String getStockapplyname() {
        return stockapplyname;
    }

    public void setStockapplyname(String stockapplyname) {
        this.stockapplyname = stockapplyname == null ? null : stockapplyname.trim();
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
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0 == null ? null : extend0.trim();
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3 == null ? null : extend3.trim();
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4 == null ? null : extend4.trim();
    }
}