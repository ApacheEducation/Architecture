/**
 * StringUtil.java Nov 25, 2009
 * 
 * Copyright 2009 xwz, Inc. All rights reserved.
 */
package org.socket.udp_nat.util;

import java.util.StringTokenizer;

/**
 * 字符串分割处理
 *
 */
public class StringUtil {
	// 按照splitor分割src
	public static String[] splitString(String src, String splitor) {
		StringTokenizer s = new StringTokenizer(src, splitor);

		String[] strs = new String[s.countTokens()];
		int i = 0;
		while (s.hasMoreTokens()) {
			strs[i++] = s.nextToken();
		}

		return strs;
	}
}
