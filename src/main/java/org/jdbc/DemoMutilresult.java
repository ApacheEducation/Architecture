package org.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//create table test(name varchar(30),content varchar(100));
//        DELIMITER $$
//        USE test $$
//        DROP PROCEDURE IF EXISTS `test_select`$$
//        create procedure test_select()
//        Begin
//        declare a varchar(30);
//        declare b varchar(100);
//        select name,content from test where name='aaa';
//        End$$
//        DELIMITER ;
public class DemoMutilresult {
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);
			String sql = "{call test_select()}";
			st = con.prepareCall(sql);
			boolean flag = st.execute();
			int i = 0;
			while (flag) {
				System.out.println("第几个结果集" + (++i));
				rs = st.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getString(2));
				}
				flag = st.getMoreResults();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			}catch (Exception e) {
				rs=null;
			}
			try {
				st.close();
			}catch (Exception e) {
				st=null;
			}
			try {
				con.close();
			}catch (Exception e) {
				con=null;
			}
		}
	}
}