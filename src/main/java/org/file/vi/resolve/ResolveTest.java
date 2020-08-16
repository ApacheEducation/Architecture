package org.file.vi.resolve;

import java.io.*;

public class ResolveTest {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("tran.txt"));
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("tran.txt"));
            oos.writeObject(Orientation.HORIZONTAL);
            oos.writeObject(Orientation.VERTICAL);
            Orientation ori = (Orientation) ois.readObject();
            System.out.println(ori == Orientation.HORIZONTAL);
            Orientation ori1 = (Orientation) ois.readObject();
            System.out.println(ori1 == Orientation.VERTICAL);
            ois.close();
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}