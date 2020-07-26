package org.language;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;


import java.util.*;

/**
 * Created by yanghai on 16-8-1.
 */
class Inter{
    int value;
    public Inter(int i){
        this.value=i;
    }
}
public class Collection1 {
    static int i=0;
    public static void main(String[] args) {
        int
        Integer;
//        List list=new ArrayList();

//        List<Integer> list=new LinkedList<Integer>();
//
//        list.add(10);
//        list.add(1);
//        list.add(100);
//        list.add(1);
//        list.remove(new Integer(100));
//        int size=list.size();
//        for(int i=0;i<size;i++){
//            System.out.println(list.get(i));
//        }
//        for (int i:list) {
//            System.out.println(i);
//        }
//        Iterator it=list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        Set;
        Set<String> set=new HashSet<String>();
        set.add("adfadfsd");
        set.add("bbb");
        set.add("aaa");
        set.add("aaa");
        for (String i:set) {
            System.out.println(i);
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(1,2);

        for (Integer i:map.keySet()) {
            System.out.println(i+"    "+map.get(i));
        }
//
        Hashtable ht=new Hashtable();
        ht.put("aaa",1);

        Vector v=new Vector();
        v.add(1);
        v.add(1);
        int size=v.size();
        for (int i=0;i<size;i++){
            System.out.println(v.get(i));
        }
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(100,"aaaa");

        tm.put(10,"ccc");
        tm.put(10,"bbb");
        for (Integer i:tm.keySet()) {
            System.out.println(i+"    "+tm.get(i));
        }
        Queue q=new ArrayDeque();
        q.offer("aaa");
        q.offer("bbb");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        Stack stack=new StringStack();
        stack.push("aaaa");
        stack.push("bbb");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//
        Map.Entry entry= new Map.Entry<String, String>() {
            private String key;
            private String value;

            public void setKey(String key){
                this.key=key;
            }
            @Override
            public String getKey() {
                return key;
            }
            @Override
            public String getValue() {
                return value;
            }
            @Override
            public String setValue(String value) {
                this.value=value;
                this.key="xxx"+(Collection1.i++);
                return key;
            }
            @Override
            public boolean equals(Object o) {
                return false;
            }
            @Override
            public int hashCode() {
                return 0;
            }
        };
        Object k=entry.setValue("aaa");
        System.out.println(entry.getValue());
        Map bag=new HashMap();
        bag.put("hp",10);
        bag.put("mp",100);


    }
}
