package org.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by yanghai on 16-8-17.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        Properties p=new Properties();
        p.load(new FileInputStream("/disk/test/iotest/src/org/prop/test.properties"));
        System.out.println(p.getProperty("host"));
    }
}
