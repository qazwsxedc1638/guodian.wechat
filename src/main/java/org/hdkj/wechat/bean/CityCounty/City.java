package org.hdkj.wechat.bean.CityCounty;

public class City {
    private String ddKey;

    private String ddValue;

    public String getDdKey() {
        return ddKey;
    }

    public void setDdKey(String ddKey) {
        this.ddKey = ddKey == null ? null : ddKey.trim();
    }

    public String getDdValue() {
        return ddValue;
    }

    public void setDdValue(String ddValue) {
        this.ddValue = ddValue == null ? null : ddValue.trim();
    }

}