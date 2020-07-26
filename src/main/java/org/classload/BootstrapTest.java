package org.classload;
import sun.swing.BakedArrayList;
import javax.net.ServerSocketFactory;

public class BootstrapTest
{
	public static void main(String[] args) throws ClassNotFoundException {
//		// 获取根类加载器所加载的全部URL数组
//		URL[] urls = sun.misc.Launcher.
//		getBootstrapClassPath().getURLs();
//		// 遍历、输出根类加载器加载的全部URL
//		for (int i = 0; i < urls.length; i++)
//		{
//			System.out.println(urls[i].toExternalForm());
//		}
		String str="aaaa";
        ClassLoader cl=str.getClass().getClassLoader();
        System.out.println(cl);
        Class clazz=Class.forName("com.sun.crypto.provider.AESCipher");
        System.out.println(clazz.getClassLoader());
        BootstrapTest bootstrapTest=new BootstrapTest();
        System.out.println(bootstrapTest.getClass().getClassLoader());
    }
}

