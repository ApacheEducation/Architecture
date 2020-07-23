package org.architecture.oop;

import org.architecture.oop.base.Person;

/**
 * @author yanghai
 * @since 2020/7/23 21:14
 */
public class Application {

    public static void main(String[] args) {
        Person t = new Person();
        t.setName("小明");
        t.setAge(4);

        System.out.println(t.getName());
    }

}
