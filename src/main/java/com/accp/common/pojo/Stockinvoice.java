package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * stockinvoice  采购发票主表
 * @author 
 */
public class Stockinvoice implements Serializable {
	 private String sysid;

	    private String fundbillno;

	    public String getSysid() {
	        return sysid;
	    }

	    public void setSysid(String sysid) {
	        this.sysid = sysid;
	    }

	    public String getFundbillno() {
	        return fundbillno;
	    }

	    public void setFundbillno(String fundbillno) {
	        this.fundbillno = fundbillno;
	    }
	
	private Date billdate;

    private String peoid;

    private String purveyname;

    private String billtype;

    private String invoice;

    private String affirmstate;

    private String invoiceid;

    private String voucherno;

    private String currid;

    private String cvoucherno;

    private String exchrate;

    private String total;

    private String tax;

    private String cashpay;

    private String visapay;

    private String offset;

    private String discount;

    private String localtotal;

    private String localtax;

    private String localcashpay;

    private String localvisapay;

    private String localoffset;

    private String prepayday;

    private String dueto;

    private String saleman;

    private String mark;

    private String permitter;

    private String project;

    private String remark;

    private String safetyone;

    private String safetytwo;

    private String custflag;

    private static final long serialVersionUID = 1L;

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getPeoid() {
        return peoid;
    }

    public void setPeoid(String peoid) {
        this.peoid = peoid;
    }

    public String getPurveyname() {
        return purveyname;
    }

