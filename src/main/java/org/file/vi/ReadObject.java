package org.file.vi;

import java.io.*;

public class ReadObject
{
	public static void main(String[] args)
	{
		try{
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("test.txt"));
            System.out.println(ois.available());
            Person p = (Person)ois.readObject();
			System.out.println("名字为：" + p.getName()
				+ "\n年龄为：" + p.getAge());
			ois.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
