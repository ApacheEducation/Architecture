package org.staticblock;


/**
 * Created by yanghai on 17-1-7.
 */

class Car{

    private static int c1;
    private static int c2;
    static{
        c2=0;
    }
    private static Car s;
    static{
        s=new Car();
    }
    private Car(){
        c1++;
        c2++;
    }
    public static Car getInstance(){
        return s;
    }
    public static void dis(){
        System.out.println("c1: "+c1+"\t c2: "+c2);
    }
}

class Sigleton{
    private static int c1;
    private static int c2=0;
    private static Sigleton s=new Sigleton();
    private Sigleton(){
        c1++;
        c2++;
    }
    public static Sigleton getInstance(){
        return s;
    }
    public static void dis(){
        System.out.println("c1: "+c1+"\t c2: "+c2);
    }
}
public class Test1{
    public static void main(String[] args) {
        Sigleton s= Sigleton.getInstance();
        Sigleton.dis();
    }

}

