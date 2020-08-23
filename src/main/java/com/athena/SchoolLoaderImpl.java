package com.athena;

import com.athena.api.ISchoolLoader;
import com.athena.entity.School;
import com.onix.AthenaDb;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 00:53
 */
public class SchoolLoaderImpl implements ISchoolLoader {

    @Override
    public List<School> getSchoolByProvinceId(Long provinceId) {
        if (null == provinceId) {
            return Collections.emptyList();
        }
        //找数据的过程换成去数据库里面找是不是就可以了
        return AthenaDb.DB_SCHOOLS.stream().filter(it -> Objects.equals(it.getProvinceId(), provinceId)).collect(Collectors.toList());
    }

    @Override
    public School getSchoolById(Long schoolId) {
        if (null == schoolId) {
            return null;
        }
        return AthenaDb.DB_SCHOOLS.stream().filter(it -> Objects.equals(it.getId(), schoolId)).findFirst().orElse(null);
    }
}
