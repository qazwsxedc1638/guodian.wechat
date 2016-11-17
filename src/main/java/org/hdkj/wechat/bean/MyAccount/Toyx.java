package org.hdkj.wechat.bean.MyAccount;

import java.util.Date;

public class Toyx {
    private String detId;//主键

    private String consNo;//户号

    private String consName;//户名

    private String wx;//微信号

    private String bindStatus;//绑定状态 0绑定 1解绑

    private Date bandTime;//最后一次更新状态时间

    public String getDetId() {
        return detId;
    }

    public void setDetId(String detId) {
        this.detId = detId == null ? null : detId.trim();
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

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx == null ? null : wx.trim();
    }

    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus == null ? null : bindStatus.trim();
    }

    public Date getBandTime() {
        return bandTime;
    }

    public void setBandTime(Date bandTime) {
        this.bandTime = bandTime;
    }
}