package com.hsy.datasource.dao.oracle;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.hsy.datasource.entity.Region;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
public interface TRegionMapper {

    PageList<Region> getAll(PageBounds pageBounds, Map<String, Object> map) ;
}
