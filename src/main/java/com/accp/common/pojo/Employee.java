package com.accp.common.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * employee  人员主文件设定
 * @author 
 */
public class Employee implements Serializable {
    /**
     * 人员编号
     */
    private String empid;

    /**
     * 人员姓名
     */
    private String empname;

    /**
     * 英文姓名
     */
    private String empename;

    /**
     * 部门编号id
     */
    private String depid;

    /**
     * 性别（默认男）
     */
    private String empsex;

    /**
     * 身份证号
     */
    private String empcard;

    /**
     * 就职状态id
     */
    private String empstate;

    /**
     * 行事历
     */
    private String calid;

    /**
     * 出生日期
     */
    private Date empbirthday;

    /**
     * 政治面貌
     */
    private String empphoneone;

    /**
     * 婚姻状况
     */
    private String empphonetwo;

    /**
     * 入职日期
     */
    private Date empphonethree;

    /**
     * 血型
     */
    private String bloodtype;

    /**
     * 离职日期
     */
    private Date empbirtbday;

    /**
     * 岗位
     */
    private String empjob;

    /**
     * 籍贯
     */
    private String empemail;

    /**
     * 技术职务
     */
    private String technicalpositin;

    /**
     * 中文职务
     */
    private String chineseposts;

    /**
     * 英文职务
     */
    private String englishposts;

    /**
     * 联系邮编
     */
    private String contactzipcode;

    /**
     * 联系电话
     */
    private String contactdouble;

    /**
     * 联系地址
     */
    private String contactaddress;

    /**
     * 移动电话
     */
    private String mobilephone;

    /**
     * 民族
     */
    private String nation;

    /**
     * 职务
     */
    private String post;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 薪资方案
     */
    private String salaryscheme;

    /**
     * 传输方案
     */
    private String transmissionscheme;

    /**
     * 扣税方式
     */
    private String taxdeductionmethod;

    /**
     * 最高学历
     */
    private String emptop;

    /**
     * 学位
     */
    private String empdegree;

    /**
     * 到期日期
     */
    private Date empgotime;

    /**
     * 毕业学校
     */
    private String empgraduatetime;

    /**
     * 合同起始日期
     */
    private Date emppactstarttime;

    /**
     * 合同终止日期
     */
    private Date emppactendtime;

    /**
     * 所学专业
     */
    private String majorofstudy;

    /**
     * 外语水平
     */
    private String proficiency;

    /**
     * 体检日期
     */
    private Date examinationdate;

    /**
     * 入境日期
     */
    private Date ofentrydate;

    /**
     * 护照号码
     */
    private String passportdouble;

    /**
     * 合同期
     */
    private Date contractperiod;

    /**
     * 电子邮件
     */
    private String myempemail;

    /**
     * 户籍电话
     */
    private String householdtelephone;

    /**
     * 现邮编
     */
    private String empnowmailid;

    /**
     * 户籍邮编
     */
    private String householdemail;

    /**
     * 户籍地址
     */
    private String householdaddress;

    /**
     * 家庭电话
     */
    private String empfamilyphone;

    /**
     * 家庭住址
     */
    private String empfamilyplace;

    /**
     * 现电话
     */
    private String empnowphone;

    /**
     * 现住址
     */
    private String empnowplace;

    /**
     * 紧急联系人
     */
    private String empexigenceman;

    /**
     * 紧急联系电话
     */
    private String empexphone;

    /**
     * 紧急联系邮编
     */
    private String empexemail;

    /**
     * 紧急联系地址
     */
    private String empexaddress;

    /**
     * 家庭邮编
     */
    private String empfamilymailid;

    /**
     * 自定义栏一
     */
    private String custombarone;

    /**
     * 自定义栏二
     */
    private String custombartow;

    /**
     * 自定义栏三
     */
    private String custombarthree;

    /**
     * 自定义栏四
     */
    private String custombarfour;

    /**
     * 自定义栏五
     */
    private String custombarfilw;

    /**
     * 自定义栏六
     */
    private String custombarsex;

    /**
     * 备注
     */
    private String empremark;

    private static final long serialVersionUID = 1L;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpename() {
        return empename;
    }

