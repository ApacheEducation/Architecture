package com.athena.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author yanghai
 * @since 2020/8/23 00:21
 */
@Data
public class School extends BaseEntity{

    /**
     * 学校的编码
     */
    private Long id;

    /**
     * 学校的省编码
     */
    private Long provinceId;

    /**
     * 学校的等级
     */
    private Long level;

    /**
     * 学校的名字
     */
    private String name;

    /**
     * 学校的别称
     */
    private String alias;

    /**
     * 学校的简称
     */
    private String abbreviation;
}
