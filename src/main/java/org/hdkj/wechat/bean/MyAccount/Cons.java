package org.hdkj.wechat.bean.MyAccount;

import java.math.BigDecimal;
import java.util.Date;

public class Cons {
    private Long consId;//用户标识:本实体记录的唯一标识，产生规则为流水号

    private Long vatId;//增值税标识:本实体记录的唯一标识，产生规则为流水号

    private Long custId;//客户标识:本实体记录的唯一标识，产生规则为流水号

    private String consNo;//用户编号:用电客户的外部标识引用国家电网公司营销管理代码类集:5110.1  用电客户编号规则

    private String consName;//用户名称:用户的名称，一般等于客户实体中的客户名称，但也允许附加上一些非自然的信息。如 XXX（东城），便于通过用户名称直接识别。

    private String custQueryNo;//自定义查询号:存储客户提供的自己熟悉的一串标识码，客户通过各种服务渠道可以通过这个查询号来查询自己用电的信息，如客户有多个用电地址，可提供不同的查询号

    private String tmpPayRelaNo;//临时缴费关系号:方便收费操作，用户间建立的松散的缴费关系的标识，可根据此编号缴费，系统显示该编号的所有客户欠费记录，但用户间不能互相共用余额

    private String orgnConsNo;//原用户编号:原用户编号，用于系统升级的时候用户编号重新编号可以在一段时间内继续使用原用户编号查询用户信息

    private String voltCode;//供电电压:用电客户的供电电压等级代码，多路电源时取电压等级最高的供电电压等级代码引用《国家电网公司信息分类与代码体系－综合代码类集－电压等级代码表》

    private String elecAddr;//用电地址:用电客户的用电地址

    private String tradeCode;//行业分类:用电客户的行业分类代码引用国标GB/T 4754-2002

    private String elecTypeCode;//用电类别:用电客户的用电类别分类引用国家电网公司营销管理代码类集:5110.4 用电类别大工业用电，中小化肥，居民生活用电，农业生产用电，贫困县农业排灌用电

    private BigDecimal contractCap;//合同容量:合同约定的本用户的容量

    private BigDecimal runCap;//运行容量:用电客户正在使用的合同容量，如暂停客户，在暂停期间其运行容量等于合同容量减去已暂停的容量

    private String shiftNo;//生产班次:用电客户的生产班次分类引用国家电网公司营销管理代码类集:5110.6用电客户生产班次代码单班，二班，三班，连续生产

    private String lodeAttrCode;//负荷性质:负荷的重要程度分类引用国家电网公司营销管理代码类集:5110.44负荷类别分类与代码一类，二类，三类

    private String psVolt;//原电压等级，已被VOLT_CODE代替，此字段暂时不删除

    private String hecIndustryCode;//高耗能行业类别:依据国家最新的高耗能行业划分

    private String holiday;//厂休日:周休日通过数字连续表示周休哪几天，类似于飞机航班日期表示，如1.2.3,表示星期一星期二和星期三休息。

    private Date buildDate;//立户日期:电子用户档案的首次建立日期

    private Date psDate;//送电日期:用户的首次送电日期

    private Date cancelDate;//销户日期:销户业务信息归档的日期

    private Date dueDate;//到期日期:临时用电客户约定的用电到期日期

    private String notifyMode;//电费通知方式:用户每月电费的通知方式引用国家电网公司营销管理代码类集:5110.57催费方式分类与代码短信，通知单，电话，传真，E-MAIL等

    private String settleMode;//电费结算方式:用于区分是否分期结算01 分期结算，02 抄表结算

    private String statusCode;//用户状态:用电客户的状态说明，说明客户是否处于业扩变更中或已销户引用国家电网公司营销管理代码类集:5110.9 客户状态标志代码正常用电客户，当前新装客户，当前变更客户，已销户客户

    private String orgNo;//供电单位编号:供电单位编码，一般是指的用户的直接供电管理单位，也可以是大客户管理中心等由于管理原因产生的客户管理单位

