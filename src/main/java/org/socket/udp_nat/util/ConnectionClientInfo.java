/**
 * ConnectionClientInfo.java Nov 25, 2009
 * 
 * Copyright 2009 xwz, Inc. All rights reserved.
 */
package org.socket.udp_nat.util;

/**
 * 需要保存的客户端信息
 */
public class ConnectionClientInfo {
	private String ip;
	private int port;
	private String nickname;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
