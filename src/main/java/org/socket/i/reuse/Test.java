package org.socket.i.reuse;

import java.net.InetSocketAddress;
import java.net.ServerSocket;

/**
 * Created by yanghai on 16-5-22.
 */
public class Test {
    //只有第一个连接是TIME_WAIT状态的，第二个连接就才能使用8899端口
    public static void main(String[] args) {
        try {
            ServerSocket socket1 = new ServerSocket();
            ServerSocket socket2 = new ServerSocket();
            socket1.setReuseAddress(true);
            socket1.bind(new InetSocketAddress("127.0.0.1", 8899));
            System.out.println("socket1.getReuseAddress():"
                    + socket1.getReuseAddress());
            socket2.setReuseAddress(true);
            socket2.bind(new InetSocketAddress("127.0.0.1", 8899));
            System.out.println("socket2.getReuseAddress():"
                    + socket2.getReuseAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
