package org.mythread.ii;

import java.util.*;

public class SleepTest {
    public static void main(String[] args)
            throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间: " + new Date());
            Thread.sleep(1000);
        }
    }
}

