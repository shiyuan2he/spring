package com.hsy.spring.dynamic.datasource.service;

import com.hsy.spring.dynamic.datasource.entity.ActivityRecordlist;

import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.service
 * @date 2018/1/18 11:30
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public interface ITActivityRecordListService {

    List<ActivityRecordlist> test(Integer offset, Integer limit) ;
}
