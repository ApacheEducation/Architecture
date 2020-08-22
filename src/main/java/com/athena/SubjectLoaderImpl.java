package com.athena;

import com.athena.api.ISubjectLoader;
import com.athena.entity.Subject;
import com.onix.AthenaDb;

import java.util.Objects;

/**
 * @author yanghai
 * @since 2020/8/23 01:26
 */
public class SubjectLoaderImpl implements ISubjectLoader {

    @Override
    public Subject getSubjectById(Long id) {
        if (null == id) {
            return null;
        }
        return AthenaDb.DB_SUBJECTS.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
    }
}
