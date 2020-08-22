package com.athena.api;

import com.athena.entity.School;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:52
 */
public interface ISchoolLoader {

    List<School> getSchoolByProvinceId(Long provinceId);

    School getSchoolById(Long schoolId);
}
