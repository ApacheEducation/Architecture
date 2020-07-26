package org.mythread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanghai on 16-8-30.
 */
class MyThread extends Thread{
    public Socket getSocket() {
        return socket;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    private Socket socket;
    @Override
    public void run() {
        while(true){
            try {
                InputStreamReader in=new InputStreamReader(socket.getInputStream());
                PrintStream ps=new PrintStream(socket.getOutputStream());
                BufferedReader br=new BufferedReader(in);
                String str="";
                while((str=br.readLine())!=null){
                    if(str.equals("aaa")){
                        ps.write("bbb".getBytes());
                        ps.flush();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Test12{

    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    @Override
    public boolean equals(Object obj) {
        int a=this.name.hashCode();
        int b=((Test12)obj).getName().hashCode();
        return a==b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object o) {
        int a1=this.age;
        int a2=((Test12)o).getAge();
        if(a1>a2){
            return 1;
        }else if(a1<a2){
            return -1;
        }
        return 0;
    }
}
public class Test11 {
    public static void main(String[] args) throws IOException {
//        ServerSocket ss=new ServerSocket(10000);
        Test12 t1=new Test12();
        t1.setName("aa");
        t1.setAge(1);
        Test12 t2=new Test12();
        t2.setName("aa");
        t2.setAge(10);
        System.out.println(t1.compareTo(t2));
//        if(t1.equals(t2)){
//            System.out.println("==========");
//        }else{
//            System.out.println("<<<<<<<");
//        }



//        while(true){
//            Socket s=ss.accept();
//
//            MyThread my=new MyThread();
//            my.setSocket(s);
//            my.start();
//        }


    }
}
