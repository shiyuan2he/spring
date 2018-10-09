package com.hsy.spring.redis.dao.string;

import com.hsy.spring.redis.dao.BaseRedisRepositoryTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.redis.dao
 * @date 2018/7/24 10:13
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath*:/spring/applicationContext.xml"})
@Slf4j
public class HashRedisRepositoryTest extends BaseRedisRepositoryTest {
    @Autowired private HashRedisRepository hashStringRepository;

    private String hashKey = "hash:" ;
    @Test
    public void testPutAll(){
        hashStringRepository.putAll(hashKey, generateMapForString(), true);
    }


}