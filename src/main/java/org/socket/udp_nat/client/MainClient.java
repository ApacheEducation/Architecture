/**
 * MainClient.java Nov 23, 2009
 * 
 * Copyright 2009 xwz, Inc. All rights reserved.
 */
package org.socket.udp_nat.client;

import org.socket.udp_nat.util.MyProtocol;
import org.socket.udp_nat.util.StringUtil;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


/**
 * @author xwz
 * @version 1.0, Nov 23, 2009 11:24:47 PM
 */
public class MainClient {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Client------------");

		Scanner scanner = new Scanner(System.in);

		System.out.print("nickname:");
		String nickname = scanner.next();// 昵称

		System.out.print("Server IP:");
		String ip = scanner.next();// 服务器ip地址

		System.out.print("Server port:");
		int port = scanner.nextInt();// 服务器端口

		System.out.println(ip + "|" + port + "|" + nickname);

		// UDP
		DatagramSocket ds = new DatagramSocket();

		// 登陆服务器
		String loginStr = MyProtocol.LOGIN + MyProtocol.SPLITOR + nickname;
		// 构造要发送的包
		DatagramPacket lp = new DatagramPacket(loginStr.getBytes(), loginStr
				.length(), InetAddress.getByName(ip), port);
		// 发送登陆信息
		ds.send(lp);

		// 启动心跳线程
		String heartStr = MyProtocol.HEART + MyProtocol.SPLITOR + nickname
				+ "'s Heart Package";
		DatagramPacket hp = new DatagramPacket(heartStr.getBytes(), heartStr
				.length(), InetAddress.getByName(ip), port);
		new Thread(new HeartThread(ds, hp)).start();

		// 循环接收
		byte[] buf = new byte[1024];
		DatagramPacket rp = new DatagramPacket(buf, 1024);
		boolean isEnd = false;
		while (!isEnd) {
			ds.receive(rp);
			// 取出信息
			String content = new String(rp.getData(), 0, rp.getLength());
			String rip = rp.getAddress().getHostAddress();
			int rport = rp.getPort();
			// 输出接收到的数据
			System.out.println(rip + ":" + rport + " >>>> " + content);

			// 处理控制部分,委托给其他方法做
			if (content.startsWith(MyProtocol.LIST_ONLINE)) {
				dealListOnline(ds, rp, content);
			} else if (content.startsWith(MyProtocol.PUNCH_HOLE_TO)) {
				dealPunchTo(ds, rp, content);
			} else if (content.startsWith(MyProtocol.CAN_P2P_TO)) {
				firtTimeConnectP2P(ds, rp, content);
			} else if (content.startsWith(MyProtocol.HELLO_P2P_FRIEND)) {
			} else if (content.startsWith(MyProtocol.P2P_MESSAGE)) {
			} else {
			}
		}
		ds.close();
	}

	// 被服务器通知,对方打洞成功
	private static void firtTimeConnectP2P(DatagramSocket ds,
			DatagramPacket rp, String content) throws IOException {
		String[] clientInfo = StringUtil.splitString(content,
				MyProtocol.SPLITOR);

		String ip = clientInfo[1];
		int port = Integer.parseInt(clientInfo[2]);

		String send = MyProtocol.HELLO_P2P_FRIEND + MyProtocol.SPLITOR + "你好";
		DatagramPacket p2 = new DatagramPacket(send.getBytes(),
				send.getBytes().length, InetAddress.getByName(ip), port);

		ds.send(p2);
	}

	// 打洞
	private static void dealPunchTo(DatagramSocket ds, DatagramPacket rp,
			String content) throws IOException {
		String[] clientInfo = StringUtil.splitString(content,
				MyProtocol.SPLITOR);

		String ip = clientInfo[1];
		int port = Integer.parseInt(clientInfo[2]);

		String send = MyProtocol.HELLO_P2P_FRIEND + MyProtocol.SPLITOR + "打洞";
		DatagramPacket p2 = new DatagramPacket(send.getBytes(),
				send.getBytes().length, InetAddress.getByName(ip), port);

		// 发包打洞,多发几次
		ds.send(p2);
		ds.send(p2);
		ds.send(p2);

		// 告诉服务器打洞成功
		send = MyProtocol.SUCCESS_HOLE_TO + MyProtocol.SPLITOR + ip
				+ MyProtocol.SPLITOR + port;
		DatagramPacket p3 = new DatagramPacket(send.getBytes(),
				send.getBytes().length, rp.getAddress(), rp.getPort());
		ds.send(p3);

	}

	// 返回列表的时候
	private static void dealListOnline(DatagramSocket ds, DatagramPacket rp,
			String content) throws IOException {
		System.out.print("和谁连接(192.168.0.2|23112|aaa),请输入(xxx不连接):");
		Scanner s = new Scanner(System.in);

		String input = s.next();

		if (input.equalsIgnoreCase("xxx")) {
			return;
		}

		input = MyProtocol.WANT_TO_CONNECT + MyProtocol.SPLITOR + input;
		DatagramPacket p = new DatagramPacket(input.getBytes(), input
				.getBytes().length, rp.getAddress(), rp.getPort());

		ds.send(p);
	}

}
