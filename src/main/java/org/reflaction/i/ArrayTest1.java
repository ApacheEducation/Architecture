package org.reflaction.i;

import java.lang.reflect.*;

public class ArrayTest1 {
    public static void main(String args[]) {
        try {
//            int[] a=new int[10];
//            int char long short double float boolean
            Object arr = Array.newInstance(String.class, 10);
            //String []arr=new String[10];
            Array.set(arr, 5, "aaaa");
            Array.set(arr, 6, "bbbbbb");
            Object book1 = Array.get(arr, 5);
            Object book2 = Array.get(arr, 6);
            System.out.println(book1);
            System.out.println(book2);
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
