package org.homework.firefoxsea.oop.impl;

import org.homework.firefoxsea.common.CommonLib;
import org.homework.firefoxsea.oop.SchoolUserRef;
import org.homework.firefoxsea.oop.api.ISchoolUserRefService;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/1 20:01
 */
public class SchoolUserRefServiceImpl implements ISchoolUserRefService {

    @Override
    public List<SchoolUserRef> loadSchoolUserRefBySchoolIdentifyId(Long schoolIdentifyId) {
        List<SchoolUserRef> schoolUserRefs = CommonLib.schoolUserRefs;
        return schoolUserRefs;
    }
}
