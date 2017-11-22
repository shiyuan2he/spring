package com.hsy.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.bean
 * @date 2017/11/21 16:41
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
public class ConfigBean2 {
    @Value("${my.email}")
    private String email;
    @Value("${my.qq}")
    private Integer qq ;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    @PostConstruct
    public void init(){
        System.out.println("ConfigBean2======================"+email+qq) ;
    }
}
