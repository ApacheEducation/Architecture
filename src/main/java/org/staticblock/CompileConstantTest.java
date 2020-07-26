package org.staticblock;

import java.util.Random;

class MyTest
{
	static
	{

		x=2;
//		System.out.println(x);
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOO");
	}
    static int x;

	static{
		x=1;
	}




	// 使用一个字符串直接量为static final的类变量赋值
//	static final String compileConstant = "xxxxxx";
	static final int compileConstant1 = new Random().nextInt();
//	static final int com=1*2*3;
//    static final Object o=new Object();
}
class YYY extends MyTest{
    static
    {
        System.out.println("YYYYYYY");
    }
	static final int com=1*2*3;
}

public class CompileConstantTest
{
	public static void main(String[] args)
	{
		// 访问、输出MyTest中的compileConstant类变量
		System.out.println(YYY.compileConstant1);   // ①
	}
}
