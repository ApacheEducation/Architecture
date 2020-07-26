package org.reflaction.i;

import java.lang.reflect.*;

public class ArrayTest3 {
    @SuppressWarnings("unchecked")
    public static <T> T[] newInstance(Class<T> componentType, int length) {
        return (T[]) Array.newInstance(componentType, length);  //①
    }

    public static void main(String[] args) {
        String[] arr = ArrayTest3.newInstance(String.class, 10);
        int[][] intArr = ArrayTest3.newInstance(int[].class, 5);
//		int[][] test= new int[5][];
        arr[5] = "xxxx";
        intArr[1] = new int[]{23, 12};
        System.out.println(arr[5]);
        System.out.println(intArr[1][1]);
    }
}
