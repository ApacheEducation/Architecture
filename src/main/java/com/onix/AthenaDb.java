package com.onix;

import com.athena.entity.*;


import java.util.ArrayList;
import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:54
 */
public class AthenaDb {

    public static List<Province> DB_PROVINCES = new ArrayList<>();
    public static List<School> DB_SCHOOLS = new ArrayList<>();
    public static List<Classes> DB_CLASSES = new ArrayList<>();
    public static List<Student> DB_STUDENTS = new ArrayList<>();
    public static List<Teacher> DB_TEACHERS = new ArrayList<>();
    public static List<User> DB_USERS = new ArrayList<>();
    public static List<UserRef> DB_USE_REFS = new ArrayList<>();
    public static List<Subject> DB_SUBJECTS = new ArrayList<>();
    public static List<Book> DB_BOOKS = new ArrayList<>();

    /**
     * 初始化数据
     */
    static void init() {

    }
}
