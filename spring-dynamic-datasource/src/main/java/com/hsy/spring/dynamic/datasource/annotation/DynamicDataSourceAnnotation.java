package com.hsy.spring.dynamic.datasource.annotation;

import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path htjf/com.hengtianjf.business.pof.annotation
 * @date 2018/1/18 14:03
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface DynamicDataSourceAnnotation {
    //dataSource 自定义注解的参数
    DataSourcesEnum dataSource() default DataSourcesEnum.ORACLE;
}
