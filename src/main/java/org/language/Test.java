package org.language;

import java.io.*;
import java.util.*;
interface Buy{
    void buy(String str, int a);
}
interface Sell{
    void sell();
}
abstract class TT{
    public String login(){
        return "";
    }
}
class Taobao extends TT implements Buy,Sell{
    private int a=0;
    @Override
    public void buy(String str, int a) {
        System.out.println("taobao buy");
    }

    @Override
    public void sell() {
        System.out.println("taobao sell");
    }
}

class JD implements Buy,Sell{

    @Override
    public void buy(String str, int a) {
        System.out.println("jd buy");
    }
    @Override
    public void sell() {
        System.out.println("jd sell");
    }
}
class AA{
    public final void xxx(){

    }
}








public class Test {
   static int q;


    public static void main(String[] args) throws IOException {

        ArrayList l=new ArrayList<>();
        l.add("");
        Buy bb= new Buy() {
            @Override
            public void buy(String str, int a) {
                System.out.println("xxxx");
            }
        };
        bb.buy("",1);//地址
    Sell cc=(JD)bb;
//////        b.buy("",1);
//////        Sell c=(Sell)b;
//////        c.sell();
////        int a=1;
//        Buy[] buys=new Buy[10];
//        buys[0]=new JD();
//        buys[1]=new Taobao();
        String a="1234";
        String b=new String("1234");
        String d=new String(a);
        System.out.println(a==(1234+""));
        String c="12"+"34";
        System.out.println(a==b.intern());
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a==d);
        System.out.println(b.equals(c));

    }
}
