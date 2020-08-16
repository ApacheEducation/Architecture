package org.file.vi;

import java.io.*;

public class WriteTeacher {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("teacher.txt"));
            Person per = new Person("aaa", 500);
//			Teacher t1 = new Teacher("bbb" , per);
//			Teacher t2 = new Teacher("ccc" , per);
//			oos.writeObject(t1);
//			oos.writeObject(t2);
            oos.writeObject(per);
//			oos.writeObject(t2);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

