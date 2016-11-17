package org.hdkj.wechat.bean.MyElec;

import java.util.Date;

public class DateAmt {
    private String quantityId;//用电ID

    private String consNo;//户号

    private Integer quantity;//电量

    private Date quantityDate;//用电时间

    public String getQuantityId() {
        return quantityId;
    }

    public void setQuantityId(String quantityId) {
        this.quantityId = quantityId == null ? null : quantityId.trim();
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo == null ? null : consNo.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getQuantityDate() {
        return quantityDate;
    }

    public void setQuantityDate(Date quantityDate) {
        this.quantityDate = quantityDate;
    }
}