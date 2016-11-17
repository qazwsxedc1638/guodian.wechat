package org.hdkj.wechat.bean.MyElec;

public class Jtdl {
    private Long accuPqId;//累计电量标识

    private Long consId;//用电客户的内部唯一标识

    private String consNo;//用户的外部标识

    private Long prcId;//用户电价的唯一标识

    private String ym;//本期电费年月

    private String orgNo;//供电管理单位

    private String year;//阶梯的年份

    private String beginYmd;//阶梯执行起始月份

    private String endYmd;//阶梯执行终止月份

    private Long accuPq;//累计电量

    private Long settlePq;//本期结算电量

    private Long calcId;//电费计算标识

    private Integer monthsIdx;//指标月数

    private String ifClearing;//是否需要清算

    private Long levOnePqRemain;//一阶剩余可用电量

    private Long levTwoPqRemain;//二阶剩余可用电量

    private Long levOnePq;//一阶可用电量

    private Long levTwoPq;//二阶可用电量

    private Long levOnePqSum;//一阶已用电量

    private Long levTwoPqSum;//二阶已用电量

    private Long levThreePqSum;//三阶已用电量

    private String appCode;//申请编号

    public Long getAccuPqId() {
        return accuPqId;
    }

    public void setAccuPqId(Long accuPqId) {
        this.accuPqId = accuPqId;
    }

    public Long getConsId() {
        return consId;
    }

    public void setConsId(Long consId) {
        this.consId = consId;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo == null ? null : consNo.trim();
    }

    public Long getPrcId() {
        return prcId;
    }

    public void setPrcId(Long prcId) {
        this.prcId = prcId;
    }

    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym == null ? null : ym.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getBeginYmd() {
        return beginYmd;
    }

    public void setBeginYmd(String beginYmd) {
        this.beginYmd = beginYmd == null ? null : beginYmd.trim();
    }

    public String getEndYmd() {
        return endYmd;
    }

    public void setEndYmd(String endYmd) {
        this.endYmd = endYmd == null ? null : endYmd.trim();
    }

    public Long getAccuPq() {
        return accuPq;
    }

    public void setAccuPq(Long accuPq) {
        this.accuPq = accuPq;
    }

    public Long getSettlePq() {
        return settlePq;
    }

    public void setSettlePq(Long settlePq) {
        this.settlePq = settlePq;
    }

    public Long getCalcId() {
        return calcId;
    }

    public void setCalcId(Long calcId) {
        this.calcId = calcId;
    }

    public Integer getMonthsIdx() {
        return monthsIdx;
    }

    public void setMonthsIdx(Integer monthsIdx) {
        this.monthsIdx = monthsIdx;
    }

    public String getIfClearing() {
        return ifClearing;
    }

    public void setIfClearing(String ifClearing) {
        this.ifClearing = ifClearing == null ? null : ifClearing.trim();
    }

    public Long getLevOnePqRemain() {
        return levOnePqRemain;
    }

    public void setLevOnePqRemain(Long levOnePqRemain) {
        this.levOnePqRemain = levOnePqRemain;
    }

    public Long getLevTwoPqRemain() {
        return levTwoPqRemain;
    }

    public void setLevTwoPqRemain(Long levTwoPqRemain) {
        this.levTwoPqRemain = levTwoPqRemain;
    }

    public Long getLevOnePq() {
        return levOnePq;
    }

    public void setLevOnePq(Long levOnePq) {
        this.levOnePq = levOnePq;
    }

    public Long getLevTwoPq() {
        return levTwoPq;
    }

    public void setLevTwoPq(Long levTwoPq) {
        this.levTwoPq = levTwoPq;
    }

    public Long getLevOnePqSum() {
        return levOnePqSum;
    }

    public void setLevOnePqSum(Long levOnePqSum) {
        this.levOnePqSum = levOnePqSum;
    }

    public Long getLevTwoPqSum() {
        return levTwoPqSum;
    }

    public void setLevTwoPqSum(Long levTwoPqSum) {
        this.levTwoPqSum = levTwoPqSum;
    }

    public Long getLevThreePqSum() {
        return levThreePqSum;
    }

    public void setLevThreePqSum(Long levThreePqSum) {
        this.levThreePqSum = levThreePqSum;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }
}