    public void setPurveyname(String purveyname) {
        this.purveyname = purveyname;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getAffirmstate() {
        return affirmstate;
    }

    public void setAffirmstate(String affirmstate) {
        this.affirmstate = affirmstate;
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid;
    }

    public String getCvoucherno() {
        return cvoucherno;
    }

    public void setCvoucherno(String cvoucherno) {
        this.cvoucherno = cvoucherno;
    }

    public String getExchrate() {
        return exchrate;
    }

    public void setExchrate(String exchrate) {
        this.exchrate = exchrate;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCashpay() {
        return cashpay;
    }

    public void setCashpay(String cashpay) {
        this.cashpay = cashpay;
    }

    public String getVisapay() {
        return visapay;
    }

    public void setVisapay(String visapay) {
        this.visapay = visapay;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getLocaltotal() {
        return localtotal;
    }

    public void setLocaltotal(String localtotal) {
        this.localtotal = localtotal;
    }

    public String getLocaltax() {
        return localtax;
    }

    public void setLocaltax(String localtax) {
        this.localtax = localtax;
    }

    public String getLocalcashpay() {
        return localcashpay;
    }

    public void setLocalcashpay(String localcashpay) {
        this.localcashpay = localcashpay;
    }

    public String getLocalvisapay() {
        return localvisapay;
    }

    public void setLocalvisapay(String localvisapay) {
        this.localvisapay = localvisapay;
    }

    public String getLocaloffset() {
        return localoffset;
    }

    public void setLocaloffset(String localoffset) {
        this.localoffset = localoffset;
    }

    public String getPrepayday() {
        return prepayday;
    }

    public void setPrepayday(String prepayday) {
        this.prepayday = prepayday;
    }

    public String getDueto() {
        return dueto;
    }

    public void setDueto(String dueto) {
        this.dueto = dueto;
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getCustflag() {
        return custflag;
    }

    public void setCustflag(String custflag) {
        this.custflag = custflag;
    }

	public Stockinvoice() {
		super();
	}

	public Stockinvoice(String sysid, String fundbillno, Date billdate, String peoid, String purveyname,
			String billtype, String invoice, String affirmstate, String invoiceid, String voucherno, String currid,
			String cvoucherno, String exchrate, String total, String tax, String cashpay, String visapay, String offset,
			String discount, String localtotal, String localtax, String localcashpay, String localvisapay,
			String localoffset, String prepayday, String dueto, String saleman, String mark, String permitter,
			String project, String remark, String safetyone, String safetytwo, String custflag) {
		super();
		this.sysid = sysid;
		this.fundbillno = fundbillno;
		this.billdate = billdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.billtype = billtype;
		this.invoice = invoice;
		this.affirmstate = affirmstate;
		this.invoiceid = invoiceid;
		this.voucherno = voucherno;
		this.currid = currid;
		this.cvoucherno = cvoucherno;
		this.exchrate = exchrate;
		this.total = total;
		this.tax = tax;
		this.cashpay = cashpay;
		this.visapay = visapay;
		this.offset = offset;
		this.discount = discount;
		this.localtotal = localtotal;
		this.localtax = localtax;
		this.localcashpay = localcashpay;
		this.localvisapay = localvisapay;
		this.localoffset = localoffset;
		this.prepayday = prepayday;
		this.dueto = dueto;
		this.saleman = saleman;
		this.mark = mark;
		this.permitter = permitter;
		this.project = project;
		this.remark = remark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.custflag = custflag;
	}

	public Stockinvoice(String fundbillno, Date billdate, String peoid, String purveyname, String billtype,
			String invoice, String affirmstate, String invoiceid, String voucherno, String currid, String cvoucherno,
			String exchrate, String total, String tax, String cashpay, String visapay, String offset, String discount,
			String localtotal, String localtax, String localcashpay, String localvisapay, String localoffset,
			String prepayday, String dueto, String saleman, String mark, String permitter, String project,
			String remark, String safetyone, String safetytwo, String custflag) {
		super();
		this.fundbillno = fundbillno;
		this.billdate = billdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.billtype = billtype;
		this.invoice = invoice;
		this.affirmstate = affirmstate;
		this.invoiceid = invoiceid;
		this.voucherno = voucherno;
		this.currid = currid;
		this.cvoucherno = cvoucherno;
		this.exchrate = exchrate;
		this.total = total;
		this.tax = tax;
		this.cashpay = cashpay;
		this.visapay = visapay;
		this.offset = offset;
		this.discount = discount;
		this.localtotal = localtotal;
		this.localtax = localtax;
		this.localcashpay = localcashpay;
		this.localvisapay = localvisapay;
		this.localoffset = localoffset;
		this.prepayday = prepayday;
		this.dueto = dueto;
		this.saleman = saleman;
		this.mark = mark;
		this.permitter = permitter;
		this.project = project;
		this.remark = remark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.custflag = custflag;
	}

	public Stockinvoice(Date billdate, String peoid, String purveyname, String billtype, String invoice,
			String affirmstate, String invoiceid, String voucherno, String currid, String cvoucherno, String exchrate,
			String total, String tax, String cashpay, String visapay, String offset, String discount, String localtotal,
			String localtax, String localcashpay, String localvisapay, String localoffset, String prepayday,
			String dueto, String saleman, String mark, String permitter, String project, String remark,
			String safetyone, String safetytwo, String custflag) {
		super();
		this.billdate = billdate;
		this.peoid = peoid;
		this.purveyname = purveyname;
		this.billtype = billtype;
		this.invoice = invoice;
		this.affirmstate = affirmstate;
		this.invoiceid = invoiceid;
		this.voucherno = voucherno;
		this.currid = currid;
		this.cvoucherno = cvoucherno;
		this.exchrate = exchrate;
		this.total = total;
		this.tax = tax;
		this.cashpay = cashpay;
		this.visapay = visapay;
		this.offset = offset;
		this.discount = discount;
		this.localtotal = localtotal;
		this.localtax = localtax;
		this.localcashpay = localcashpay;
		this.localvisapay = localvisapay;
		this.localoffset = localoffset;
		this.prepayday = prepayday;
		this.dueto = dueto;
		this.saleman = saleman;
		this.mark = mark;
		this.permitter = permitter;
		this.project = project;
		this.remark = remark;
		this.safetyone = safetyone;
		this.safetytwo = safetytwo;
		this.custflag = custflag;
	}

	@Override
	public String toString() {
		return "Stockinvoice [sysid=" + sysid + ", fundbillno=" + fundbillno + ", billdate=" + billdate + ", peoid="
				+ peoid + ", purveyname=" + purveyname + ", billtype=" + billtype + ", invoice=" + invoice
				+ ", affirmstate=" + affirmstate + ", invoiceid=" + invoiceid + ", voucherno=" + voucherno + ", currid="
				+ currid + ", cvoucherno=" + cvoucherno + ", exchrate=" + exchrate + ", total=" + total + ", tax=" + tax
				+ ", cashpay=" + cashpay + ", visapay=" + visapay + ", offset=" + offset + ", discount=" + discount
				+ ", localtotal=" + localtotal + ", localtax=" + localtax + ", localcashpay=" + localcashpay
				+ ", localvisapay=" + localvisapay + ", localoffset=" + localoffset + ", prepayday=" + prepayday
				+ ", dueto=" + dueto + ", saleman=" + saleman + ", mark=" + mark + ", permitter=" + permitter
				+ ", project=" + project + ", remark=" + remark + ", safetyone=" + safetyone + ", safetytwo="
				+ safetytwo + ", custflag=" + custflag + "]";
	}
    
    
}