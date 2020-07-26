package org.file.vi.custom;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person
	implements Serializable
{
	private String name;
	private int age;
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	private void writeObject(ObjectOutputStream out)
		throws IOException
	{
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}
	private void readObject(ObjectInputStream in)
		throws IOException, ClassNotFoundException
	{
		this.name = ((StringBuffer)in.readObject()).reverse()
			.toString();
		this.age = in.readInt();
	}
}