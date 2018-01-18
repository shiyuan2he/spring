package com.hsy.spring.dynamic.datasource.aop;

import com.hsy.spring.dynamic.datasource.annotation.DynamicDataSourceAnnotation;
import com.hsy.spring.dynamic.datasource.enums.DataSourcesEnum;
import com.hsy.spring.dynamic.datasource.utils.DataSourceTypeManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.aop
 * @date 2018/1/10 9:48
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
@Aspect
@Order(0)
public class DataSourceAspect {
    private static Logger _logger = LoggerFactory.getLogger(DataSourceAspect.class) ;



    @Before("@annotation(com.hsy.spring.dynamic.datasource.annotation.DynamicDataSourceAnnotation)") //前置通知
    public void testBefore(JoinPoint point){
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        DynamicDataSourceAnnotation dataSourceAnnotation = className.getAnnotation(DynamicDataSourceAnnotation.class);
        if (dataSourceAnnotation != null ) {
            //获得访问的方法名
            String methodName = point.getSignature().getName();
            //得到方法的参数的类型
            Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
            try {
                Method method = className.getMethod(methodName, argClass);
                if (method.isAnnotationPresent(DynamicDataSourceAnnotation.class)) {
                    DynamicDataSourceAnnotation annotation = method.getAnnotation(DynamicDataSourceAnnotation.class);
                    DataSourcesEnum dataSource = annotation.dataSource() ;
                    _logger.info("【前置通知】当前数据源是({})",dataSource);
                    if(null != dataSource){
                        _logger.info("【前置通知】即将设置成数据源({})",dataSource);
                        DataSourceTypeManager.set(dataSource);
                    }else{
                        _logger.info("【前置通知】即将设置成数据源({})",DataSourcesEnum.MYSQL);
                        DataSourceTypeManager.set(DataSourcesEnum.MYSQL);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @After("@annotation(com.hsy.spring.dynamic.datasource.annotation.DynamicDataSourceAnnotation)")   //后置通知
    public void testAfter(JoinPoint point){
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        DynamicDataSourceAnnotation dataSourceAnnotation = className.getAnnotation(DynamicDataSourceAnnotation.class);
        if (dataSourceAnnotation != null ) {
            //获得访问的方法名
            String methodName = point.getSignature().getName();
            //得到方法的参数的类型
            Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
            DataSourcesEnum dataSource = null ;
            try {
                Method method = className.getMethod(methodName, argClass);
                if (method.isAnnotationPresent(DynamicDataSourceAnnotation.class)) {
                    DynamicDataSourceAnnotation annotation = method.getAnnotation(DynamicDataSourceAnnotation.class);
                    dataSource = annotation.dataSource() ;
                    _logger.info("【后置通知】当前数据源是({})",dataSource);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(dataSource != null && !DataSourcesEnum.ORACLE.equals(dataSource)) {
                _logger.info("【后置通知】即将清除数据源({})",dataSource);
                DataSourceTypeManager.clear();
            }
        }
    }


    /*@Pointcut("execution(public * com.hsy.spring.dynamic.datasource.service.ITActivityRecordListService.*(..))")
    public void dataSourceMysql(){}

    @Around("dataSourceMysql()")
    public Object before(ProceedingJoinPoint joinPoint) throws Throwable {

        _logger.info("当前数据源是（{}）",DataSourceTypeManager.get());
        if (DataSourceTypeManager.get() != DataSourcesEnum.MYSQL){
            _logger.info("正在切换成（{}）数据源",DataSourcesEnum.MYSQL);
            DataSourceTypeManager.set(DataSourcesEnum.MYSQL);
        }
        Object obj = joinPoint.proceed(joinPoint.getArgs()) ;
        _logger.info("清除数据源",DataSourcesEnum.ORACLE);
        DataSourceTypeManager.clear();

        return obj ;
    }*/
}