    public void setEmpename(String empename) {
        this.empename = empename;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public String getEmpcard() {
        return empcard;
    }

    public void setEmpcard(String empcard) {
        this.empcard = empcard;
    }

    public String getEmpstate() {
        return empstate;
    }

    public void setEmpstate(String empstate) {
        this.empstate = empstate;
    }

    public String getCalid() {
        return calid;
    }

    public void setCalid(String calid) {
        this.calid = calid;
    }

    public Date getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(Date empbirthday) {
        this.empbirthday = empbirthday;
    }

    public String getEmpphoneone() {
        return empphoneone;
    }

    public void setEmpphoneone(String empphoneone) {
        this.empphoneone = empphoneone;
    }

    public String getEmpphonetwo() {
        return empphonetwo;
    }

    public void setEmpphonetwo(String empphonetwo) {
        this.empphonetwo = empphonetwo;
    }

    public Date getEmpphonethree() {
        return empphonethree;
    }

    public void setEmpphonethree(Date empphonethree) {
        this.empphonethree = empphonethree;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public Date getEmpbirtbday() {
        return empbirtbday;
    }

    public void setEmpbirtbday(Date empbirtbday) {
        this.empbirtbday = empbirtbday;
    }

    public String getEmpjob() {
        return empjob;
    }

    public void setEmpjob(String empjob) {
        this.empjob = empjob;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getTechnicalpositin() {
        return technicalpositin;
    }

    public void setTechnicalpositin(String technicalpositin) {
        this.technicalpositin = technicalpositin;
    }

    public String getChineseposts() {
        return chineseposts;
    }

    public void setChineseposts(String chineseposts) {
        this.chineseposts = chineseposts;
    }

    public String getEnglishposts() {
        return englishposts;
    }

    public void setEnglishposts(String englishposts) {
        this.englishposts = englishposts;
    }

    public String getContactzipcode() {
        return contactzipcode;
    }

    public void setContactzipcode(String contactzipcode) {
        this.contactzipcode = contactzipcode;
    }

    public String getContactdouble() {
        return contactdouble;
    }

    public void setContactdouble(String contactdouble) {
        this.contactdouble = contactdouble;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSalaryscheme() {
        return salaryscheme;
    }

    public void setSalaryscheme(String salaryscheme) {
        this.salaryscheme = salaryscheme;
    }

    public String getTransmissionscheme() {
        return transmissionscheme;
    }

    public void setTransmissionscheme(String transmissionscheme) {
        this.transmissionscheme = transmissionscheme;
    }

    public String getTaxdeductionmethod() {
        return taxdeductionmethod;
    }

    public void setTaxdeductionmethod(String taxdeductionmethod) {
        this.taxdeductionmethod = taxdeductionmethod;
    }

    public String getEmptop() {
        return emptop;
    }

    public void setEmptop(String emptop) {
        this.emptop = emptop;
    }

    public String getEmpdegree() {
        return empdegree;
    }

    public void setEmpdegree(String empdegree) {
        this.empdegree = empdegree;
    }

    public Date getEmpgotime() {
        return empgotime;
    }

    public void setEmpgotime(Date empgotime) {
        this.empgotime = empgotime;
    }

    public String getEmpgraduatetime() {
        return empgraduatetime;
    }

    public void setEmpgraduatetime(String empgraduatetime) {
        this.empgraduatetime = empgraduatetime;
    }

    public Date getEmppactstarttime() {
        return emppactstarttime;
    }

    public void setEmppactstarttime(Date emppactstarttime) {
        this.emppactstarttime = emppactstarttime;
    }

    public Date getEmppactendtime() {
        return emppactendtime;
    }

    public void setEmppactendtime(Date emppactendtime) {
        this.emppactendtime = emppactendtime;
    }

    public String getMajorofstudy() {
        return majorofstudy;
    }

    public void setMajorofstudy(String majorofstudy) {
        this.majorofstudy = majorofstudy;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public Date getExaminationdate() {
        return examinationdate;
    }

    public void setExaminationdate(Date examinationdate) {
        this.examinationdate = examinationdate;
    }

    public Date getOfentrydate() {
        return ofentrydate;
    }

    public void setOfentrydate(Date ofentrydate) {
        this.ofentrydate = ofentrydate;
    }

    public String getPassportdouble() {
        return passportdouble;
    }

    public void setPassportdouble(String passportdouble) {
        this.passportdouble = passportdouble;
    }

    public Date getContractperiod() {
        return contractperiod;
    }

    public void setContractperiod(Date contractperiod) {
        this.contractperiod = contractperiod;
    }

    public String getMyempemail() {
        return myempemail;
    }

    public void setMyempemail(String myempemail) {
        this.myempemail = myempemail;
    }

    public String getHouseholdtelephone() {
        return householdtelephone;
    }

    public void setHouseholdtelephone(String householdtelephone) {
        this.householdtelephone = householdtelephone;
    }

    public String getEmpnowmailid() {
        return empnowmailid;
    }

    public void setEmpnowmailid(String empnowmailid) {
        this.empnowmailid = empnowmailid;
    }

    public String getHouseholdemail() {
        return householdemail;
    }

    public void setHouseholdemail(String householdemail) {
        this.householdemail = householdemail;
    }

    public String getHouseholdaddress() {
        return householdaddress;
    }

    public void setHouseholdaddress(String householdaddress) {
        this.householdaddress = householdaddress;
    }

    public String getEmpfamilyphone() {
        return empfamilyphone;
    }

    public void setEmpfamilyphone(String empfamilyphone) {
        this.empfamilyphone = empfamilyphone;
    }

    public String getEmpfamilyplace() {
        return empfamilyplace;
    }

    public void setEmpfamilyplace(String empfamilyplace) {
        this.empfamilyplace = empfamilyplace;
    }

    public String getEmpnowphone() {
        return empnowphone;
    }

    public void setEmpnowphone(String empnowphone) {
        this.empnowphone = empnowphone;
    }

    public String getEmpnowplace() {
        return empnowplace;
    }

    public void setEmpnowplace(String empnowplace) {
        this.empnowplace = empnowplace;
    }

    public String getEmpexigenceman() {
        return empexigenceman;
    }

    public void setEmpexigenceman(String empexigenceman) {
        this.empexigenceman = empexigenceman;
    }

    public String getEmpexphone() {
        return empexphone;
    }

    public void setEmpexphone(String empexphone) {
        this.empexphone = empexphone;
    }

    public String getEmpexemail() {
        return empexemail;
    }

    public void setEmpexemail(String empexemail) {
        this.empexemail = empexemail;
    }

    public String getEmpexaddress() {
        return empexaddress;
    }

    public void setEmpexaddress(String empexaddress) {
        this.empexaddress = empexaddress;
    }

    public String getEmpfamilymailid() {
        return empfamilymailid;
    }

    public void setEmpfamilymailid(String empfamilymailid) {
        this.empfamilymailid = empfamilymailid;
    }

    public String getCustombarone() {
        return custombarone;
    }

    public void setCustombarone(String custombarone) {
        this.custombarone = custombarone;
    }

    public String getCustombartow() {
        return custombartow;
    }

    public void setCustombartow(String custombartow) {
        this.custombartow = custombartow;
    }

    public String getCustombarthree() {
        return custombarthree;
    }

    public void setCustombarthree(String custombarthree) {
        this.custombarthree = custombarthree;
    }

    public String getCustombarfour() {
        return custombarfour;
    }

    public void setCustombarfour(String custombarfour) {
        this.custombarfour = custombarfour;
    }

    public String getCustombarfilw() {
        return custombarfilw;
    }

    public void setCustombarfilw(String custombarfilw) {
        this.custombarfilw = custombarfilw;
    }

    public String getCustombarsex() {
        return custombarsex;
    }

    public void setCustombarsex(String custombarsex) {
        this.custombarsex = custombarsex;
    }

    public String getEmpremark() {
        return empremark;
    }

    public void setEmpremark(String empremark) {
        this.empremark = empremark;
    }

	public Employee() {
		super();
	}

	public Employee(String empid, String empname, String empename, String depid, String empsex, String empcard,
			String empstate, String calid, Date empbirthday, String empphoneone, String empphonetwo, Date empphonethree,
			String bloodtype, Date empbirtbday, String empjob, String empemail, String technicalpositin,
			String chineseposts, String englishposts, String contactzipcode, String contactdouble,
			String contactaddress, String mobilephone, String nation, String post, String nationality,
			String salaryscheme, String transmissionscheme, String taxdeductionmethod, String emptop, String empdegree,
			Date empgotime, String empgraduatetime, Date emppactstarttime, Date emppactendtime, String majorofstudy,
			String proficiency, Date examinationdate, Date ofentrydate, String passportdouble, Date contractperiod,
			String myempemail, String householdtelephone, String empnowmailid, String householdemail,
			String householdaddress, String empfamilyphone, String empfamilyplace, String empnowphone,
			String empnowplace, String empexigenceman, String empexphone, String empexemail, String empexaddress,
			String empfamilymailid, String custombarone, String custombartow, String custombarthree,
			String custombarfour, String custombarfilw, String custombarsex, String empremark) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empename = empename;
		this.depid = depid;
		this.empsex = empsex;
		this.empcard = empcard;
		this.empstate = empstate;
		this.calid = calid;
		this.empbirthday = empbirthday;
		this.empphoneone = empphoneone;
		this.empphonetwo = empphonetwo;
		this.empphonethree = empphonethree;
		this.bloodtype = bloodtype;
		this.empbirtbday = empbirtbday;
		this.empjob = empjob;
		this.empemail = empemail;
		this.technicalpositin = technicalpositin;
		this.chineseposts = chineseposts;
		this.englishposts = englishposts;
		this.contactzipcode = contactzipcode;
		this.contactdouble = contactdouble;
		this.contactaddress = contactaddress;
		this.mobilephone = mobilephone;
		this.nation = nation;
		this.post = post;
		this.nationality = nationality;
		this.salaryscheme = salaryscheme;
		this.transmissionscheme = transmissionscheme;
		this.taxdeductionmethod = taxdeductionmethod;
		this.emptop = emptop;
		this.empdegree = empdegree;
		this.empgotime = empgotime;
		this.empgraduatetime = empgraduatetime;
		this.emppactstarttime = emppactstarttime;
		this.emppactendtime = emppactendtime;
		this.majorofstudy = majorofstudy;
		this.proficiency = proficiency;
		this.examinationdate = examinationdate;
		this.ofentrydate = ofentrydate;
		this.passportdouble = passportdouble;
		this.contractperiod = contractperiod;
		this.myempemail = myempemail;
		this.householdtelephone = householdtelephone;
		this.empnowmailid = empnowmailid;
		this.householdemail = householdemail;
		this.householdaddress = householdaddress;
		this.empfamilyphone = empfamilyphone;
		this.empfamilyplace = empfamilyplace;
		this.empnowphone = empnowphone;
		this.empnowplace = empnowplace;
		this.empexigenceman = empexigenceman;
		this.empexphone = empexphone;
		this.empexemail = empexemail;
		this.empexaddress = empexaddress;
		this.empfamilymailid = empfamilymailid;
		this.custombarone = custombarone;
		this.custombartow = custombartow;
		this.custombarthree = custombarthree;
		this.custombarfour = custombarfour;
		this.custombarfilw = custombarfilw;
		this.custombarsex = custombarsex;
		this.empremark = empremark;
	}

	public Employee(String empname, String empename, String depid, String empsex, String empcard, String empstate,
			String calid, Date empbirthday, String empphoneone, String empphonetwo, Date empphonethree,
			String bloodtype, Date empbirtbday, String empjob, String empemail, String technicalpositin,
			String chineseposts, String englishposts, String contactzipcode, String contactdouble,
			String contactaddress, String mobilephone, String nation, String post, String nationality,
			String salaryscheme, String transmissionscheme, String taxdeductionmethod, String emptop, String empdegree,
			Date empgotime, String empgraduatetime, Date emppactstarttime, Date emppactendtime, String majorofstudy,
			String proficiency, Date examinationdate, Date ofentrydate, String passportdouble, Date contractperiod,
			String myempemail, String householdtelephone, String empnowmailid, String householdemail,
			String householdaddress, String empfamilyphone, String empfamilyplace, String empnowphone,
			String empnowplace, String empexigenceman, String empexphone, String empexemail, String empexaddress,
			String empfamilymailid, String custombarone, String custombartow, String custombarthree,
			String custombarfour, String custombarfilw, String custombarsex, String empremark) {
		super();
		this.empname = empname;
		this.empename = empename;
		this.depid = depid;
		this.empsex = empsex;
		this.empcard = empcard;
		this.empstate = empstate;
		this.calid = calid;
		this.empbirthday = empbirthday;
		this.empphoneone = empphoneone;
		this.empphonetwo = empphonetwo;
		this.empphonethree = empphonethree;
		this.bloodtype = bloodtype;
		this.empbirtbday = empbirtbday;
		this.empjob = empjob;
		this.empemail = empemail;
		this.technicalpositin = technicalpositin;
		this.chineseposts = chineseposts;
		this.englishposts = englishposts;
		this.contactzipcode = contactzipcode;
		this.contactdouble = contactdouble;
		this.contactaddress = contactaddress;
		this.mobilephone = mobilephone;
		this.nation = nation;
		this.post = post;
		this.nationality = nationality;
		this.salaryscheme = salaryscheme;
		this.transmissionscheme = transmissionscheme;
		this.taxdeductionmethod = taxdeductionmethod;
		this.emptop = emptop;
		this.empdegree = empdegree;
		this.empgotime = empgotime;
		this.empgraduatetime = empgraduatetime;
		this.emppactstarttime = emppactstarttime;
		this.emppactendtime = emppactendtime;
		this.majorofstudy = majorofstudy;
		this.proficiency = proficiency;
		this.examinationdate = examinationdate;
		this.ofentrydate = ofentrydate;
		this.passportdouble = passportdouble;
		this.contractperiod = contractperiod;
		this.myempemail = myempemail;
		this.householdtelephone = householdtelephone;
		this.empnowmailid = empnowmailid;
		this.householdemail = householdemail;
		this.householdaddress = householdaddress;
		this.empfamilyphone = empfamilyphone;
		this.empfamilyplace = empfamilyplace;
		this.empnowphone = empnowphone;
		this.empnowplace = empnowplace;
		this.empexigenceman = empexigenceman;
		this.empexphone = empexphone;
		this.empexemail = empexemail;
		this.empexaddress = empexaddress;
		this.empfamilymailid = empfamilymailid;
		this.custombarone = custombarone;
		this.custombartow = custombartow;
		this.custombarthree = custombarthree;
		this.custombarfour = custombarfour;
		this.custombarfilw = custombarfilw;
		this.custombarsex = custombarsex;
		this.empremark = empremark;
	}
    
    
}