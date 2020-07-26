/**
 * HeartThread.java Nov 25, 2009
 * 
 * Copyright 2009 xwz, Inc. All rights reserved.
 */
package org.socket.udp_nat.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 发送心跳包线程
 * 
 * @author xwz
 * @version 1.0, Nov 25, 2009 11:33:59 PM
 */
public class HeartThread implements Runnable {
	private DatagramSocket ds;
	private DatagramPacket p;

	public HeartThread(DatagramSocket ds, DatagramPacket p) {
		this.ds = ds;
		this.p = p;
	}

	public void run() {
		while (true) {
			try {
				ds.send(p);
				Thread.sleep(500);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
