package com.athena.entity;


import java.sql.Date;

/**
 * @author yanghai
 * @since 2020/8/23 00:16
 */
public class User extends BaseEntity{

    /**
     * 编号
     */
    Long id;

    /**
     * 省编码
     */
    Long provinceId;

    /**
     * 学校的编码
     */
    Long schoolId;

    /**
     * 用户的类型
     * TEACHER: 老师
     * STUDENT: 学生
     */
    String type;

    /**
     * 名字
     */
    String name;

    /**
     * 性别
     */
    String sex;

    /**
     * 年龄
     */
    Integer age;

    /**
     * 学历
     */
    Integer level;

    /**
     * 地址
     */
    String address;
}
