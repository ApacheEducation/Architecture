package org.homework.shenyilin.newoop;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private String schoolCode;
    private ArrayList<Classes> classess=null;

    public ArrayList<Classes> getClassess() {
        return classess;
    }

    public void setClassess(ArrayList<Classes> classess) {
        this.classess = classess;
    }



    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public  School(String name,String code,ArrayList<Classes> classes){
        this.schoolName=name;
        this.schoolCode=code;
        this.classess=classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", classess=" + classess +
                '}';
    }
}
