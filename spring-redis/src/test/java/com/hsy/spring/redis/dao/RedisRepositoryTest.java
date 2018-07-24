package com.hsy.spring.redis.dao;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.redis.dao
 * @date 2018/7/23 18:42
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration("src/main/webapp")
@ContextConfiguration({"classpath*:/spring/applicationContext.xml"})
public class RedisRepositoryTest {

    @Autowired private RedisRepository redisRepository;
    @Test
    public void testSetString(){
        redisRepository.putCache("test:set:name","robot");
    }
}