package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * materiel  物料主文件设定
 * @author 
 */
public class Materiel implements Serializable {
    /**
     * 物料编号                      
     */
    private String matid;

    /**
     * 物料名称
     */
    private String matname;

    /**
     * 规格型号
     */
    private String matspec;

    /**
     * 物料类别（伪外键）
     */
    private String mattypeid;

    /**
     * 物料类别名称
     */
    private String mattypename;

    /**
     * 英文品名
     */
    private String matdityname;

    /**
     * 计量单位
     */
    private String matunit;

    /**
     * 条形码编号
     */
    private Double matshapecode;

    /**
     * 建议售价
     */
    private Double matadviceprice;

    /**
     * 售价A
     */
    private Double matadvicepricea;

    /**
     * 售价B
     */
    private Double matadvicepriceb;

    /**
     * 售价C
     */
    private Double matadvicepricec;

    /**
     * 售价D
     */
    private Double matadvicepriced;

    /**
     * 售价E
     */
    private Double matadvicepricee;

    /**
     * 标准进价
     */
    private Double matstandardprice;

    /**
     * 币别
     */
    private String matcurrency;

    /**
     * 物料型态
     */
    private String matshape;

    /**
     * 是否含税
     */
    private Integer matifduty;

    /**
     * 税目
     */
    private String matcategories;

    /**
     * 税率
     */
    private Double matdutyrate;

    /**
     * 采购提前期
     */
    private Integer matstockaheaddate;

    /**
     * 主供应商
     */
    private String matmainafford;

    /**
     * 安全存量
     */
    private Double matetystock;

    /**
     * 期初总数量
     */
    private Double matuantity;

    /**
     * 平均成本
     */
    private Double matgecost;

    /**
     * 标准成本
     */
    private Double matdardcost;

    /**
     * 期初总成本
     */
    private Double mattialcost;

    /**
     * 低于安全存量
     */
    private Double matfestock;

    /**
     * 现有总数量
     */
    private Double matravailable;

    /**
     * 现行平均成本
     */
    private Double mattaveragecost;

    /**
     * 标准总成本
     */
    private Double matcost;

    /**
     * 现行总成本
     */
    private Double mattalcost;

    /**
     * 最初出库日
     */
    private Date matldepotdate;

    /**
     * 最初入库日
     */
    private Date matragedate;

    /**
     * 最近出库日
     */
    private Date matepotdate;

    /**
     * 最近入库日
     */
    private Date mattoragedate;

    /**
     * 自定义栏一
     */
    private String matolumnone;

    /**
     * 自定义栏二
     */
    private String matolumntow;

    /**
     * 主供应商ID
     */
    private String matmainaffordid;

    /**
     * 呆滞起计天数
     */
    private Integer matgawpdate;

    /**
     * 停用日期
     */
    private Date matstopdate;

    /**
     * 物料说明
     */
    private String matremark;

    private static final long serialVersionUID = 1L;

    public String getMatid() {
        return matid;
    }

    public void setMatid(String matid) {
        this.matid = matid;
    }

    public String getMatname() {
        return matname;
    }

    public void setMatname(String matname) {
        this.matname = matname;
    }

    public String getMatspec() {
        return matspec;
    }

    public void setMatspec(String matspec) {
        this.matspec = matspec;
    }

    public String getMattypeid() {
        return mattypeid;
    }

    public void setMattypeid(String mattypeid) {
        this.mattypeid = mattypeid;
    }

    public String getMattypename() {
        return mattypename;
    }

    public void setMattypename(String mattypename) {
        this.mattypename = mattypename;
    }

    public String getMatdityname() {
        return matdityname;
    }

    public void setMatdityname(String matdityname) {
        this.matdityname = matdityname;
    }

    public String getMatunit() {
        return matunit;
    }

    public void setMatunit(String matunit) {
        this.matunit = matunit;
    }

    public Double getMatshapecode() {
        return matshapecode;
    }

    public void setMatshapecode(Double matshapecode) {
        this.matshapecode = matshapecode;
    }

    public Double getMatadviceprice() {
        return matadviceprice;
    }

    public void setMatadviceprice(Double matadviceprice) {
        this.matadviceprice = matadviceprice;
    }

    public Double getMatadvicepricea() {
        return matadvicepricea;
    }

    public void setMatadvicepricea(Double matadvicepricea) {
        this.matadvicepricea = matadvicepricea;
    }

    public Double getMatadvicepriceb() {
        return matadvicepriceb;
    }

    public void setMatadvicepriceb(Double matadvicepriceb) {
        this.matadvicepriceb = matadvicepriceb;
    }

    public Double getMatadvicepricec() {
        return matadvicepricec;
    }

    public void setMatadvicepricec(Double matadvicepricec) {
        this.matadvicepricec = matadvicepricec;
    }

    public Double getMatadvicepriced() {
        return matadvicepriced;
    }

    public void setMatadvicepriced(Double matadvicepriced) {
        this.matadvicepriced = matadvicepriced;
    }

