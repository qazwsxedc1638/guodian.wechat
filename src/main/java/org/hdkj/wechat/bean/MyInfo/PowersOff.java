package org.hdkj.wechat.bean.MyInfo;

import java.util.Date;

public class PowersOff {
    private String orgNo;//地区编号

    private Date startTime;//开始时间

    private Date stopDate;//结束时间

    private String scope;//具体信息

    private String areaNo;//地区编码

    private String poweroffArea;//停电区域

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo == null ? null : areaNo.trim();
    }

    public String getPoweroffArea() {
        return poweroffArea;
    }

    public void setPoweroffArea(String poweroffArea) {
        this.poweroffArea = poweroffArea == null ? null : poweroffArea.trim();
    }
}