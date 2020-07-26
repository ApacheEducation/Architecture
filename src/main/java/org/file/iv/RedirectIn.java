package org.file.iv;

import java.util.*;
import java.io.*;

public class RedirectIn
{
	public static void main(String[] args)
	{
		try{
			FileInputStream fis = new FileInputStream("RedirectIn.java");
			System.setIn(fis);
			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("\n");
			while(sc.hasNext())
			{
				System.out.println("键盘输入的内容是：" + sc.next());
			}
			fis.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

