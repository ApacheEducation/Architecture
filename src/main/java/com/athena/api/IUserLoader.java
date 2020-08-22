package com.athena.api;

import com.athena.entity.*;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:45
 */
public interface IUserLoader {

    User getUserById(Long id);

    Teacher getTeacherByTid(Long tid);

    Student getStudentBySid(Long sid);

    List<User> getUserByType(String type);

    List<User> getUserBySchoolId(Long schoolId);

    List<User> getUserByProvinceId(Long provinceId);
}
