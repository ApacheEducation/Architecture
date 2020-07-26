package org.language;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by yanghai on 16-6-4.
 */

public class TestOO {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream=new FileOutputStream("/media/yanghai/BAFD-A1A6/aaaaaa");
        long start=System.nanoTime();
        outputStream.write("aaaaa".getBytes());//44775
        outputStream.flush();                  //179868
                                               //2887868
        System.out.println(System.nanoTime()-start);
    }

}
