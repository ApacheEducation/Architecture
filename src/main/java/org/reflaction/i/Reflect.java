package org.reflaction.i;

import java.lang.reflect.Constructor;

//接口应用子对象
public class Reflect{
    static public void main(String[] args) {
        try {
//            Reflect reflect=new Reflect();
//            System.out.println(reflect instanceof Object);
//            System.out.println(reflect.getClass()==new Object().getClass());
            Class c = Class.forName("org.reflaction.i.Y");// X
            Constructor cc=c.getConstructor();
            XY t1 = (XY) cc.newInstance();
            XY t = (XY) c.newInstance(); // 反射相应的一个子类对象


            t.show(); // 动态运行不同类的方法
            XY x = new X(); // X Class
            Class xc = Class.forName("org.reflaction.i.X");
            System.out.println(xc.isInstance(x));// true
            System.out.println(t instanceof XY); // true
//            System.out.println(t instanceof X); // false
//            System.out.println(t instanceof Y);// true
//            System.out.println(t.getClass()==Y.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
