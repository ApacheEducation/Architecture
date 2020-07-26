package org.file.iii;

import java.io.*;

public class PrintStreamTest
{
	public static void main(String[] args)
	{
		try{
//			FileOutputStream fos = new FileOutputStream("/opt/test.txt");
//			PrintStream ps = new PrintStream(fos);
			PrintStream ps = new PrintStream(System.out);
			ps.println("普通字符串");
			ps.println(new PrintStreamTest());
			ps.close();
//			fos.close();
		}
		catch (Exception ioe)
		{

			ioe.printStackTrace();
            System.exit(1);
		}
	}
}

