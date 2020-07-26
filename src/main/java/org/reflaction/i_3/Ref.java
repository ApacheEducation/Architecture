package org.reflaction.i_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态调用方法
public class Ref {
	/**
	 * @param message
	 */
	public Ref(String message) {
		System.out.println("Hello :" + message);
	}

	public Ref(String message,Integer age){

	}
	public void sayHello(String message) {
		System.out.println("Say Hello!" + message);
	}

	public static String show() {
		return "static show()";
	}

	public static void main(String[] args) throws Exception {

		// 得到Ref类c(元数据)
		Class c = Class.forName("org.reflaction.i_3.Ref");

//		Ref test1 = (Ref)c.newInstance();
		// 通过指定参数类型获取相应构造函数(对象)
		Constructor constructor = c.getConstructor(String.class);

		Constructor constructor1 = c.getConstructor(String.class,Integer.class);
		// 通过构造函数实例化Ref类对象test
		Ref test = (Ref) constructor.newInstance("Test Instructor");

		Ref test2 = (Ref) constructor.newInstance("Test Instructor",1);

//		Ref test =new org.reflaction.i_3.Ref("Test Instructor");

		// 通过指定的方法名称取得对应方法对象
		// *****************
		// 语法: 类名.getMethod("方法名称",形参类型列表)
		// *****************
		Method method = c.getMethod("sayHello", String.class);

		// 动态调用方法(非静态方法)
		// *****************
		// 语法: method.invoke(对象实例, 实参列表);
		// *****************
		method.invoke(test, "Test method");

//		test.sayHello("Test method");

		// 动态调用方法(静态方法)
		Method show = c.getMethod("show");
		String str = (String) show.invoke(test); // 静态方法调用方式1
		// String str = (String)show.invoke(null);//静态方法调用方式2
		System.out.println(str);

	}
}
