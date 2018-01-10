package com.hsy.spring.dynamic.datasource.utils;

import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.utils
 * @date 2018/1/10 9:28
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class DataSourceTypeManager {
    private static final ThreadLocal<DataSourcesEnum> dataSourceTypes = new ThreadLocal<DataSourcesEnum>(){
        @Override
        protected DataSourcesEnum initialValue(){
            return DataSourcesEnum.MYSQL;
        }
    };

    public static DataSourcesEnum get(){
        return dataSourceTypes.get();
    }

    public static void set(DataSourcesEnum dataSourceType){
        dataSourceTypes.set(dataSourceType);
    }

    public static void reset(){
        dataSourceTypes.set(DataSourcesEnum.MYSQL);
    }
}
