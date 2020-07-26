package org.reflaction.i_2;

import java.lang.reflect.*;

//反射类成员
public class ReflectDemo {
	public static void main(String[] args) {
		try {
			/* 得到该类的所有数据字段 */
			String className = "org.reflaction.i_2.Student";
			Class c = Class.forName(className);
			showFields(c); // 显示该类所有属性信息
			showConstructors(c); // 显示所有构造方法
			showMethods(c);// 显示该类所有方法信息
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* 得到该类的所有数据字段 */
	public static void showFields(Class c) {
		Field fields[] = c.getDeclaredFields();
		for (Field f : fields) {
			// 1./*数据字段修饰符*/
			String m = Modifier.toString(f.getModifiers());
			// 2./*字段数据类型名*/
			Class type = f.getType();
			String t = type.getName();
			// 3./*类的属性名称*/
			String n = f.getName();
			System.out.println(m + " " + t + " " + n);
		}
	}

	/* 得到构造器 */
	public static void showConstructors(Class c) {
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor con : cons) {
			String m = Modifier.toString(con.getModifiers());
			String n = con.getName();
			System.out.print(m + " " + n + "(");
			Class[] params = con.getParameterTypes();
			for (int j = 0; j < params.length; j++) {
				if (j == params.length - 1) {
					System.out.print(params[j].getSimpleName());
				} else
					System.out.print(params[j].getSimpleName() + ",");
			}
			System.out.println(")");
		}
	}

	/* 得到类里所有方法 */
	public static void showMethods(Class c) {
		Method[] m = c.getMethods();
		for (int i = 0; i < m.length; i++) {
			/* 方法修饰符 */
			String modify = Modifier.toString(m[i].getModifiers());
			System.out.print(modify + " ");
			/* 方法返回类型 */
			Class returntype = m[i].getReturnType();
			System.out.print(returntype.getName() + " ");
			/* 方法名称 */
			String name = m[i].getName();
			System.out.print(name + "(");
			/* 方法参数 */
			Class[] params = m[i].getParameterTypes();
			for (int j = 0; j < params.length; j++) {
				if (j == params.length - 1) {
					System.out.print(params[j].getSimpleName());
				} else
					System.out.print(params[j].getSimpleName() + ",");
			}
			System.out.println(")");
		}
	}
}
