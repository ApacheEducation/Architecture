package org.reflaction.iii_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yanghai on 16-10-20.
 */
public class EJG implements InvocationHandler{
    private Object target;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;
        if(target.getClass()==IBM.class&&method.getName().equalsIgnoreCase("sale")){
            System.out.println("ibm mouse");
            res=method.invoke(target,args);
        }else if(method.getName().equalsIgnoreCase("sale")){
            System.out.println("other mouse");
            res=method.invoke(target,args);
        }else{
            res=method.invoke(target,args);
        }
        return res;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
