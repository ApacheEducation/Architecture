package org.file.iii;

import java.io.*;

public class KeyinTest
{
	public static void main(String[] args)
	{
		try{
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null)
			{
				if (line.equals("exit"))
				{
					System.exit(1);
				}
				System.out.println("输入内容为:" + line);
			}
			br.close();
			reader.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
