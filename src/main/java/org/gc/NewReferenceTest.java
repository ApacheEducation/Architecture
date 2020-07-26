package org.gc;

/**
 * Created by yanghai on 16-4-26.
 */
//抢引用必须断开指针才能被回收
public class NewReferenceTest {
    public static void main(String[] args) {
        String str=new String("xxxxx");
        str=null;
        System.gc();
        System.runFinalization();
        System.out.println(str);
    }
}
