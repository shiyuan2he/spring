package com.hsy.datasource.utils;

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
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceTypeManager.get();
    }
}
