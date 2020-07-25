package org.architecture.oop.oopextends;

/**
 * @author yanghai
 * @since 2020/7/25 20:33
 */
public class Cat extends Anminal {

    public Cat() {
        super();
        System.out.println("CAT子类被构建");
    }

    /**
     * 方法重写
     */
    @Override
    public void say() {
        System.out.println(" i am Cat");
    }

    public void hello() {
        System.out.println("sout");
    }

    /**
     * 重载   跟方法的名字和参数有关系
     */
    public void run() {
        System.out.println("i can run 100KM");
    }
    public void run(long number) {
        System.out.println("i can run" + name + "KM");
    }
    public void run(long number, String name) {
        System.out.println(name + " can run" + number + "KM");
    }
    public void run(long name, long number) {
        System.out.println(name + " can run" + number + "KM");
    }
}
