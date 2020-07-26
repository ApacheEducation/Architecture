package org.gc;

import java.lang.ref.*;
//虚引用其实就没有被引用，必须与引用队列合并使用，当监控对象被回收，系统会向引用队列投放一个引用对象（无堆）
//因此用于监控对象的回收用
public class PhantomReferenceTest {
    public static void main(String[] args)
            throws Exception {
        String str = new String("xxxxx");
        ReferenceQueue rq = new ReferenceQueue();
        PhantomReference pr = new PhantomReference(str, rq);
        System.out.println(pr.get());
        str = null;
        System.out.println(pr.get());
        System.out.println(rq.poll());
//        System.out.println(rq.poll()== pr);
        System.gc();
        System.runFinalization();
//        System.out.println(rq.poll() == pr);
        System.out.println(rq.poll());
    }
}
