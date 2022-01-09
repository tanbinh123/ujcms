package com.ujcms.core.domain.base;

import org.springframework.lang.Nullable;

/**
 * This class was generated by MyBatis Generator.
 *
 * @author MyBatis Generator
 */
public class GroupBase {
    /**
     * 数据库表名
     */
    public static final String TABLE_NAME = "group";

    /**
     * 用户组ID
     */
    private int id = 0;

    /**
     * 名称
     */
    private String name = "";

    /**
     * 描述
     */
    @Nullable
    private String description;

    /**
     * 类型(1:系统,2:常规,3:IP组)
     */
    private short type = 2;

    /**
     * 排序
     */
    private short order = 32767;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public short getOrder() {
        return order;
    }

    public void setOrder(short order) {
        this.order = order;
    }
}