package org.gc;

import org.openjdk.jol.info.ClassLayout;
//对应openjdk源码：openjdk/hotspot/src/share/vm/oops/markOop.hpp
public class ClassLayer {
    private int a;
    private String str="abcccc";
    public Object xxx(int a,Object c){
        return new Object();
    }
    public static Object xxx(float a,Object c){
        return new Object();
    }
    public static void main(String[] args) throws InterruptedException {
        ClassLayer classLayer=new ClassLayer();
        System.out.println(ClassLayout.parseInstance(classLayer).toPrintable());
        synchronized (classLayer){
            System.out.println(ClassLayout.parseInstance(classLayer).toPrintable());
//            Thread.sleep(10000);
        }
    }
}
