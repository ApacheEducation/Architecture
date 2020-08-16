package org.file.iv;

import java.io.*;
public class RedirectOut
{
	public static void main(String[] args)
	{
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream("out.txt",true));
			System.setOut(ps);
			System.out.println("普通字符串");
			System.out.println(new RedirectOut());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

