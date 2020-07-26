package org.language;

import java.util.ArrayList;

/**
 * Created by yanghai on 16-6-4.
 */
class RW{
    private boolean flag=false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
class Msg{
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
}
interface Handler{
    public RW read(RW rw, Msg msg);

}
class Handler1 implements Handler{
    @Override
    public RW read(RW rw, Msg msg) {
        System.out.println("xxx");
        rw.setFlag(true);
        return rw;
    }

}
class Handler2 implements Handler{
    @Override
    public RW read(RW rw, Msg msg) {
        System.out.println("read:"+msg.getMsg());
        rw.setFlag(false);
        return rw;
    }

}
class MyHandler{
    private ArrayList<Handler> pipeline=null;
    private RW rw=null;
    private Msg msg=null;
    public MyHandler(ArrayList<Handler> pipeline,RW rw,Msg msg){
        this.pipeline=pipeline;
        this.rw=rw;
        this.msg=msg;
    }
    public void read(){
        for (Handler handler:pipeline) {
            RW flag=handler.read(rw,msg);
            if(!flag.isFlag()){
                break;
            }

        }
    }
}
public class TestPipe {
    public static void main(String[] args) {
        ArrayList<Handler> pipelist=new ArrayList<>();
        pipelist.add(new Handler1());
        pipelist.add(new Handler2());

        String xxx="aaaa";
        RW rw=new RW();
        Msg msg=new Msg();
        msg.setMsg(xxx);
        MyHandler myHandler=new MyHandler(pipelist,rw,msg);
        myHandler.read();
    }
}
