package com.accp.common.pojo;

import java.io.Serializable;

/**
 * otherreceipts  其它出库单类型
 * @author 
 */
public class Otherreceipts implements Serializable {
    /**
     * 类型编号
     */
    private String oreid;

    /**
     * 类型名称
     */
    private String orename;

    /**
     * 英文名称
     */
    private String oreengname;

    /**
     * 备注
     */
    private String oremale;

    private static final long serialVersionUID = 1L;

    public String getOreid() {
        return oreid;
    }

    public void setOreid(String oreid) {
        this.oreid = oreid;
    }

    public String getOrename() {
        return orename;
    }

    public void setOrename(String orename) {
        this.orename = orename;
    }

    public String getOreengname() {
        return oreengname;
    }

    public void setOreengname(String oreengname) {
        this.oreengname = oreengname;
    }

    public String getOremale() {
        return oremale;
    }

    public void setOremale(String oremale) {
        this.oremale = oremale;
    }

	public Otherreceipts() {
		super();
	}

	public Otherreceipts(String oreid, String orename, String oreengname, String oremale) {
		super();
		this.oreid = oreid;
		this.orename = orename;
		this.oreengname = oreengname;
		this.oremale = oremale;
	}

	public Otherreceipts(String orename, String oreengname, String oremale) {
		super();
		this.orename = orename;
		this.oreengname = oreengname;
		this.oremale = oremale;
	}
    
    
}