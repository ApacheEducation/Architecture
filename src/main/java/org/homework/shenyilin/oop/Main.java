package org.homework.shenyilin.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void initInput() {
        System.out.println("1.输入省市编码");
        System.out.println("2.输入学校编码");
        System.out.println("3.输入班级编码");
        System.out.println("4.输入学生编码");
        System.out.println("5.输入教师编码");
    }

    public static void main(String[] args) {
        int num = 0;
        ArrayList<Province> provinces = new ArrayList<Province>();
        for (int l = 1; l <= 5; l++) {
            ArrayList<School> schools = new ArrayList<School>();
            for (int k = 1; k < 9; k++) {
                ArrayList<Classes> classess = new ArrayList<Classes>();
                for (int j = 1; j <= 10; j++) {
                    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
                    ArrayList<Student> students = new ArrayList<Student>();
                    for (int i = 1; i < 11; i++) {
                        students.add(new Student("学生" + l + k + j + i, "10" + l + k + j + i));
                    }
                    for (int i = 1; i < 6; i++) {
                        teachers.add(new Teacher("教师" + l + k + j + i, "20" + l + k + j + i));
                    }
                    classess.add(new Classes("班级" + l + k + j, "30" + l + k + j, students, teachers));
                }
                schools.add(new School("学校" + l + k, "40" + l + k, classess));
            }
            provinces.add(new Province("省" + l, "50" + l, schools));
        }
        initInput();
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        switch (in) {
            case 1:
                System.out.println("请输入省的编码：");
                Scanner sc1 = new Scanner(System.in);
                String pr = sc1.next();
                for (int i = 0; i < provinces.size(); i++) {
                    if (provinces.get(i).getpCode().contains(pr)) {
                        Province p = provinces.get(i);
                        System.out.println(p.getpName());
                        for (int j = 0; j < p.getSchools().size(); j++) {
                            System.out.println(p.getSchools().get(j).getSchoolName() + "     学校代码：" + p.getSchools().get(j).getSchoolCode());
                        }
                    }
                }
                break;
            case 2:
                System.out.println("请输入学校的编码：");
                Scanner sc2 = new Scanner(System.in);
                String sch = sc2.next();
                for (int i = 0; i < provinces.size(); i++) {
                    for (int j = 0; j < provinces.get(i).getSchools().size(); j++) {
                        if (provinces.get(i).getSchools().get(j).getSchoolCode().contains(sch)) {
                            School p = provinces.get(i).getSchools().get(j);
                            System.out.println(provinces.get(i).getpName());
                            System.out.println(p.getSchoolName() + "     学校代码：" + p.getSchoolCode());
                        }
                    }
                }
                break;
            case 3:
                System.out.println("请输入班级的编码：");
                Scanner sc3 = new Scanner(System.in);
                String cla = sc3.next();
                for (int i = 0; i < provinces.size(); i++) {
                    for (int j = 0; j < provinces.get(i).getSchools().size(); j++) {
                        for (int k = 0; k < provinces.get(i).getSchools().get(j).getClassess().size(); k++) {
                            if (provinces.get(i).getSchools().get(j).getClassess().get(k).getClassCode().contains(cla)) {
                                Classes p = provinces.get(i).getSchools().get(j).getClassess().get(k);
                                System.out.println(provinces.get(i).getpName());
                                System.out.println(provinces.get(i).getSchools().get(j).getSchoolName() + "     学校代码：" + provinces.get(i).getSchools().get(j).getSchoolCode());
                                System.out.println(p.getClassName() + "     班级编码" + p.getClassCode());
                            }
                        }
                    }
                }
                break;
            case 4:
                System.out.println("请输入学生的编码：");
                Scanner sc4 = new Scanner(System.in);
                String stu = sc4.next();
                for (int i = 0; i < provinces.size(); i++) {
                    for (int j = 0; j < provinces.get(i).getSchools().size(); j++) {
                        for (int k = 0; k < provinces.get(i).getSchools().get(j).getClassess().size(); k++) {
                            for (int l = 0; l < provinces.get(i).getSchools().get(j).getClassess().get(k).getStuList().size(); l++) {
                                if (provinces.get(i).getSchools().get(j).getClassess().get(k).getStuList().get(l).getCode().contains(stu)) {
                                    Student p = provinces.get(i).getSchools().get(j).getClassess().get(k).getStuList().get(l);
                                    System.out.println(provinces.get(i).getpName());
                                    System.out.println(provinces.get(i).getSchools().get(j).getSchoolName() + "     学校代码：" + provinces.get(i).getSchools().get(j).getSchoolCode());
                                    System.out.println(provinces.get(i).getSchools().get(j).getClassess().get(k).getClassName() + "     班级编码" + provinces.get(i).getSchools().get(j).getClassess().get(k).getClassCode());
                                    System.out.println(p.getName() + "   编码" + p.getCode() + "    地址" + p.getAddr() + "   性别" + p.getSex());
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                System.out.println("请输入教师的编码：");
                Scanner sc5 = new Scanner(System.in);
                String tea = sc5.next();
                for (int i = 0; i < provinces.size(); i++) {
                    for (int j = 0; j < provinces.get(i).getSchools().size(); j++) {
                        for (int k = 0; k < provinces.get(i).getSchools().get(j).getClassess().size(); k++) {
                            for (int l = 0; l < provinces.get(i).getSchools().get(j).getClassess().get(k).getTeaList().size(); l++) {
                                if (provinces.get(i).getSchools().get(j).getClassess().get(k).getTeaList().get(l).getCode().contains(tea)) {
                                    Teacher p = provinces.get(i).getSchools().get(j).getClassess().get(k).getTeaList().get(l);
                                    System.out.println(provinces.get(i).getpName());
                                    System.out.println(provinces.get(i).getSchools().get(j).getSchoolName() + "     学校代码：" + provinces.get(i).getSchools().get(j).getSchoolCode());
                                    System.out.println(provinces.get(i).getSchools().get(j).getClassess().get(k).getClassName() + "     班级编码" + provinces.get(i).getSchools().get(j).getClassess().get(k).getClassCode());
                                    System.out.println(p.getName() + "   编码" + p.getCode() + "    科目" + p.getSubject1() + "   性别" + p.getSex());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                break;
        }
    }
}
