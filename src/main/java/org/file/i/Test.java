package org.file.i;
import com.sun.tools.javac.main.Main;


import java.io.File;

/**
 * Created by yanghai on 16-4-23.
 */
public class Test extends File{
    private String pathname;
    public Test(String pathname) {
        super(pathname);
        this.pathname=pathname;
    }
    @Override
    public String toString() {
        return "file path is: "+pathname;
    }
    public static void main(String[] args) {
//        Test file=new Test("/opt/b.txt");
//        System.out.println(file);

        try{
            FileTest ft=new FileTest();
            ft.dis();
        }catch (Error e){
//            System.out.println("=================");
//            org.file.i_0.FileTest ft=new org.file.i_0.FileTest();
//            ft.dis();
        }
    }
}

