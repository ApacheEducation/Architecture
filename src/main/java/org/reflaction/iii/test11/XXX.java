package org.reflaction.iii.test11;

import org.reflaction.iii.Dog;
import org.reflaction.iii.MyInvokationHandler;

import java.lang.reflect.Method;

/**
 * Created by yanghai on 17-1-6.
 */
public class XXX implements Dog {
    public void setMyInvokationHandler(MyInvokationHandler myInvokationHandler) {
        this.myInvokationHandler = myInvokationHandler;
    }

    private MyInvokationHandler myInvokationHandler;

    @Override
    public void info() {
        try {
            Method m=Dog.class.getDeclaredMethod("info");
            myInvokationHandler.invoke(myInvokationHandler,m,null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {
        try {
            Method m=Dog.class.getDeclaredMethod("run");
            myInvokationHandler.invoke(myInvokationHandler,m,null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
