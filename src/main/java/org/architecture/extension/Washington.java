package org.architecture.extension;

/**
 * @author yanghai
 * @since 2020/7/19 18:57
 */
public class Washington {

    public static void main(String[] args) {

        /**
         * 字符串的比较，严格按照JVM的内存图理解，就不会出错
         */
        String s1 = "aaa";
        String s3 = "aaa";
        String s2 = new String("aaa");
        String s4 = "a" + "aa";

        System.out.println(s1.equals(s2));
    }
}
