package com.athena.entity;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/23 00:28
 */
@Data
public class Teacher extends User {

    /**
     * 毕业的大学
     */
    private Long graduationId;

    /**
     * 婚姻状态
     */
    private Boolean marriage;

    /**
     * 擅长的科目
     */
    private Long subjectId;
}
