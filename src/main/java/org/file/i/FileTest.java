package org.file.i;

import java.io.*;
import java.util.List;

public class FileTest {
	public void dis(){
		System.out.println("hahahahaha");
	}
	public static void main(String[] args) throws Exception {
//		File file = new File("/opt/中文");
//        System.out.println(file.isFile()+"   "+file.isDirectory());
//        System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.getAbsoluteFile());
//		System.out.println(file.getAbsoluteFile().getParent());
//        if(!file.exists()){
//            System.exit(1);
//        }
//        File tmpFile = File.createTempFile("aaa", ".txt", file);
//		tmpFile.deleteOnExit();



		File newFile = new File("/disk");
//		System.out.println("newFile对象是否存在：" + newFile.exists());
//		newFile.createNewFile();
//		newFile.mkdir();
		String[] fileList = newFile.list();
		System.out.println("====当前路径下所有文件和路径如下====");
		for (String fileName : fileList)
		{
			System.out.println(fileName);
		}
//		File[] roots = File.listRoots();
//		System.out.println("====系统所有根路径如下====");
//		for (File root : roots)
//		{
//			System.out.println(root);
//		}
	}
	public static void showfile(File f){
		if(f.isDirectory()){
			File[] l=f.listFiles();
			for(File f1:l){
				if(f1.isDirectory()){
					showfile(f1);
				}else{
					System.out.println(f.getName());
				}
			}
		}else{
			System.out.println(f.getName());
		}
	}
}


