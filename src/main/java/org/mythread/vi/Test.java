package org.mythread.vi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghai on 16-5-8.
 */
public class Test {
    private static List list=new ArrayList();
    public static void main(String[] args) {
        while(true){
            Thread t=new Thread(){
              public void run(){
                  while(true){
                      System.out.println("aaaaa");
                  }
              }
            };
            list.add(t);
            t.start();
        }
    }
}
