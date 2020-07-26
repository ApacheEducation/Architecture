package org.socket.i.oobinline;

/**
 * Created by yanghai on 16-5-22.
 */

import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("服务器已经启动，端口号：1234");
        while (true) {
            Socket socket = serverSocket.accept();
            socket.setOOBInline(true);
            InputStream in = socket.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader bReader = new BufferedReader(inReader);
            System.out.println(bReader.readLine());
            System.out.println(bReader.readLine());
            socket.close();
        }
    }
}
