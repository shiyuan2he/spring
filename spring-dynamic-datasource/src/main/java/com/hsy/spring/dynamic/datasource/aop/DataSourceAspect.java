package com.hsy.spring.dynamic.datasource.aop;

import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;
import com.hsy.spring.dynamic.datasource.utils.DataSourceTypeManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.aop
 * @date 2018/1/10 9:48
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
@Aspect
@Order(0)
public class DataSourceAspect {
    @Pointcut("execution(public * com.hsy.spring.dynamic.datasource.dao.TActivityRecordListMapper.*(..))")
    public void dataSourceMysql(){}

    @Before("dataSourceMysql()")
    public void before(JoinPoint jp) {
        DataSourceTypeManager.set(DataSourcesEnum.MYSQL);
    }

    @Pointcut("execution(public * com.hsy.spring.dynamic.datasource.dao.TRegionMapper.*(..))")
    public void dataSourceOracle(){}

    @Before("dataSourceOracle()")
    public void beforeDb(JoinPoint jp) {
        DataSourceTypeManager.set(DataSourcesEnum.ORACLE);
    }
}
