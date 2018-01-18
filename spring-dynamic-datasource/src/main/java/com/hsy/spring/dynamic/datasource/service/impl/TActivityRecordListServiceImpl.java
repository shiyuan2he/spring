package com.hsy.spring.dynamic.datasource.service.impl;

import com.hsy.spring.dynamic.datasource.annotation.DynamicDataSourceAnnotation;
import com.hsy.spring.dynamic.datasource.dao.TActivityRecordListMapper;
import com.hsy.spring.dynamic.datasource.dao.TRegionMapper;
import com.hsy.spring.dynamic.datasource.entity.ActivityRecordlist;
import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;
import com.hsy.spring.dynamic.datasource.service.ITActivityRecordListService;
import com.hsy.spring.dynamic.datasource.service.ITRegionService;
import com.hsy.spring.dynamic.datasource.utils.DataSourceTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.service.impl
 * @date 2018/1/18 11:31
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service("activityRecordListService")
@DynamicDataSourceAnnotation
public class TActivityRecordListServiceImpl implements ITActivityRecordListService {
    @Autowired
    private TActivityRecordListMapper tActivityRecordListMapper ;

    @Autowired private ITRegionService regionService ;

    @Override
    @DynamicDataSourceAnnotation(dataSource = DataSourcesEnum.MYSQL)
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<ActivityRecordlist> test(Integer offset, Integer limit) {
        List<ActivityRecordlist> list = tActivityRecordListMapper.getAll(offset,limit);
        System.out.println(regionService.getAll(offset, limit)) ;
        return list;
    }
}
