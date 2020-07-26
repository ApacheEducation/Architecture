package org.socket.i;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args)
            throws IOException {
        // 创建一个ServerSocket，用于监听客户端Socket的连接请求
        ServerSocket ss = new ServerSocket(30000);

//        InetSocketAddress isa = new InetSocketAddress("0.0.0.0", 30000);
//        ss.bind(isa);
        // 采用循环不断接受来自客户端的请求
        while (true) {
            // 每当接受到客户端Socket的请求，服务器端也对应产生一个Socket
        System.out.println("++++++++++");
        Socket s = ss.accept();
            System.out.println(s.getLocalPort());
        System.out.println("!!!!!!!!!!");
            // 将Socket对应的输出流包装成PrintStream
        PrintStream ps = new PrintStream(s.getOutputStream());
            // 进行普通IO操作
        ps.println("您好，您收到了服务器的新年祝福！");
        ps.flush();
        BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            // 进行普通IO操作
        String line = br.readLine();
        System.out.println("来自客户端的数据：" + line);
            // 关闭输出流，关闭Socket
        br.close();
        ps.close();
//        s.close();
        }
    }
}

