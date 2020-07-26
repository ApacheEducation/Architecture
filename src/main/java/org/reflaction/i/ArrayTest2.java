package org.reflaction.i;

import java.lang.reflect.*;

public class ArrayTest2 {
    public static void main(String args[]) {
        Object arr = Array.newInstance(String.class, 3, 4, 10);
        Object arrObj = Array.get(arr, 2);   //2 后面是个二维数组
        Array.set(arrObj, 2, new String[]  //2 2 后面是个数组，其中0是aaa 1是bbb
                {
                        "aaa",
                        "bbb"
                });
        Object anArr = Array.get(arrObj, 3); //2 3后面是个数组
        Array.set(anArr, 8, "ccc");        //2 3 8 是ccc
        String[][][] cast = (String[][][]) arr;
        System.out.println(cast[2][3][8]);
        System.out.println(cast[2][2][0]);
        System.out.println(cast[2][2][1]);
    }
}

