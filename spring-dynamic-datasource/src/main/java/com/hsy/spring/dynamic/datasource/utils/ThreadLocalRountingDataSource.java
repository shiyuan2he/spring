package com.hsy.spring.dynamic.datasource.utils;

import com.hsy.spring.dynamic.datasource.aop.DataSourceAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.utils
 * @date 2018/1/10 9:36
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class ThreadLocalRountingDataSource extends AbstractRoutingDataSource {
    private static Logger _logger = LoggerFactory.getLogger(DataSourceAspect.class) ;
    @Override
    protected Object determineCurrentLookupKey() {
        _logger.info("当前数据源是({})", DataSourceTypeManager.get());
        return DataSourceTypeManager.get();
    }
}
