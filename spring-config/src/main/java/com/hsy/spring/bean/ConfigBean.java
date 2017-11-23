package com.hsy.spring.bean;
import org.springframework.beans.factory.annotation.Autowired;
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
//@Component
public class ConfigBean {
    //@Value("#{config.name}")
    private String name ;
    //@Value("#{config.age}")
    private Integer age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //@PostConstruct
    public void init() {
        System.out.println("ConfigBean======================"+name+age) ;
    }

}
