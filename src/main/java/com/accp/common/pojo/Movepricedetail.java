package com.accp.common.pojo;

import java.io.Serializable;

/**
 * movepricedetail  调价明细表
 * @author 
 */
public class Movepricedetail implements Serializable {
	/**
     * 行号
     */
    private Integer moveinile;

    /**
     * 单据号码
     */
    private String moveorderno;

    public Integer getMoveinile() {
        return moveinile;
    }

    public void setMoveinile(Integer moveinile) {
        this.moveinile = moveinile;
    }

    public String getMoveorderno() {
        return moveorderno;
    }

    public void setMoveorderno(String moveorderno) {
        this.moveorderno = moveorderno;
    }
	/**
     * 物料编号
     */
    private String movematerielno;

    /**
     * 物料名称
     */
    private String movematerielname;

    /**
     * 规格型号
     */
    private String movespectype;

    /**
     * 单位
     */
    private String moveunit;

    /**
     * 库存量
     */
    private Integer movestocks;

    /**
     * 现行平均成本
     */
    private Integer moveaveragecost;

    /**
     * 单价（自己填）
     */
    private Integer moveprice;

    /**
     * 调价金额
     */
    private Integer movemoveprice;

    /**
     * 保留字段
     */
    private String safetyone;

    /**
     * 保留字段1
     */
    private String safetytwo;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getMovematerielno() {
        return movematerielno;
    }

    public void setMovematerielno(String movematerielno) {
        this.movematerielno = movematerielno;
    }

    public String getMovematerielname() {
        return movematerielname;
    }

    public void setMovematerielname(String movematerielname) {
        this.movematerielname = movematerielname;
    }

    public String getMovespectype() {
        return movespectype;
    }

    public void setMovespectype(String movespectype) {
        this.movespectype = movespectype;
    }

    public String getMoveunit() {
        return moveunit;
    }

    public void setMoveunit(String moveunit) {
        this.moveunit = moveunit;
    }

    public Integer getMovestocks() {
        return movestocks;
    }

    public void setMovestocks(Integer movestocks) {
        this.movestocks = movestocks;
    }

    public Integer getMoveaveragecost() {
        return moveaveragecost;
    }

    public void setMoveaveragecost(Integer moveaveragecost) {
        this.moveaveragecost = moveaveragecost;
    }

    public Integer getMoveprice() {
        return moveprice;
    }

    public void setMoveprice(Integer moveprice) {
        this.moveprice = moveprice;
    }

    public Integer getMovemoveprice() {
        return movemoveprice;
    }

    public void setMovemoveprice(Integer movemoveprice) {
        this.movemoveprice = movemoveprice;
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

	public Movepricedetail(Integer moveinile, String moveorderno, String movematerielno, String movematerielname,
			String movespectype, String moveunit, Integer movestocks, Integer moveaveragecost, Integer moveprice,
			Integer movemoveprice, String safetyone, String safetytwo, Integer enables) {
		super();
		this.moveinile = moveinile;
		this.moveorderno = moveorderno;
		this.movematerielno = movematerielno;
		this.movematerielname = movematerielname;
		this.movespectype = movespectype;
		this.moveunit = moveunit;
		this.movestocks = movestocks;
		this.moveaveragecost = moveaveragecost;
		this.moveprice = moveprice;
		this.movemoveprice = movemoveprice;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.enables = enables;
	}

	public Movepricedetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movepricedetail [moveinile=" + moveinile + ", moveorderno=" + moveorderno + ", movematerielno="
				+ movematerielno + ", movematerielname=" + movematerielname + ", movespectype=" + movespectype
				+ ", moveunit=" + moveunit + ", movestocks=" + movestocks + ", moveaveragecost=" + moveaveragecost
				+ ", moveprice=" + moveprice + ", movemoveprice=" + movemoveprice + ", safetyone=" + safetyone
				+ ", safetytwo=" + safetytwo + ", enables=" + enables + "]";
	}
    
    
}