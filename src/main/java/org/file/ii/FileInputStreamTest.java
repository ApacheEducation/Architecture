package org.file.ii;

import java.io.*;

public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("/disk/oo.txt");
		InputStream fis = new FileInputStream(f);
//		InputStream fis1 = new FileInputStream("/opt/test/nohup.out");
		byte[] bbuf = new byte[100];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf)) > 0 )
		{
			System.out.print(new String(bbuf , 0 , hasRead,"utf-8" ));
            System.out.println("我");
        }
		fis.close();


		String str="aaaaaa";
		byte[] bs=str.getBytes();
		System.out.println(new String(bs));
	}
}
