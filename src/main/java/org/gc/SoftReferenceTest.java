package org.gc;

import java.lang.ref.SoftReference;

/**
 * Created by yanghai on 16-4-26.
 */
//软引用必须内存不够才会被回收
public class SoftReferenceTest {
    public static void main(String[] args) {
        String str = new String("xxxx");
        SoftReference wr = new SoftReference(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.runFinalization();
        System.out.println(wr.get());
    }
}
