package org.file.ii;

import java.io.*;

public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try{
			FileInputStream fis = new FileInputStream(
				"FileOutputStreamTest.java");
			FileOutputStream fos = new FileOutputStream("newFile.txt",true);
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			while ((hasRead = fis.read(bbuf)) > 0 )
			{
				fos.write(bbuf , 0 , hasRead);
			}
			fos.close();
			fis.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
