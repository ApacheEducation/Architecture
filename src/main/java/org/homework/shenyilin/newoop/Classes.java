package org.homework.shenyilin.newoop;

import java.util.ArrayList;

public class Classes {
    private String className;
    private String classCode;
    private ArrayList<Student> stuList=null;
    private ArrayList<Teacher> teaList=null;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public ArrayList<Teacher> getTeaList() {
        return teaList;
    }

    public void setTeaList(ArrayList<Teacher> teaList) {
        this.teaList = teaList;
    }

    public Classes(String className,String classCode,ArrayList<Student> stuList,ArrayList<Teacher> teaList){
        this.className=className;
        this.classCode =classCode;
        this.stuList=stuList;
        this.teaList=teaList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", classCode='" + classCode + '\'' +
                ", stuList=" + stuList +
                ", teaList=" + teaList +
                '}';
    }
}
