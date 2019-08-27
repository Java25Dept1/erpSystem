package com.accp.common.pojo;

import java.io.Serializable;

/**
 * clientaddress  客户地址
 * @author 
 */
public class Clientaddress implements Serializable {
    /**
     * 客户地址编号
     */
    private String cliaddrid;

    /**
     * 客户地址
     */
    private String cliaddress;

    /**
     * 邮政编码
     */
    private String clizipcode;

    /**
     * 联系人
     */
    private String clilinkman;

    /**
     * 联系人职称
     */
    private String clilinkmanprof;

    /**
     * 联系人电话
     */
    private String clitelephone;

    /**
     * 传真号码
     */
    private String clifaxno;

    /**
     * 行走路线
     */
    private String cliwalkaddr;

    /**
     * 备注
     */
    private String climemo;

    /**
     * 客户编号
     */
    private Integer cliid;

    private static final long serialVersionUID = 1L;

    public String getCliaddrid() {
        return cliaddrid;
    }

    public void setCliaddrid(String cliaddrid) {
        this.cliaddrid = cliaddrid;
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress;
    }

    public String getClizipcode() {
        return clizipcode;
    }

    public void setClizipcode(String clizipcode) {
        this.clizipcode = clizipcode;
    }

    public String getClilinkman() {
        return clilinkman;
    }

    public void setClilinkman(String clilinkman) {
        this.clilinkman = clilinkman;
    }

    public String getClilinkmanprof() {
        return clilinkmanprof;
    }

    public void setClilinkmanprof(String clilinkmanprof) {
        this.clilinkmanprof = clilinkmanprof;
    }

    public String getClitelephone() {
        return clitelephone;
    }

    public void setClitelephone(String clitelephone) {
        this.clitelephone = clitelephone;
    }

    public String getClifaxno() {
        return clifaxno;
    }

    public void setClifaxno(String clifaxno) {
        this.clifaxno = clifaxno;
    }

    public String getCliwalkaddr() {
        return cliwalkaddr;
    }

    public void setCliwalkaddr(String cliwalkaddr) {
        this.cliwalkaddr = cliwalkaddr;
    }

    public String getClimemo() {
        return climemo;
    }

    public void setClimemo(String climemo) {
        this.climemo = climemo;
    }

    public Integer getCliid() {
        return cliid;
    }

    public void setCliid(Integer cliid) {
        this.cliid = cliid;
    }

	public Clientaddress() {
		super();
	}

	public Clientaddress(String cliaddrid, String cliaddress, String clizipcode, String clilinkman,
			String clilinkmanprof, String clitelephone, String clifaxno, String cliwalkaddr, String climemo,
			Integer cliid) {
		super();
		this.cliaddrid = cliaddrid;
		this.cliaddress = cliaddress;
		this.clizipcode = clizipcode;
		this.clilinkman = clilinkman;
		this.clilinkmanprof = clilinkmanprof;
		this.clitelephone = clitelephone;
		this.clifaxno = clifaxno;
		this.cliwalkaddr = cliwalkaddr;
		this.climemo = climemo;
		this.cliid = cliid;
	}

	public Clientaddress(String cliaddress, String clizipcode, String clilinkman, String clilinkmanprof,
			String clitelephone, String clifaxno, String cliwalkaddr, String climemo, Integer cliid) {
		super();
		this.cliaddress = cliaddress;
		this.clizipcode = clizipcode;
		this.clilinkman = clilinkman;
		this.clilinkmanprof = clilinkmanprof;
		this.clitelephone = clitelephone;
		this.clifaxno = clifaxno;
		this.cliwalkaddr = cliwalkaddr;
		this.climemo = climemo;
		this.cliid = cliid;
	}
    
    
}