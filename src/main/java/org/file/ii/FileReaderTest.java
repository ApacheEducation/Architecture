package org.file.ii;

import java.io.*;
import java.nio.charset.Charset;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/opt/test/nohup.out");
            BufferedReader br = new BufferedReader(fr);
           new String();
			String str = "";
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
//            char[] cbuf = new char[32];
//            int hasRead = 0;
//            while ((hasRead = fr.read(cbuf)) > 0) {
//                System.out.print(new String(cbuf, 0, hasRead));
//            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
