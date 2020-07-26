package org.file.ii;

import java.io.*;

public class FileWriterTest
{
	public static void main(String[] args)
	{
		try{
			FileWriter fw = new FileWriter("poem.txt",true);
			fw.write("有钱不要非君子，\r\n");
			fw.write("跟钱有仇是小人。\r\n");
			fw.flush();
			fw.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
