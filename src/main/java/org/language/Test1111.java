package org.language;

import java.util.ArrayList;

/**
 * Created by yanghai on 16-10-5.
 */
class T1{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class T2{
    private T1 t;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T1 getT() {
        return t;
    }

    public void setT(T1 t) {
        this.t = t;
    }
}
public class Test1111 {
    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
        T1 t1=new T1();
        t1.setName("aaa");
        T2 t2=null;
//        t2.setName("bbbb");
//        list.add(t1);
//        list.add(t2);
//        for(int i=0;i<list.size();i++){
//            Object o=list.get(i);
////            if(o instanceof T1){
////                System.out.println(((T1) o).getName()+" is T1");
////            }else{
////                System.out.println(((T2) o).getName()+" is T2");
////            }
//            if(o.getClass()==T1.class){
//                System.out.println(((T1) o).getName()+" is T1");
//            }else{
//                System.out.println(((T2) o).getName()+" is T2");
//            }
//        }
        System.out.println(t2.getT().getName());
    }
}
