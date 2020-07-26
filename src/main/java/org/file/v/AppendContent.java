package org.file.v;

import java.io.*;

public class AppendContent
{
	public static void main(String[] args)
	{
		try{
			RandomAccessFile raf = new RandomAccessFile("out.txt" , "rw");
			raf.seek(raf.length());
			raf.read();
			raf.write("追加的内容！\r\n".getBytes());
			raf.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
