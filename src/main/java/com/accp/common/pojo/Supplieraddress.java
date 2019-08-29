package com.accp.common.pojo;

import java.io.Serializable;

/**
 * supplieraddress  供应商地址
 * @author 
 */
public class Supplieraddress implements Serializable {
    /**
     * 供应商地址id
     */
    private String suaddrid;

    /**
     * 供应商地址
     */
    private String suaddress;

    /**
     * 邮政编码
     */
    private String suzipcode;

    /**
     * 联系人
     */
    private String sulinkman;

    /**
     * 联系人职称
     */
    private String sulinkmanprof;

    /**
     * 联系人电话
     */
    private String sutelephone;

    /**
     * 传真号码
     */
    private String sufaxno;

    /**
     * 行走路线
     */
    private String suwalkaddr;

    /**
     * 备注
     */
    private String sumemo;

    /**
     * 供应商id
     */
    private Integer peoid;

    private static final long serialVersionUID = 1L;

    public String getSuaddrid() {
        return suaddrid;
    }

    public void setSuaddrid(String suaddrid) {
        this.suaddrid = suaddrid;
    }

    public String getSuaddress() {
        return suaddress;
    }

    public void setSuaddress(String suaddress) {
        this.suaddress = suaddress;
    }

    public String getSuzipcode() {
        return suzipcode;
    }

    public void setSuzipcode(String suzipcode) {
        this.suzipcode = suzipcode;
    }

    public String getSulinkman() {
        return sulinkman;
    }

    public void setSulinkman(String sulinkman) {
        this.sulinkman = sulinkman;
    }

    public String getSulinkmanprof() {
        return sulinkmanprof;
    }

    public void setSulinkmanprof(String sulinkmanprof) {
        this.sulinkmanprof = sulinkmanprof;
    }

    public String getSutelephone() {
        return sutelephone;
    }

    public void setSutelephone(String sutelephone) {
        this.sutelephone = sutelephone;
    }

    public String getSufaxno() {
        return sufaxno;
    }

    public void setSufaxno(String sufaxno) {
        this.sufaxno = sufaxno;
    }

    public String getSuwalkaddr() {
        return suwalkaddr;
    }

    public void setSuwalkaddr(String suwalkaddr) {
        this.suwalkaddr = suwalkaddr;
    }

    public String getSumemo() {
        return sumemo;
    }

    public void setSumemo(String sumemo) {
        this.sumemo = sumemo;
    }

    public Integer getPeoid() {
        return peoid;
    }

    public void setPeoid(Integer peoid) {
        this.peoid = peoid;
    }

	public Supplieraddress() {
		super();
	}

	public Supplieraddress(String suaddrid, String suaddress, String suzipcode, String sulinkman, String sulinkmanprof,
			String sutelephone, String sufaxno, String suwalkaddr, String sumemo, Integer peoid) {
		super();
		this.suaddrid = suaddrid;
		this.suaddress = suaddress;
		this.suzipcode = suzipcode;
		this.sulinkman = sulinkman;
		this.sulinkmanprof = sulinkmanprof;
		this.sutelephone = sutelephone;
		this.sufaxno = sufaxno;
		this.suwalkaddr = suwalkaddr;
		this.sumemo = sumemo;
		this.peoid = peoid;
	}

	public Supplieraddress(String suaddress, String suzipcode, String sulinkman, String sulinkmanprof,
			String sutelephone, String sufaxno, String suwalkaddr, String sumemo, Integer peoid) {
		super();
		this.suaddress = suaddress;
		this.suzipcode = suzipcode;
		this.sulinkman = sulinkman;
		this.sulinkmanprof = sulinkmanprof;
		this.sutelephone = sutelephone;
		this.sufaxno = sufaxno;
		this.suwalkaddr = suwalkaddr;
		this.sumemo = sumemo;
		this.peoid = peoid;
	}

	@Override
	public String toString() {
		return "Supplieraddress [suaddrid=" + suaddrid + ", suaddress=" + suaddress + ", suzipcode=" + suzipcode
				+ ", sulinkman=" + sulinkman + ", sulinkmanprof=" + sulinkmanprof + ", sutelephone=" + sutelephone
				+ ", sufaxno=" + sufaxno + ", suwalkaddr=" + suwalkaddr + ", sumemo=" + sumemo + ", peoid=" + peoid
				+ "]";
	}
    
    
}