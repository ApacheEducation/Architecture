/**
 * MyProtocol.java Nov 25, 2009
 * 
 * Copyright 2009 xwz, Inc. All rights reserved.
 */
package org.socket.udp_nat.util;

/**
 * 指定一些协议(其实应该使用byte的,为了简单先使用String)
 *
 */
public class MyProtocol {
	/*
	 * 说明: (C)表示由Client发送此命令 (S)表示由Server发送此命令 <C>表示是Client直接的通信 ()表示C/S之间的通信
	 * <>表示C之间的通信 []
	 * 
	 * xxx:被连接的端,完成打向yyy的洞 yyy:提出P2P连接的端
	 */

	// (C) 客户端第一次登陆时,发送此命令
	// LOGIN|nickname
	public static final String LOGIN = "LOGIN";

	// (S) 在线客户端列表
	// LIST_ONLINE|ip1,port1,name1|ip2,port2,name2
	public static final String LIST_ONLINE = "LIST_ONLINE";

	// (C) 心跳
	// HEART|nickname
	public static final String HEART = "HEART";

	// (C) 我要连接xxx,请告诉xxx打一个向我的洞
	// WANT_TO_CONNECT|ip|port|nickname
	public static final String WANT_TO_CONNECT = "WANT_TO_CONNECT";

	// (S) 请打一个向yyy的洞
	// PUNCH_HOLE_TO|ip|port|nickname
	public static final String PUNCH_HOLE_TO = "PUNCH_HOLE_TO";

	// (C) 完成向yyy的打洞,请通知yyy
	// SUCCESS_HOLE_TO|ip|port|nickname
	public static final String SUCCESS_HOLE_TO = "SUCCESS_HOLE_TO";

	// (S) xxx完成了对你的打洞,可以连接xxx了
	// CAN_P2P_TO|ip|port|nickname
	public static final String CAN_P2P_TO = "CAN_P2P_TO";

	// <C> 第一次yyy连接xxx
	// HELLO_MYP2P_FRIEND|nickname
	public static final String HELLO_P2P_FRIEND = "HELLO_MYP2P_FRIEND";

	// <C> 客户端私下里通信
	// P2P_MESSAGE|msg's content
	public static final String P2P_MESSAGE = "P2P_MESSAGE";

	// 分隔符
	public static final String SPLITOR = "|";
}
