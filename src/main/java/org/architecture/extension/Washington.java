package org.architecture.extension;

/**
 * @author yanghai
 * @since 2020/7/19 18:57
 */
public class Washington {

    public static void main(String[] args) {

        String s1 = "aaa";
        String s3 = "aaa";
        String s2 = new String("aaa");
        String s4 = "a" + "aa";
//        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s4);

    }
}
