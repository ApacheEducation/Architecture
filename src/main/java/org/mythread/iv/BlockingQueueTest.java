package org.mythread.iv;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.*;

public class BlockingQueueTest {
    public static void main(String[] args)
            throws Exception {

        ArrayList list1=new ArrayList();
        list1.add("aaa");


        CopyOnWriteArrayList list =new CopyOnWriteArrayList();
        list.add("a");
        ConcurrentHashMap map=new ConcurrentHashMap();
        map.put("","");



        // 定义一个长度为2的阻塞队列
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);

        bq.put("Java");
//        bq.put("Java");
//        bq.put("Java");
//        System.out.println(bq.take());
//        bq.offer("aaa");
//        bq.offer("aaa");
        boolean b=bq.offer("aaa");
        System.out.println(bq.poll());
//        System.out.println(b);
    }
}
