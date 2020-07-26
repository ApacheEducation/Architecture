package org.language;

/**
 * Created by yanghai on 16-8-27.
 */
class CCCCCC{
    public void sss(){

    }
}
class TTTT extends CCCCCC{


    public static String usrname;

    public void sss(){
        synchronized (new Object()){

        }

    }
    public void xxx(){
        synchronized (this){

        }
    }
}
class MyThread11 extends Thread{
    private TTTT t;
    public MyThread11(TTTT t){
        this.t=t;
    }
}
public class TestSync {
    public static void main(String[] args) {
        TTTT t3=new TTTT();
        TTTT t4=new TTTT();
        Thread t1=new MyThread11(t3);
        Thread t2=new MyThread11(t4);
    }
}
