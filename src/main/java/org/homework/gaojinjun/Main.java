package org.homework.gaojinjun;

public class Main {

    public static void main(String[] args) {

        System.out.println("九九乘法表");
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println("\n");
        }
	// write your code here
    }
}
