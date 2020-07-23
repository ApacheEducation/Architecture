package org.homework.shenyilin;

public class Main {

    public static void main(String[] args) {
        int j=0,m=0;
        //for
        for (int i=0;i<100;i++) {
            if (i % 2 == 0)
                System.out.print(i+"\t");
        }
        System.out.print("\n");
        //while
        while (j<100) {
            if (j % 2 == 0)
                System.out.print(j + "\t");
            j++;
        }
        System.out.print("\n");
        //do while
        do{
            if (m % 2 == 0)
                System.out.print(m + "\t");
            m++;
        }while (m<100);
        System.out.print("\n");

        for (int i=1;i<=9;i++)
        {
            for (int k=1;k<=i;k++) {
                m = i * k;
                System.out.print(k + "*" + i + "=" + m+"\t");
            }
            System.out.print("\n");
        }

        // write your code here
    }
}
