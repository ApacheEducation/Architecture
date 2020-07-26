package org.runtime;

import java.io.*;

public class ReadFromProcess
{
	public static void main(String[] args) throws InterruptedException {
		try{
			Process p = Runtime.getRuntime().exec("java -help");
			BufferedReader br = new BufferedReader(new
				InputStreamReader(p.getErrorStream()));
			String buff = null;
			while((buff = br.readLine()) != null)
			{
				System.out.println(buff);
			}
			p.waitFor();
			br.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}

