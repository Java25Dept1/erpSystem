package com.accp.common.pojo;

import java.io.Serializable;

/**
 * purchasingorder  采购订单类型
 * @author 
 */
public class Purchasingorder implements Serializable {
    /**
     * 类型编号
     */
    private String purid;

    /**
     * 类型名称
     */
    private String purname;

    /**
     * 英文名称
     */
    private String purengname;

    /**
     * 备注
     */
    private String purmale;

    private static final long serialVersionUID = 1L;

    public String getPurid() {
        return purid;
    }

    public void setPurid(String purid) {
        this.purid = purid;
    }

    public String getPurname() {
        return purname;
    }

    public void setPurname(String purname) {
        this.purname = purname;
    }

    public String getPurengname() {
        return purengname;
    }

    public void setPurengname(String purengname) {
        this.purengname = purengname;
    }

    public String getPurmale() {
        return purmale;
    }

    public void setPurmale(String purmale) {
        this.purmale = purmale;
    }

	public Purchasingorder() {
		super();
	}

	public Purchasingorder(String purid, String purname, String purengname, String purmale) {
		super();
		this.purid = purid;
		this.purname = purname;
		this.purengname = purengname;
		this.purmale = purmale;
	}

	public Purchasingorder(String purname, String purengname, String purmale) {
		super();
		this.purname = purname;
		this.purengname = purengname;
		this.purmale = purmale;
	}
    
    
}