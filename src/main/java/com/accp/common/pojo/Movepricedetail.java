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
    private Double moveaveragecost;

    /**
     * 单价（自己填）
     */
    private Double moveprice;

    /**
     * 调价金额
     */
    private Double movemoveprice;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

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

    public Double getMoveaveragecost() {
        return moveaveragecost;
    }

    public void setMoveaveragecost(Double moveaveragecost) {
        this.moveaveragecost = moveaveragecost;
    }

    public Double getMoveprice() {
        return moveprice;
    }

    public void setMoveprice(Double moveprice) {
        this.moveprice = moveprice;
    }

    public Double getMovemoveprice() {
        return movemoveprice;
    }

    public void setMovemoveprice(Double movemoveprice) {
        this.movemoveprice = movemoveprice;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Movepricedetail() {
		super();
	}

	public Movepricedetail(Integer moveinile, String moveorderno, String movespectype, String moveunit,
			Integer movestocks, Double moveaveragecost, Double moveprice, Double movemoveprice, Integer enables) {
		super();
		this.moveinile = moveinile;
		this.moveorderno = moveorderno;
		this.movespectype = movespectype;
		this.moveunit = moveunit;
		this.movestocks = movestocks;
		this.moveaveragecost = moveaveragecost;
		this.moveprice = moveprice;
		this.movemoveprice = movemoveprice;
		this.enables = enables;
	}

	public Movepricedetail(String movespectype, String moveunit, Integer movestocks, Double moveaveragecost,
			Double moveprice, Double movemoveprice, Integer enables) {
		super();
		this.movespectype = movespectype;
		this.moveunit = moveunit;
		this.movestocks = movestocks;
		this.moveaveragecost = moveaveragecost;
		this.moveprice = moveprice;
		this.movemoveprice = movemoveprice;
		this.enables = enables;
	}

	public Movepricedetail(String moveorderno, String movespectype, String moveunit, Integer movestocks,
			Double moveaveragecost, Double moveprice, Double movemoveprice, Integer enables) {
		super();
		this.moveorderno = moveorderno;
		this.movespectype = movespectype;
		this.moveunit = moveunit;
		this.movestocks = movestocks;
		this.moveaveragecost = moveaveragecost;
		this.moveprice = moveprice;
		this.movemoveprice = movemoveprice;
		this.enables = enables;
	}
    
    
}