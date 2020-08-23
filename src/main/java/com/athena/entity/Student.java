package com.athena.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yanghai
 * @since 2020/8/23 00:28
 */
@Data
public class Student extends User implements Serializable {

    private static final long serialVersionUID = -807676971379854606L;
    /**
     * 班级的编号
     */
    private Long classesId;

    /**
     * 学生的年级
     */
    private Integer level;

    /**
     * 各科的总分
     */
    private Long score;

    /**
     * 学生排名
     */
    private Long ranking;

    /**
     * 家庭经济背景
     */
    private Integer economy;
}
