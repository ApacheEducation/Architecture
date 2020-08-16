package org.homework.shenyilin.newoop;

import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void initInput(){
        System.out.println("1.输入省市编码");
        System.out.println("2.输入学校编码");
        System.out.println("3.输入班级编码");
        System.out.println("4.输入学生编码");
        System.out.println("5.输入教师编码");
    }

    public static void main(String[] args) {
        int num=0;
        ArrayList<Province> provinces=new ArrayList<Province>();
        for (int l=1;l<=5;l++) {
            ArrayList<School> schools = new ArrayList<School>();
            for (int k = 1; k < 9; k++) {
                ArrayList<Classes> classess = new ArrayList<Classes>();
                for (int j = 1; j <= 10; j++) {
                    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
                    ArrayList<Student> students = new ArrayList<Student>();
                    for (int i = 1; i < 11; i++) {
                        students.add(new Student("学生" + l+ k + j + i, "10" + l+ k + j + i));
                    }
                    for (int i = 1; i < 6; i++) {
                        teachers.add(new Teacher("教师" + l+ k + j + i, "20" + l+ k + j + i));
                    }
                    classess.add(new Classes("班级" + l+ k + j, "30" +l+ k +  j, students, teachers));
                }
                schools.add(new School("学校" + l+ k, "40" +l+  k, classess));
            }
            provinces.add(new Province("省"+l,"50"+l,schools));
        }
        initInput();
        UserServiceIm userService=new UserServiceIm();
        Scanner sc = new Scanner(System.in);
        int in=sc.nextInt();

        switch (in){
            case 1:
                System.out.println("请输入省的编码：");
                Scanner sc1 = new Scanner(System.in);
                String pr=sc1.next();
                ArrayList<Province> pro=userService.LoadProvinceByCode(provinces,pr);
                System.out.println(pro.toString());

                break;
            case 2:
                System.out.println("请输入学校的编码：");
                Scanner sc2 = new Scanner(System.in);
                String sch=sc2.next();
                ArrayList<School> schools=userService.LoadSchoolByCode(provinces,sch);
                System.out.println(schools.toString());

                break;
            case 3:
                System.out.println("请输入班级的编码：");
                Scanner sc3 = new Scanner(System.in);
                String cla=sc3.next();
                ArrayList<Classes> clas=userService.LoadClassByCode(provinces,cla);
                System.out.println(clas.toString());

                break;
            case 4:
                System.out.println("请输入学生的编码：");
                Scanner sc4 = new Scanner(System.in);
                String stu=sc4.next();
//                UserServiceIm userService=new UserServiceIm();
                ArrayList<Student> str=userService.LoadStudentByCode(provinces,stu);
                System.out.println(str.toString());

                break;
            case 5:
                System.out.println("请输入教师的编码：");
                Scanner sc5 = new Scanner(System.in);
                String tea=sc5.next();
                ArrayList<Teacher> teac=userService.LoadTeacherByCode(provinces,tea) ;
                System.out.println(teac.toString());

                break;
            default:
                break;

        }



    }
//    private void initTeacher(){
//
//    }

}
