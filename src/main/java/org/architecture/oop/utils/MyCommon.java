package org.architecture.oop.utils;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.*;

/**
 * @author yanghai
 * @since 2020/8/2 19:43
 */
public class MyCommon {

    public static void main(String[] args) {

        /**
         * 自己实现一个大数组   功能添加，查找，动态扩容
         * 自己实现一个链表     功能添加，查找
         */

        //大数组
        List<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("third");

        for (String text : arrayList) {
            System.out.println(text);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //链表
        List<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("first");
        System.out.println(linkedList);


        //list ---》 元素是有序 可以重复

        // key --> value  map
        //                    --> key(hashcode())
        // key --> null   set

        //Set(K-null) 散列(hashcode())表   元素的无序,不能重复
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("first");
        linkedHashSet.add("second");
        linkedHashSet.add("third");
        linkedHashSet.add("fourth");
        System.out.println("LinkedHashSet ==> " + linkedHashSet.toString());

        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        hashSet.add("fourth");
        Iterator<String> iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

//        System.out.println(hashSet.size());


        //散列表 Node  Entry<K, V>
        Map<String, String> map = new HashMap<>();
        // key-->value =====> Entry
        map.put("url", "https://bing.com");
        map.put("name", "yanghai");
        map.put("password", "123456");
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println("keys -->" + keys);
        Collection<String> values = map.values();
        System.out.println("values -->" + values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("entries --->" + entries.toString());



        //Queue  队列   Stack 栈
        Queue queue = new ArrayDeque();
        queue.offer("aaaa");
        queue.poll();


        //栈 先来晚走 晚来先走
        Stack<String> stack = new StringStack();
        stack.push("");  //进栈
        stack.pop();

    }
}
