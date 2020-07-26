package org.file.vi.replace;

import java.util.*;
import java.io.*;

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

	private Object writeReplace()throws ObjectStreamException {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(age);
		return list;
	}
}