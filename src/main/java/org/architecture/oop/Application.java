package org.architecture.oop;

import org.architecture.oop.oopextends.Anminal;
import org.architecture.oop.oopextends.Cat;

/**
 * @author yanghai
 * @since 2020/7/23 21:14
 */
public class Application {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.say();

//        子类方法，父类虚拟调用
        Anminal anminal = new Cat();
        anminal.name = "aa";
        anminal.say();
        anminal.water();
//        Cat cat = new Anminal();

    }
}
