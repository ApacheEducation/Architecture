package org.architecture.baselanugage;

import java.util.Scanner;

/**
 * @author yanghai
 * @since 2020/7/19 18:29
 */
public class Andromeda {
    
    public int mode() {
        /**
         * code
         */
        return 0;
    }

    public static void main(String[] args) {

        //for循环
//        for (int i = 0; i < 100; i++) {
//            //do somethings
//        }
        //while
//        while (true) {
//            //do somethings
//        }
        //do...while
//        do {
//            //do somethings
//        } while (true);

        //switch结构
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            //if结构
            if (input == 1 || input == 2 || input == 3) {
                System.out.println("input is small number");
            } else if (input == 90){
                System.out.println("input is big number");
            } else {
                System.out.println("input number is not Adapt");
            }

            switch (input) {
                case 1:
                    System.out.println("input is small number");
                case 2:
                    System.out.println("input is small number");
                case 3:
                    System.out.println("input is small number");
                case 90:
                    System.out.println("input is big number");
                default:
                    System.out.println("input number is not Adapt");
            }
        } else {
            System.out.println("input error is not number");
        }
    }
}
