package org.reflaction;

import java.lang.reflect.Field;

/**
 * Created by yanghai on 16-8-1.
 */
public class Testks {
    public static void main(String[] args) throws Exception {
        String a="abc";        Field ch=a.getClass().getDeclaredField("value");
        ch.setAccessible(true);
        char[] chr= (char[]) ch.get(a);
        chr[0]='1';
        System.out.println("abc");
    }
}
