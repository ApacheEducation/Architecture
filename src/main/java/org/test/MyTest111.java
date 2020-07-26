package org.test;

/**
 * Created by yanghai on 17-2-18.
 */
//abstract class Thread11{
//    public void start0(){
//        run();
//    }
//    public abstract void run();
//
//}
//interface Xxx{
//    void run();
//}
//class MyThread11111 implements Xxx{
//
//    @Override
//    public void run() {
//        System.out.println("aaaaa");
//    }
//}
class Lock{
    public static int i=10;
    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    private Object lock;

}
class MyThread2 extends Thread{
    public MyThread2(Lock l){
        this.lock=l;
    }
    private Lock lock;
    public void run(){
        synchronized (Lock.class) {
            Lock.i++;
        }
    }
}
public class MyTest111 {

    public static void main(String[] args) {
        Lock l=new Lock();
        MyThread2 t1=new MyThread2(l);
        MyThread2 t2=new MyThread2(l);
        long l1=System.nanoTime();


    }
}
