package org.mythread.vi;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args)
            throws Exception {
        // 创建足够的线程来支持4个CPU并行的线程池
        // 创建一个具有固定线程数（6）的线程池

        ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool2 = Executors.newScheduledThreadPool(100);
        ExecutorService pool3 = Executors.newSingleThreadExecutor();

        ExecutorService pool4 = new ThreadPoolExecutor(16, 16,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());


        ExecutorService pool = Executors.newFixedThreadPool(2);
        // 使用Lambda表达式创建Runnable对象
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()
                            + "的i值为:" + i);
                }
            }


        };
        // 向线程池中提交两个线程
        pool.execute(target);
        pool.submit(target);

        Thread.sleep(5000);
        pool.execute(target);
        // 关闭线程池
        pool.shutdown();
//        pool.execute(target);
    }
}

