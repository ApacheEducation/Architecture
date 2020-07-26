package org.socket.i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanghai on 16-8-30.
 */
class MyClient{
    public static void start() throws IOException {
        Socket s=new Socket("localhost",16000);
        OutputStream out=s.getOutputStream();
        out.write("aaa".getBytes());
        out.flush();
    }
}
class MyServer{
    public static void start() throws IOException {
        ServerSocket ss=new ServerSocket(16000);
        Socket s=ss.accept();
        InputStream in=s.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=in.read(bytes))>0){
            System.out.println(len);
            System.out.println(new String(bytes,0,len,"utf-8"));
        }
        System.out.println(len);

    }
}
public class Test {
    public static void main(String[] args) throws IOException {
        new Thread(){
            public void run(){
                try {
                    MyServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }.start();
        MyClient.start();
    }
}
