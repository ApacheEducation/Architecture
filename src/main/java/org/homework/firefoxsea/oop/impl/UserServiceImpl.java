package org.homework.firefoxsea.oop.impl;

import org.homework.firefoxsea.common.CommonLib;
import org.homework.firefoxsea.oop.User;
import org.homework.firefoxsea.oop.api.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/1 19:41
 */
public class UserServiceImpl implements IUserService {


    @Override
    public List<User> loadStudentByName(String parten) {
        /**
         * 去学生的列表里查找
         */
        List<User> users = CommonLib.users;
        List<User> ret = new ArrayList<>();
        for (User user: users) {
            boolean contains = user.getName().contains(parten);
            if (contains) {
                ret.add(user);
            }
        }
        return ret;
    }

    @Override
    public List<User> loadStudentBySchoolIdentify(Long schoolIdentify) {
        List<User> users = CommonLib.users;
        List<User> ret = new ArrayList<>();
//        for (User user: users) {
//            if (user.getSchoolIdentify().equals(schoolIdentify)) {
//                ret.add(user);
//            }
//        }
        return ret;
    }

    @Override
    public List<User> loadStudentByUserIds(List<Long> userIds) {
        /**
         *
         */
        return new ArrayList<>();
    }
}
