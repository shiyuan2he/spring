package com.hsy.spring.dynamic.datasource.service.impl;

import com.hsy.spring.dynamic.datasource.annotation.DynamicDataSourceAnnotation;
import com.hsy.spring.dynamic.datasource.dao.TActivityRecordListMapper;
import com.hsy.spring.dynamic.datasource.dao.TRegionMapper;
import com.hsy.spring.dynamic.datasource.entity.Region;
import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;
import com.hsy.spring.dynamic.datasource.service.ITRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.service.impl
 * @date 2018/1/18 11:30
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service("regionService")
@DynamicDataSourceAnnotation
public class TRegionServiceImpl implements ITRegionService {
    @Autowired private TRegionMapper tRegionMapper ;

    @Override
    @DynamicDataSourceAnnotation(dataSource = DataSourcesEnum.ORACLE)
    @Transactional(propagation = Propagation.NESTED,readOnly = true)
    public List<Region> getAll(Integer offset, Integer limit) {
        return tRegionMapper.getAll(offset,limit);
    }
}
