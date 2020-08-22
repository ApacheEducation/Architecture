package com.athena.entity;

import java.sql.Date;

/**
 * @author yanghai
 * @since 2020/8/23 00:38
 */
public class BaseEntity {

    Boolean disabled;

    /**
     * 创建时间
     */
    Date createTime;

    /**
     * 更新时间
     */
    Date updateTime;
}
