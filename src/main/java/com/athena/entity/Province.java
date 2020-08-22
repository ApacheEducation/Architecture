package com.athena.entity;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/23 00:11
 */
@Data
public class Province extends BaseEntity {

    /**
     * 省的编码
     */
    private Long id;

    /**
     * 省的名字
     */
    private String name;

    /**
     * 省的别称
     */
    private String alias;

    /**
     * 省的简称
     */
    private String abbreviation;
}
