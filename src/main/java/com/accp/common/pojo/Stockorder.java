package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * stockorder  采购订单主表    
 * @author 
 */
public class Stockorder implements Serializable {
    /**
     * 单据号
     */
    private String stoid;

    /**
     * 日期
     */
    private Date stodate;

    /**
     * 供货商
     */
    private String stopeoname;

    /**
     * 供货商编号
     */
    private String stopeoid;

    /**
     * 供货商地址
     */
    private String stopeoadress;

    /**
     * 单价是否含税：1-含税，2-未税
     */
    private String stoistax;

    /**
     * 单况：1-未结案，2-已结案，3-无效
     */
    private Integer stostate;

    /**
     * 送货地址
     */
    private String stoadress;

    /**
     * 采购人员
     */
    private String stoempstock;

    /**
     * 伪外键:采购人员id
     */
    private String stopersonid;

    /**
     * 采购部门
     */
    private String stodept;

    /**
     * 伪外键:部门id
     */
    private String stodeptid;

    /**
     * 制单人员
     */
    private String stoempname;

    /**
     * 复核人员
     */
    private String stoempcheck;

    /**
     * 备注
     */
    private String stomark;

    /**
     * 审核状态
     */
    private Integer checkstate;

    /**
     * 保存（“采购订单”）
     */
    private String stockordername;

    /**
     * 标识是否删除
     */
    private Integer enables;

    /**
     * 保留字段
     */
    private String safetyone;

    /**
     * 保留字段
     */
    private String safetytwo;

    /**
     * 扩展字段0
     */
    private String extend0;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 扩展字段3
     */
    private String extend3;

    /**
     * 扩展字段4
     */
    private String extend4;
    
    private List<Stockorderdetails> details;//采购订单明细
    
    

    public Stockorder(Date stodate, String stopeoname, String stopeoid, String stopeoadress, String stoistax,
			Integer stostate, String stoadress, String stoempstock, String stopersonid, String stodept,
			String stodeptid, String stoempname, String stoempcheck, String stomark, Integer checkstate,
			String stockordername, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4, List<Stockorderdetails> details) {
		super();
		this.stodate = stodate;
		this.stopeoname = stopeoname;
		this.stopeoid = stopeoid;
		this.stopeoadress = stopeoadress;
		this.stoistax = stoistax;
		this.stostate = stostate;
		this.stoadress = stoadress;
		this.stoempstock = stoempstock;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoempname = stoempname;
		this.stoempcheck = stoempcheck;
		this.stomark = stomark;
		this.checkstate = checkstate;
		this.stockordername = stockordername;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
		this.details = details;
	}

	public Stockorder(String stoid, Date stodate, String stopeoname, String stopeoid, String stopeoadress,
			String stoistax, Integer stostate, String stoadress, String stoempstock, String stopersonid, String stodept,
			String stodeptid, String stoempname, String stoempcheck, String stomark, Integer checkstate,
			String stockordername, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4, List<Stockorderdetails> details) {
		super();
		this.stoid = stoid;
		this.stodate = stodate;
		this.stopeoname = stopeoname;
		this.stopeoid = stopeoid;
		this.stopeoadress = stopeoadress;
		this.stoistax = stoistax;
		this.stostate = stostate;
		this.stoadress = stoadress;
		this.stoempstock = stoempstock;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoempname = stoempname;
		this.stoempcheck = stoempcheck;
		this.stomark = stomark;
		this.checkstate = checkstate;
		this.stockordername = stockordername;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
		this.details = details;
	}

	public List<Stockorderdetails> getDetails() {
		return details;
	}

	public void setDetails(List<Stockorderdetails> details) {
		this.details = details;
	}

	private static final long serialVersionUID = 1L;

    public String getStoid() {
        return stoid;
    }

    public void setStoid(String stoid) {
        this.stoid = stoid;
    }

    public Date getStodate() {
        return stodate;
    }

    public void setStodate(Date stodate) {
        this.stodate = stodate;
    }

    public String getStopeoname() {
        return stopeoname;
    }

    public void setStopeoname(String stopeoname) {
        this.stopeoname = stopeoname;
    }

    public String getStopeoid() {
        return stopeoid;
    }

    public void setStopeoid(String stopeoid) {
        this.stopeoid = stopeoid;
    }

    public String getStopeoadress() {
        return stopeoadress;
    }

    public void setStopeoadress(String stopeoadress) {
        this.stopeoadress = stopeoadress;
    }

    public String getStoistax() {
        return stoistax;
    }

    public void setStoistax(String stoistax) {
        this.stoistax = stoistax;
    }

