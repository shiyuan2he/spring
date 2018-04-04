package com.hsy.datasource.service.impl;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.hsy.datasource.annotation.DynamicDataSourceAnnotation;
import com.hsy.datasource.annotation.OracleRepository;
import com.hsy.datasource.dao.oracle.TRegionMapper;
import com.hsy.datasource.entity.ActivityRecordlist;
import com.hsy.datasource.entity.Region;
import com.hsy.datasource.service.ITRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
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
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service(value = "regionService")
@DynamicDataSourceAnnotation
public class TRegionServiceImpl implements ITRegionService {
    @Autowired
    private TRegionMapper tRegionMapper;

    @Override
    @Transactional(propagation = Propagation.NESTED, readOnly = true)
    public PageList<Region> getAll(Integer currentPage, Integer limit) {
        PageBounds pageBounds = new PageBounds();
        pageBounds.setLimit(limit);
        pageBounds.setPage(currentPage);
        pageBounds.setContainsTotalCount(true);
        PageList<Region>  list = tRegionMapper.getAll(pageBounds,new HashMap<String,Object>());
        return list;
    }
}
