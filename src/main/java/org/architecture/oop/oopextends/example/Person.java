package org.architecture.oop.oopextends.example;

/**
 * @author yanghai
 * @since 2020/7/23 00:48
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public void pull() {
        System.out.println(this.name + "拉门");
    }

    public void push() {
        System.out.println(this.name + "推门");
    }

}