    public Double getMatadvicepricee() {
        return matadvicepricee;
    }

    public void setMatadvicepricee(Double matadvicepricee) {
        this.matadvicepricee = matadvicepricee;
    }

    public Double getMatstandardprice() {
        return matstandardprice;
    }

    public void setMatstandardprice(Double matstandardprice) {
        this.matstandardprice = matstandardprice;
    }

    public String getMatcurrency() {
        return matcurrency;
    }

    public void setMatcurrency(String matcurrency) {
        this.matcurrency = matcurrency;
    }

    public String getMatshape() {
        return matshape;
    }

    public void setMatshape(String matshape) {
        this.matshape = matshape;
    }

    public Integer getMatifduty() {
        return matifduty;
    }

    public void setMatifduty(Integer matifduty) {
        this.matifduty = matifduty;
    }

    public String getMatcategories() {
        return matcategories;
    }

    public void setMatcategories(String matcategories) {
        this.matcategories = matcategories;
    }

    public Double getMatdutyrate() {
        return matdutyrate;
    }

    public void setMatdutyrate(Double matdutyrate) {
        this.matdutyrate = matdutyrate;
    }

    public Integer getMatstockaheaddate() {
        return matstockaheaddate;
    }

    public void setMatstockaheaddate(Integer matstockaheaddate) {
        this.matstockaheaddate = matstockaheaddate;
    }

    public String getMatmainafford() {
        return matmainafford;
    }

    public void setMatmainafford(String matmainafford) {
        this.matmainafford = matmainafford;
    }

    public Double getMatetystock() {
        return matetystock;
    }

    public void setMatetystock(Double matetystock) {
        this.matetystock = matetystock;
    }

    public Double getMatuantity() {
        return matuantity;
    }

    public void setMatuantity(Double matuantity) {
        this.matuantity = matuantity;
    }

    public Double getMatgecost() {
        return matgecost;
    }

    public void setMatgecost(Double matgecost) {
        this.matgecost = matgecost;
    }

    public Double getMatdardcost() {
        return matdardcost;
    }

    public void setMatdardcost(Double matdardcost) {
        this.matdardcost = matdardcost;
    }

    public Double getMattialcost() {
        return mattialcost;
    }

    public void setMattialcost(Double mattialcost) {
        this.mattialcost = mattialcost;
    }

    public Double getMatfestock() {
        return matfestock;
    }

    public void setMatfestock(Double matfestock) {
        this.matfestock = matfestock;
    }

    public Double getMatravailable() {
        return matravailable;
    }

    public void setMatravailable(Double matravailable) {
        this.matravailable = matravailable;
    }

    public Double getMattaveragecost() {
        return mattaveragecost;
    }

    public void setMattaveragecost(Double mattaveragecost) {
        this.mattaveragecost = mattaveragecost;
    }

    public Double getMatcost() {
        return matcost;
    }

    public void setMatcost(Double matcost) {
        this.matcost = matcost;
    }

    public Double getMattalcost() {
        return mattalcost;
    }

    public void setMattalcost(Double mattalcost) {
        this.mattalcost = mattalcost;
    }

    public Date getMatldepotdate() {
        return matldepotdate;
    }

    public void setMatldepotdate(Date matldepotdate) {
        this.matldepotdate = matldepotdate;
    }

    public Date getMatragedate() {
        return matragedate;
    }

    public void setMatragedate(Date matragedate) {
        this.matragedate = matragedate;
    }

    public Date getMatepotdate() {
        return matepotdate;
    }

    public void setMatepotdate(Date matepotdate) {
        this.matepotdate = matepotdate;
    }

    public Date getMattoragedate() {
        return mattoragedate;
    }

    public void setMattoragedate(Date mattoragedate) {
        this.mattoragedate = mattoragedate;
    }

    public String getMatolumnone() {
        return matolumnone;
    }

    public void setMatolumnone(String matolumnone) {
        this.matolumnone = matolumnone;
    }

    public String getMatolumntow() {
        return matolumntow;
    }

    public void setMatolumntow(String matolumntow) {
        this.matolumntow = matolumntow;
    }

    public String getMatmainaffordid() {
        return matmainaffordid;
    }

    public void setMatmainaffordid(String matmainaffordid) {
        this.matmainaffordid = matmainaffordid;
    }

    public Integer getMatgawpdate() {
        return matgawpdate;
    }

    public void setMatgawpdate(Integer matgawpdate) {
        this.matgawpdate = matgawpdate;
    }

    public Date getMatstopdate() {
        return matstopdate;
    }

    public void setMatstopdate(Date matstopdate) {
        this.matstopdate = matstopdate;
    }

    public String getMatremark() {
        return matremark;
    }

    public void setMatremark(String matremark) {
        this.matremark = matremark;
    }

	public Materiel() {
		super();
	}

