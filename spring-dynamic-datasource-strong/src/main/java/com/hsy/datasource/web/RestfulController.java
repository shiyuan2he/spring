package com.hsy.datasource.web;
import com.hsy.datasource.service.ITActivityRecordListService;
import com.hsy.datasource.service.ITRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public Object getRegionList(@RequestParam Integer currentPage,@RequestParam Integer pageSize){
        //System.out.println(activityRecordListService.test(currentPage,pageSize).toString());
        return activityRecordListService.test(currentPage,pageSize) ;
    }

    @RequestMapping(value = "/v2/list",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object getRecordList(@RequestParam Integer currentPage,@RequestParam Integer pageSize){
        return  regionService.getAll(currentPage,pageSize) ;
    }
}
