package com.accp.common.pojo;

import java.io.Serializable;

/**
 * materieltype  物料类别设定
 * @author 
 */
public class Materieltype implements Serializable {
    /**
     * 物料类别编号                      
     */
    private String matypeid;

    /**
     * 物料类别名称
     */
    private String matypename;

    /**
     * 英文名称
     */
    private String matypeengname;

    /**
     * 备注
     */
    private String matyperemark;

    /**
     * 销售收入科目
     */
    private String mataccsaleid;

    /**
     * 销售成本科目
     */
    private String matacccostid;

    /**
     * 赠品费用科目
     */
    private String matexpenseid;

    /**
     * 其它收入科目
     */
    private String matincomeid;

    /**
     * 其它费用科目
     */
    private String matexpensid;

    /**
     * 其它成本科目
     */
    private String matcostid;

    private static final long serialVersionUID = 1L;

    public String getMatypeid() {
        return matypeid;
    }

    public void setMatypeid(String matypeid) {
        this.matypeid = matypeid;
    }

    public String getMatypename() {
        return matypename;
    }

    public void setMatypename(String matypename) {
        this.matypename = matypename;
    }

    public String getMatypeengname() {
        return matypeengname;
    }

    public void setMatypeengname(String matypeengname) {
        this.matypeengname = matypeengname;
    }

    public String getMatyperemark() {
        return matyperemark;
    }

    public void setMatyperemark(String matyperemark) {
        this.matyperemark = matyperemark;
    }

    public String getMataccsaleid() {
        return mataccsaleid;
    }

    public void setMataccsaleid(String mataccsaleid) {
        this.mataccsaleid = mataccsaleid;
    }

    public String getMatacccostid() {
        return matacccostid;
    }

    public void setMatacccostid(String matacccostid) {
        this.matacccostid = matacccostid;
    }

    public String getMatexpenseid() {
        return matexpenseid;
    }

    public void setMatexpenseid(String matexpenseid) {
        this.matexpenseid = matexpenseid;
    }

    public String getMatincomeid() {
        return matincomeid;
    }

    public void setMatincomeid(String matincomeid) {
        this.matincomeid = matincomeid;
    }

    public String getMatexpensid() {
        return matexpensid;
    }

    public void setMatexpensid(String matexpensid) {
        this.matexpensid = matexpensid;
    }

    public String getMatcostid() {
        return matcostid;
    }

    public void setMatcostid(String matcostid) {
        this.matcostid = matcostid;
    }

	public Materieltype() {
		super();
	}

	public Materieltype(String matypeid, String matypename, String matypeengname, String matyperemark,
			String mataccsaleid, String matacccostid, String matexpenseid, String matincomeid, String matexpensid,
			String matcostid) {
		super();
		this.matypeid = matypeid;
		this.matypename = matypename;
		this.matypeengname = matypeengname;
		this.matyperemark = matyperemark;
		this.mataccsaleid = mataccsaleid;
		this.matacccostid = matacccostid;
		this.matexpenseid = matexpenseid;
		this.matincomeid = matincomeid;
		this.matexpensid = matexpensid;
		this.matcostid = matcostid;
	}

	public Materieltype(String matypename, String matypeengname, String matyperemark, String mataccsaleid,
			String matacccostid, String matexpenseid, String matincomeid, String matexpensid, String matcostid) {
		super();
		this.matypename = matypename;
		this.matypeengname = matypeengname;
		this.matyperemark = matyperemark;
		this.mataccsaleid = mataccsaleid;
		this.matacccostid = matacccostid;
		this.matexpenseid = matexpenseid;
		this.matincomeid = matincomeid;
		this.matexpensid = matexpensid;
		this.matcostid = matcostid;
	}
    
    
}