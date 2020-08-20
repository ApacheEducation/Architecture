package org.file.vi;

import java.io.*;

public class ReadTeacher {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(
//				new FileInputStream("teacher.txt"));
                    new FileInputStream("/Users/yanghai/Documents/easyarArchitecture/Architecture/WriteObject.txt"));
//			System.out.println(ois.available());
            Teacher t1 = (Teacher) ois.readObject();
            System.out.println(t1.getName());
//			Teacher t2 = (Teacher)ois.readObject();
//			Person p = (Person)ois.readObject();
//			Teacher t3 = (Teacher)ois.readObject();
//			System.out.println("t1的student引用和p是否相同："
//				+ (t1.getStudent() == p));
//			System.out.println("t2的student引用和p是否相同："
//				+ (t2.getStudent() == p));
//			System.out.println("t2和t3是否是同一个对象："
//				+ (t2 == t3));
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
