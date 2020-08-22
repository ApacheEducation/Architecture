package com.athena;

import com.athena.api.IUserLoader;
import com.athena.entity.*;
import com.onix.AthenaDb;
import org.apache.commons.lang3.StringUtils;


import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 01:28
 */
public class UserLoaderImpl implements IUserLoader {
    @Override
    public User getUserById(Long id) {
        if (null == id) {
            return null;
        }
        User teacher = AthenaDb.DB_TEACHERS.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
        if (null != teacher) {
            return teacher;
        }
        return AthenaDb.DB_STUDENTS.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
    }

    @Override
    public Teacher getTeacherByTid(Long tid) {
        if (null == tid) {
            return null;
        }
        return AthenaDb.DB_TEACHERS.stream().filter(it -> Objects.equals(it.getId(), tid)).findFirst().orElse(null);
    }

    @Override
    public Student getStudentBySid(Long sid) {
        if (null == sid) {
            return null;
        }
        return AthenaDb.DB_STUDENTS.stream().filter(it -> Objects.equals(it.getId(), sid)).findFirst().orElse(null);

    }

    @Override
    public List<User> getUserByType(String type) {
        if (StringUtils.isBlank(type)) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_USERS.stream().filter(it -> Objects.equals(it.getType(), type)).collect(Collectors.toList());
    }

    @Override
    public List<User> getUserBySchoolId(Long schoolId) {
        if (null == schoolId) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_USERS.stream().filter(it -> Objects.equals(it.getSchoolId(), schoolId)).collect(Collectors.toList());
    }

    @Override
    public List<User> getUserByProvinceId(Long provinceId) {
        if (null == provinceId) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_USERS.stream().filter(it -> Objects.equals(it.getProvinceId(), provinceId)).collect(Collectors.toList());

    }
}
