package com.hsy.datasource.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.hsy.datasource.entity.Region;

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
public interface ITRegionService {
    PageList<Region> getAll(Integer offset, Integer limit) ;
}
