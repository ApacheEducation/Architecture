package org.architecture.staticblock;

/**
 * @author yanghai
 * @since 2020/8/2 19:21
 */
public class StaticApplication {

    //final  static不可改变 JVM

    //static

    //static 代码块
    static {
        System.out.println("aaa");
    }

    static {
        System.out.println("bbb");
    }

    public static String name = "static";

    public String age;

    public static void say() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        StaticApplication.say();
    }

}
