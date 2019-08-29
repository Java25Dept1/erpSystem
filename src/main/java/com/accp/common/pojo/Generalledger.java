package com.accp.common.pojo;

import java.io.Serializable;

/**
 * generalledger
 * @author 
 */
public class Generalledger implements Serializable {
	 /**
     * 行号
     */
    private String genid;

    /**
     * 物料编号
     */
    private String genmaterielid;

    public String getGenid() {
        return genid;
    }

    public void setGenid(String genid) {
        this.genid = genid;
    }

    public String getGenmaterielid() {
        return genmaterielid;
    }

    public void setGenmaterielid(String genmaterielid) {
        this.genmaterielid = genmaterielid;
    }
	
	/**
     * 仓库编号(伪外键)
     */
    private String genstorageno;

    /**
     * 仓库
     */
    private String genstoragename;

    /**
     * 期初总数量
     */
    private Integer genexpectstartqty;

    /**
     * 标准成本
     */
    private Double genstandarcost;

    /**
     * 标准总成本
     */
    private Double genallcost;

    /**
     * 期初总成本
     */
    private Double genexpectstartallcost;

    /**
     * 安全数量
     */
    private Integer gensafetyqty;

    /**
     * 平均成本
     */
    private Double genavgcost;

    /**
     * 现有总数量
     */
    private Integer genqty;

    /**
     * 现行平均成本
     */
    private Double gennowavgcost;

    /**
     * 标准总成本（改名字）
     */
    private Double genstandardcostall;

    /**
     * 现行总成本
     */
    private Double gennowcost;

    /**
     * 保留字段1
     */
    private String safetyone;

    /**
     * 保留字段2
     */
    private String safetytwo;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getGenstorageno() {
        return genstorageno;
    }

    public void setGenstorageno(String genstorageno) {
        this.genstorageno = genstorageno;
    }

    public String getGenstoragename() {
        return genstoragename;
    }

    public void setGenstoragename(String genstoragename) {
        this.genstoragename = genstoragename;
    }

    public Integer getGenexpectstartqty() {
        return genexpectstartqty;
    }

    public void setGenexpectstartqty(Integer genexpectstartqty) {
        this.genexpectstartqty = genexpectstartqty;
    }

    public Double getGenstandarcost() {
        return genstandarcost;
    }

    public void setGenstandarcost(Double genstandarcost) {
        this.genstandarcost = genstandarcost;
    }

    public Double getGenallcost() {
        return genallcost;
    }

    public void setGenallcost(Double genallcost) {
        this.genallcost = genallcost;
    }

    public Double getGenexpectstartallcost() {
        return genexpectstartallcost;
    }

    public void setGenexpectstartallcost(Double genexpectstartallcost) {
        this.genexpectstartallcost = genexpectstartallcost;
    }

    public Integer getGensafetyqty() {
        return gensafetyqty;
    }

    public void setGensafetyqty(Integer gensafetyqty) {
        this.gensafetyqty = gensafetyqty;
    }

    public Double getGenavgcost() {
        return genavgcost;
    }

    public void setGenavgcost(Double genavgcost) {
        this.genavgcost = genavgcost;
    }

    public Integer getGenqty() {
        return genqty;
    }

    public void setGenqty(Integer genqty) {
        this.genqty = genqty;
    }

    public Double getGennowavgcost() {
        return gennowavgcost;
    }

    public void setGennowavgcost(Double gennowavgcost) {
        this.gennowavgcost = gennowavgcost;
    }

    public Double getGenstandardcostall() {
        return genstandardcostall;
    }

    public void setGenstandardcostall(Double genstandardcostall) {
        this.genstandardcostall = genstandardcostall;
    }

    public Double getGennowcost() {
        return gennowcost;
    }

    public void setGennowcost(Double gennowcost) {
        this.gennowcost = gennowcost;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone;
    }

    public String getSafetytwo() {
        return safetytwo;
    }

    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Generalledger() {
		super();
	}

	public Generalledger(String genid, String genmaterielid, String genstorageno, String genstoragename,
			Integer genexpectstartqty, Double genstandarcost, Double genallcost, Double genexpectstartallcost,
			Integer gensafetyqty, Double genavgcost, Integer genqty, Double gennowavgcost, Double genstandardcostall,
			Double gennowcost, String safetyone, String safetytwo, Integer enables) {
		super();
		this.genid = genid;
		this.genmaterielid = genmaterielid;
		this.genstorageno = genstorageno;
		this.genstoragename = genstoragename;
		this.genexpectstartqty = genexpectstartqty;
		this.genstandarcost = genstandarcost;
		this.genallcost = genallcost;
		this.genexpectstartallcost = genexpectstartallcost;
		this.gensafetyqty = gensafetyqty;
		this.genavgcost = genavgcost;
		this.genqty = genqty;
		this.gennowavgcost = gennowavgcost;
		this.genstandardcostall = genstandardcostall;
		this.gennowcost = gennowcost;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	public Generalledger(String genmaterielid, String genstorageno, String genstoragename, Integer genexpectstartqty,
			Double genstandarcost, Double genallcost, Double genexpectstartallcost, Integer gensafetyqty,
			Double genavgcost, Integer genqty, Double gennowavgcost, Double genstandardcostall, Double gennowcost,
			String safetyone, String safetytwo, Integer enables) {
		super();
		this.genmaterielid = genmaterielid;
		this.genstorageno = genstorageno;
		this.genstoragename = genstoragename;
		this.genexpectstartqty = genexpectstartqty;
		this.genstandarcost = genstandarcost;
		this.genallcost = genallcost;
		this.genexpectstartallcost = genexpectstartallcost;
		this.gensafetyqty = gensafetyqty;
		this.genavgcost = genavgcost;
		this.genqty = genqty;
		this.gennowavgcost = gennowavgcost;
		this.genstandardcostall = genstandardcostall;
		this.gennowcost = gennowcost;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	public Generalledger(String genstorageno, String genstoragename, Integer genexpectstartqty, Double genstandarcost,
			Double genallcost, Double genexpectstartallcost, Integer gensafetyqty, Double genavgcost, Integer genqty,
			Double gennowavgcost, Double genstandardcostall, Double gennowcost, String safetyone, String safetytwo,
			Integer enables) {
		super();
		this.genstorageno = genstorageno;
		this.genstoragename = genstoragename;
		this.genexpectstartqty = genexpectstartqty;
		this.genstandarcost = genstandarcost;
		this.genallcost = genallcost;
		this.genexpectstartallcost = genexpectstartallcost;
		this.gensafetyqty = gensafetyqty;
		this.genavgcost = genavgcost;
		this.genqty = genqty;
		this.gennowavgcost = gennowavgcost;
		this.genstandardcostall = genstandardcostall;
		this.gennowcost = gennowcost;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	@Override
	public String toString() {
		return "Generalledger [genid=" + genid + ", genmaterielid=" + genmaterielid + ", genstorageno=" + genstorageno
				+ ", genstoragename=" + genstoragename + ", genexpectstartqty=" + genexpectstartqty
				+ ", genstandarcost=" + genstandarcost + ", genallcost=" + genallcost + ", genexpectstartallcost="
				+ genexpectstartallcost + ", gensafetyqty=" + gensafetyqty + ", genavgcost=" + genavgcost + ", genqty="
				+ genqty + ", gennowavgcost=" + gennowavgcost + ", genstandardcostall=" + genstandardcostall
				+ ", gennowcost=" + gennowcost + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo + ", enables="
				+ enables + "]";
	}
    
    
}