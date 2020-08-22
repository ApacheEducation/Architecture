package com.athena.entity;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/23 00:43
 */
@Data
public class Book extends BaseEntity {

    /**
     * 教材ID
     */
    private Long id;

    /**
     * 教材的名字
     */
    private String name;

    /**
     * 教材的购买链接
     */
    private String url;

    /**
     * 教材的内容
     */
    private String context;
}
