package org.nio.netty.udp;

/**
 * Created by yanghai on 16-5-27.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientTest {

    public static void main(String[] args) throws IOException {
        DatagramSocket sendSocket = new DatagramSocket();
        String mes = "我是设备！";
        byte[] buf = mes.getBytes("UTF-8");
        int port = 9999;
        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, ip,
                port);
        sendSocket.send(sendPacket);
        sendSocket.close();
    }

}
