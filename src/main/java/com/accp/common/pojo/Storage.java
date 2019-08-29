package com.accp.common.pojo;

import java.io.Serializable;

/**
 * storage  仓库设定 
 * @author 
 */
public class Storage implements Serializable {
    /**
     * 仓库编号                      
     */
    private String stoid;

    /**
     * 仓库名称
     */
    private String stoname;

    /**
     * 仓库简称
     */
    private String stosimplename;

    /**
     * 英文名称
     */
    private String stoengname;

    /**
     * 联系人
     */
    private String stoconnectper;

    /**
     * 联系人ID(新增)
     */
    private String stoempid;

    /**
     * 联系电话
     */
    private String stophone;

    /**
     * 仓库地址
     */
    private String stoaddress;

    /**
     * 备注
     */
    private String storemark;

    private static final long serialVersionUID = 1L;

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public String getStoname() {
        return stoname;
    }

    public void setStoname(String stoname) {
        this.stoname = stoname;
    }

    public String getStosimplename() {
        return stosimplename;
    }

    public void setStosimplename(String stosimplename) {
        this.stosimplename = stosimplename;
    }

    public String getStoengname() {
        return stoengname;
    }

    public void setStoengname(String stoengname) {
        this.stoengname = stoengname;
    }

    public String getStoconnectper() {
        return stoconnectper;
    }

    public void setStoconnectper(String stoconnectper) {
        this.stoconnectper = stoconnectper;
    }

    public String getStoempid() {
        return stoempid;
    }

    public void setStoempid(String stoempid) {
        this.stoempid = stoempid;
    }

    public String getStophone() {
        return stophone;
    }

    public void setStophone(String stophone) {
        this.stophone = stophone;
    }

    public String getStoaddress() {
        return stoaddress;
    }

    public void setStoaddress(String stoaddress) {
        this.stoaddress = stoaddress;
    }

    public String getStoremark() {
        return storemark;
    }

    public void setStoremark(String storemark) {
        this.storemark = storemark;
    }

	public Storage() {
		super();
	}

	public Storage(String stoid, String stoname, String stosimplename, String stoengname, String stoconnectper,
			String stoempid, String stophone, String stoaddress, String storemark) {
		super();
		this.stoid = stoid;
		this.stoname = stoname;
		this.stosimplename = stosimplename;
		this.stoengname = stoengname;
		this.stoconnectper = stoconnectper;
		this.stoempid = stoempid;
		this.stophone = stophone;
		this.stoaddress = stoaddress;
		this.storemark = storemark;
	}

	public Storage(String stoname, String stosimplename, String stoengname, String stoconnectper, String stoempid,
			String stophone, String stoaddress, String storemark) {
		super();
		this.stoname = stoname;
		this.stosimplename = stosimplename;
		this.stoengname = stoengname;
		this.stoconnectper = stoconnectper;
		this.stoempid = stoempid;
		this.stophone = stophone;
		this.stoaddress = stoaddress;
		this.storemark = storemark;
	}

	@Override
	public String toString() {
		return "Storage [stoid=" + stoid + ", stoname=" + stoname + ", stosimplename=" + stosimplename + ", stoengname="
				+ stoengname + ", stoconnectper=" + stoconnectper + ", stoempid=" + stoempid + ", stophone=" + stophone
				+ ", stoaddress=" + stoaddress + ", storemark=" + storemark + "]";
	}
    
    
}