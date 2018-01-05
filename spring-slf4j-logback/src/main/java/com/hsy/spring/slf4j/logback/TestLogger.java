package com.hsy.spring.slf4j.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.slf4j.logback
 * @date 2018/1/5 17:16
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class TestLogger {
    private static final Logger _logger = LoggerFactory.getLogger(TestLogger.class) ;
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            _logger.info("服务器日志{}",i);
        }
    }
}
