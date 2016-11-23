package org.hdkj.wechat.bean.MyAccount;

import java.util.Date;

public class HhInfo {
    
	private String id;

    private String hh;//户号

    private String hm;//户名

    private String wx;//微信openid

    private String state;//是否默认户号绑定状态 0非默认 1默认

    private Date bandTime;//绑定时间

    private String consType;//控制模式 1,远程控；2本地控；3其它

    private String orgCode;//地区编码

    private String addr;//地址

    private String msg;//短信平台推送标志

    private String wxCheck;

    private String bindStatus;//绑定状态：0绑定，1解绑

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh == null ? null : hh.trim();
    }

    public String getHm() {
        return hm;
    }

    public void setHm(String hm) {
        this.hm = hm == null ? null : hm.trim();
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx == null ? null : wx.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getBandTime() {
        return bandTime;
    }

    public void setBandTime(Date bandTime) {
        this.bandTime = bandTime;
    }

    public String getConsType() {
        return consType;
    }

    public void setConsType(String consType) {
        this.consType = consType == null ? null : consType.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getWxCheck() {
        return wxCheck;
    }

    public void setWxCheck(String wxCheck) {
        this.wxCheck = wxCheck == null ? null : wxCheck.trim();
    }

    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus == null ? null : bindStatus.trim();
    }
}