    private String rrioCode;//重要性等级:客户重要性等级：特级、一级、二级

    private Integer chkCycle;//检查周期:检查周期(单位：月)：用于存放客户检查周期信息，便于周期检查计划制定时，获取参数。

    private Date lastChkDate;//上次检查日期:上次检查日期：用于存放客户上次检查日期，默认为客户的开户日期。

    private String checkerNo;//检查人员编号:人员编号：分管检查人员的人员编号。

    private String poweroffCode;//停电标志:停电标志：01 已停电  02 未停电，反映客户当前是否处于停电状态

    private String transferCode;//转供标志:标识客户是否是转供相关客户，如果涉及转供，是属于转供户还是被转供户引用国家电网公司营销管理代码类集:5110.35 转供标志分类与代码无转供，转供户，被转供户

    private String mrSectNo;//抄表段编号:抄表段标识,用于表示用电客户所属的抄表段

    private String noteTypeCode;//票据类型:用电客户每月电费默认打印的票据类型引用国家电网公司营销管理代码类集:5110.107票据类型普通发票，增殖税发票，收据，无

    private String tmpFlag;//临时用电标志:表示是否是临时用电的用电客户，且属于哪种临时用电01 装表临时用电，02 无表临时用电，03 非临时用电

    private Date tmpDate;//临时用电到期日期:临时用电用户临时用电的到期日期

    private String consSortCode;//用户分类:用户一种常用的分类方式，方便用户的管理01 高压，02 低压非居民，03 低压居民

    private String ruralConsCode;//城农网标志：用于区分是否为农网用电客户

    private String urbanRuralFlag;//城乡类别：城市、农村、特殊边远地区

    private String loadFeatureCode;

    private BigDecimal securityCap;

    public Long getConsId() {
        return consId;
    }

    public void setConsId(Long consId) {
        this.consId = consId;
    }

    public Long getVatId() {
        return vatId;
    }

    public void setVatId(Long vatId) {
        this.vatId = vatId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo == null ? null : consNo.trim();
    }

    public String getConsName() {
        return consName;
    }

    public void setConsName(String consName) {
        this.consName = consName == null ? null : consName.trim();
    }

    public String getCustQueryNo() {
        return custQueryNo;
    }

    public void setCustQueryNo(String custQueryNo) {
        this.custQueryNo = custQueryNo == null ? null : custQueryNo.trim();
    }

    public String getTmpPayRelaNo() {
        return tmpPayRelaNo;
    }

    public void setTmpPayRelaNo(String tmpPayRelaNo) {
        this.tmpPayRelaNo = tmpPayRelaNo == null ? null : tmpPayRelaNo.trim();
    }

    public String getOrgnConsNo() {
        return orgnConsNo;
    }

    public void setOrgnConsNo(String orgnConsNo) {
        this.orgnConsNo = orgnConsNo == null ? null : orgnConsNo.trim();
    }

    public String getVoltCode() {
        return voltCode;
    }

    public void setVoltCode(String voltCode) {
        this.voltCode = voltCode == null ? null : voltCode.trim();
    }

    public String getElecAddr() {
        return elecAddr;
    }

