package org.homework.gaojinjun;

import java.util.Scanner;

public class JinZhi {

    public static void main(String args[]){
        System.out.println("请输入一个整数");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("请输入要转换成几进制（例如：转换成二进制请输入“2”）");
        Scanner jin =new Scanner(System.in);
        int a=in.nextInt();
        if( a == 2 ){
            System.out.println("十进制转换二进制:"+JinZhi2(num));
        }else if (a == 8){
            System.out.println("十进制转换八进制:"+JinZhi8(num));
        }else if (a == 16){
            System.out.println("十进制转换十六进制:"+JinZhi16(num));
        }else{
            System.out.println("第二次数据输入错误，进制转换出错，请重新输入");
        }
       /* System.out.println("十进制转换二进制:"+JinZhi2(num));
        System.out.println("十进制转换八进制:"+JinZhi8(num));
        System.out.println("十进制转换3进制:"+JinZhi3(num));
        System.out.println("十进制转换十六进制:"+JinZhi16(num));*/
        System.out.println("请输入3，进行十进制转换三进制");
        Scanner san =new Scanner(System.in);
        int t=in.nextInt();
        if( t == 3 ){
            System.out.println("十进制转换三进制:"+JinZhi3(num));
        }else {
            System.out.println("第三次数据输入错误，进制转换出错，请重新输入");
        }

    }
    public static String JinZhi3(int num){
        String JieGuo = "";
        char[] b=JieGuo.toCharArray();
        int YuShu = 0;

        while(num >= 1){
            YuShu = num % 3 ;
            num = num / 3;
            JieGuo = YuShu + JieGuo;
        }

        return JieGuo;

    }
    public static String JinZhi8(int num){
        String JieGuo = "";
        char[] b=JieGuo.toCharArray();
        int YuShu = 0;

        while(num >= 1){
            YuShu = num % 8;
            num = num / 8;
            JieGuo = YuShu + JieGuo;
        }

        return JieGuo;

    }
    public static String JinZhi2(int num){
        String JieGuo = "";
        int YuShu = 0;

        while(num >= 1){
            YuShu = num % 2;
            num = num / 2;
            JieGuo = YuShu + JieGuo;
        }

        return JieGuo;


    }
    public static String JinZhi16(int num){
        String JieGuo = "";
        int YuShu = 0;


        while(num >= 1){
            YuShu = num % 16;

            char result;

            num = num / 16;
            if (YuShu>=9){
                result = (char) ('A'+(YuShu - 10));
            }
            else {
                result = (char) ('0'+(YuShu - 0));
            }
            JieGuo = result + JieGuo;
        }

        return JieGuo;
    }



}

