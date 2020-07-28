package org.architecture.oop.oopextends;

/**
 * @author yanghai
 * @since 2020/7/25 20:33
 */
public class Cat extends Anminal implements IHobby, Imethod{

    public Cat() {
        super();
        System.out.println("CAT子类被构建");
    }

    /**
     * 重载   跟方法的名字和参数有关系
     */
    public void run() {
        System.out.println("i can run 100KM");
    }

    public void run(long number, String name) {
        System.out.println(name + " can run" + number + "KM");
    }

    public void run(long name, long number) {
        System.out.println(name + " can run" + number + "KM");
    }

    @Override
    public void read() {

    }

    @Override
    public void writer() {

    }

    @Override
    public void behiver() {

    }

    @Override
    public void water() {

    }

    @Override
    public void say() {

    }

    @Override
    public String color() {
        return null;
    }
}
