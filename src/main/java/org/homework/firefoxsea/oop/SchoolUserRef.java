package org.homework.firefoxsea.oop;

import lombok.Data;

/**
 * @author yanghai
 * @since 2020/8/1 19:58
 * 学校和用户的对应关系
 */
@Data
public class SchoolUserRef {

    private String id;

    private Long schoolIdentifyId;

    private Long userId;
}
