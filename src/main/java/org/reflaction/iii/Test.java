package org.reflaction.iii;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws Exception {
        // 创建一个原始的GunDog对象，作为target
        Dog target = new GunDog();
//        target.info();
//        target.run();
        // 以指定的target来创建动态代理
        // 创建一个MyInvokationHandler对象
        MyInvokationHandler handler = new MyInvokationHandler();
        // 为MyInvokationHandler设置target对象
        handler.setTarget(target);
        // 创建、并返回一个动态代理
        Dog dog = (Dog) Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces(), handler);

        dog.info();
        dog.run();
    }
}

