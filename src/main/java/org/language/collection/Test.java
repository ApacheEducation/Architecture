package org.language.collection;

import sun.misc.*;
import sun.misc.Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


//class MyEntry{
//    public Object key;
//    public Object value;
//}
public class Test{
    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Test[] test=new Test[10];
        test[0]=new Test();

//        Object[] objs=new Object[102480];
//        MyEntry t=new MyEntry();
//        t.key="aaa";
//        t.value="bbb";
//        objs[t.key.hashCode()]=t;
//        System.out.println(((MyEntry)objs[t.key.hashCode()]).value);
//        int io=10;
//        Integer ii=new Integer(io);
//        int bb=ii.intValue();
//
//
//        ArrayList<String> list =new ArrayList();
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add(10,"aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("aaa");
//
//        for(int i=0;i<list.size();i++){
//            String o=list.get(i);
//            System.out.println(o.toString());
//        }
////        Iterator iterator=list.iterator();
////        while(iterator.hasNext()){
////            String o=(String)iterator.next();
////            System.out.println(o.toString());
////        }
//        for (String o:list) {
//            System.out.println(o.toString());
//        }
//        LinkedHashMap<String,String> hm=new LinkedHashMap();
//        hm.put("aaa","vaaa");
//        hm.put("bbb","vbbba");
//        System.out.println(hm.get("aaa"));
//        for (String o:hm.keySet()) {
//            System.out.println(o+"\t"+hm.get(o));
//        }
//
//        HashSet<String> set=new HashSet<>();
//        set.add("aaaa");
//        set.add("aaaa");
//        set.add("bbbb");
////        for (String o:set) {
//        if(set.contains("bbbb")){
//            System.out.println("ok");
//        }
//        }

        TreeMap<String,String> treeMap=new TreeMap();
        treeMap.put("z","z");
        treeMap.put("a","a");
        treeMap.put("c","c");
        treeMap.put("b","b");
        for(String str:treeMap.keySet()){
            System.out.println(str+"\t"+treeMap.get(str));
        }

        Vector<String> v=new Vector();
        v.add("aaa");
        v.add("bbb");
        Enumeration enumeration=v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        Stack st=new Stack();
        st.push("aaaa");
        st.push("bbbb");
        System.out.println(st.pop());
        ArrayBlockingQueue abq=new ArrayBlockingQueue(10);
        abq.put("aaa");
        abq.put("bbb");
        System.out.println(abq.take());

    }
}
