package com.athena.entity;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/23 00:37
 */
@Data
public class Subject extends BaseEntity {

    private Long id;

    /**
     * 科目名称
     */
    private String name;

    /**
     * 科目的年级
     */
    private Integer level;

    /**
     * 关联的教材
     */
    private Long bookId;
}
