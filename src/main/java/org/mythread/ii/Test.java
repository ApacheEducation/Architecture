package org.mythread.ii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by yanghai on 16-8-9.
 */
class A extends Thread {
    public A(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(this.getName());
            Contral.cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}

class B extends Thread {
    public B(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(this.getName());
            Contral.cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class C extends Thread {
    public C(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(this.getName());
            Contral.cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Contral extends Thread {
    public static CountDownLatch cdl;
    public HashMap getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    private HashMap<String, Thread> hashMap;

    public void run() {
        Set<String> keys=hashMap.keySet();
        int i=keys.size();
        cdl=new CountDownLatch(i);
        for (String key : keys) {
            Thread t = hashMap.get(key);
            System.out.println("aaaaaaaaaa"+key);
            t.start();
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<HashMap> level = new ArrayList<HashMap>();
        HashMap<String, Thread> hashMap = new HashMap<String, Thread>();
        A a = new A("a");
        B b = new B("b");
        C c = new C("c");
        hashMap.put("A", a);
        level.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("B", b);
        level.add(hashMap2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("C", c);
        level.add(hashMap1);
        for (HashMap obj : level) {
            Contral ct = new Contral();
            System.out.println(obj);
            ct.setHashMap(obj);
            ct.start();
            try {
                ct.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("xxx");
        }
    }

}

//        HashMap level=new HashMap();
//        for(){
//            HashMap hashMap = new HashMap();
//            for() {
//
//                hashMap.put()
//            }
//            level.put()
//
//        }
class Nose{

}

class TT{
    public Nose getAaa() {
        return aaa;
    }

    public void setAaa(Nose aaa) {
        this.aaa = aaa;
    }

    private Nose aaa;
}
class TTTT{
    public static void main(String[] args) {
        Nose n=new Nose();
        TT t=new TT();
        t.setAaa(n);

        int money=0;


        int i=money--;
        String name=Thread.currentThread().getName();
        int i1=money--;
        String name1=Thread.currentThread().getName();
        String str=":";
        String str1=":";



        String outstr1=name+str+i;
        String outstr=name+str+i;
        System.out.println(outstr);
        System.out.println(outstr1);


    }
}