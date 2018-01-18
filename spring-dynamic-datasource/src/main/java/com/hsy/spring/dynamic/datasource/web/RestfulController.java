package com.hsy.spring.dynamic.datasource.web;

import com.hsy.spring.dynamic.datasource.dao.TActivityRecordListMapper;
import com.hsy.spring.dynamic.datasource.dao.TRegionMapper;
import com.hsy.spring.dynamic.datasource.service.ITActivityRecordListService;
import com.hsy.spring.dynamic.datasource.service.ITRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.web
 * @date 2018/1/10 13:51
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RestController
public class RestfulController {

    @Autowired private ITActivityRecordListService activityRecordListService ;
    @Autowired private ITRegionService regionService ;
    @RequestMapping(value = "/v1/list",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object getRegionList(){
        System.out.println( activityRecordListService.test(1,5).toString());
        return activityRecordListService.test(1,5) ;
    }

    @RequestMapping(value = "/v2/list",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object getRecordList(){
        System.out.println( regionService.getAll(1,5).toString());
        return  regionService.getAll(1,5) ;
    }
}
