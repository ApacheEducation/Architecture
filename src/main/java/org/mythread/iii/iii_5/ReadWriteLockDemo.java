package org.mythread.iii.iii_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Data data = new Data();
        Worker t1 = new Worker(data,true);
        Worker t2 = new Worker(data,true);
        t1.start();
        t2.start();


//        Data data = new Data();
//        Worker t1 = new Worker(data,false);
//        Worker t2 = new Worker(data,true);
//
//        t2.start();
//        t1.start();

    }

    static class Worker extends Thread {
        Data data;
        boolean read;

        public Worker(Data data, boolean read) {
            this.data = data;
            this.read = read;
        }

        public void run() {
            if (read)
                data.get();
            else
                data.set();
        }
    }

    static class Data {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock read = lock.readLock();
        Lock write = lock.writeLock();
        public  void set() {
            write.lock();
            System.out.println(Thread.currentThread().hashCode()
                    + " set:begin " + sdf.format(new Date()));

            try {
                Thread.sleep(5000);
                //
            } catch (Exception e) {

            } finally {
                System.out.println(Thread.currentThread().hashCode() + " set:end "
                        + sdf.format(new Date()));
                write.unlock();
            }


        }

        public  int get() {
            read.lock();
            System.out.println(Thread.currentThread().hashCode()
                    + " get :begin " + sdf.format(new Date()));
            try {
                Thread.sleep(5000);
                //
            } catch (Exception e) {

            } finally {
                System.out.println(Thread.currentThread().hashCode() + " get :end "
                        + sdf.format(new Date()));
                read.unlock();
            }


            return 1;
        }
    }
}
