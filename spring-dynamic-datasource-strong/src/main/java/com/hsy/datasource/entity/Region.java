package com.hsy.datasource.entity;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path spring/com.hsy.spring.dynamic.datasource.entity
 * @date 2018/1/10 9:52
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class Region {
    /**
     * id:地区id.
     */
    private int id;

    /**
     * code:地区编号.
     */
    private String code;

    /**
     * name:地区名称.
     */
    private String name;

    /**
     * parentId:所属身份Id(相当于code)
     */
    private String parentId;

    /**
     * 获取 id:地区id.
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置 id:地区id.
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取 code:地区编号.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 code:地区编号.
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 name:地区名称.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name:地区名称.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 parentId:所属身份Id(相当于code)
     * @return the parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置 parentId:所属身份Id(相当于code)
     * @param parentId the parentId to set
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
