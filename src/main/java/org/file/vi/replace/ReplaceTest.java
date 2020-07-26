package org.file.vi.replace;

import java.io.*;
import java.util.*;

public class ReplaceTest
{
	public static void main(String[] args)
	{
		try{
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("replace.txt"));
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("replace.txt"));
			Person per = new Person("aaa", 500);
			oos.writeObject(per);
			ArrayList list = (ArrayList)ois.readObject();
			System.out.println(list);
			ois.close();
			oos.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

