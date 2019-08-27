package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * moveprice  调价主表
 * @author 
 */
public class Moveprice implements Serializable {
    /**
     * 单据号码
     */
    private String moveorderno;

    /**
     * 单据日期
     */
    private Date movedate;

    /**
     * 调整方式
     */
    private String moveadjust;

    /**
     * 仓库编号
     */
    private String movestorageno;

    /**
     * 制单人员
     */
    private String movemake;

    /**
     * 复核人员
     */
    private String movecheck;

    /**
     * 备注
     */
    private String moveremark;

    /**
     * 审核状态
     */
    private Integer moveauditingstate;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getMoveorderno() {
        return moveorderno;
    }

    public void setMoveorderno(String moveorderno) {
        this.moveorderno = moveorderno;
    }

    public Date getMovedate() {
        return movedate;
    }

    public void setMovedate(Date movedate) {
        this.movedate = movedate;
    }

    public String getMoveadjust() {
        return moveadjust;
    }

    public void setMoveadjust(String moveadjust) {
        this.moveadjust = moveadjust;
    }

    public String getMovestorageno() {
        return movestorageno;
    }

    public void setMovestorageno(String movestorageno) {
        this.movestorageno = movestorageno;
    }

    public String getMovemake() {
        return movemake;
    }

    public void setMovemake(String movemake) {
        this.movemake = movemake;
    }

    public String getMovecheck() {
        return movecheck;
    }

    public void setMovecheck(String movecheck) {
        this.movecheck = movecheck;
    }

    public String getMoveremark() {
        return moveremark;
    }

    public void setMoveremark(String moveremark) {
        this.moveremark = moveremark;
    }

    public Integer getMoveauditingstate() {
        return moveauditingstate;
    }

    public void setMoveauditingstate(Integer moveauditingstate) {
        this.moveauditingstate = moveauditingstate;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

	public Moveprice() {
		super();
	}

	public Moveprice(String moveorderno, Date movedate, String moveadjust, String movestorageno, String movemake,
			String movecheck, String moveremark, Integer moveauditingstate, Integer enables) {
		super();
		this.moveorderno = moveorderno;
		this.movedate = movedate;
		this.moveadjust = moveadjust;
		this.movestorageno = movestorageno;
		this.movemake = movemake;
		this.movecheck = movecheck;
		this.moveremark = moveremark;
		this.moveauditingstate = moveauditingstate;
		this.enables = enables;
	}

	public Moveprice(Date movedate, String moveadjust, String movestorageno, String movemake, String movecheck,
			String moveremark, Integer moveauditingstate, Integer enables) {
		super();
		this.movedate = movedate;
		this.moveadjust = moveadjust;
		this.movestorageno = movestorageno;
		this.movemake = movemake;
		this.movecheck = movecheck;
		this.moveremark = moveremark;
		this.moveauditingstate = moveauditingstate;
		this.enables = enables;
	}
    
    
}