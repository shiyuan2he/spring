package com.hsy.datasource.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.hsy.datasource.annotation.DynamicDataSourceAnnotation;
import com.hsy.datasource.annotation.MysqlRepository;
import com.hsy.datasource.dao.mysql.TActivityRecordListMapper;
import com.hsy.datasource.dao.oracle.TRegionMapper;
import com.hsy.datasource.entity.ActivityRecordlist;
import com.hsy.datasource.entity.Region;
import com.hsy.datasource.service.ITActivityRecordListService;
import com.hsy.datasource.service.ITRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;

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
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service(value = "activityRecordListService")
@DynamicDataSourceAnnotation
public class TActivityRecordListServiceImpl implements ITActivityRecordListService {
    @Autowired
    private TActivityRecordListMapper tActivityRecordListMapper ;

    @Autowired
    private TRegionMapper tRegionMapper;

    @Autowired private ITRegionService regionService ;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public PageList<ActivityRecordlist> test(Integer currentPage, Integer limit) {
        PageBounds pageBounds = new PageBounds();
        pageBounds.setLimit(limit);
        pageBounds.setPage(currentPage);
        pageBounds.setContainsTotalCount(true);
        PageList<ActivityRecordlist>  list = tActivityRecordListMapper.getAll(pageBounds,new HashMap<String,Object>());

        //PageList<Region> regionList = tRegionMapper.getAll(pageBounds,new HashMap<String,Object>());
        PageList<Region> regionList = regionService.getAll(currentPage,limit);
        return list;
    }
}
