package org.test;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

/**
 * Created by yanghai on 16-5-7.
 */
public class MyTest {

    public static void main(String[] args) {
        byte b=1;
        short a=2;
        int i=0;
        long o=22;
        float f=1.0f;
        double d=1.0;
        boolean bb=true;
        char c=12;
        String str="111";
        String str1=new String("111");
        System.out.println(str==str1);
        int[] ii=new int[20];
        ii[0]=1;
        MyTest[] myTests=new MyTest[100000];
        myTests[0]=new MyTest();

    }
}
