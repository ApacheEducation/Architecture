package org.language;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by yanghai on 16-8-2.
 */
class MyException extends Exception{
    public MyException(String xxx) {
        super(xxx);
    }
}
class Opt {
    public int div(int i, int j) {
        int b = 0;  //load 0;  movl 0,%eax ;load b; movl %eax,b;
        b++;
        int a = 0;

        a++;

        int c = a + b;


        try {
            System.out.println("bbbbbbb");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("aaaaaa");

        }
        System.out.println();
        return 1;
    }

    public void xxx(Collection list) {

    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        Opt opt=new Opt();
        for (int i=0;i<10000;i++) {
            int c = opt.div(1, 2);
//        try {
//            c = opt.div(b,a);
//            System.out.println("pppppppp");
//            return;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("xxxxxx");
//        }
//        opt.xxx(new HashSet());
            System.out.println(c);
        }


    }
}
