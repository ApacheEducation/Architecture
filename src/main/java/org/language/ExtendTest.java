package org.language;

import java.util.Random;

/**
 * Created by yanghai on 16-8-2.
 */
class FFF{
    public static final int i=1;
    public static int j=1000;
    static {
//        i=1;
        System.out.println("adfadfadfasdf");
    }
    public void dis(){
        final int i=0;
//        i++;
    }
//    public String name="fffff";
//    public static void dis(){
//        System.out.println("aaaa");
//    }
}
class SSS extends FFF{
//    public static int i;
    static {
//        i=2;
        System.out.println("pppppp");
    }
//    public String name="sssss";
//    public static void dis(){
//        System.out.println("bbbb");
//    }
}
public class ExtendTest {
    public static void main(String[] args) {
//        SSS f=new SSS();
//        System.out.println(f.name);
        System.out.println(FFF.i);
    }


}
