package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root"; 

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		com.mysql.jdbc.Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			con.setAutoCommit(false);
			st=con.createStatement();
			stmt=(com.mysql.jdbc.Statement) con.createStatement();
			st.setFetchSize(1);
			stmt.enableStreamingResults();
			for(long i=0;i<10000000;i++){
				st.execute("insert into ordertest values("+i+",'a"+i+"','1988-12-12',"+i+",'aaa','13114898799')");
			}
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (Exception e) {
				st = null;
			}
			try {
				con.close();
			} catch (Exception e) {
				con = null;
			}
		}
	}
}
