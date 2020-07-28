package org.architecture.oop.oopextends;

/**
 * @author yanghai
 * @since 2020/7/25 20:33
 */
public class Dog extends Anminal implements Imethod{

    public void behiver() {
        System.out.println("cat");
    }

    @Override
    public void water() {

    }

    @Override
    public void say() {

    }

    @Override
    public String color() {
        return "green";
    }
}