	public Materiel(String matid, String matname, String matspec, String mattypeid, String mattypename,
			String matdityname, String matunit, Double matshapecode, Double matadviceprice, Double matadvicepricea,
			Double matadvicepriceb, Double matadvicepricec, Double matadvicepriced, Double matadvicepricee,
			Double matstandardprice, String matcurrency, String matshape, Integer matifduty, String matcategories,
			Double matdutyrate, Integer matstockaheaddate, String matmainafford, Double matetystock, Double matuantity,
			Double matgecost, Double matdardcost, Double mattialcost, Double matfestock, Double matravailable,
			Double mattaveragecost, Double matcost, Double mattalcost, Date matldepotdate, Date matragedate,
			Date matepotdate, Date mattoragedate, String matolumnone, String matolumntow, String matmainaffordid,
			Integer matgawpdate, Date matstopdate, String matremark) {
		super();
		this.matid = matid;
		this.matname = matname;
		this.matspec = matspec;
		this.mattypeid = mattypeid;
		this.mattypename = mattypename;
		this.matdityname = matdityname;
		this.matunit = matunit;
		this.matshapecode = matshapecode;
		this.matadviceprice = matadviceprice;
		this.matadvicepricea = matadvicepricea;
		this.matadvicepriceb = matadvicepriceb;
		this.matadvicepricec = matadvicepricec;
		this.matadvicepriced = matadvicepriced;
		this.matadvicepricee = matadvicepricee;
		this.matstandardprice = matstandardprice;
		this.matcurrency = matcurrency;
		this.matshape = matshape;
		this.matifduty = matifduty;
		this.matcategories = matcategories;
		this.matdutyrate = matdutyrate;
		this.matstockaheaddate = matstockaheaddate;
		this.matmainafford = matmainafford;
		this.matetystock = matetystock;
		this.matuantity = matuantity;
		this.matgecost = matgecost;
		this.matdardcost = matdardcost;
		this.mattialcost = mattialcost;
		this.matfestock = matfestock;
		this.matravailable = matravailable;
		this.mattaveragecost = mattaveragecost;
		this.matcost = matcost;
		this.mattalcost = mattalcost;
		this.matldepotdate = matldepotdate;
		this.matragedate = matragedate;
		this.matepotdate = matepotdate;
		this.mattoragedate = mattoragedate;
		this.matolumnone = matolumnone;
		this.matolumntow = matolumntow;
		this.matmainaffordid = matmainaffordid;
		this.matgawpdate = matgawpdate;
		this.matstopdate = matstopdate;
		this.matremark = matremark;
	}

	public Materiel(String matname, String matspec, String mattypeid, String mattypename, String matdityname,
			String matunit, Double matshapecode, Double matadviceprice, Double matadvicepricea, Double matadvicepriceb,
			Double matadvicepricec, Double matadvicepriced, Double matadvicepricee, Double matstandardprice,
			String matcurrency, String matshape, Integer matifduty, String matcategories, Double matdutyrate,
			Integer matstockaheaddate, String matmainafford, Double matetystock, Double matuantity, Double matgecost,
			Double matdardcost, Double mattialcost, Double matfestock, Double matravailable, Double mattaveragecost,
			Double matcost, Double mattalcost, Date matldepotdate, Date matragedate, Date matepotdate,
			Date mattoragedate, String matolumnone, String matolumntow, String matmainaffordid, Integer matgawpdate,
			Date matstopdate, String matremark) {
		super();
		this.matname = matname;
		this.matspec = matspec;
		this.mattypeid = mattypeid;
		this.mattypename = mattypename;
		this.matdityname = matdityname;
		this.matunit = matunit;
		this.matshapecode = matshapecode;
		this.matadviceprice = matadviceprice;
		this.matadvicepricea = matadvicepricea;
		this.matadvicepriceb = matadvicepriceb;
		this.matadvicepricec = matadvicepricec;
		this.matadvicepriced = matadvicepriced;
		this.matadvicepricee = matadvicepricee;
		this.matstandardprice = matstandardprice;
		this.matcurrency = matcurrency;
		this.matshape = matshape;
		this.matifduty = matifduty;
		this.matcategories = matcategories;
		this.matdutyrate = matdutyrate;
		this.matstockaheaddate = matstockaheaddate;
		this.matmainafford = matmainafford;
		this.matetystock = matetystock;
		this.matuantity = matuantity;
		this.matgecost = matgecost;
		this.matdardcost = matdardcost;
		this.mattialcost = mattialcost;
		this.matfestock = matfestock;
		this.matravailable = matravailable;
		this.mattaveragecost = mattaveragecost;
		this.matcost = matcost;
		this.mattalcost = mattalcost;
		this.matldepotdate = matldepotdate;
		this.matragedate = matragedate;
		this.matepotdate = matepotdate;
		this.mattoragedate = mattoragedate;
		this.matolumnone = matolumnone;
		this.matolumntow = matolumntow;
		this.matmainaffordid = matmainaffordid;
		this.matgawpdate = matgawpdate;
		this.matstopdate = matstopdate;
		this.matremark = matremark;
	}
    
    
}