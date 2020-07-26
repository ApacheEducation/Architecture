package org.reflaction.i_2;

public class Student {
	public String name = "";
	public int age = 0;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("反射测试." + this.name);
	}
}
