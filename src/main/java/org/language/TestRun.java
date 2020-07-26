package org.language;

/**
 * Created by yanghai on 16-8-5.
 */
interface MyRunable{
    public void run();
}
class MyyThread implements MyRunable{
    private MyRunable target=null;
    public MyyThread(){
        init(null);
    }
    private void init(MyRunable target){
        this.target=target;
    }

    @Override
    public void run() {
        if(target!=null){
            target.run();
        }
    }
    public void start(){
        target=this;
        run();
    }

}
public class TestRun extends MyyThread{
    @Override
    public void run() {
        while(true){
            System.out.println("xxxxx");
        }
    }

    public static void main(String[] args) {
        TestRun testRun=new TestRun();
        testRun.start();

    }
}
