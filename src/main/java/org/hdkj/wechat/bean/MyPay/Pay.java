package org.hdkj.wechat.bean.MyPay;

import java.math.BigDecimal;
import java.util.Date;


public class Pay {
    private Long chargeId;

    private Long cashchkId;

    private Long acctId;

    private String consNo;

    private String orgNo;

    private String chargeYm;

    private String chargeDate;

    private String acctYm;

    private String typeCode;

    private BigDecimal rcvAmt;

    private BigDecimal thisChg;

    private BigDecimal lastChg;

    private String chargeEmpNo;

    private String payMode;

    private String settleMode;

    private String settleNoteNo;

    private String settleBankCode;

    private String acctNo;

    private String chargeRemark;

    private String rcvOrgNo;

    private String deptNo;

    private String statusCode;

    private Long relateId;

    private String rcvedDate;

    private String bankDate;

    private String consBankAcct;

    private Long branchId;

    private String statNo;

    private String prepayCode;

    private String payVer;

    private String transferType;

    private String transferDirection;

    private String arriveStatus;
    
    private Long codeId;

    private Long codeSortId;

    private String pCode;

    private String codeType;

    private String value;

    private String name;

    private Integer dispSn;

    private String content1;

    private String content2;

    private String content3;

    private String content4;

    private String content5;

    public Long getCodeId() {
        return codeId;
    }

    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    public Long getCodeSortId() {
        return codeSortId;
    }

    public void setCodeSortId(Long codeSortId) {
        this.codeSortId = codeSortId;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDispSn() {
        return dispSn;
    }

    public void setDispSn(Integer dispSn) {
        this.dispSn = dispSn;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1 == null ? null : content1.trim();
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2 == null ? null : content2.trim();
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3 == null ? null : content3.trim();
    }

    public String getContent4() {
        return content4;
    }

    public void setContent4(String content4) {
        this.content4 = content4 == null ? null : content4.trim();
    }

    public String getContent5() {
        return content5;
    }

    public void setContent5(String content5) {
        this.content5 = content5 == null ? null : content5.trim();
    }

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public Long getCashchkId() {
        return cashchkId;
    }

    public void setCashchkId(Long cashchkId) {
        this.cashchkId = cashchkId;
    }

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

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getChargeYm() {
        return chargeYm;
    }

    public void setChargeYm(String chargeYm) {
        this.chargeYm = chargeYm == null ? null : chargeYm.trim();
    }

    public String getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate;
    }

    public String getAcctYm() {
        return acctYm;
    }

    public void setAcctYm(String acctYm) {
        this.acctYm = acctYm == null ? null : acctYm.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public BigDecimal getRcvAmt() {
        return rcvAmt;
    }

    public void setRcvAmt(BigDecimal rcvAmt) {
        this.rcvAmt = rcvAmt;
    }

    public BigDecimal getThisChg() {
        return thisChg;
    }

    public void setThisChg(BigDecimal thisChg) {
        this.thisChg = thisChg;
    }

    public BigDecimal getLastChg() {
        return lastChg;
    }

    public void setLastChg(BigDecimal lastChg) {
        this.lastChg = lastChg;
    }

    public String getChargeEmpNo() {
        return chargeEmpNo;
    }

    public void setChargeEmpNo(String chargeEmpNo) {
        this.chargeEmpNo = chargeEmpNo == null ? null : chargeEmpNo.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public String getSettleNoteNo() {
        return settleNoteNo;
    }

    public void setSettleNoteNo(String settleNoteNo) {
        this.settleNoteNo = settleNoteNo == null ? null : settleNoteNo.trim();
    }

    public String getSettleBankCode() {
        return settleBankCode;
    }

    public void setSettleBankCode(String settleBankCode) {
        this.settleBankCode = settleBankCode == null ? null : settleBankCode.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getChargeRemark() {
        return chargeRemark;
    }

    public void setChargeRemark(String chargeRemark) {
        this.chargeRemark = chargeRemark == null ? null : chargeRemark.trim();
    }

    public String getRcvOrgNo() {
        return rcvOrgNo;
    }

    public void setRcvOrgNo(String rcvOrgNo) {
        this.rcvOrgNo = rcvOrgNo == null ? null : rcvOrgNo.trim();
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public Long getRelateId() {
        return relateId;
    }

    public void setRelateId(Long relateId) {
        this.relateId = relateId;
    }

    public String getRcvedDate() {
        return rcvedDate;
    }

    public void setRcvedDate(String rcvedDate) {
        this.rcvedDate = rcvedDate == null ? null : rcvedDate.trim();
    }

    public String getBankDate() {
        return bankDate;
    }

    public void setBankDate(String bankDate) {
        this.bankDate = bankDate == null ? null : bankDate.trim();
    }

    public String getConsBankAcct() {
        return consBankAcct;
    }

    public void setConsBankAcct(String consBankAcct) {
        this.consBankAcct = consBankAcct == null ? null : consBankAcct.trim();
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getStatNo() {
        return statNo;
    }

    public void setStatNo(String statNo) {
        this.statNo = statNo == null ? null : statNo.trim();
    }

    public String getPrepayCode() {
        return prepayCode;
    }

    public void setPrepayCode(String prepayCode) {
        this.prepayCode = prepayCode == null ? null : prepayCode.trim();
    }

    public String getPayVer() {
        return payVer;
    }

    public void setPayVer(String payVer) {
        this.payVer = payVer == null ? null : payVer.trim();
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType == null ? null : transferType.trim();
    }

    public String getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(String transferDirection) {
        this.transferDirection = transferDirection == null ? null : transferDirection.trim();
    }

    public String getArriveStatus() {
        return arriveStatus;
    }

    public void setArriveStatus(String arriveStatus) {
        this.arriveStatus = arriveStatus == null ? null : arriveStatus.trim();
    }



    
}