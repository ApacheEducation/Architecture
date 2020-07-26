package org.gc;

import java.lang.ref.*;
//弱引用只要垃圾回收就会被回收
public class WeakReferenceTest {
    public static void main(String[] args)
            throws Exception {
        String str = new String("xxxx");
        WeakReference wr = new WeakReference(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.runFinalization();
        System.out.println(wr.get());
    }
}
