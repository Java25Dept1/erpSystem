package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * accountmoneydetail  采购账款明细表
 * @author 
 */
public class Accountmoneydetail implements Serializable {
    /**
     * 主键ID
     */
    private Integer storageid;

    /**
     * 单据日期
     */
    private Date storagedate;

    /**
     * 来源单别
     */
    private String origintypes;

    /**
     * 来源单号
     */
    private String originid;

    /**
     * 日期
     */
    private Date nwdate;

    /**
     * 供货商名称
     */
    private String clientsupply;

    /**
     * 供货商ID
     */
    private String citationid;

    /**
     * 原单金额
     */
    private Double originalmoney;

    /**
     * 现行余额
     */
    private Double nwadaysmoneys;

    /**
     * 标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段
     */
    private String safetytone;

    /**
     * 保留字段
     */
    private String safetytwo;

    private static final long serialVersionUID = 1L;

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getOrigintypes() {
        return origintypes;
    }

    public void setOrigintypes(String origintypes) {
        this.origintypes = origintypes;
    }

    public String getOriginid() {
        return originid;
    }

    public void setOriginid(String originid) {
        this.originid = originid;
    }

    public Date getNwdate() {
        return nwdate;
    }

    public void setNwdate(Date nwdate) {
        this.nwdate = nwdate;
    }

    public String getClientsupply() {
        return clientsupply;
    }

    public void setClientsupply(String clientsupply) {
        this.clientsupply = clientsupply;
    }

    public String getCitationid() {
        return citationid;
    }

    public void setCitationid(String citationid) {
        this.citationid = citationid;
    }

    public Double getOriginalmoney() {
        return originalmoney;
    }

    public void setOriginalmoney(Double originalmoney) {
        this.originalmoney = originalmoney;
    }

    public Double getNwadaysmoneys() {
        return nwadaysmoneys;
    }

    public void setNwadaysmoneys(Double nwadaysmoneys) {
        this.nwadaysmoneys = nwadaysmoneys;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetytone() {
        return safetytone;
    }

    public void setSafetytone(String safetytone) {
        this.safetytone = safetytone;
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo;
    }

	public Accountmoneydetail() {
		super();
	}

	public Accountmoneydetail(Integer storageid, Date storagedate, String origintypes, String originid, Date nwdate,
			String clientsupply, String citationid, Double originalmoney, Double nwadaysmoneys, Integer enables,
			String safetytone, String safetytwo) {
		super();
		this.storageid = storageid;
		this.storagedate = storagedate;
		this.origintypes = origintypes;
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	public Accountmoneydetail(Date storagedate, String origintypes, String originid, Date nwdate, String clientsupply,
			String citationid, Double originalmoney, Double nwadaysmoneys, Integer enables, String safetytone,
			String safetytwo) {
		super();
		this.storagedate = storagedate;
		this.origintypes = origintypes;
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	public Accountmoneydetail(String origintypes, String originid, Date nwdate, String clientsupply, String citationid,
			Double originalmoney, Double nwadaysmoneys, Integer enables, String safetytone, String safetytwo) {
		super();
		this.origintypes = origintypes;
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	public Accountmoneydetail(String originid, Date nwdate, String clientsupply, String citationid,
			Double originalmoney, Double nwadaysmoneys, Integer enables, String safetytone, String safetytwo) {
		super();
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	public Accountmoneydetail(Date nwdate, String clientsupply, String citationid, Double originalmoney,
			Double nwadaysmoneys, Integer enables, String safetytone, String safetytwo) {
		super();
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
		this.enables = enables;
		this.safetytone = safetytone;
		this.safetytwo = safetytwo;
	}

	public Accountmoneydetail(Integer storageid, Date storagedate, String origintypes, String originid, Date nwdate,
			String clientsupply, String citationid, Double originalmoney, Double nwadaysmoneys) {
		super();
		this.storageid = storageid;
		this.storagedate = storagedate;
		this.origintypes = origintypes;
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
	}

	public Accountmoneydetail(Date storagedate, String origintypes, String originid, Date nwdate, String clientsupply,
			String citationid, Double originalmoney, Double nwadaysmoneys) {
		super();
		this.storagedate = storagedate;
		this.origintypes = origintypes;
		this.originid = originid;
		this.nwdate = nwdate;
		this.clientsupply = clientsupply;
		this.citationid = citationid;
		this.originalmoney = originalmoney;
		this.nwadaysmoneys = nwadaysmoneys;
	}
    
    
    
}