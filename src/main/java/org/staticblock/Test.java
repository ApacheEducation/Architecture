package org.staticblock;

import java.util.Random;

class TestObj{
	static{
		System.out.println("TestObj------------");
	}
	public static int x;
}
class Testt extends TestObj{
	static {
		System.out.println("Testt--------------");
	}
	static void xxx(){

	}
	static int c=11;
	static final  int c1=11;
	static final int c2=new Random().nextInt(1);
}
class First{
	static{
		System.out.println("First-------------");
	}
}
public class Test {
//	static{
//		System.out.println("Test----------");
//	}
	public static void main(String[] args) throws ClassNotFoundException {
//		new First();
//		Class.forName("org.staticblock.First");
//		new Testt();
//		System.out.println(Testt.c);
//		System.out.println(Testt.c1);
		System.out.println(Testt.c2);
//		Testt.xxx();
//		System.out.println(Testt.x);
	}

}

