package org.hdkj.wechat.bean.MyElec;

import java.math.BigDecimal;

public class Balance {
    private Long acctId;//账户标识

    private String consNo;//用户编号

    private BigDecimal prepayBal;//预收余额

    private BigDecimal freezeAmt;//冻结余额

    private BigDecimal chgBal;//调尾余额

    private BigDecimal transitNoteBal;//在途票据余额

    private String orgNo;//供电单位编号

    private BigDecimal cardBal;//卡表用户预售电余额

    private String prepayCode;//预收来源类型，为浙江区分预收来源使用

    private BigDecimal checkAmt;//锁定金额

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo == null ? null : consNo.trim();
    }

    public BigDecimal getPrepayBal() {
        return prepayBal;
    }

    public void setPrepayBal(BigDecimal prepayBal) {
        this.prepayBal = prepayBal;
    }

    public BigDecimal getFreezeAmt() {
        return freezeAmt;
    }

    public void setFreezeAmt(BigDecimal freezeAmt) {
        this.freezeAmt = freezeAmt;
    }

    public BigDecimal getChgBal() {
        return chgBal;
    }

    public void setChgBal(BigDecimal chgBal) {
        this.chgBal = chgBal;
    }

    public BigDecimal getTransitNoteBal() {
        return transitNoteBal;
    }

    public void setTransitNoteBal(BigDecimal transitNoteBal) {
        this.transitNoteBal = transitNoteBal;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public BigDecimal getCardBal() {
        return cardBal;
    }

    public void setCardBal(BigDecimal cardBal) {
        this.cardBal = cardBal;
    }

    public String getPrepayCode() {
        return prepayCode;
    }

    public void setPrepayCode(String prepayCode) {
        this.prepayCode = prepayCode == null ? null : prepayCode.trim();
    }

    public BigDecimal getCheckAmt() {
        return checkAmt;
    }

    public void setCheckAmt(BigDecimal checkAmt) {
        this.checkAmt = checkAmt;
    }
}