package org.file.vi;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("WriteObject.txt"));
            Teacher per = new Teacher("aaa");
//            Person per1 = new Person("aaa", 500);
            oos.writeObject(per);
//			oos.writeObject(per1);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

