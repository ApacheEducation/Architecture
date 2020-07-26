package org.reflaction.i.tools;

/**
 * Created by yanghai on 16-12-11.
 */
class YourThread implements IRunanble{

    @Override
    public void run() {
        System.out.println("adfadfadsfasdf");
    }
}
public class MyThread implements IRunanble {
    @Override
    public void run() {
        System.out.println("aaaa");
    }

    public static void main(String[] args) throws Exception {
        Tools.start("org.reflaction.i.tools.YourThread");
    }
}
