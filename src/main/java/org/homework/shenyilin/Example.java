package org.homework.shenyilin;
import java.util.Scanner;

public class Example {

    public static Boolean IsNumeric(String str){
        for(int i=str.length();--i>=0;){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer num1 = 0;
        int exc;
        String str_b;
        char[] ch_b;
        String[] str_array = new String[3];


        Scanner scan1 = new Scanner(System.in);
        // 从键盘接收数据
        System.out.println("请按顺序输入十进制、需要转换的进制（如BIN、OCT、HEX及DEFINE）、自定义数制");
        for (int i = 0; i < 3; i++) {
            str_array[i] = scan1.next();
        }
        if (!IsNumeric(str_array[0])) {
            System.out.println("输入的数据有误！");
        } else {
            num1=Integer.valueOf(str_array[0]);
            if (str_array[1].equals("BIN")) {
                exc = 2;
            } else if (str_array[1].equals("OCT") ) {
                exc = 8;
            } else if (str_array[1].equals("HEX")) {
                exc = 16;
            } else {
                exc = 1;
            }
            switch (exc) {
                case 2:
                    str_b = Integer.toBinaryString(num1);
                    ch_b = str_b.toCharArray();
                    for (int i = 0; i < ch_b.length; i++) {
                        System.out.print(ch_b[i] + "\t");
                    }
                    System.out.print("B\n");
                    break;
                case 8:
                    str_b = Integer.toOctalString(num1);
                    System.out.println("八制数据为" + str_b + "Q");
                    break;
                case 16:
                    str_b = Integer.toHexString(num1);
                    System.out.println("十六制数据为" + str_b + "H");
                    break;
                default:
                    if (IsNumeric(str_array[2])) {
                        int i=Integer.valueOf(str_array[2]);
                        str_b=Integer.toString(num1,i);
                        System.out.println(str_array[2] + "制数据为" +str_b  );
                    } else System.out.println("输入进制数据错误！");

            }
        }



        scan1.close();
    }
}
