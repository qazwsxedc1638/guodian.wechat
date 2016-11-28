package org.hdkj.wechat.bean.MyAccount;

public class RecordMaintain {
    private String consNo;//户号

    private String consName;//户名

    private String consAddr;//地址

    private String consDate;//抄表日期

    private String idNo;//身份证号

    private String phoneNo;//电话

    private String consType;//用户类型（0:非费控，1:费控）

    private String consPws;//查询密码

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

    public String getConsAddr() {
        return consAddr;
    }

    public void setConsAddr(String consAddr) {
        this.consAddr = consAddr == null ? null : consAddr.trim();
    }

    public String getConsDate() {
        return consDate;
    }

    public void setConsDate(String consDate) {
        this.consDate = consDate == null ? null : consDate.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getConsType() {
        return consType;
    }

    public void setConsType(String consType) {
        this.consType = consType == null ? null : consType.trim();
    }

    public String getConsPws() {
        return consPws;
    }

    public void setConsPws(String consPws) {
        this.consPws = consPws == null ? null : consPws.trim();
    }
}