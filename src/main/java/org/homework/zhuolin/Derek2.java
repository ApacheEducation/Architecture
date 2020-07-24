package org.homework.zhuolin;
import java.util.Scanner;

/**
 * 1、进制转换有问题，不是自己实现的
 * 2、整体的代码格式有不足的地方
 */
public class Derek2
{
    public static void main (String[] args) {
        int i;
        char[] str;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制数");
        int num = sc.nextInt();
        String a = sc.nextLine();


        if (a.trim().equals("BIN")) {
            String b = Integer.toBinaryString(num);
            str = b.toCharArray();
            for (i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.print("\n");
        } else if (a.trim().equals("OCT")) {
            String b = Integer.toOctalString(num);
            System.out.println("八进制" + "\t" + b);
        } else if (a.trim().equals("HEX")) {
            String b = Integer.toHexString(num);
            System.out.println("十六进制" + "\t" + b);
        }

    }
}