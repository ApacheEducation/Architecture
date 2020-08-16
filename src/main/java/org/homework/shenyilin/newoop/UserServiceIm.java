package org.homework.shenyilin.newoop;

import java.util.ArrayList;
import java.util.List;
import sun.awt.geom.AreaOp;

public class UserServiceIm implements IUserService {
    @Override
    public ArrayList<Province> LoadProvinceByCode(ArrayList<Province> p, String code) {
        ArrayList<Province> provinces=new ArrayList<>();
        for (int i=0;i<p.size();i++){
            if (p.get(i).getpCode().contains(code)){
                provinces.add(p.get(i));
            }
        }

        return provinces;
    }

    @Override
    public ArrayList<School> LoadSchoolByCode(ArrayList<Province> p, String code) {
        ArrayList<School> schools=new ArrayList<>();
        for (int i=0;i<p.size();i++){
            for (int j=0;j<p.get(i).getSchools().size();j++){
                if (p.get(i).getSchools().get(j).getSchoolCode().contains(code)) {
                    schools.add(p.get(i).getSchools().get(j));
                }
            }
        }
        return schools;
    }

    @Override
    public ArrayList<Classes> LoadClassByCode(ArrayList<Province> p, String code) {
        ArrayList<Classes> classess=new ArrayList<Classes>();
        for (int i=0;i<p.size();i++){
            for (int j=0;j<p.get(i).getSchools().size();j++){
                for(int k=0;k<p.get(i).getSchools().get(j).getClassess().size();k++){
                    if (p.get(i).getSchools().get(j).getClassess().get(k).getClassCode().contains(code)) {
                        classess.add(p.get(i).getSchools().get(j).getClassess().get(k)) ;
                    }
                }
            }
        }

        return classess;
    }

    @Override
    public ArrayList<Student> LoadStudentByCode(ArrayList<Province> p,String code) {
//        ArrayList<Province> provinces = new ArrayList<Province>();
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < p.get(i).getSchools().size(); j++) {
                for (int k = 0; k < p.get(i).getSchools().get(j).getClassess().size(); k++) {
                    for (int l = 0; l < p.get(i).getSchools().get(j).getClassess().get(k).getStuList().size(); l++) {
                        if (p.get(i).getSchools().get(j).getClassess().get(k).getStuList().get(l).getCode().contains(code)) {
                            students.add(p.get(i).getSchools().get(j).getClassess().get(k).getStuList().get(l));
                        }
                    }
                }
            }
        }
        return students;
    }

    @Override
    public ArrayList<Teacher> LoadTeacherByCode(ArrayList<Province> p, String code) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        for (int i=0;i<p.size();i++){
            for (int j=0;j<p.get(i).getSchools().size();j++){
                for(int k=0;k<p.get(i).getSchools().get(j).getClassess().size();k++) {
                    for (int l=0;l<p.get(i).getSchools().get(j).getClassess().get(k).getTeaList().size();l++){
                        if (p.get(i).getSchools().get(j).getClassess().get(k).getTeaList().get(l).getCode().contains(code)) {
                            teachers.add(p.get(i).getSchools().get(j).getClassess().get(k).getTeaList().get(l));
                        }
                    }
                }
            }
        }
        return teachers;
    }
}
