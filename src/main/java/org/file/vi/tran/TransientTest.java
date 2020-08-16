package org.file.vi.tran;

import java.io.*;

public class TransientTest {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tran.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tran.txt"));
            Person per = new Person("aaa", 500);
            oos.writeObject(per);
            Person p = (Person) ois.readObject();
            System.out.println(p.getName());
            System.out.println(p.getAge());
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
