package org.hdkj.wechat.bean.CityCounty;

public class ORGCompany {
    private String orgNo;

    private String orgName;

    private String pOrgNo;

    private String orgType;

    private Integer sortNo;

    private String orgShorthand;

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getpOrgNo() {
        return pOrgNo;
    }

    public void setpOrgNo(String pOrgNo) {
        this.pOrgNo = pOrgNo == null ? null : pOrgNo.trim();
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getOrgShorthand() {
        return orgShorthand;
    }

    public void setOrgShorthand(String orgShorthand) {
        this.orgShorthand = orgShorthand == null ? null : orgShorthand.trim();
    }
}