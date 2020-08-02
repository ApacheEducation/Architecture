package org.architecture.oop.utils;

import java.util.*;

/**
 * @author yanghai
 * @since 2020/8/2 19:43
 */
public class MyCommon {

    public static void main(String[] args) {

//        String[] array = new String[10];

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
        System.out.println(arrayList);

        //链表
        List<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("first");
        System.out.println(linkedList);


        //list ---》 元素是有序 可以重复

        //Set(K-null) Map(K-V) 散列(hashcode())表   元素的无序,不能重复

        Set<String> hashSet = new HashSet<>();
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        System.out.println(hashSet.size());
//        System.out.println(hashSet);

    }
}
