package org.mythread.iv.iv_1;

/**
 * Created by yanghai on 16-5-8.
 */
public class Test {
//    wait，notify，notifyAll必须在当前线程获得监视器时才能调用，即这些方法必须在同步块中才能调用。
//    被阻塞的线程在被notify之后，并不是马上可以执行，而是“可执行”，要到获得锁之后才能真正开始执行。
    public static void main(String[] args) throws Exception {
        final Object lock="";
        Thread t1=new Thread(){
            public void run(){
                try {
                    System.out.println("t1 wait begin");
                    synchronized (lock) {
                        //
                        System.out.println("t1 get lock, wait begin");
                        lock.wait();
                        System.out.println("t1 wait end,release lock");
                        lock.notifyAll();
//                        lock.notify();
                    }
                    System.out.println("t1  wait end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        System.out.println("t1 start and sleep");
        for(int i=0;i<10000001;i++){
            if(i==10000000)
                System.out.println("i end");
        }
        Thread.sleep(5000);
        System.out.println("sleep(5000) end");

        System.out.println("main lock begin");
        synchronized (lock) {
            System.out.println("main get lock");
            lock.notify();
            System.out.println("notify");
            Thread.sleep(10000);
            System.out.println("sleep 10000 end");
            System.out.println("main wait begin ");


            lock.wait();

            System.out.println("main wait end");
        }
        System.out.println("main lock end");
    }
}  
