package com.athena.api;

import com.athena.entity.Subject;

/**
 * @author yanghai
 * @since 2020/8/23 00:46
 */
public interface ISubjectLoader {

    Subject getSubjectById(Long id);
}
