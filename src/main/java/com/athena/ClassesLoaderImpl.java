package com.athena;

import com.athena.api.IClassesLoader;
import com.athena.entity.Classes;
import com.onix.AthenaDb;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 01:23
 */
public class ClassesLoaderImpl implements IClassesLoader {
    @Override
    public Classes getClassesById(Long id) {
        if (null == id) {
            return null;
        }
        return AthenaDb.DB_CLASSES.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
    }

    @Override
    public List<Classes> getClassesBySchoolId(Long schoolId) {
        if (null == schoolId) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_CLASSES.stream().filter(it -> Objects.equals(it.getSchoolId(), schoolId)).collect(Collectors.toList());
    }
}
