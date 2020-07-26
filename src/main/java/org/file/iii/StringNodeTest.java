package org.file.iii;

import java.io.*;

public class StringNodeTest
{
	public static void main(String[] args)
	{
		String src = "有钱不要非君子,\n跟钱有仇是小人。\n";
		char[] buffer = new char[32];
		int hasRead = 0;
		try{
			StringReader sr = new StringReader(src);
			while((hasRead = sr.read(buffer)) > 0)
			{
				System.out.print(new String(buffer ,0 , hasRead));
			}
			StringWriter sw = new StringWriter();
			sw.write("有钱不要非君子，\n");
			sw.write("跟钱有仇是小人。\n");
			System.out.println("----下面是sw的字符串节点里的内容----");
			System.out.println(sw.toString());
			sw.close();
			sr.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
