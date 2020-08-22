package com.athena.api;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:47
 */
public interface IUserRefLoader {

    List<Long> getRefsByTid(Long tid);

    List<Long> getRefsBySid(Long sid);
}
