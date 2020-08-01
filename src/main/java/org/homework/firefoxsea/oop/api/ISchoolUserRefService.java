package org.homework.firefoxsea.oop.api;

import org.homework.firefoxsea.oop.SchoolUserRef;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/1 20:00
 */
public interface ISchoolUserRefService {

    List<SchoolUserRef> loadSchoolUserRefBySchoolIdentifyId(Long schoolIdentifyId);
}
