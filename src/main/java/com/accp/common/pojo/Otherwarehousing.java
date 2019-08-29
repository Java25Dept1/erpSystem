package com.accp.common.pojo;

import java.io.Serializable;

/**
 * otherwarehousing  其它入库单类型
 * @author 
 */
public class Otherwarehousing implements Serializable {
    /**
     * 类型编号
     */
    private String owaid;

    /**
     * 类型名称
     */
    private String owaname;

    /**
     * 英文名称
     */
    private String owaengname;

    /**
     * 备注
     */
    private String owamale;

    private static final long serialVersionUID = 1L;

    public String getOwaid() {
        return owaid;
    }

    public void setOwaid(String owaid) {
        this.owaid = owaid;
    }

    public String getOwaname() {
        return owaname;
    }

    public void setOwaname(String owaname) {
        this.owaname = owaname;
    }

    public String getOwaengname() {
        return owaengname;
    }

    public void setOwaengname(String owaengname) {
        this.owaengname = owaengname;
    }

    public String getOwamale() {
        return owamale;
    }

    public void setOwamale(String owamale) {
        this.owamale = owamale;
    }

	public Otherwarehousing() {
		super();
	}

	public Otherwarehousing(String owaid, String owaname, String owaengname, String owamale) {
		super();
		this.owaid = owaid;
		this.owaname = owaname;
		this.owaengname = owaengname;
		this.owamale = owamale;
	}

	public Otherwarehousing(String owaname, String owaengname, String owamale) {
		super();
		this.owaname = owaname;
		this.owaengname = owaengname;
		this.owamale = owamale;
	}

	@Override
	public String toString() {
		return "Otherwarehousing [owaid=" + owaid + ", owaname=" + owaname + ", owaengname=" + owaengname + ", owamale="
				+ owamale + "]";
	}
    
    
}