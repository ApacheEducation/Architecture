package com.athena.api;

import com.athena.entity.Classes;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 01:16
 */
public interface IClassesLoader {

    Classes getClassesById(Long id);

    List<Classes> getClassesBySchoolId(Long schoolId);
}
