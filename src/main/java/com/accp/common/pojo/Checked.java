package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * checked  盘点主表
 * @author 
 */
public class Checked implements Serializable {
	/**
     * 盘点单的流水号
     */
    private String cheid;

    @Override
	public String toString() {
		return "Checked [cheid=" + cheid + ", chestorageno=" + chestorageno + ", chestoragename=" + chestoragename
				+ ", chedate=" + chedate + ", cheman=" + cheman + ", chedeptname=" + chedeptname + ", cherestrictman="
				+ cherestrictman + ", cheauditingman=" + cheauditingman + ", chestatu=" + chestatu + ", enables="
				+ enables + "]";
	}

	/**
     * 盘点的仓库编号Storage(stoid)
     */
    private String chestorageno;

    public String getCheid() {
        return cheid;
    }

    public void setCheid(String cheid) {
        this.cheid = cheid;
    }

    public String getChestorageno() {
        return chestorageno;
    }

    public void setChestorageno(String chestorageno) {
        this.chestorageno = chestorageno;
    }
	
	/**
     * 盘点的仓库名称
     */
    private String chestoragename;

    /**
     * 盘点的日期
     */
    private Date chedate;

    /**
     * 盘点人名称
     */
    private String cheman;

    /**
     * 部门名称
     */
    private String chedeptname;

    /**
     * 制单人-当前登录人
     */
    private String cherestrictman;

    /**
     * 审核人-当前登录人
     */
    private String cheauditingman;

    /**
     * 审核状态，0为未审核
     */
    private Integer chestatu;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getChestoragename() {
        return chestoragename;
    }

    public void setChestoragename(String chestoragename) {
        this.chestoragename = chestoragename;
    }

    public Date getChedate() {
        return chedate;
    }

    public void setChedate(Date chedate) {
        this.chedate = chedate;
    }

    public String getCheman() {
        return cheman;
    }

    public void setCheman(String cheman) {
        this.cheman = cheman;
    }

    public String getChedeptname() {
        return chedeptname;
    }

    public void setChedeptname(String chedeptname) {
        this.chedeptname = chedeptname;
    }

    public String getCherestrictman() {
        return cherestrictman;
    }

    public void setCherestrictman(String cherestrictman) {
        this.cherestrictman = cherestrictman;
    }

    public String getCheauditingman() {
        return cheauditingman;
    }

    public void setCheauditingman(String cheauditingman) {
        this.cheauditingman = cheauditingman;
    }

    public Integer getChestatu() {
        return chestatu;
    }

    public void setChestatu(Integer chestatu) {
        this.chestatu = chestatu;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Checked() {
		super();
	}

	public Checked(String cheid, String chestorageno, String chestoragename, Date chedate, String cheman,
			String chedeptname, String cherestrictman, String cheauditingman, Integer chestatu, Integer enables) {
		super();
		this.cheid = cheid;
		this.chestorageno = chestorageno;
		this.chestoragename = chestoragename;
		this.chedate = chedate;
		this.cheman = cheman;
		this.chedeptname = chedeptname;
		this.cherestrictman = cherestrictman;
		this.cheauditingman = cheauditingman;
		this.chestatu = chestatu;
		this.enables = enables;
	}

	public Checked(String chestorageno, String chestoragename, Date chedate, String cheman, String chedeptname,
			String cherestrictman, String cheauditingman, Integer chestatu, Integer enables) {
		super();
		this.chestorageno = chestorageno;
		this.chestoragename = chestoragename;
		this.chedate = chedate;
		this.cheman = cheman;
		this.chedeptname = chedeptname;
		this.cherestrictman = cherestrictman;
		this.cheauditingman = cheauditingman;
		this.chestatu = chestatu;
		this.enables = enables;
	}

	public Checked(String chestoragename, Date chedate, String cheman, String chedeptname, String cherestrictman,
			String cheauditingman, Integer chestatu, Integer enables) {
		super();
		this.chestoragename = chestoragename;
		this.chedate = chedate;
		this.cheman = cheman;
		this.chedeptname = chedeptname;
		this.cherestrictman = cherestrictman;
		this.cheauditingman = cheauditingman;
		this.chestatu = chestatu;
		this.enables = enables;
	}
    
	
}