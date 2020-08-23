package com.athena.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author yanghai
 * @since 2020/8/23 00:36
 */
@Data
public class UserRef extends BaseEntity {

    private String id;

    private Long teacherId;

    private Long studentId;
}
