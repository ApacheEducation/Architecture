package org.homework.shenyilin.newoop;

import java.util.ArrayList;

public interface IUserService {
    //学生查询
    ArrayList<Student> LoadStudentByCode(ArrayList<Province> p,String code);
    ArrayList<Teacher> LoadTeacherByCode(ArrayList<Province> p,String code);
    ArrayList<Classes> LoadClassByCode(ArrayList<Province> p,String code);
    ArrayList<School>   LoadSchoolByCode(ArrayList<Province> p,String code);
    ArrayList<Province> LoadProvinceByCode(ArrayList<Province> p,String code);
}
