package org.mythread.iii.iii_2;

/**
 * Created by yanghai on 16-5-14.
 */
class A{

}
public class Test extends Thread {
    private A a;

    public void run(){
        doSomething();
    }
    private static int sum=0;
    public void doSomething(){
        //....
        //....
        for (int i = 0; i < 1000; i++) {
            //...
            synchronized(a) {

                sum++;
            }

        }
        //....
        //....
    }
    public int dis(){
        return sum;
    }


    public static void main(String[] args) {
        A a=new A();
        for(int i=0;i<10;i++){
            Test t=new Test();
            t.setA(a);
            t.start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    public void setA(A a) {
        this.a = a;
    }
}
