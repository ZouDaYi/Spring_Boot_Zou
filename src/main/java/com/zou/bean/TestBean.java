package com.zou.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public class TestBean {
    @Value("${spring.mail.username}")
    String tempStrng;

    @Value("${ranLong}")
    String tempLong;

    @Value("${ranNum}")
    Integer tempInt;
    public String getTempStrng() {
        return tempStrng;
    }

    public void setTempStrng(String tempStrng) {
        this.tempStrng = tempStrng;
    }

    public String getTempLong() {
        return tempLong;
    }

    public void setTempLong(String tempLong) {
        this.tempLong = tempLong;
    }

    public Integer getTempInt() {
        return tempInt;
    }

    public void setTempInt(Integer tempInt) {
        this.tempInt = tempInt;
    }
}
