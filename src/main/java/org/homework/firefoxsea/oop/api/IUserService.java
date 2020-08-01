package org.homework.firefoxsea.oop.api;

/**
 * @author yanghai
 * @since 2020/8/1 19:39
 */

import org.homework.firefoxsea.oop.User;

import java.util.List;

/**
 * 提供查找学生的功能
 */
public interface IUserService {

    /**
     * 按parten模糊匹配
     * @param parten
     * @return
     */
    List<User> loadStudentByName(String parten);

    /**
     * 按学校的编码查询学生
     * @param schoolIdentify
     * @return
     */
    List<User> loadStudentBySchoolIdentify(Long schoolIdentify);

    List<User> loadStudentByUserIds(List<Long> userIds);

}
