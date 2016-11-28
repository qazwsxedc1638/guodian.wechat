package org.hdkj.wechat.bean.CustomerService;

import java.util.Date;

public class LeaveMsg {
    private String msgId;

    private String wxId;//微信openId

    private String content;//留言内容		

    private Date msgTime;//留言时间

    private String replyUserLv1;//lv1处理人

    private Date replyTimeLv1;//lv1回复时间

    private String replyState;//0,lv1未回复；1，lv1已回复；2，lv2未回复；3，lv2已回复

    private String replyUserLv2;//lv2处理人

    private String replyUserLv1Content;//lv1回复内容

    private String replyUserLv2Content;//lv2回复内容

    private Date replyTimeLv2;//lv2回复时间

    private String msgType;//消息类型

    private String workNo;//工作号

    private String islock;//是否锁定1表示已经锁定，0解锁,无数据未操作

    private String lockUserId;//锁定用户id

    private String wxPhone;//微信手机号

    private String wxHh;//户号

    private String msgCounty;//区县

    private String msgCity;//城市
    
    private String isRead;//是否已读 0为已读 1为未读

    public String getIsRead() {
		return isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId == null ? null : wxId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public String getReplyUserLv1() {
        return replyUserLv1;
    }

    public void setReplyUserLv1(String replyUserLv1) {
        this.replyUserLv1 = replyUserLv1 == null ? null : replyUserLv1.trim();
    }

    public Date getReplyTimeLv1() {
        return replyTimeLv1;
    }

    public void setReplyTimeLv1(Date replyTimeLv1) {
        this.replyTimeLv1 = replyTimeLv1;
    }

    public String getReplyState() {
        return replyState;
    }

    public void setReplyState(String replyState) {
        this.replyState = replyState == null ? null : replyState.trim();
    }

    public String getReplyUserLv2() {
        return replyUserLv2;
    }

    public void setReplyUserLv2(String replyUserLv2) {
        this.replyUserLv2 = replyUserLv2 == null ? null : replyUserLv2.trim();
    }

    public String getReplyUserLv1Content() {
        return replyUserLv1Content;
    }

    public void setReplyUserLv1Content(String replyUserLv1Content) {
        this.replyUserLv1Content = replyUserLv1Content == null ? null : replyUserLv1Content.trim();
    }

    public String getReplyUserLv2Content() {
        return replyUserLv2Content;
    }

    public void setReplyUserLv2Content(String replyUserLv2Content) {
        this.replyUserLv2Content = replyUserLv2Content == null ? null : replyUserLv2Content.trim();
    }

    public Date getReplyTimeLv2() {
        return replyTimeLv2;
    }

    public void setReplyTimeLv2(Date replyTimeLv2) {
        this.replyTimeLv2 = replyTimeLv2;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo == null ? null : workNo.trim();
    }

    public String getIslock() {
        return islock;
    }

    public void setIslock(String islock) {
        this.islock = islock == null ? null : islock.trim();
    }

    public String getLockUserId() {
        return lockUserId;
    }

    public void setLockUserId(String lockUserId) {
        this.lockUserId = lockUserId == null ? null : lockUserId.trim();
    }

    public String getWxPhone() {
        return wxPhone;
    }

    public void setWxPhone(String wxPhone) {
        this.wxPhone = wxPhone == null ? null : wxPhone.trim();
    }

    public String getWxHh() {
        return wxHh;
    }

    public void setWxHh(String wxHh) {
        this.wxHh = wxHh == null ? null : wxHh.trim();
    }

    public String getMsgCounty() {
        return msgCounty;
    }

    public void setMsgCounty(String msgCounty) {
        this.msgCounty = msgCounty == null ? null : msgCounty.trim();
    }

    public String getMsgCity() {
        return msgCity;
    }

    public void setMsgCity(String msgCity) {
        this.msgCity = msgCity == null ? null : msgCity.trim();
    }
}