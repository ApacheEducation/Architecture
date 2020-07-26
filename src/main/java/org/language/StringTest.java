package org.language;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yanghai on 16-8-2.
 */
public class StringTest {
    public static void main(String[] args) {
//        int i=0;
//        Integer ii=1;
//        ii.toString();
//
//        int b=Integer.parseInt("1")+1;
//        double c=(double)1+1;
//        Integer.valueOf("",1);
//        byte[] a=new byte[10];
//        char b1='a';
//        String str=new String();
//        System.out.println(i+"");//new Integer(i);i.toString();
//        byte[] cc="adfadsf".getBytes();
//        //add
//        BigDecimal bd=new BigDecimal(0.11111111);
//        BitSet bs=new BitSet();
//        bs.set(0,true);

//        Date d=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        System.out.println(sdf.format(d));
//
//        try {
//            Date dd=sdf.parse("afasdasdsadf");
//            System.out.println(dd);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //1970
        int j=0;
        long start=System.nanoTime();
        new StringTest();                //2468   514759
//        for(int i=0;i<10000;i++){//93115
//            j++;
//        }
//        System.out.println("aaa"); //217936
        long end=System.nanoTime();
        System.out.println(end-start);
    }
}
