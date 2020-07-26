package org.mythread.ii;

import java.util.Random;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    public void run() {
//        for (int i = 0; i < 100; i++) {
////            System.out.println(getName() + "  " + i);
//        }
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.println(this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new JoinThread("新线程").start();
        for (int i = 0; i < 100; i++) {
//            if (i == 20) {
            JoinThread jt = new JoinThread("被Join的线程"+i);
            jt.start();
            jt.join();
//            System.out.println("xxxx");

//            }

        }
    }
}
