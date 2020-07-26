package org.reflaction.iii_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by yanghai on 16-10-20.
 */
public class CoperProxyFactory {
    public static Coper getProxy(Object target, InvocationHandler ejg){
        return (Coper)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),ejg);
    }
}
