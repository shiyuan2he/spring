package com.hsy.spring.dynamic.datasource.dao;

import com.hsy.spring.dynamic.datasource.entity.ActivityRecordlist;
import com.hsy.spring.dynamic.datasource.entity.Region;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.dao
 * @date 2018/1/10 11:47
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class TRegionMapperTest {
    private final static Logger _logger = LoggerFactory.getLogger(TRegionMapperTest.class) ;
    @Autowired
    private TRegionMapper tRegionMapper ;

    @Test
    public void testGetAll(){
        List<Region> list = tRegionMapper.getAll(1,5) ;
        for (Region bean : list){
            _logger.info(bean.toString()) ;
        }
    }
}