    public void setElecAddr(String elecAddr) {
        this.elecAddr = elecAddr == null ? null : elecAddr.trim();
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    public String getElecTypeCode() {
        return elecTypeCode;
    }

    public void setElecTypeCode(String elecTypeCode) {
        this.elecTypeCode = elecTypeCode == null ? null : elecTypeCode.trim();
    }

    public BigDecimal getContractCap() {
        return contractCap;
    }

    public void setContractCap(BigDecimal contractCap) {
        this.contractCap = contractCap;
    }

    public BigDecimal getRunCap() {
        return runCap;
    }

    public void setRunCap(BigDecimal runCap) {
        this.runCap = runCap;
    }

    public String getShiftNo() {
        return shiftNo;
    }

    public void setShiftNo(String shiftNo) {
        this.shiftNo = shiftNo == null ? null : shiftNo.trim();
    }

    public String getLodeAttrCode() {
        return lodeAttrCode;
    }

    public void setLodeAttrCode(String lodeAttrCode) {
        this.lodeAttrCode = lodeAttrCode == null ? null : lodeAttrCode.trim();
    }

    public String getPsVolt() {
        return psVolt;
    }

    public void setPsVolt(String psVolt) {
        this.psVolt = psVolt == null ? null : psVolt.trim();
    }

    public String getHecIndustryCode() {
        return hecIndustryCode;
    }

    public void setHecIndustryCode(String hecIndustryCode) {
        this.hecIndustryCode = hecIndustryCode == null ? null : hecIndustryCode.trim();
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday == null ? null : holiday.trim();
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Date getPsDate() {
        return psDate;
    }

    public void setPsDate(Date psDate) {
        this.psDate = psDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getNotifyMode() {
        return notifyMode;
    }

    public void setNotifyMode(String notifyMode) {
        this.notifyMode = notifyMode == null ? null : notifyMode.trim();
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getRrioCode() {
        return rrioCode;
    }

    public void setRrioCode(String rrioCode) {
        this.rrioCode = rrioCode == null ? null : rrioCode.trim();
    }

    public Integer getChkCycle() {
        return chkCycle;
    }

    public void setChkCycle(Integer chkCycle) {
        this.chkCycle = chkCycle;
    }

    public Date getLastChkDate() {
        return lastChkDate;
    }

    public void setLastChkDate(Date lastChkDate) {
        this.lastChkDate = lastChkDate;
    }

    public String getCheckerNo() {
        return checkerNo;
    }

    public void setCheckerNo(String checkerNo) {
        this.checkerNo = checkerNo == null ? null : checkerNo.trim();
    }

    public String getPoweroffCode() {
        return poweroffCode;
    }

    public void setPoweroffCode(String poweroffCode) {
        this.poweroffCode = poweroffCode == null ? null : poweroffCode.trim();
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode == null ? null : transferCode.trim();
    }

    public String getMrSectNo() {
        return mrSectNo;
    }

    public void setMrSectNo(String mrSectNo) {
        this.mrSectNo = mrSectNo == null ? null : mrSectNo.trim();
    }

    public String getNoteTypeCode() {
        return noteTypeCode;
    }

    public void setNoteTypeCode(String noteTypeCode) {
        this.noteTypeCode = noteTypeCode == null ? null : noteTypeCode.trim();
    }

    public String getTmpFlag() {
        return tmpFlag;
    }

    public void setTmpFlag(String tmpFlag) {
        this.tmpFlag = tmpFlag == null ? null : tmpFlag.trim();
    }

    public Date getTmpDate() {
        return tmpDate;
    }

    public void setTmpDate(Date tmpDate) {
        this.tmpDate = tmpDate;
    }

    public String getConsSortCode() {
        return consSortCode;
    }

    public void setConsSortCode(String consSortCode) {
        this.consSortCode = consSortCode == null ? null : consSortCode.trim();
    }

    public String getRuralConsCode() {
        return ruralConsCode;
    }

    public void setRuralConsCode(String ruralConsCode) {
        this.ruralConsCode = ruralConsCode == null ? null : ruralConsCode.trim();
    }

    public String getUrbanRuralFlag() {
        return urbanRuralFlag;
    }

    public void setUrbanRuralFlag(String urbanRuralFlag) {
        this.urbanRuralFlag = urbanRuralFlag == null ? null : urbanRuralFlag.trim();
    }

    public String getLoadFeatureCode() {
        return loadFeatureCode;
    }

    public void setLoadFeatureCode(String loadFeatureCode) {
        this.loadFeatureCode = loadFeatureCode == null ? null : loadFeatureCode.trim();
    }

    public BigDecimal getSecurityCap() {
        return securityCap;
    }

    public void setSecurityCap(BigDecimal securityCap) {
        this.securityCap = securityCap;
    }
}