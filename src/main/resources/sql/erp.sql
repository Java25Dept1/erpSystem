/*
SQLyog Trial v12.01 (64 bit)
MySQL - 5.7.18-log : Database - erp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`erp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `erp`;

/*Table structure for table `accountmoneydetail` */

DROP TABLE IF EXISTS `accountmoneydetail`;

CREATE TABLE `accountmoneydetail` (
  `storageid` int(9) NOT NULL COMMENT '主键ID',
  `storagedate` date DEFAULT NULL COMMENT '单据日期',
  `origintypes` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `nwdate` date DEFAULT NULL COMMENT '日期',
  `clientsupply` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `citationid` varchar(50) DEFAULT NULL COMMENT '供货商ID',
  `Originalmoney` double DEFAULT NULL COMMENT '原单金额',
  `Nwadaysmoneys` double DEFAULT NULL COMMENT '现行余额',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `safetytone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`storageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `accountmoneydetail` */

/*Table structure for table `advance` */

DROP TABLE IF EXISTS `advance`;

CREATE TABLE `advance` (
  `advid` varchar(20) NOT NULL COMMENT '预付单单号',
  `advdate` date DEFAULT NULL COMMENT '单据日期',
  `purveyid` varchar(20) DEFAULT NULL COMMENT '供应商ID',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '供应商名称',
  `advstrike1` varchar(50) DEFAULT NULL COMMENT '结算方式1',
  `advstrike2` varchar(50) DEFAULT NULL COMMENT '结算方式2',
  `advstrike3` varchar(50) DEFAULT NULL COMMENT '结算方式3',
  `advmoney1` double DEFAULT NULL COMMENT '金额1',
  `advmoney2` double DEFAULT NULL COMMENT '金额2',
  `advmoney3` double DEFAULT NULL COMMENT '金额2',
  `advcurrencyType` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchangerate` double DEFAULT NULL COMMENT '汇率',
  `advmakeing` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `stodept` varchar(50) DEFAULT NULL COMMENT '制单人所属部门',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID',
  `advcheckman` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `advremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `isaditing` int(9) DEFAULT '0' COMMENT '是否审核，默认0未审核，1：审核',
  `enables` int(11) DEFAULT '1' COMMENT '默认1不删除，0：删除    标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`advid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advance` */

/*Table structure for table `advancedetails` */

DROP TABLE IF EXISTS `advancedetails`;

CREATE TABLE `advancedetails` (
  `advid` varchar(20) NOT NULL COMMENT '预付款主表单号',
  `advdetid` int(9) DEFAULT NULL COMMENT '行号',
  `advdetmoney` double DEFAULT NULL COMMENT '预付金额',
  `advdetoddtype` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `advdetoddid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `advdetdegest` varchar(50) DEFAULT NULL COMMENT '摘要',
  `advdetbalance` double DEFAULT NULL COMMENT '预付余额',
  `enables` int(11) DEFAULT '1' COMMENT '默认1不删除，0：删除    标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`advid`),
  KEY `advdetid` (`advdetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advancedetails` */

/*Table structure for table `advancegather` */

DROP TABLE IF EXISTS `advancegather`;

CREATE TABLE `advancegather` (
  `adcid` varchar(20) NOT NULL COMMENT '预付单单号',
  `adcdate` date DEFAULT NULL COMMENT '单据日期',
  `purveyid` varchar(20) DEFAULT NULL COMMENT '客户编号 ',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `adcstrike1` varchar(50) DEFAULT NULL COMMENT '结算方式1',
  `adcstrike2` varchar(50) DEFAULT NULL COMMENT '结算方式2',
  `adcstrike3` varchar(50) DEFAULT NULL COMMENT '结算方式3',
  `adcmoney1` double DEFAULT NULL COMMENT '金额1',
  `adcmoney2` double DEFAULT NULL COMMENT '金额2',
  `adcmoney3` double DEFAULT NULL COMMENT '金额3',
  `advcurrencyType` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchangerate` double DEFAULT NULL COMMENT '汇率',
  `adcmakeing` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `stodept` varchar(50) DEFAULT NULL COMMENT '制单人所属部门',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID',
  `adccheckman` varchar(50) DEFAULT NULL COMMENT '    复核人员（当前登录人）',
  `adcremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `isaditing` int(9) DEFAULT NULL COMMENT '是否审核',
  `checkstate` int(9) DEFAULT '0' COMMENT '默认0未审核，1：审核，审核状态',
  `enables` int(11) DEFAULT '1' COMMENT '默认1不删除，0：删除    标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`adcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advancegather` */

/*Table structure for table `advancegatherdetails` */

DROP TABLE IF EXISTS `advancegatherdetails`;

CREATE TABLE `advancegatherdetails` (
  `adcid` varchar(20) NOT NULL COMMENT '预付款主表单号',
  `adcdetid` int(9) DEFAULT NULL COMMENT '行号',
  `adcdetmoney` double DEFAULT NULL COMMENT '预付金额',
  `adcdetoddtype` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `adcdetoddid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `adcdetdegest` varchar(50) DEFAULT NULL COMMENT '摘要',
  `adcdetbalance` double DEFAULT NULL COMMENT '预付余额',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`adcid`),
  KEY `adcdetid` (`adcdetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advancegatherdetails` */

/*Table structure for table `apportiondetails` */

DROP TABLE IF EXISTS `apportiondetails`;

CREATE TABLE `apportiondetails` (
  `adeid` varchar(20) NOT NULL COMMENT '采购分摊单号',
  `adesequ` int(9) DEFAULT NULL COMMENT '行号',
  `adeexesid` varchar(50) DEFAULT NULL COMMENT ' 费用编号',
  `adeexesname` varchar(50) DEFAULT NULL COMMENT '费用名称',
  `adeamtmoney` double DEFAULT NULL COMMENT '金额',
  `adcurrency` varchar(20) DEFAULT NULL COMMENT '币别',
  `adstandardcurrency` double DEFAULT NULL COMMENT '金额本位币',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`adeid`),
  KEY `adesequ` (`adesequ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apportiondetails` */

/*Table structure for table `apportionresult` */

DROP TABLE IF EXISTS `apportionresult`;

CREATE TABLE `apportionresult` (
  `atiid` varchar(20) NOT NULL COMMENT '采购分摊单号',
  `atisequ` int(9) DEFAULT NULL COMMENT '行号',
  `storageid` varchar(50) DEFAULT NULL COMMENT '采购入库单号',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `stockprice` double DEFAULT NULL COMMENT '采购金额',
  `atinum` int(9) DEFAULT NULL COMMENT '数量',
  `ademoney` double DEFAULT NULL COMMENT '分摊金额',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`atiid`),
  KEY `atisequ` (`atisequ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apportionresult` */

/*Table structure for table `checkdetail` */

DROP TABLE IF EXISTS `checkdetail`;

CREATE TABLE `checkdetail` (
  `cheid` varchar(50) NOT NULL COMMENT '盘点单的流水号check(cheid)',
  `chelineid` int(9) DEFAULT NULL COMMENT '栏号',
  `chematerielid` varchar(50) DEFAULT NULL COMMENT '物料的编号Materiel(matid)',
  `chematerielname` varchar(50) DEFAULT NULL COMMENT '物料的名称',
  `cheunitname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `cheaccountqty` int(9) DEFAULT NULL COMMENT '账面数量',
  `checheckqty` int(9) DEFAULT NULL COMMENT '盘点数量',
  `cheprofitandlossqty` int(9) DEFAULT NULL COMMENT '盈亏数量',
  `cheprofitandlossmoney` double DEFAULT NULL COMMENT '盈亏金额',
  `cheprice` double DEFAULT NULL COMMENT '单价',
  `cheremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`cheid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `checkdetail` */

/*Table structure for table `checked` */

DROP TABLE IF EXISTS `checked`;

CREATE TABLE `checked` (
  `cheid` varchar(50) NOT NULL COMMENT '盘点单的流水号',
  `chestorageno` varchar(50) DEFAULT NULL COMMENT '盘点的仓库编号Storage(stoid)',
  `chestoragename` varchar(50) DEFAULT NULL COMMENT '盘点的仓库名称',
  `chedate` date DEFAULT NULL COMMENT '盘点的日期',
  `cheman` varchar(50) DEFAULT NULL COMMENT '盘点人名称',
  `chedeptname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `cherestrictman` varchar(50) DEFAULT NULL COMMENT '制单人-当前登录人',
  `cheauditingman` varchar(50) DEFAULT NULL COMMENT '审核人-当前登录人',
  `chestatu` int(2) DEFAULT '0' COMMENT '审核状态，0为未审核',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`cheid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `checked` */

/*Table structure for table `clashfund` */

DROP TABLE IF EXISTS `clashfund`;

CREATE TABLE `clashfund` (
  `cfid` varchar(20) NOT NULL COMMENT '应收冲款单单号',
  `cfdate` date DEFAULT NULL COMMENT '单据日期',
  `purveyid` varchar(20) DEFAULT NULL COMMENT '客户ID',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `cfstrike1` varchar(50) DEFAULT NULL COMMENT '结算方式1',
  `cfstrike2` varchar(50) DEFAULT NULL COMMENT '结算方式2',
  `cfstrike3` varchar(50) DEFAULT NULL COMMENT '结算方式3',
  `cfmoney1` double DEFAULT NULL COMMENT '金额1',
  `cfmoney2` double DEFAULT NULL COMMENT '金额2',
  `cfmoney3` double DEFAULT NULL COMMENT '金额3',
  `cfmakeing` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `cfdept` varchar(50) DEFAULT NULL COMMENT '制单人所属部门',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID ',
  `cfcheckman` varchar(50) DEFAULT NULL COMMENT '审核人员',
  `cfremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `isaditing` int(9) DEFAULT '0' COMMENT '是否审核',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`cfid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clashfund` */

/*Table structure for table `clashfunddetails` */

DROP TABLE IF EXISTS `clashfunddetails`;

CREATE TABLE `clashfunddetails` (
  `cfdid` varchar(20) NOT NULL COMMENT '应收冲款单主单号',
  `cfddetid` int(20) DEFAULT NULL COMMENT '行号',
  `cfdsourcedate` date DEFAULT NULL COMMENT '来源单号日期',
  `cfddetoddtype` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `cfddetoddid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `dealobjectid` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `dealobjectname` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `cfddeptid` varchar(20) DEFAULT NULL COMMENT '部门编号',
  `cfddeptname` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `stoperson` varchar(20) DEFAULT NULL COMMENT '采购人员',
  `cfdcurrency` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchangerate` double DEFAULT NULL COMMENT '汇率',
  `formeroddmoney` double DEFAULT NULL COMMENT '原单金额',
  `Ncebalance` double DEFAULT NULL COMMENT '现行余额',
  `cfdzr` double DEFAULT NULL COMMENT '折让金额',
  `cfddetmoney` double DEFAULT NULL COMMENT '冲款金额',
  `rushmoney` double DEFAULT NULL COMMENT '冲抵金额',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`cfdid`),
  KEY `cfddetid` (`cfddetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clashfunddetails` */

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `cliid` varchar(50) NOT NULL COMMENT '客户编号',
  `clitypeid` varchar(50) DEFAULT NULL COMMENT '客户类别Id',
  `cliaccounts` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `cliname` varchar(50) DEFAULT NULL COMMENT '客户全称',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `cliaddress` varchar(50) DEFAULT NULL COMMENT '地方（具体）',
  `cliarea` varchar(50) DEFAULT NULL COMMENT '地区',
  `cliename` varchar(50) DEFAULT NULL COMMENT '英文全称',
  `clieshortname` varchar(50) DEFAULT NULL COMMENT '英文简称',
  `cliprincipal` varchar(50) DEFAULT NULL COMMENT '负责人',
  `clilinkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `cliphoneone` varchar(50) DEFAULT NULL COMMENT '联系电话一',
  `cliphonetwo` varchar(50) DEFAULT NULL COMMENT '联系电话二',
  `cliphonethree` varchar(50) DEFAULT NULL COMMENT '联系电话三',
  `clibankaccounts` varchar(50) DEFAULT NULL COMMENT '银行帐号',
  `cliopenbank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `clidouble` varchar(50) DEFAULT NULL COMMENT '税务登记号',
  `clicategory` varchar(50) DEFAULT NULL COMMENT '行业别',
  `cliempid` varchar(50) DEFAULT NULL COMMENT '业务人员id',
  `cliempName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `climobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `cliemail` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `cliweb` varchar(50) DEFAULT NULL COMMENT '网址',
  `clifaxes` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `clioldoutdate` date DEFAULT NULL COMMENT '最初销售出货日',
  `clioldodate` date DEFAULT NULL COMMENT '最初销售退货日',
  `clinewoutdate` date DEFAULT NULL COMMENT '最近销售出货日',
  `clinewodate` date DEFAULT NULL COMMENT '最近销售退货日',
  `clidiscount` varchar(50) DEFAULT NULL COMMENT '折数(%)',
  `clipricestep` varchar(50) DEFAULT NULL COMMENT '售价等级',
  `clicreatedate` date DEFAULT NULL COMMENT '客户建立日',
  `cliunitprice` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `clicustomerdouble` varchar(50) DEFAULT NULL COMMENT '潜在客户编号',
  `cliAappoment` date DEFAULT NULL COMMENT '最近预约拜访',
  `cliappoment` date DEFAULT NULL COMMENT '预约拜访',
  `clistopdate` date DEFAULT NULL COMMENT '终止交易日',
  `clizhangkuanedu` varchar(50) DEFAULT NULL COMMENT '账款额度',
  `cliremainedu` varchar(50) DEFAULT NULL COMMENT '剩余额度',
  `clicondition` varchar(50) DEFAULT NULL COMMENT '收款条件（天）',
  `climonthreckoning` date DEFAULT NULL COMMENT '每月结账日',
  `clicreditstep` varchar(50) DEFAULT NULL COMMENT '信用等级',
  `cliInvoice` varchar(50) DEFAULT NULL COMMENT '发票类型',
  `cliReceivables` varchar(50) DEFAULT NULL COMMENT '应收款科目',
  `cliqcpremoney` double(19,4) DEFAULT NULL COMMENT '期初预收款',
  `cliqcdealmoney` double(19,4) DEFAULT NULL COMMENT '期初应收款',
  `cliqmpremoney` double(19,4) DEFAULT NULL COMMENT '期末预收款',
  `cliqmdealmoney` double(19,4) DEFAULT NULL COMMENT '期末应收款',
  `cliAdvancee` varchar(50) DEFAULT NULL COMMENT '预收款科目',
  `cliColumnoneone` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `cliColumnonetow` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `cliotherremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cliid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`cliid`,`clitypeid`,`cliaccounts`,`cliname`,`clishortname`,`cliaddress`,`cliarea`,`cliename`,`clieshortname`,`cliprincipal`,`clilinkman`,`cliphoneone`,`cliphonetwo`,`cliphonethree`,`clibankaccounts`,`cliopenbank`,`clidouble`,`clicategory`,`cliempid`,`cliempName`,`climobilephone`,`cliemail`,`cliweb`,`clifaxes`,`clioldoutdate`,`clioldodate`,`clinewoutdate`,`clinewodate`,`clidiscount`,`clipricestep`,`clicreatedate`,`cliunitprice`,`clicustomerdouble`,`cliAappoment`,`cliappoment`,`clistopdate`,`clizhangkuanedu`,`cliremainedu`,`clicondition`,`climonthreckoning`,`clicreditstep`,`cliInvoice`,`cliReceivables`,`cliqcpremoney`,`cliqcdealmoney`,`cliqmpremoney`,`cliqmdealmoney`,`cliAdvancee`,`cliColumnoneone`,`cliColumnonetow`,`cliotherremark`) values ('200812K00001','代理商','200812K00001','株洲伟大电脑有限公司','株洲伟大',NULL,'华中区',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'10010','戴经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('200812K00002','代理商','200812K00002','郴州正帆信息技术有限公司','郴州正帆',NULL,'华中区',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'10010','戴经理',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `clientaddress` */

DROP TABLE IF EXISTS `clientaddress`;

CREATE TABLE `clientaddress` (
  `cliaddrId` varchar(50) NOT NULL COMMENT '客户地址编号',
  `cliaddress` varchar(50) DEFAULT NULL COMMENT '客户地址',
  `clizipcode` varchar(50) DEFAULT NULL COMMENT '邮政编码',
  `clilinkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `clilinkmanprof` varchar(50) DEFAULT NULL COMMENT '联系人职称',
  `clitelephone` varchar(50) DEFAULT NULL COMMENT '联系人电话',
  `clifaxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `cliwalkaddr` varchar(50) DEFAULT NULL COMMENT '行走路线',
  `climemo` varchar(50) DEFAULT NULL COMMENT '备注',
  `cliid` int(11) DEFAULT NULL COMMENT '客户编号',
  PRIMARY KEY (`cliaddrId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户地址';

/*Data for the table `clientaddress` */

/*Table structure for table `clienttype` */

DROP TABLE IF EXISTS `clienttype`;

CREATE TABLE `clienttype` (
  `clitypeid` varchar(50) NOT NULL COMMENT '类别编号',
  `clitypename` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `clitypeename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `cliremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`clitypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clienttype` */

insert  into `clienttype`(`clitypeid`,`clitypename`,`clitypeename`,`cliremark`) values ('01','大客户',NULL,NULL),('02','代理商',NULL,NULL),('03','其它经销商',NULL,NULL),('99','其它最终用户',NULL,NULL);

/*Table structure for table `depttab` */

DROP TABLE IF EXISTS `depttab`;

CREATE TABLE `depttab` (
  `depid` varchar(50) NOT NULL COMMENT '部门编号',
  `depname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `EngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `Male` varchar(50) DEFAULT NULL COMMENT '编制人数（男）(女)',
  `SalyaryTypeid` varchar(50) DEFAULT NULL COMMENT '工资方案',
  `Calid` varchar(50) DEFAULT NULL COMMENT '行事历',
  `depremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`depid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `depttab` */

insert  into `depttab`(`depid`,`depname`,`EngName`,`Male`,`SalyaryTypeid`,`Calid`,`depremark`) values ('01','财务部',NULL,NULL,NULL,NULL,NULL),('02','直销部',NULL,NULL,NULL,NULL,NULL),('03','渠道部',NULL,NULL,NULL,NULL,NULL),('04','服务中心',NULL,NULL,NULL,NULL,NULL),('05','综合管理部',NULL,NULL,NULL,NULL,NULL),('06','生产部',NULL,NULL,NULL,NULL,NULL),('0601','一车间',NULL,NULL,NULL,NULL,NULL),('0602','二车间',NULL,NULL,NULL,NULL,NULL),('0603','三车间',NULL,NULL,NULL,NULL,NULL),('0604','质保课',NULL,NULL,NULL,NULL,NULL),('07','研发部',NULL,NULL,NULL,NULL,NULL),('08','储运部',NULL,NULL,NULL,NULL,NULL),('09','采购部',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `empid` varchar(50) NOT NULL COMMENT '人员编号',
  `empname` varchar(50) DEFAULT NULL COMMENT '人员姓名',
  `empename` varchar(50) DEFAULT NULL COMMENT '英文姓名',
  `depid` varchar(50) DEFAULT NULL COMMENT '部门编号id',
  `empsex` varchar(50) DEFAULT NULL COMMENT '性别（默认男）',
  `empcard` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `empstate` varchar(50) DEFAULT NULL COMMENT '就职状态id',
  `Calid` varchar(50) DEFAULT NULL COMMENT '行事历',
  `empbirthday` date DEFAULT NULL COMMENT '出生日期',
  `empphoneone` varchar(50) DEFAULT NULL COMMENT '政治面貌',
  `empphonetwo` varchar(50) DEFAULT NULL COMMENT '婚姻状况',
  `empphonethree` date DEFAULT NULL COMMENT '入职日期',
  `Bloodtype` varchar(50) DEFAULT NULL COMMENT '血型',
  `empbirtbday` date DEFAULT NULL COMMENT '离职日期',
  `empjob` varchar(50) DEFAULT NULL COMMENT '岗位',
  `Empemail` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `Technicalpositin` varchar(50) DEFAULT NULL COMMENT '技术职务',
  `Chineseposts` varchar(50) DEFAULT NULL COMMENT '中文职务',
  `Englishposts` varchar(50) DEFAULT NULL COMMENT '英文职务',
  `ContactZipCode` varchar(50) DEFAULT NULL COMMENT '联系邮编',
  `Contactdouble` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `Contactaddress` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `Mobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `Nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `post` varchar(50) DEFAULT NULL COMMENT '职务',
  `nationality` varchar(50) DEFAULT NULL COMMENT '国籍',
  `Salaryscheme` varchar(50) DEFAULT NULL COMMENT '薪资方案',
  `Transmissionscheme` varchar(50) DEFAULT NULL COMMENT '传输方案',
  `Taxdeductionmethod` varchar(50) DEFAULT NULL COMMENT '扣税方式',
  `emptop` varchar(50) DEFAULT NULL COMMENT '最高学历',
  `empdegree` varchar(50) DEFAULT NULL COMMENT '学位',
  `empgotime` date DEFAULT NULL COMMENT '到期日期',
  `empgraduatetime` varchar(50) DEFAULT NULL COMMENT '毕业学校',
  `emppactstarttime` date DEFAULT NULL COMMENT '合同起始日期',
  `emppactendtime` date DEFAULT NULL COMMENT '合同终止日期',
  `Majorofstudy` varchar(50) DEFAULT NULL COMMENT '所学专业',
  `proficiency` varchar(50) DEFAULT NULL COMMENT '外语水平',
  `examinationdate` date DEFAULT NULL COMMENT '体检日期',
  `ofentrydate` date DEFAULT NULL COMMENT '入境日期',
  `Passportdouble` varchar(50) DEFAULT NULL COMMENT '护照号码',
  `Contractperiod` date DEFAULT NULL COMMENT '合同期',
  `Myempemail` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `Householdtelephone` varchar(50) DEFAULT NULL COMMENT '户籍电话',
  `empnowmailid` varchar(50) DEFAULT NULL COMMENT '现邮编',
  `Householdemail` varchar(50) DEFAULT NULL COMMENT '户籍邮编',
  `Householdaddress` varchar(50) DEFAULT NULL COMMENT '户籍地址',
  `empfamilyphone` varchar(50) DEFAULT NULL COMMENT '家庭电话',
  `empfamilyplace` varchar(50) DEFAULT NULL COMMENT '家庭住址',
  `empnowphone` varchar(50) DEFAULT NULL COMMENT '现电话',
  `empnowplace` varchar(50) DEFAULT NULL COMMENT '现住址',
  `empexigenceman` varchar(50) DEFAULT NULL COMMENT '紧急联系人',
  `Empexphone` varchar(50) DEFAULT NULL COMMENT '紧急联系电话',
  `EmpexEmail` varchar(50) DEFAULT NULL COMMENT '紧急联系邮编',
  `Empexaddress` varchar(50) DEFAULT NULL COMMENT '紧急联系地址',
  `empfamilymailid` varchar(50) DEFAULT NULL COMMENT '家庭邮编',
  `CustomBarone` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `CustomBartow` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `CustomBarthree` varchar(50) DEFAULT NULL COMMENT '自定义栏三',
  `CustomBarfour` varchar(50) DEFAULT NULL COMMENT '自定义栏四',
  `CustomBarfilw` varchar(50) DEFAULT NULL COMMENT '自定义栏五',
  `CustomBarsex` varchar(50) DEFAULT NULL COMMENT '自定义栏六',
  `empremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`empid`,`empname`,`empename`,`depid`,`empsex`,`empcard`,`empstate`,`Calid`,`empbirthday`,`empphoneone`,`empphonetwo`,`empphonethree`,`Bloodtype`,`empbirtbday`,`empjob`,`Empemail`,`Technicalpositin`,`Chineseposts`,`Englishposts`,`ContactZipCode`,`Contactdouble`,`Contactaddress`,`Mobilephone`,`Nation`,`post`,`nationality`,`Salaryscheme`,`Transmissionscheme`,`Taxdeductionmethod`,`emptop`,`empdegree`,`empgotime`,`empgraduatetime`,`emppactstarttime`,`emppactendtime`,`Majorofstudy`,`proficiency`,`examinationdate`,`ofentrydate`,`Passportdouble`,`Contractperiod`,`Myempemail`,`Householdtelephone`,`empnowmailid`,`Householdemail`,`Householdaddress`,`empfamilyphone`,`empfamilyplace`,`empnowphone`,`empnowplace`,`empexigenceman`,`Empexphone`,`EmpexEmail`,`Empexaddress`,`empfamilymailid`,`CustomBarone`,`CustomBartow`,`CustomBarthree`,`CustomBarfour`,`CustomBarfilw`,`CustomBarsex`,`empremark`) values ('1001','王总',NULL,'综合管理部','男','43000019711203001x','转正',NULL,'1971-12-03',NULL,NULL,'2001-04-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1002','林副总',NULL,'综合管理部','女','430000197401090021','转正',NULL,'1974-01-09',NULL,NULL,'2001-04-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1003','陈助理',NULL,'综合管理部','男','43000019691204001x','转正',NULL,'1969-12-04',NULL,NULL,'2003-06-21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1005','曾会计',NULL,'财务部','女','430000197410010001','转正',NULL,'1974-10-01',NULL,NULL,'2001-04-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1006','陈出纳',NULL,'财务部','女','430000198010230001','转正',NULL,'1980-10-23',NULL,NULL,'2001-05-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1007','王经理',NULL,'直销部','男','430000197612080019','转正',NULL,'1976-12-08',NULL,NULL,'2003-12-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1008','刘直销',NULL,'直销部','女','43000019811124002x','试用',NULL,'1981-11-12',NULL,NULL,'2006-08-12',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1009','周直销',NULL,'直销部','男','430000197905080013','转正',NULL,'1979-05-08',NULL,NULL,'2005-03-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1010','戴经理',NULL,'渠道部','男','430000197502160015','转正',NULL,'1975-02-16',NULL,NULL,'2008-04-21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1011','欧经理',NULL,'生产部','男','430000197108190010','转正',NULL,'1971-08-19',NULL,NULL,'2001-06-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1012','洪主任',NULL,'一车间','女','430000198503150029','转正',NULL,'1985-03-15',NULL,NULL,'2008-12-03',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1013','龚主任',NULL,'二车间','男','403000198404080019','转正',NULL,'1984-04-08',NULL,NULL,'2007-06-21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1014','杨主任',NULL,'三车间','女','430000198304190022','转正',NULL,'1983-04-19',NULL,NULL,'2007-04-21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1015','邓工',NULL,'研发部','男','43000019770924001x','转正',NULL,'1977-09-24',NULL,NULL,'2007-03-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1016','王保管',NULL,'储运部','女','430000197112030020','转正',NULL,'1971-12-03',NULL,NULL,'2001-12-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1017','胡保管',NULL,'储运部','女','430000198012040045','转正',NULL,'1980-12-04',NULL,NULL,'2005-01-02',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1018','朱采购',NULL,'采购部','男','43000019720516001x','转正',NULL,'1972-05-16',NULL,NULL,'2004-12-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1019','牛质检',NULL,'质保课','男','430000197404290013','转正',NULL,'1974-04-29',NULL,NULL,'2006-04-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `generalledger` */

DROP TABLE IF EXISTS `generalledger`;

CREATE TABLE `generalledger` (
  `Genid` varchar(50) NOT NULL COMMENT '行号',
  `genmaterielid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `genstorageno` varchar(20) DEFAULT NULL COMMENT '仓库编号(伪外键)',
  `genstoragename` varchar(20) DEFAULT NULL COMMENT '仓库',
  `genexpectstartqty` int(11) DEFAULT NULL COMMENT '期初总数量',
  `genstandarcost` double DEFAULT NULL COMMENT '标准成本',
  `genallcost` double DEFAULT NULL COMMENT '标准总成本',
  `genexpectstartallcost` double DEFAULT NULL COMMENT '期初总成本',
  `gensafetyqty` int(9) DEFAULT NULL COMMENT '安全数量',
  `Genavgcost` double DEFAULT NULL COMMENT '平均成本',
  `Genqty` int(11) DEFAULT NULL COMMENT '现有总数量',
  `Gennowavgcost` double DEFAULT NULL COMMENT '现行平均成本',
  `Genstandardcostall` double DEFAULT NULL COMMENT '标准总成本（改名字）',
  `Gennowcost` double DEFAULT NULL COMMENT '现行总成本',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`Genid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `generalledger` */

/*Table structure for table `invoicedetails` */

DROP TABLE IF EXISTS `invoicedetails`;

CREATE TABLE `invoicedetails` (
  `storagedetailno` varchar(100) NOT NULL,
  `rowno` int(100) DEFAULT NULL,
  `materielid` varchar(100) DEFAULT NULL,
  `materielname` varchar(100) DEFAULT NULL,
  `types` varchar(100) DEFAULT NULL,
  `units` varchar(100) DEFAULT NULL,
  `amount` int(100) DEFAULT NULL,
  `rebateprice` int(100) DEFAULT NULL,
  `rebate` int(100) DEFAULT NULL,
  `unitprice` int(100) DEFAULT NULL,
  `moneys` int(100) DEFAULT NULL,
  `cess` int(100) DEFAULT NULL,
  `tax` int(100) DEFAULT NULL,
  `taxmoneys` varchar(100) DEFAULT NULL,
  `originno` varchar(100) DEFAULT NULL,
  `present` varchar(100) DEFAULT NULL,
  `Lqty` int(100) DEFAULT NULL,
  `enables` int(100) DEFAULT NULL,
  `safetyone` varchar(100) DEFAULT NULL,
  `safetytwo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`storagedetailno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invoicedetails` */

/*Table structure for table `materiel` */

DROP TABLE IF EXISTS `materiel`;

CREATE TABLE `materiel` (
  `matid` varchar(50) NOT NULL COMMENT '物料编号                      ',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `mattypeid` varchar(20) DEFAULT NULL COMMENT '物料类别（伪外键）',
  `mattypename` varchar(50) DEFAULT NULL COMMENT '物料类别名称',
  `matdityname` varchar(50) DEFAULT NULL COMMENT '英文品名',
  `matunit` varchar(50) DEFAULT NULL COMMENT '计量单位',
  `matshapecode` double(19,4) DEFAULT NULL COMMENT '条形码编号',
  `matadviceprice` double(19,4) DEFAULT NULL COMMENT '建议售价',
  `matadvicepriceA` double(19,4) DEFAULT NULL COMMENT '售价A',
  `matadvicepriceB` double(19,4) DEFAULT NULL COMMENT '售价B',
  `matadvicepriceC` double(19,4) DEFAULT NULL COMMENT '售价C',
  `matadvicepriceD` double(19,4) DEFAULT NULL COMMENT '售价D',
  `matadvicepriceE` double(19,4) DEFAULT NULL COMMENT '售价E',
  `matstandardprice` double(19,4) DEFAULT NULL COMMENT '标准进价',
  `matcurrency` varchar(50) DEFAULT NULL COMMENT '币别',
  `matshape` varchar(50) DEFAULT NULL COMMENT '物料型态',
  `matifduty` int(10) DEFAULT NULL COMMENT '是否含税',
  `matcategories` varchar(50) DEFAULT NULL COMMENT '税目',
  `matdutyrate` double(19,4) DEFAULT NULL COMMENT '税率',
  `matstockaheaddate` int(10) DEFAULT NULL COMMENT '采购提前期',
  `matmainafford` varchar(50) DEFAULT NULL COMMENT '主供应商',
  `matetystock` double(19,4) DEFAULT NULL COMMENT '安全存量',
  `matuantity` double(19,4) DEFAULT NULL COMMENT '期初总数量',
  `matgecost` double(19,4) DEFAULT NULL COMMENT '平均成本',
  `matdardcost` double(19,4) DEFAULT NULL COMMENT '标准成本',
  `mattialcost` double(19,4) DEFAULT NULL COMMENT '期初总成本',
  `matfestock` double(19,4) DEFAULT NULL COMMENT '低于安全存量',
  `matravailable` double(19,4) DEFAULT NULL COMMENT '现有总数量',
  `mattaveragecost` double(19,4) DEFAULT NULL COMMENT '现行平均成本',
  `matcost` double(19,4) DEFAULT NULL COMMENT '标准总成本',
  `mattalcost` double(19,4) DEFAULT NULL COMMENT '现行总成本',
  `matlDepotDate` date DEFAULT NULL COMMENT '最初出库日',
  `matragedate` date DEFAULT NULL COMMENT '最初入库日',
  `matepotDate` date DEFAULT NULL COMMENT '最近出库日',
  `mattorageDate` date DEFAULT NULL COMMENT '最近入库日',
  `matolumnone` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `matolumntow` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `matmainaffordid` varchar(50) DEFAULT NULL COMMENT '主供应商ID',
  `matgawpdate` int(10) DEFAULT NULL COMMENT '呆滞起计天数',
  `matstopdate` date DEFAULT NULL COMMENT '停用日期',
  `matremark` varchar(200) DEFAULT NULL COMMENT '物料说明',
  PRIMARY KEY (`matid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materiel` */

insert  into `materiel`(`matid`,`matname`,`matspec`,`mattypeid`,`mattypename`,`matdityname`,`matunit`,`matshapecode`,`matadviceprice`,`matadvicepriceA`,`matadvicepriceB`,`matadvicepriceC`,`matadvicepriceD`,`matadvicepriceE`,`matstandardprice`,`matcurrency`,`matshape`,`matifduty`,`matcategories`,`matdutyrate`,`matstockaheaddate`,`matmainafford`,`matetystock`,`matuantity`,`matgecost`,`matdardcost`,`mattialcost`,`matfestock`,`matravailable`,`mattaveragecost`,`matcost`,`mattalcost`,`matlDepotDate`,`matragedate`,`matepotDate`,`mattorageDate`,`matolumnone`,`matolumntow`,`matmainaffordid`,`matgawpdate`,`matstopdate`,`matremark`) values ('C01-W-HP-DC7900-307','HP V7650 17\" Flat Color Monitor',NULL,NULL,'显示器','采购件',NULL,NULL,3800.0000,3750.0000,3600.0000,NULL,NULL,NULL,3370.0000,NULL,'采购件',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3370.0000,3370.0000,5.0000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C01-W-HP-DC7900-308','HP DC7900CMT- NA307PA#AB2台式机',NULL,NULL,'主机','采购件',NULL,NULL,4900.0000,4800.0000,4700.0000,NULL,NULL,NULL,4190.0000,NULL,'采购件',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4190.0000,4190.0000,1.0000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C02-W-HP-GS917AA-AB2','HP DC7900CMT- NA308PA#AB2台式机',NULL,NULL,'主机','采购件',NULL,NULL,1050.0000,1040.0000,1030.0000,NULL,NULL,NULL,990.0000,NULL,'采购件',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,990.0000,990.0000,2.0000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('C02-W-HP-PF996AA-AB2','HP L1710 (17\"LCD,VGA接口,300nits,800:1,5ms)',NULL,NULL,'显示器','采购件',NULL,NULL,650.0000,640.0000,630.0000,NULL,NULL,NULL,540.0000,NULL,'采购件',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,540.0000,540.0000,1.0000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `materieltype` */

DROP TABLE IF EXISTS `materieltype`;

CREATE TABLE `materieltype` (
  `matypeid` varchar(50) NOT NULL COMMENT '物料类别编号                      ',
  `matypename` varchar(50) DEFAULT NULL COMMENT '物料类别名称',
  `matypeengname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `matyperemark` varchar(200) DEFAULT NULL COMMENT '备注',
  `matAccSaleid` varchar(50) DEFAULT NULL COMMENT '销售收入科目',
  `matAccCostid` varchar(50) DEFAULT NULL COMMENT '销售成本科目',
  `matExpenseid` varchar(50) DEFAULT NULL COMMENT '赠品费用科目',
  `matIncomeid` varchar(50) DEFAULT NULL COMMENT '其它收入科目',
  `matExpensid` varchar(50) DEFAULT NULL COMMENT '其它费用科目',
  `matCostid` varchar(50) DEFAULT NULL COMMENT '其它成本科目',
  PRIMARY KEY (`matypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materieltype` */

/*Table structure for table `measurement` */

DROP TABLE IF EXISTS `measurement`;

CREATE TABLE `measurement` (
  `UnitId` varchar(50) NOT NULL COMMENT '单位编号                      ',
  `UnitName` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `UnitEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `Unitremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`UnitId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `measurement` */

insert  into `measurement`(`UnitId`,`UnitName`,`UnitEngName`,`Unitremark`) values ('01','PCS',NULL,NULL),('02','KG',NULL,NULL);

/*Table structure for table `minusandadddetail` */

DROP TABLE IF EXISTS `minusandadddetail`;

CREATE TABLE `minusandadddetail` (
  `Minusaddid` int(11) NOT NULL COMMENT '主键ID',
  `Minusdate` date DEFAULT NULL COMMENT '单据日期',
  `Matypeid` varchar(20) DEFAULT NULL COMMENT '物料编号',
  `Matypename` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Minusadd` int(11) DEFAULT NULL COMMENT '本期入库数量',
  `Minusremove` int(11) DEFAULT NULL COMMENT '本期出库数量',
  `Unitprice` double DEFAULT NULL COMMENT '单价',
  `Moneys` double DEFAULT NULL COMMENT '金额',
  `storagedate` date DEFAULT NULL COMMENT '时间',
  `Stoid` varchar(50) DEFAULT NULL COMMENT '仓库ID',
  `Stoname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `Origintype` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `Originid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Aftermath` int(11) DEFAULT NULL COMMENT '期末结存',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`Minusaddid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `minusandadddetail` */

/*Table structure for table `movedetails` */

DROP TABLE IF EXISTS `movedetails`;

CREATE TABLE `movedetails` (
  `Mdsno` varchar(50) NOT NULL COMMENT '单号',
  `Mdsmseno` varchar(50) DEFAULT NULL COMMENT '单据号码(单号)',
  `mdsmaterieltype` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `mdsmaterielname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `mdsmaterielspecs` varchar(50) DEFAULT NULL COMMENT '物料规格',
  `mdsmaterielunit` varchar(50) DEFAULT NULL COMMENT '单位',
  `mdsmaterielnum` int(11) DEFAULT NULL COMMENT '数量',
  `Mdsavgcost` double DEFAULT NULL COMMENT '现行平均成本（出库）',
  `mdscost` double DEFAULT NULL COMMENT '总现行平均成本',
  `Mdsremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`Mdsno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movedetails` */

/*Table structure for table `moveprice` */

DROP TABLE IF EXISTS `moveprice`;

CREATE TABLE `moveprice` (
  `movedate` date DEFAULT NULL COMMENT '单据日期',
  `moveorderNo` varchar(50) NOT NULL COMMENT '单据号码',
  `moveadjust` varchar(50) DEFAULT NULL COMMENT '调整方式',
  `movestorageNo` varchar(50) DEFAULT NULL COMMENT '仓库编号',
  `movemake` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `movecheck` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `moveremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `moveAuditingState` int(11) DEFAULT NULL COMMENT '审核状态',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`moveorderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `moveprice` */

/*Table structure for table `movepricedetail` */

DROP TABLE IF EXISTS `movepricedetail`;

CREATE TABLE `movepricedetail` (
  `Moveinile` int(11) DEFAULT NULL COMMENT '行号',
  `moveorderNo` varchar(50) NOT NULL COMMENT '单据号码',
  `Movespectype` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `Moveunit` varchar(50) DEFAULT NULL COMMENT '单位',
  `Movestocks` int(11) DEFAULT NULL COMMENT '库存量',
  `moveaveragecost` double DEFAULT NULL COMMENT '现行平均成本',
  `moveprice` double DEFAULT NULL COMMENT '单价（自己填）',
  `movemoveprice` double DEFAULT NULL COMMENT '调价金额',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`moveorderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movepricedetail` */

/*Table structure for table `movestorage` */

DROP TABLE IF EXISTS `movestorage`;

CREATE TABLE `movestorage` (
  `Mseno` varchar(50) NOT NULL COMMENT '单据号码(单号)',
  `msedate` date DEFAULT NULL COMMENT '单据日期',
  `Mseoutstorage` varchar(50) DEFAULT NULL COMMENT '出库仓（仓库编号）',
  `mseinsertstor` varchar(50) DEFAULT NULL COMMENT '入库仓（仓库编号）',
  `mseemployee` varchar(50) DEFAULT NULL COMMENT '制作人',
  `mesAuditingemp` varchar(50) DEFAULT NULL COMMENT '审核人',
  `Mesremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `messtate` varchar(50) DEFAULT NULL COMMENT '审核状态',
  `Mestrash` varchar(50) DEFAULT NULL COMMENT '是否可用',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`Mseno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movestorage` */

/*Table structure for table `orderdetails` */

DROP TABLE IF EXISTS `orderdetails`;

CREATE TABLE `orderdetails` (
  `odid` int(11) NOT NULL COMMENT '编号',
  `odno` varchar(50) DEFAULT NULL COMMENT '栏号',
  `odwlid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `odwlname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `odtype` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `oddwname` int(11) DEFAULT NULL COMMENT '单位名称',
  `odnumber` varchar(50) DEFAULT NULL COMMENT '数量',
  `odzkprice` double(19,4) DEFAULT NULL COMMENT '折扣前单价',
  `odzs` double(19,4) DEFAULT NULL COMMENT '折数',
  `odprice` double(19,4) DEFAULT NULL COMMENT '单价',
  `odmoney` double(19,4) DEFAULT NULL COMMENT '金额',
  `odsl` double(19,4) DEFAULT NULL COMMENT '税率',
  `odpaid` double(19,4) DEFAULT NULL COMMENT '税额',
  `odamount` double(19,4) DEFAULT NULL COMMENT '含税金额',
  `odzp` varchar(50) DEFAULT NULL COMMENT '分配赠品',
  `odremark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `odyckdate` date DEFAULT NULL COMMENT '预出库日',
  `odwcknumber` varchar(50) DEFAULT NULL COMMENT '未出库数量',
  `odcomb` varchar(50) DEFAULT NULL COMMENT '物料组合',
  `oddb` varchar(50) DEFAULT NULL COMMENT '物料单别',
  `oddh` varchar(50) DEFAULT NULL COMMENT '物料单号',
  `odsc` varchar(50) DEFAULT NULL COMMENT '生产',
  `odpcdh` varchar(50) DEFAULT NULL COMMENT '排成单号',
  `odproduction` int(11) DEFAULT NULL COMMENT '已生产数量',
  PRIMARY KEY (`odid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderdetails` */

/*Table structure for table `othercome` */

DROP TABLE IF EXISTS `othercome`;

CREATE TABLE `othercome` (
  `Othcomeid` varchar(50) NOT NULL COMMENT '单据号码(系统自带)',
  `Othcomedate` date DEFAULT NULL COMMENT '单据日期',
  `othcometypeid` varchar(50) DEFAULT NULL COMMENT '入库类型',
  `Othcomestore` varchar(50) DEFAULT NULL COMMENT '仓库',
  `Othcomename` varchar(50) DEFAULT NULL COMMENT '入库人员',
  `Othcomedept` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `Othcomemakemanid` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Othcomerepeatuserid` varchar(50) DEFAULT NULL COMMENT '复核人员',
  PRIMARY KEY (`Othcomeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `othercome` */

/*Table structure for table `othercomedetail` */

DROP TABLE IF EXISTS `othercomedetail`;

CREATE TABLE `othercomedetail` (
  `Othcomeid` varchar(50) NOT NULL COMMENT '其它入库主表id',
  `Othcomeno` varchar(50) DEFAULT NULL COMMENT '栏号',
  `Othcomemertialsid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `Othcomemertialname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Othcometypes` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `Othcomeunits` varchar(50) DEFAULT NULL COMMENT '单位',
  `Othcomeamount` int(10) DEFAULT NULL COMMENT '数量',
  `othcomeremark` varchar(200) DEFAULT NULL COMMENT '备注',
  `othprice` double(19,4) DEFAULT NULL COMMENT '单价',
  `othmoney` double(19,4) DEFAULT NULL COMMENT '金额',
  `Othph` varchar(50) DEFAULT NULL COMMENT '批号',
  PRIMARY KEY (`Othcomeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `othercomedetail` */

/*Table structure for table `otheroutdetail` */

DROP TABLE IF EXISTS `otheroutdetail`;

CREATE TABLE `otheroutdetail` (
  `otheroutid` varchar(50) NOT NULL COMMENT '单据号码(其它出库主表id)',
  `Othoutlineno` varchar(50) DEFAULT NULL COMMENT '栏号',
  `Othoutmertialsid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `Othoutmertialname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Othouttypes` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `Othoutunits` varchar(50) DEFAULT NULL COMMENT '单位',
  `Othoutamount` int(10) DEFAULT NULL COMMENT '数量',
  `othoutremark` varchar(200) DEFAULT NULL COMMENT '备注',
  `othph` int(11) DEFAULT NULL COMMENT '批号',
  PRIMARY KEY (`otheroutid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otheroutdetail` */

/*Table structure for table `otheroutmain` */

DROP TABLE IF EXISTS `otheroutmain`;

CREATE TABLE `otheroutmain` (
  `Othid` varchar(50) NOT NULL COMMENT '编号',
  `Othdate` date DEFAULT NULL COMMENT '单据日期',
  `othouttypeid` varchar(50) DEFAULT NULL COMMENT '出库类型id',
  `othstore` varchar(50) DEFAULT NULL COMMENT '仓库',
  `Othoutname` varchar(50) DEFAULT NULL COMMENT '出库人名',
  `Othdept` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `Othmakemanid` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Othrepeatuserid` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `othidno` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `Othbzid` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  PRIMARY KEY (`Othid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otheroutmain` */

/*Table structure for table `otherreceipts` */

DROP TABLE IF EXISTS `otherreceipts`;

CREATE TABLE `otherreceipts` (
  `oreid` varchar(50) NOT NULL COMMENT '类型编号',
  `orename` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `oreEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `oreMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`oreid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otherreceipts` */

insert  into `otherreceipts`(`oreid`,`orename`,`oreEngName`,`oreMale`) values ('01','组合出库',NULL,NULL),('02','归还出库',NULL,NULL),('03','借出',NULL,NULL),('04','生产消耗件领料',NULL,NULL),('09','其它出库',NULL,NULL);

/*Table structure for table `otherwarehousing` */

DROP TABLE IF EXISTS `otherwarehousing`;

CREATE TABLE `otherwarehousing` (
  `owaid` varchar(50) NOT NULL COMMENT '类型编号',
  `owaname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `owaEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `owaMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`owaid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otherwarehousing` */

insert  into `otherwarehousing`(`owaid`,`owaname`,`owaEngName`,`owaMale`) values ('01','拆解入库',NULL,NULL),('02','借入',NULL,NULL),('03','借出归还',NULL,NULL),('04','生产消耗件退料',NULL,NULL),('09','其它入库',NULL,NULL);

/*Table structure for table `paper` */

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `sinId` int(9) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `cliplaceid` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `Cliplace` varchar(50) DEFAULT NULL COMMENT '地址',
  `effectdate` date DEFAULT NULL COMMENT '有效日期',
  `currencyType` varchar(50) DEFAULT NULL COMMENT '币别',
  `priceWhetherTax` varchar(20) DEFAULT NULL COMMENT '单价是否含税',
  `stoid` varchar(50) DEFAULT NULL COMMENT '仓库编号   ',
  `stoname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `whereCheck` int(2) DEFAULT NULL COMMENT '销售核对状态',
  `empid` varchar(50) DEFAULT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `depid` varchar(50) DEFAULT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(9) DEFAULT NULL COMMENT '审核状态',
  `Enable` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper` */

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `payid` varchar(20) NOT NULL COMMENT 'payid',
  `paydate` date DEFAULT NULL COMMENT 'paydate',
  `purveyid` varchar(20) DEFAULT NULL COMMENT 'purveyid',
  `purveyname` varchar(50) DEFAULT NULL COMMENT 'purveyname',
  `paystrike1` varchar(50) DEFAULT NULL COMMENT 'paystrike1',
  `paystrike2` varchar(50) DEFAULT NULL COMMENT 'paystrike2',
  `paystrike3` varchar(50) DEFAULT NULL COMMENT 'paystrike3',
  `paymoney1` double DEFAULT NULL COMMENT 'paymoney1',
  `paymoney2` double DEFAULT NULL COMMENT 'paymoney2',
  `paymoney3` double DEFAULT NULL COMMENT 'paymoney3',
  `paymakeing` varchar(50) DEFAULT NULL COMMENT 'paymakeing',
  `paydept` varchar(50) DEFAULT NULL COMMENT 'paydept',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT 'stodeptid',
  `paycheckman` varchar(50) DEFAULT NULL COMMENT 'paycheckman',
  `payremark` varchar(2000) DEFAULT NULL COMMENT 'payremark',
  `isaditing` int(9) DEFAULT '0' COMMENT 'isaditing',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`payid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payment` */

/*Table structure for table `paymentdetails` */

DROP TABLE IF EXISTS `paymentdetails`;

CREATE TABLE `paymentdetails` (
  `payid` varchar(20) NOT NULL COMMENT '应付冲款单主单号',
  `paydetid` int(20) DEFAULT NULL COMMENT '行号',
  `psourcedate` date DEFAULT NULL COMMENT '原单日期',
  `paydetoddtype` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `paydetoddid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `dealobjectid` varchar(20) DEFAULT NULL COMMENT '供应商编号',
  `dealobjectname` varchar(20) DEFAULT NULL COMMENT '供应商名称',
  `paydeptid` varchar(20) DEFAULT NULL COMMENT '部门编号',
  `paydeptname` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `stoperson` varchar(20) DEFAULT NULL COMMENT '采购人员',
  `adcurrency` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchangerate` double DEFAULT NULL COMMENT '汇率',
  `formeroddmoney` double DEFAULT NULL COMMENT '原单金额',
  `Ncebalance` double DEFAULT NULL COMMENT '现行余额',
  `payzr` double DEFAULT NULL COMMENT '折让金额',
  `paydetmoney` double DEFAULT NULL COMMENT '冲款金额',
  `rushmoney` double DEFAULT NULL COMMENT '冲抵金额',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`payid`),
  KEY `paydetid` (`paydetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paymentdetails` */

/*Table structure for table `provideinfo` */

DROP TABLE IF EXISTS `provideinfo`;

CREATE TABLE `provideinfo` (
  `peoid` varchar(50) NOT NULL COMMENT '供应商编号',
  `peoname` varchar(50) DEFAULT NULL COMMENT '供应商全称',
  `peoshortname` varchar(50) DEFAULT NULL COMMENT '供应商简称',
  `peoAbbreviation` varchar(50) DEFAULT NULL COMMENT '英文简称',
  `peoFullname` varchar(50) DEFAULT NULL COMMENT '英文全称',
  `peoascription` varchar(50) DEFAULT NULL COMMENT '帐款归属',
  `peopeeid` varchar(50) DEFAULT NULL COMMENT '供应商类型表id',
  `peopeename` varchar(50) DEFAULT NULL COMMENT '供应商类型表名称（新增）',
  `peoarea` varchar(50) DEFAULT NULL COMMENT '地区',
  `peocurrency` varchar(50) DEFAULT NULL COMMENT '币别',
  `peoprincipal` varchar(50) DEFAULT NULL COMMENT '负责人',
  `peolinkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `peophoneone` varchar(50) DEFAULT NULL COMMENT '联系电话一',
  `peophonetwo` varchar(50) DEFAULT NULL COMMENT '联系电话二',
  `peophonethree` varchar(50) DEFAULT NULL COMMENT '联系电话三',
  `peomobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `peobankaccounts` varchar(50) DEFAULT NULL COMMENT '银行帐号',
  `peoopenbank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `peopersonnel` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `peoregistration` varchar(50) DEFAULT NULL COMMENT '税务登记表',
  `peocalling` varchar(50) DEFAULT NULL COMMENT '行业别',
  `peoemail` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `peoweb` varchar(50) DEFAULT NULL COMMENT '网址',
  `peofaxes` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `peoldoutdate` date DEFAULT NULL COMMENT '最初采购入库日',
  `peoldodate` date DEFAULT NULL COMMENT '最初采购退货日',
  `peonewoutdate` date DEFAULT NULL COMMENT '最近采购入库日',
  `peonewodate` date DEFAULT NULL COMMENT '最近采购退货日',
  `peoincluded` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `peoterminadate` varchar(50) DEFAULT NULL COMMENT '终止交易日期',
  `peozhangkuanedu` double(19,4) DEFAULT NULL COMMENT '帐款额度',
  `peoremainedu` double(19,4) DEFAULT NULL COMMENT '剩余额度',
  `peopayment` varchar(50) DEFAULT NULL COMMENT '付款条件',
  `peomonthreckoning` double(19,4) DEFAULT NULL COMMENT '每月结帐日',
  `peocreditrating` varchar(50) DEFAULT NULL COMMENT '信用等级',
  `peoInvoicetype` varchar(50) DEFAULT NULL COMMENT '发票类型',
  `Peoqcprepaymoney` double(19,4) DEFAULT NULL COMMENT '期初预付款',
  `peoqcdealmoney` double(19,4) DEFAULT NULL COMMENT '期初应付款',
  `peoqmprepaymoney` double(19,4) DEFAULT NULL COMMENT '期末预付款',
  `peoqmdealmoney` double(19,4) DEFAULT NULL COMMENT '期末应付款',
  `peoAdvance` varchar(50) DEFAULT NULL COMMENT '预付账款科目',
  `peoAccounts` varchar(50) DEFAULT NULL COMMENT '应付账款科目',
  `peoassessed` varchar(50) DEFAULT NULL COMMENT '应付暂估科目',
  `peoCustomBarone` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `peoCustomBartow` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `peoremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`peoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `provideinfo` */

insert  into `provideinfo`(`peoid`,`peoname`,`peoshortname`,`peoAbbreviation`,`peoFullname`,`peoascription`,`peopeeid`,`peopeename`,`peoarea`,`peocurrency`,`peoprincipal`,`peolinkman`,`peophoneone`,`peophonetwo`,`peophonethree`,`peomobilephone`,`peobankaccounts`,`peoopenbank`,`peopersonnel`,`peoregistration`,`peocalling`,`peoemail`,`peoweb`,`peofaxes`,`peoldoutdate`,`peoldodate`,`peonewoutdate`,`peonewodate`,`peoincluded`,`peoterminadate`,`peozhangkuanedu`,`peoremainedu`,`peopayment`,`peomonthreckoning`,`peocreditrating`,`peoInvoicetype`,`Peoqcprepaymoney`,`peoqcdealmoney`,`peoqmprepaymoney`,`peoqmdealmoney`,`peoAdvance`,`peoAccounts`,`peoassessed`,`peoCustomBarone`,`peoCustomBartow`,`peoremark`) values ('HP','惠普(中国)有限公司','惠普',NULL,NULL,'HP','01','主要供应商',NULL,NULL,'朱采购',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('SZSM','神州数码计算机有限公司','神州数码',NULL,NULL,'SZSM','01','主要供应商',NULL,NULL,'朱采购',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `providetype` */

DROP TABLE IF EXISTS `providetype`;

CREATE TABLE `providetype` (
  `peeid` varchar(50) NOT NULL COMMENT '类别编号',
  `peename` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `peeEname` varchar(50) DEFAULT NULL COMMENT '类别英文名称',
  `peeremark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`peeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `providetype` */

insert  into `providetype`(`peeid`,`peename`,`peeEname`,`peeremark`) values ('01','主要供应商',NULL,NULL),('02','一般供应商',NULL,NULL),('03','委外厂',NULL,NULL),('04','其它供应商',NULL,NULL);

/*Table structure for table `purchasingorder` */

DROP TABLE IF EXISTS `purchasingorder`;

CREATE TABLE `purchasingorder` (
  `purid` varchar(50) NOT NULL COMMENT '类型编号',
  `purname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `purEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `purMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`purid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchasingorder` */

/*Table structure for table `recededetails` */

DROP TABLE IF EXISTS `recededetails`;

CREATE TABLE `recededetails` (
  `Recid` varchar(20) NOT NULL COMMENT '采购退货单号(stockrecede外键)',
  `Detsequ` int(11) DEFAULT NULL COMMENT '序号(联合主键)',
  `Matid` varchar(50) DEFAULT NULL COMMENT '物料编号(非外键)',
  `Matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Matspec` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `Detnum` int(11) DEFAULT NULL COMMENT '数量',
  `Detagioprice` decimal(10,2) DEFAULT NULL COMMENT '折扣前单价',
  `Detdiscount` int(11) DEFAULT NULL COMMENT '折数',
  `Detprice` decimal(19,4) DEFAULT NULL COMMENT '单价',
  `Detamtmoney` decimal(19,4) DEFAULT NULL COMMENT '金额',
  `Depcess` int(11) DEFAULT NULL COMMENT '税率',
  `Depcessmoney` decimal(10,2) DEFAULT NULL COMMENT '税额',
  `Deplargess` int(11) DEFAULT '0' COMMENT '是否赠品',
  `Sodorigintype` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `Sodorigin` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Recid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购退货明细表';

/*Data for the table `recededetails` */

/*Table structure for table `requisition` */

DROP TABLE IF EXISTS `requisition`;

CREATE TABLE `requisition` (
  `reqid` varchar(50) NOT NULL COMMENT '类型编号',
  `reqname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `reqEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `reqMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`reqid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `requisition` */

insert  into `requisition`(`reqid`,`reqname`,`reqEngName`,`reqMale`) values ('01','原料普通请购',NULL,NULL),('02','原料加急请购',NULL,NULL),('03','商品请购',NULL,NULL),('04','商品加急请购',NULL,NULL),('99','用品请购',NULL,NULL);

/*Table structure for table `returngoods` */

DROP TABLE IF EXISTS `returngoods`;

CREATE TABLE `returngoods` (
  `retid` varchar(50) NOT NULL COMMENT '类型编号',
  `retname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `retEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `retMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`retid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `returngoods` */

/*Table structure for table `sale` */

DROP TABLE IF EXISTS `sale`;

CREATE TABLE `sale` (
  `smid` int(11) NOT NULL COMMENT '主表编号',
  `smcustomername` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `smaddress` varchar(50) DEFAULT NULL COMMENT '地址1',
  `Smaddresstwo` varchar(50) DEFAULT NULL COMMENT '地址2',
  `smtax` varchar(50) DEFAULT NULL COMMENT '是否含税',
  `smdate` date DEFAULT NULL COMMENT '单据日期',
  `smnumber` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `smcurrency` varchar(50) DEFAULT NULL COMMENT '币别',
  `smparities` varchar(50) DEFAULT NULL COMMENT '汇率',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号',
  `smtype` int(11) DEFAULT NULL COMMENT '单据类型',
  `empid` int(11) DEFAULT NULL COMMENT '业务人员编号',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员名称',
  `depid` int(11) DEFAULT NULL COMMENT '部门编号',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '审核人员',
  `checkstate` int(11) DEFAULT NULL COMMENT '审核状态',
  `totalMoney` double(19,4) DEFAULT NULL COMMENT '合计金额',
  `totalTax` double(19,4) DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double(19,4) DEFAULT NULL COMMENT '合计含税金额',
  PRIMARY KEY (`smid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sale` */

/*Table structure for table `saleobey` */

DROP TABLE IF EXISTS `saleobey`;

CREATE TABLE `saleobey` (
  `sono` int(11) NOT NULL COMMENT '编号',
  `soid` varchar(50) DEFAULT NULL COMMENT '栏号',
  `sowlid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `sowlname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `sotype` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `sodwname` int(11) DEFAULT NULL COMMENT '单位名称',
  `sonumber` varchar(50) DEFAULT NULL COMMENT '数量',
  `sozkprice` double(19,4) DEFAULT NULL COMMENT '折扣前单价',
  `sozs` double(19,4) DEFAULT NULL COMMENT '折数',
  `soprice` double(19,4) DEFAULT NULL COMMENT '单价',
  `somoney` double(19,4) DEFAULT NULL COMMENT '金额',
  `sosl` double(19,4) DEFAULT NULL COMMENT '税率',
  `sopaid` double(19,4) DEFAULT NULL COMMENT '税额',
  `soamount` double(19,4) DEFAULT NULL COMMENT '含税金额',
  `sozp` varchar(50) DEFAULT NULL COMMENT '分配赠品',
  `soremark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `factCost` double(19,4) DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double(19,4) DEFAULT NULL COMMENT '标准成本',
  PRIMARY KEY (`sono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saleobey` */

/*Table structure for table `salesorders` */

DROP TABLE IF EXISTS `salesorders`;

CREATE TABLE `salesorders` (
  `salid` varchar(50) NOT NULL COMMENT '类型编号',
  `salname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `salEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `salMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`salid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesorders` */

/*Table structure for table `salesreturn` */

DROP TABLE IF EXISTS `salesreturn`;

CREATE TABLE `salesreturn` (
  `sretid` varchar(50) NOT NULL COMMENT '类型编号',
  `sretname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `sretEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `sretMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`sretid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesreturn` */

/*Table structure for table `salesstock` */

DROP TABLE IF EXISTS `salesstock`;

CREATE TABLE `salesstock` (
  `stoid` varchar(50) NOT NULL COMMENT '类型编号',
  `stoname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `stoEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `stoMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`stoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesstock` */

/*Table structure for table `selectdet` */

DROP TABLE IF EXISTS `selectdet`;

CREATE TABLE `selectdet` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码sellissueorder(billId)',
  `coteMark` int(9) DEFAULT NULL COMMENT '栏号',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号Materiel(matid)',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `number` int(9) DEFAULT NULL COMMENT '数量',
  `agioAgoPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `agio` double DEFAULT NULL COMMENT '折数',
  `price` double DEFAULT NULL COMMENT '单价',
  `money` double DEFAULT NULL COMMENT '金额',
  `cess` double DEFAULT NULL COMMENT '税率',
  `taxmoney` double DEFAULT NULL COMMENT '税额',
  `intaxmoney` double DEFAULT NULL COMMENT '含税金额',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `selectdet` */

/*Table structure for table `selectpaper` */

DROP TABLE IF EXISTS `selectpaper`;

CREATE TABLE `selectpaper` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码sellissueorder(billId)',
  `coteMark` int(9) DEFAULT NULL COMMENT '栏号',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号Materiel(matid)',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `number` int(9) DEFAULT NULL COMMENT '数量',
  `agioAgoPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `agio` double DEFAULT NULL COMMENT '折数',
  `price` double DEFAULT NULL COMMENT '单价',
  `money` double DEFAULT NULL COMMENT '金额',
  `cess` double DEFAULT NULL COMMENT '税率',
  `taxmoney` double DEFAULT NULL COMMENT '税额',
  `intaxmoney` double DEFAULT NULL COMMENT '含税金额',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `Nonumber` int(9) DEFAULT NULL COMMENT '未出数量',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '销售订单号',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `selectpaper` */

/*Table structure for table `sellcancel` */

DROP TABLE IF EXISTS `sellcancel`;

CREATE TABLE `sellcancel` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `sinId` int(9) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `cliplaceid` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `Cliplace` varchar(50) DEFAULT NULL COMMENT '地址',
  `effectdate` date DEFAULT NULL COMMENT '有效日期',
  `currencyType` varchar(50) DEFAULT NULL COMMENT '币别',
  `priceWhetherTax` varchar(20) DEFAULT NULL COMMENT '单价是否含税',
  `stoid` varchar(50) DEFAULT NULL COMMENT '仓库编号   ',
  `stoname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `whetheranewenterstorage` int(2) DEFAULT NULL COMMENT '是否重新入库',
  `empid` varchar(50) DEFAULT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `depid` varchar(50) DEFAULT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(9) DEFAULT NULL COMMENT '审核状态',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellcancel` */

/*Table structure for table `sellcanceldetails` */

DROP TABLE IF EXISTS `sellcanceldetails`;

CREATE TABLE `sellcanceldetails` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码sellcancel(billId)',
  `coteMark` int(9) DEFAULT NULL COMMENT '栏号',
  `matid` varchar(20) DEFAULT NULL COMMENT '物料编号Materiel(matid)',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `num` int(9) DEFAULT NULL COMMENT '数量',
  `agioAgoPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `agio` double DEFAULT NULL COMMENT '折数',
  `price` double DEFAULT NULL COMMENT '单价',
  `money` double DEFAULT NULL COMMENT '金额',
  `cess` double DEFAULT NULL COMMENT '税率',
  `taxmoney` double DEFAULT NULL COMMENT '税额',
  `intaxmoney` double DEFAULT NULL COMMENT '含税金额',
  `present` varchar(4) DEFAULT NULL COMMENT '赠品',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellcanceldetails` */

/*Table structure for table `sellissueorder` */

DROP TABLE IF EXISTS `sellissueorder`;

CREATE TABLE `sellissueorder` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `sinId` int(9) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `Sinname` varchar(50) DEFAULT NULL COMMENT '单据名称',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `cliplaceid` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `Cliplace` varchar(50) DEFAULT NULL COMMENT '地址',
  `effectdate` date DEFAULT NULL COMMENT '有效日期',
  `currencyType` varchar(50) DEFAULT NULL COMMENT '币别',
  `priceWhetherTax` varchar(20) DEFAULT NULL COMMENT '单价是否含税',
  `stoid` varchar(50) DEFAULT NULL COMMENT '仓库编号   ',
  `stoname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `empid` varchar(50) DEFAULT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `depid` varchar(50) DEFAULT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(9) DEFAULT NULL COMMENT '审核状态',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `SaleClassID` int(9) DEFAULT NULL COMMENT '销售出库类型',
  `SaleClassName` varchar(50) DEFAULT NULL COMMENT '销售出库名称',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellissueorder` */

/*Table structure for table `sellissueorderdetails` */

DROP TABLE IF EXISTS `sellissueorderdetails`;

CREATE TABLE `sellissueorderdetails` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码sellissueorder(billId)',
  `coteMark` int(9) DEFAULT NULL COMMENT '栏号',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号Materiel(matid)',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `num` int(9) DEFAULT NULL COMMENT '数量',
  `agioAgoPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `agio` double DEFAULT NULL COMMENT '折数',
  `price` double DEFAULT NULL COMMENT '单价',
  `money` double DEFAULT NULL COMMENT '金额',
  `cess` double DEFAULT NULL COMMENT '税率',
  `taxmoney` double DEFAULT NULL COMMENT '税额',
  `intaxmoney` double DEFAULT NULL COMMENT '含税金额',
  `present` varchar(4) DEFAULT NULL COMMENT '赠品',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellissueorderdetails` */

/*Table structure for table `sellorde` */

DROP TABLE IF EXISTS `sellorde`;

CREATE TABLE `sellorde` (
  `seid` int(11) NOT NULL COMMENT '主表编号',
  `secustomername` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `seaddress` varchar(50) DEFAULT NULL COMMENT '地址1',
  `seaddresstwo` varchar(50) DEFAULT NULL COMMENT '地址2',
  `setype` varchar(50) DEFAULT NULL COMMENT '销售类型',
  `setax` varchar(50) DEFAULT NULL COMMENT '是否含税',
  `sestatus` varchar(50) DEFAULT NULL COMMENT '单况',
  `sedate` date DEFAULT NULL COMMENT '单据日期',
  `senumber` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `seorder` varchar(50) DEFAULT NULL COMMENT '客户订单',
  `securrency` varchar(50) DEFAULT NULL COMMENT '币别',
  `separities` varchar(50) DEFAULT NULL COMMENT '汇率',
  `empid` int(11) DEFAULT NULL COMMENT '业务人员编号',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `depid` int(11) DEFAULT NULL COMMENT '部门编号',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` varchar(50) DEFAULT NULL COMMENT '审核状态',
  `totalMoney` int(11) DEFAULT NULL COMMENT '合计金额',
  `totalTax` int(11) DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` int(11) DEFAULT NULL COMMENT '合计含税金额',
  PRIMARY KEY (`seid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellorde` */

/*Table structure for table `sellorder` */

DROP TABLE IF EXISTS `sellorder`;

CREATE TABLE `sellorder` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `sinId` int(9) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `sinName` varchar(50) DEFAULT NULL COMMENT '单据名称',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `cliplaceid` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `Cliplace` varchar(50) DEFAULT NULL COMMENT '地址',
  `orderStatus` int(2) DEFAULT NULL COMMENT '订单状况',
  `currencyType` varchar(50) DEFAULT NULL COMMENT '币别',
  `priceWhetherTax` varchar(20) DEFAULT NULL COMMENT '单价是否含税',
  `empid` varchar(50) DEFAULT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) DEFAULT NULL COMMENT '业务人员',
  `depid` varchar(50) DEFAULT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(9) DEFAULT NULL COMMENT '审核状态',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellorder` */

/*Table structure for table `shouldgatheringdetails` */

DROP TABLE IF EXISTS `shouldgatheringdetails`;

CREATE TABLE `shouldgatheringdetails` (
  `minusaddid` int(9) NOT NULL COMMENT '主键ID',
  `sinId` int(9) DEFAULT NULL COMMENT '来源单别（销售发票、退货）',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别名称',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `nwdate` date DEFAULT NULL COMMENT '来源单据日期',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号',
  `showDate` date DEFAULT NULL COMMENT '日期',
  `origiNddMoney` double DEFAULT NULL COMMENT '原单金额',
  `currentlybalance` double DEFAULT NULL COMMENT '现行余额',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`minusaddid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shouldgatheringdetails` */

/*Table structure for table `stockapply` */

DROP TABLE IF EXISTS `stockapply`;

CREATE TABLE `stockapply` (
  `Appid` varchar(20) NOT NULL COMMENT '请购单编号',
  `Appdate` date DEFAULT NULL COMMENT '请购单日期',
  `Apptype` varchar(50) DEFAULT NULL COMMENT '请购采购类型',
  `Appcircs` int(11) DEFAULT NULL COMMENT '单况：已结案/未结案/无效',
  `Appperson` varchar(50) DEFAULT NULL COMMENT '请购人员',
  `Apppersonid` varchar(50) DEFAULT NULL COMMENT '伪外键：请购人员id',
  `Appdept` varchar(50) DEFAULT NULL COMMENT '请购部门',
  `Appdeptid` varchar(50) DEFAULT NULL COMMENT '伪外键：请购部门id',
  `Appmaker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Appauditingperson` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `Appauditing` varchar(50) DEFAULT NULL COMMENT '审核状态：未审核/已审核/无效',
  `Stockapplyname` varchar(50) DEFAULT NULL COMMENT '保存（“采购请购”）',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段 保存（“采购请购”）',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购主表';

/*Data for the table `stockapply` */

/*Table structure for table `stockapplydetails` */

DROP TABLE IF EXISTS `stockapplydetails`;

CREATE TABLE `stockapplydetails` (
  `Appid` varchar(20) NOT NULL COMMENT '请购单编号',
  `Apdrows` int(11) DEFAULT NULL COMMENT '行号',
  `Apdmateridlid` varchar(50) DEFAULT NULL COMMENT '物料编号(伪外：物料主文件)',
  `Apdmateridlname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Apdmodel` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `Apdunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `Apdnum` int(11) DEFAULT NULL COMMENT '数量',
  `Apdstandardprice` decimal(10,2) DEFAULT NULL COMMENT '标准进价',
  `Apdstandardmoney` decimal(10,2) DEFAULT NULL COMMENT '标准进价金额',
  `Apdprice` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `Apdintomoney` decimal(10,2) DEFAULT NULL COMMENT '进价金额',
  `Apddemanddate` date DEFAULT NULL COMMENT '需求日期',
  `Apdstockdate` date DEFAULT NULL COMMENT '建议采购日期',
  `Apdnotnum` int(11) DEFAULT NULL COMMENT '未采购数量',
  `Apdoriginid` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `Apdorigintype` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Apdremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购明细表';

/*Data for the table `stockapplydetails` */

/*Table structure for table `stockapportion` */

DROP TABLE IF EXISTS `stockapportion`;

CREATE TABLE `stockapportion` (
  `appid` varchar(20) NOT NULL COMMENT 'appid',
  `appdate` date DEFAULT NULL COMMENT 'appdate',
  `wisname` varchar(50) DEFAULT NULL COMMENT ' wisname',
  `appamtmoney` double DEFAULT NULL COMMENT 'appamtmoney',
  `makeperson` varchar(50) DEFAULT NULL COMMENT 'makeperson',
  `auditingperson` varchar(50) DEFAULT NULL COMMENT 'auditingperson',
  `estate` varchar(50) DEFAULT NULL COMMENT 'estate',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`appid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockapportion` */

/*Table structure for table `stockinquire` */

DROP TABLE IF EXISTS `stockinquire`;

CREATE TABLE `stockinquire` (
  `Stoid` varchar(20) NOT NULL COMMENT '询价单编号',
  `Stopname` varchar(50) DEFAULT NULL COMMENT '供应商',
  `Stopid` varchar(50) DEFAULT NULL COMMENT '伪外键(供应商主文件)',
  `Stopaddress` varchar(100) DEFAULT NULL COMMENT '供应商地址',
  `Sotdate` date DEFAULT NULL COMMENT '单据日期',
  `Stoavdate` date DEFAULT NULL COMMENT '有效日期',
  `Stoistax` varchar(50) DEFAULT NULL COMMENT '是否含税(含税/未含税)',
  `Stodaddress` varchar(100) DEFAULT NULL COMMENT '送货地址',
  `Stomakeperson` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Stoauditingperson` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `Stostockperson` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `Stopersonid` varchar(50) DEFAULT NULL COMMENT '伪外键(请购人员外键)',
  `Stodept` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `Stodeptid` varchar(50) DEFAULT NULL COMMENT '伪外键(所属部门外键)',
  `Stoauditing` varchar(50) DEFAULT NULL COMMENT '审核状态：未审核/已审核/无效',
  `Stockinquirename` varchar(50) DEFAULT NULL COMMENT '保存（“采购询价单”）',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Stoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价主表';

/*Data for the table `stockinquire` */

/*Table structure for table `stockinquiredetails` */

DROP TABLE IF EXISTS `stockinquiredetails`;

CREATE TABLE `stockinquiredetails` (
  `Stoid` varchar(20) NOT NULL COMMENT '询价单编号',
  `Sdarows` int(11) DEFAULT NULL COMMENT '行号',
  `Sdamaterielid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `Sdamateridlname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Sdamodel` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `Sdaunit` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `Sdanum` int(11) DEFAULT NULL COMMENT '数量',
  `Sdaagioes` decimal(10,2) DEFAULT NULL COMMENT '折前单价',
  `Sdaagiocess` int(11) DEFAULT NULL COMMENT '折数(%)',
  `Sdaprice` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `Sdamoney` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `Sdacess` int(11) DEFAULT NULL COMMENT '税率(%)',
  `Sdataxmoney` decimal(10,2) DEFAULT NULL COMMENT '税额',
  `Sdataxmoneys` decimal(10,2) DEFAULT NULL COMMENT '含税金额',
  `Sdaislargess` int(11) DEFAULT NULL COMMENT '赠品：是/否',
  `Sdaoriginid` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Sdaorigintype` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `Sdaremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Stoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价明细表';

/*Data for the table `stockinquiredetails` */

/*Table structure for table `stockinvoice` */

DROP TABLE IF EXISTS `stockinvoice`;

CREATE TABLE `stockinvoice` (
  `sysid` varchar(100) NOT NULL,
  `FundbillNo` varchar(100) DEFAULT NULL,
  `billdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `custflag` longtext,
  `peoid` varchar(100) DEFAULT NULL,
  `purveyname` varchar(100) DEFAULT NULL,
  `billtype` varchar(100) DEFAULT NULL,
  `Invoice` varchar(100) DEFAULT NULL,
  `Affirmstate` varchar(100) DEFAULT NULL,
  `invoiceid` varchar(100) DEFAULT NULL,
  `Voucherno` varchar(100) DEFAULT NULL,
  `Currid` varchar(100) DEFAULT NULL,
  `cvoucherNo` varchar(100) DEFAULT NULL,
  `Exchrate` varchar(100) DEFAULT NULL,
  `Total` varchar(100) DEFAULT NULL,
  `tax` varchar(100) DEFAULT NULL,
  `cashpay` varchar(100) DEFAULT NULL,
  `Visapay` varchar(100) DEFAULT NULL,
  `offset` varchar(100) DEFAULT NULL,
  `Discount` varchar(100) DEFAULT NULL,
  `Localtotal` varchar(100) DEFAULT NULL,
  `localtax` varchar(100) DEFAULT NULL,
  `Localcashpay` varchar(100) DEFAULT NULL,
  `localVisapay` varchar(100) DEFAULT NULL,
  `localoffset` varchar(100) DEFAULT NULL,
  `Prepayday` varchar(100) DEFAULT NULL,
  `dueto` varchar(100) DEFAULT NULL,
  `Saleman` varchar(100) DEFAULT NULL,
  `Mark` varchar(100) DEFAULT NULL,
  `permitter` varchar(100) DEFAULT NULL,
  `Project` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `safetyone` varchar(100) DEFAULT NULL,
  `safetytwo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sysid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockinvoice` */

/*Table structure for table `stockorder` */

DROP TABLE IF EXISTS `stockorder`;

CREATE TABLE `stockorder` (
  `Stoid` varchar(20) NOT NULL COMMENT '单据号',
  `Stodate` date DEFAULT NULL COMMENT '日期',
  `Stopeoname` varchar(50) DEFAULT NULL COMMENT '供货商',
  `Stopeoid` varchar(50) DEFAULT NULL COMMENT '供货商编号',
  `Stopeoadress` varchar(50) DEFAULT NULL COMMENT '供货商地址',
  `Stoistax` varchar(20) DEFAULT NULL COMMENT '单价是否含税：1-含税，2-未税',
  `Stostate` int(11) DEFAULT NULL COMMENT '单况：1-未结案，2-已结案，3-无效',
  `Stoadress` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `Stoempstock` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `Stopersonid` varchar(50) DEFAULT NULL COMMENT '伪外键:采购人员id',
  `Stodept` varchar(50) DEFAULT NULL COMMENT '采购部门',
  `Stodeptid` varchar(50) DEFAULT NULL COMMENT '伪外键:部门id',
  `Stoempname` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Stoempcheck` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `Stomark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `Checkstate` int(11) DEFAULT NULL COMMENT '审核状态',
  `Stockordername` varchar(50) DEFAULT NULL COMMENT '保存（“采购订单”）',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Stoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单主表';

/*Data for the table `stockorder` */

/*Table structure for table `stockorderdetails` */

DROP TABLE IF EXISTS `stockorderdetails`;

CREATE TABLE `stockorderdetails` (
  `Sodid` varchar(20) NOT NULL COMMENT '单据号',
  `Sodlineid` int(11) DEFAULT NULL COMMENT '栏号',
  `Sodmaterielid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `Sodmatid` varchar(20) DEFAULT NULL COMMENT '(物料名称)',
  `Sodspec` varchar(50) DEFAULT NULL COMMENT '(规格型号)',
  `Sodamount` int(11) DEFAULT NULL COMMENT '数量',
  `Sodpreprice` decimal(10,2) DEFAULT NULL COMMENT '折扣前单价',
  `Sodagio` int(11) DEFAULT NULL COMMENT '折数（%）',
  `Sodprice` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `Sodsum` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `Sodcess` int(11) DEFAULT NULL COMMENT '税率（%）',
  `Sodsumcess` decimal(10,2) DEFAULT NULL COMMENT '(税额)',
  `Sodsumprice` decimal(10,2) DEFAULT NULL COMMENT '(含税金额）',
  `Sodpreincomestorage` date DEFAULT NULL COMMENT '预入库日',
  `Sodpresent` varchar(4) DEFAULT NULL COMMENT '是否赠品',
  `Sodorigintype` varchar(20) DEFAULT NULL COMMENT '(来源单别)',
  `Sodorigin` varchar(20) DEFAULT NULL COMMENT '(来源单号)',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Sodid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单明细表';

/*Data for the table `stockorderdetails` */

/*Table structure for table `stockrecede` */

DROP TABLE IF EXISTS `stockrecede`;

CREATE TABLE `stockrecede` (
  `Recid` varchar(20) NOT NULL COMMENT '采购退货单号',
  `Recdate` date DEFAULT NULL COMMENT '单据日期',
  `Peoid` varchar(50) DEFAULT NULL COMMENT '供应商编号',
  `Purveyname` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `Peoaddress` varchar(50) DEFAULT NULL COMMENT '供应商地址',
  `Stoid` varchar(20) DEFAULT NULL COMMENT '仓库编号',
  `Depotname` varchar(20) DEFAULT NULL COMMENT '仓库名称',
  `Containtax` int(11) DEFAULT NULL COMMENT '单价是否含税',
  `Anewstorage` int(11) DEFAULT NULL COMMENT '是否重新入库',
  `Stoperson` varchar(50) DEFAULT NULL COMMENT '采购人员姓名',
  `Stopersonid` varchar(50) DEFAULT NULL COMMENT '采购人员ID',
  `Stodept` varchar(50) DEFAULT NULL COMMENT '请购部门',
  `Stodeptid` varchar(50) DEFAULT NULL COMMENT '部门编号',
  `Makeperson` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Auditingperson` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `Recremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `Estate` varchar(50) DEFAULT NULL COMMENT '单据状态( 是否已经审核)',
  `Stockrecedename` varchar(50) DEFAULT NULL COMMENT '保存（“采购退货单”）',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Recid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购退货主表';

/*Data for the table `stockrecede` */

/*Table structure for table `stockstoragedetails` */

DROP TABLE IF EXISTS `stockstoragedetails`;

CREATE TABLE `stockstoragedetails` (
  `Storagedetailno` varchar(20) NOT NULL COMMENT '引用采购入库单单号',
  `Rowno` int(11) DEFAULT NULL COMMENT '行号',
  `Materielid` varchar(50) DEFAULT NULL COMMENT '引用物料文件ID',
  `Materielname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `Types` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `Units` varchar(20) DEFAULT NULL COMMENT '单位',
  `Amount` int(11) DEFAULT NULL COMMENT '数量',
  `Rebateprice` decimal(10,2) DEFAULT NULL COMMENT '折扣前单价',
  `Rebate` decimal(10,2) DEFAULT NULL COMMENT '折扣',
  `Unitprice` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `Moneys` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `Cess` decimal(9,0) DEFAULT NULL COMMENT '税率',
  `Tax` decimal(10,2) DEFAULT NULL COMMENT '税额',
  `Taxmoneys` decimal(10,2) DEFAULT NULL COMMENT '含税金额',
  `Origintype` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `Originno` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Present` varchar(20) DEFAULT NULL COMMENT '是否赠品',
  `Apportionmoney` decimal(10,2) DEFAULT NULL COMMENT '分摊费用',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Storagedetailno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购入库明细';

/*Data for the table `stockstoragedetails` */

/*Table structure for table `stockstoragetable` */

DROP TABLE IF EXISTS `stockstoragetable`;

CREATE TABLE `stockstoragetable` (
  `Stockstorageno` varchar(20) NOT NULL COMMENT '单号（自动生成）',
  `Storagedate` date DEFAULT NULL COMMENT '单据日期',
  `Purveyid` varchar(50) DEFAULT NULL COMMENT '供货商ID',
  `Purveyname` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `Purveyaddress` varchar(50) DEFAULT NULL COMMENT '供货商地址',
  `Depotid` varchar(50) DEFAULT NULL COMMENT '仓库ID',
  `Depotname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `Pricerevenue` varchar(20) DEFAULT NULL COMMENT '单价是否含税',
  `Stoperson` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `Stodept` varchar(50) DEFAULT NULL COMMENT '采购人员所属部门名称',
  `Stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID',
  `Audituserid` varchar(50) DEFAULT NULL COMMENT '审核人员ID',
  `Repeatuserid` varchar(50) DEFAULT NULL COMMENT '复核人员ID',
  `Remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `Estate` int(11) DEFAULT NULL COMMENT '单据状态（是否以审核）',
  `Stockstoragetablename` varchar(50) DEFAULT NULL COMMENT '保存（“采购入库单”）',
  `Enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  `Safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Stockstorageno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购入库主表';

/*Data for the table `stockstoragetable` */

/*Table structure for table `storage` */

DROP TABLE IF EXISTS `storage`;

CREATE TABLE `storage` (
  `stoid` varchar(50) NOT NULL COMMENT '仓库编号                      ',
  `stoname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `stosimplename` varchar(50) DEFAULT NULL COMMENT '仓库简称',
  `stoEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `stoconnectper` varchar(50) DEFAULT NULL COMMENT '联系人',
  `stoempid` varchar(50) DEFAULT NULL COMMENT '联系人ID(新增)',
  `stophone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `stoaddress` varchar(50) DEFAULT NULL COMMENT '仓库地址',
  `storemark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`stoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `storage` */

insert  into `storage`(`stoid`,`stoname`,`stosimplename`,`stoEngName`,`stoconnectper`,`stoempid`,`stophone`,`stoaddress`,`storemark`) values ('01','原料仓库','王保管',NULL,NULL,NULL,NULL,NULL,NULL),('02','成品仓','胡保管',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `supplieraddress` */

DROP TABLE IF EXISTS `supplieraddress`;

CREATE TABLE `supplieraddress` (
  `suaddrId` varchar(50) NOT NULL COMMENT '供应商地址id',
  `suaddress` varchar(50) DEFAULT NULL COMMENT '供应商地址',
  `suzipcode` varchar(50) DEFAULT NULL COMMENT '邮政编码',
  `sulinkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `sulinkmanprof` varchar(50) DEFAULT NULL COMMENT '联系人职称',
  `sutelephone` varchar(50) DEFAULT NULL COMMENT '联系人电话',
  `sufaxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `suwalkaddr` varchar(50) DEFAULT NULL COMMENT '行走路线',
  `sumemo` varchar(50) DEFAULT NULL COMMENT '备注',
  `peoid` int(11) DEFAULT NULL COMMENT '供应商id',
  PRIMARY KEY (`suaddrId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商地址';

/*Data for the table `supplieraddress` */

/*Table structure for table `takeadvancedetails` */

DROP TABLE IF EXISTS `takeadvancedetails`;

CREATE TABLE `takeadvancedetails` (
  `payid` varchar(20) NOT NULL COMMENT '应付冲款单主单号',
  `takid` int(20) DEFAULT NULL COMMENT '行号',
  `advid` varchar(20) DEFAULT NULL COMMENT '来源预付单单别',
  `advdetid` varchar(20) DEFAULT NULL COMMENT '来源预付单号',
  `paybalance` double DEFAULT NULL COMMENT '预付余额',
  `takadvmoney` double DEFAULT NULL COMMENT '取用预付金额',
  `paydeptid` varchar(50) DEFAULT NULL COMMENT '部门id',
  `paydeptname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `fromdiscription` varchar(200) DEFAULT NULL COMMENT '来源摘要',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`payid`),
  KEY `takid` (`takid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `takeadvancedetails` */

/*Table structure for table `takeadvancegatherdetails` */

DROP TABLE IF EXISTS `takeadvancegatherdetails`;

CREATE TABLE `takeadvancegatherdetails` (
  `tadid` varchar(20) NOT NULL COMMENT '应收冲款单主单号',
  `tadkid` int(20) DEFAULT NULL COMMENT '行号',
  `tagadname` varchar(20) DEFAULT NULL COMMENT '来源预收单单别',
  `tagadid` varchar(20) DEFAULT NULL COMMENT '来源预收单号',
  `tagbalance` double DEFAULT NULL COMMENT '预付余额',
  `tagtakemoney` double DEFAULT NULL COMMENT '取用预付金额',
  `tagdeptid` varchar(50) DEFAULT NULL COMMENT '部门id',
  `tagdeptname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `fromdiscription` varchar(200) DEFAULT NULL COMMENT '来源摘要',
  `enables` int(11) DEFAULT '1' COMMENT 'enables',
  `safetyone` varchar(50) DEFAULT NULL COMMENT 'safetyone',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT 'safetytwo',
  PRIMARY KEY (`tadid`),
  KEY `tadkid` (`tadkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `takeadvancegatherdetails` */

/*Table structure for table `warehousing` */

DROP TABLE IF EXISTS `warehousing`;

CREATE TABLE `warehousing` (
  `warid` varchar(50) NOT NULL COMMENT '类型编号',
  `warname` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `warEngName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `warMale` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`warid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehousing` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
