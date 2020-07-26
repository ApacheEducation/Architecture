package org.mythread.vii;

class Task implements Runnable {

    ThreadLocal<Boolean> flag = new ThreadLocal<Boolean>();
    private String name = "";

    public Task() {
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        flag.set(true);
        while (flag.get()) {
            System.out.println(Thread.currentThread().getName());
            if (name.equals(Thread.currentThread().getName())) {
                flag.set(false);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(String threadName) {
        this.name = threadName;
    }
}

public class StopTest {
    public static void main(String[] args) {
        Task t = new Task();
        Thread t1 = new Thread(t, "aaaaaaaaa");
        t1.start();
        Thread t2 = new Thread(t, "bbbbbbbbb");
        t2.start();
        t.stop("aaaaaaaaa");

    }
}
