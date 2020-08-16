package org.file.ii;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by yanghai on 16-4-23.
 */
public class FileOutputStreamTest2 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = null;
        try {
            fos = new FileOutputStream("/data/bbbbb.txt");
            String str = "测试程序sjklsjkls;kjsg;kjsjlgsd";
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                System.out.println("aaaaaa");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.in.read();
        System.out.println("bbbbbb");
    }
}
