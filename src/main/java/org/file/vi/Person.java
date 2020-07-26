package org.file.vi;


import java.io.Serializable;

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
}