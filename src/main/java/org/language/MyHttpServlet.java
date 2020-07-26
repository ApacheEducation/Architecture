package org.language;

/**
 * Created by yanghai on 16-11-20.
 */
public class MyHttpServlet {
    public void doPut(MyHttpRequest res,MyHttpResponse resp)throws Exception{
        System.out.println("默认");
    }
    public void doPost(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }
    public void doGet(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }
    public void doDel(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }
    public void doTrace(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }
    public void doOption(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }
    public void doHead(MyHttpRequest res,MyHttpResponse resp)throws Exception{

    }

    public static void main(String[] args) throws Exception {
        MyHttpServlet myHttpServlet=new MyHttp();
//        //....
//        //...new xxx
//        //...
//        String str="";
//        //str="Put"
        MyHttpRequest res=null;
        MyHttpResponse resp=null;
//        switch (str){
//            case "put":
        myHttpServlet.doPut(res,resp);
//                break;
//            //......
//        }
        //start
    }
}
