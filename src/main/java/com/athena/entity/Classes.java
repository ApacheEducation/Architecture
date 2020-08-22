package com.athena.entity;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/23 01:14
 */
@Data
public class Classes extends BaseEntity {

    private Long id;

    /**
     * 班级的学校ID
     */
    private Long schoolId;

    /**
     * 班级的年级
     */
    private Integer level;

    /**
     * 班级的名称
     */
    private String name;

    /**
     * 班级的学生人数
     */
    private String count;

    /**
     * 班级的口号
     */
    private String posterCard;
}
