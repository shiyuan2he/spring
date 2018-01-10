package com.hsy.spring.dynamic.datasource.dao;

import com.hsy.spring.dynamic.datasource.entity.ActivityRecordlist;
import com.hsy.spring.dynamic.datasource.entity.Region;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.dao
 * @date 2018/1/10 9:55
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public interface TActivityRecordListMapper {

    List<ActivityRecordlist> getAll(@Param(value = "offset") Integer offset, @Param(value = "limit") Integer limit) ;
}
