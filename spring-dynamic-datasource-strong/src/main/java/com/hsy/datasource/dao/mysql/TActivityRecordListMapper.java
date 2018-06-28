package com.hsy.datasource.dao.mysql;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.hsy.datasource.entity.ActivityRecordlist;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.apache.ibatis.annotations.Param;

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
public interface TActivityRecordListMapper {

    PageList<ActivityRecordlist> getAll(PageBounds pageBounds,Map<String, Object> map) ;
}
