package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * movestorage
 * @author 
 */
public class Movestorage implements Serializable {
    /**
     * 单据号码(单号)
     */
    private String mseno;

    /**
     * 单据日期
     */
    private Date msedate;

    /**
     * 出库仓（仓库编号）
     */
    private String mseoutstorage;

    /**
     * 入库仓（仓库编号）
     */
    private String mseinsertstor;

    /**
     * 制作人
     */
    private String mseemployee;

    /**
     * 审核人
     */
    private String mesauditingemp;

    /**
     * 备注
     */
    private String mesremark;

    /**
     * 审核状态
     */
    private String messtate;

    /**
     * 是否可用
     */
    private String mestrash;

    /**
     * 标识是否删除
     */
    private Integer enables;

    private static final long serialVersionUID = 1L;

    public String getMseno() {
        return mseno;
    }

    public void setMseno(String mseno) {
        this.mseno = mseno;
    }

    public Date getMsedate() {
        return msedate;
    }

    public void setMsedate(Date msedate) {
        this.msedate = msedate;
    }

    public String getMseoutstorage() {
        return mseoutstorage;
    }

    public void setMseoutstorage(String mseoutstorage) {
        this.mseoutstorage = mseoutstorage;
    }

    public String getMseinsertstor() {
        return mseinsertstor;
    }

    public void setMseinsertstor(String mseinsertstor) {
        this.mseinsertstor = mseinsertstor;
    }

    public String getMseemployee() {
        return mseemployee;
    }

    public void setMseemployee(String mseemployee) {
        this.mseemployee = mseemployee;
    }

    public String getMesauditingemp() {
        return mesauditingemp;
    }

    public void setMesauditingemp(String mesauditingemp) {
        this.mesauditingemp = mesauditingemp;
    }

    public String getMesremark() {
        return mesremark;
    }

    public void setMesremark(String mesremark) {
        this.mesremark = mesremark;
    }

    public String getMesstate() {
        return messtate;
    }

    public void setMesstate(String messtate) {
        this.messtate = messtate;
    }

    public String getMestrash() {
        return mestrash;
    }

    public void setMestrash(String mestrash) {
        this.mestrash = mestrash;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }
}