    public Integer getStostate() {
        return stostate;
    }

    public void setStostate(Integer stostate) {
        this.stostate = stostate;
    }

    public String getStoadress() {
        return stoadress;
    }

    public void setStoadress(String stoadress) {
        this.stoadress = stoadress;
    }

    public String getStoempstock() {
        return stoempstock;
    }

    public void setStoempstock(String stoempstock) {
        this.stoempstock = stoempstock;
    }

    public String getStopersonid() {
        return stopersonid;
    }

    public void setStopersonid(String stopersonid) {
        this.stopersonid = stopersonid;
    }

    public String getStodept() {
        return stodept;
    }

    public void setStodept(String stodept) {
        this.stodept = stodept;
    }

    public String getStodeptid() {
        return stodeptid;
    }

    public void setStodeptid(String stodeptid) {
        this.stodeptid = stodeptid;
    }

    public String getStoempname() {
        return stoempname;
    }

    public void setStoempname(String stoempname) {
        this.stoempname = stoempname;
    }

    public String getStoempcheck() {
        return stoempcheck;
    }

    public void setStoempcheck(String stoempcheck) {
        this.stoempcheck = stoempcheck;
    }

    public String getStomark() {
        return stomark;
    }

    public void setStomark(String stomark) {
        this.stomark = stomark;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public String getStockordername() {
        return stockordername;
    }

    public void setStockordername(String stockordername) {
        this.stockordername = stockordername;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
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

    public String getExtend0() {
        return extend0;
    }

    public void setExtend0(String extend0) {
        this.extend0 = extend0;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getExtend4() {
        return extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

	public Stockorder() {
		super();
	}

	public Stockorder(String stoid, Date stodate, String stopeoname, String stopeoid, String stopeoadress,
			String stoistax, Integer stostate, String stoadress, String stoempstock, String stopersonid, String stodept,
			String stodeptid, String stoempname, String stoempcheck, String stomark, Integer checkstate,
			String stockordername, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4) {
		super();
		this.stoid = stoid;
		this.stodate = stodate;
		this.stopeoname = stopeoname;
		this.stopeoid = stopeoid;
		this.stopeoadress = stopeoadress;
		this.stoistax = stoistax;
		this.stostate = stostate;
		this.stoadress = stoadress;
		this.stoempstock = stoempstock;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoempname = stoempname;
		this.stoempcheck = stoempcheck;
		this.stomark = stomark;
		this.checkstate = checkstate;
		this.stockordername = stockordername;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	public Stockorder(Date stodate, String stopeoname, String stopeoid, String stopeoadress, String stoistax,
			Integer stostate, String stoadress, String stoempstock, String stopersonid, String stodept,
			String stodeptid, String stoempname, String stoempcheck, String stomark, Integer checkstate,
			String stockordername, Integer enables, String safetyone, String safetytwo, String extend0, String extend1,
			String extend2, String extend3, String extend4) {
		super();
		this.stodate = stodate;
		this.stopeoname = stopeoname;
		this.stopeoid = stopeoid;
		this.stopeoadress = stopeoadress;
		this.stoistax = stoistax;
		this.stostate = stostate;
		this.stoadress = stoadress;
		this.stoempstock = stoempstock;
		this.stopersonid = stopersonid;
		this.stodept = stodept;
		this.stodeptid = stodeptid;
		this.stoempname = stoempname;
		this.stoempcheck = stoempcheck;
		this.stomark = stomark;
		this.checkstate = checkstate;
		this.stockordername = stockordername;
		this.enables = enables;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.extend0 = extend0;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.extend4 = extend4;
	}

	@Override
	public String toString() {
		return "Stockorder [stoid=" + stoid + ", stodate=" + stodate + ", stopeoname=" + stopeoname + ", stopeoid="
				+ stopeoid + ", stopeoadress=" + stopeoadress + ", stoistax=" + stoistax + ", stostate=" + stostate
				+ ", stoadress=" + stoadress + ", stoempstock=" + stoempstock + ", stopersonid=" + stopersonid
				+ ", stodept=" + stodept + ", stodeptid=" + stodeptid + ", stoempname=" + stoempname + ", stoempcheck="
				+ stoempcheck + ", stomark=" + stomark + ", checkstate=" + checkstate + ", stockordername="
				+ stockordername + ", enables=" + enables + ", safetyone=" + safetyone + ", safetytwo=" + safetytwo
				+ ", extend0=" + extend0 + ", extend1=" + extend1 + ", extend2=" + extend2 + ", extend3=" + extend3
				+ ", extend4=" + extend4 + "]";
	}
    
    
}