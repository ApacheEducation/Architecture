package org.file.vi.singleton;

/**
 * @author yanghai
 * @since 2020/8/16 17:31
 */
// 饿汉模式
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    //懒汉样式
//    private static Singleton instance;
//    private Singleton(){
//
//    }
//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
}
