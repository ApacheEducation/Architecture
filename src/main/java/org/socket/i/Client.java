package org.socket.i;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args)
            throws IOException {
        Socket socket = new Socket("127.0.0.1", 30000);
        System.out.println(socket.getLocalPort());
        PrintStream ps = new PrintStream(socket.getOutputStream());
        // 进行普通IO操作
        ps.println("谢谢祝福！");
        ps.flush();
        // 将Socket对应的输入流包装成BufferedReader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        // 进行普通IO操作
        String line = br.readLine();
        System.out.println("来自服务器的数据：" + line);

        ps.close();
        // 关闭输入流、socket
        br.close();
        socket.close();
    }
}
