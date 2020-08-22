package com.athena;

import com.athena.api.IUserRefLoader;
import com.athena.entity.UserRef;
import com.onix.AthenaDb;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 01:31
 */
public class UserRefLoaderImpl implements IUserRefLoader {

    @Override
    public List<Long> getRefsByTid(Long tid) {
        if (null == tid) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_USE_REFS.stream().filter(it -> Objects.equals(it.getTeacherId(), tid)).map(UserRef::getStudentId).collect(Collectors.toList());
    }

    @Override
    public List<Long> getRefsBySid(Long sid) {
        if (null == sid) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_USE_REFS.stream().filter(it -> Objects.equals(it.getStudentId(), sid)).map(UserRef::getTeacherId).collect(Collectors.toList());

    }
}
