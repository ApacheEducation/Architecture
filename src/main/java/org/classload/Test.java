package org.classload;

/**
 * Created by yanghai on 16-8-28.
 */
class Ttt{
    static{
        System.out.println("xxxxx");
    }
    public static void dis(){

    }

}
class Ttt1 extends Ttt{
    static{
        System.out.println("11111");
    }
    public static void aaa(){

    }

}
public class Test  {

    public static void main(String[] args) {
        Ttt1.dis();
    }
}
