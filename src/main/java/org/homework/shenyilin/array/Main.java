package org.homework.shenyilin.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        MyArrayList str=new MyArrayList();
        str.add("ddddd");
        str.add("kkkkkk");
        str.add("asd");
        str.add("qwert");
        int i=str.containOf("asd");
        System.out.println(i);
         i=str.containOf("ddddd");
        System.out.println(i);
//链表

        MyList myList=new MyList();
        myList.addNode("aaaa");
        myList.addNode("bbbb");
        myList.addNode("cccc");
        myList.addNode("dddd");
        i=myList.length();
        System.out.println(i);
        MyNode myNode=new MyNode("cccc");
        myNode.next=new MyNode("dddd");
        if (myList.containOf(myNode)) {
            System.out.println("包含该节点！");
        }
        else{
            System.out.println("不包含该节点！");
        }
    }
}
