package org.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

//
//mysql> DELIMITER $$
//mysql> USE test $$
//mysql> DROP PROCEDURE IF EXISTS `sp_add`$$
//
//mysql> CREATE PROCEDURE sp_add(a INT, b INT,OUT c INT)
//-> BEGIN
//-> SET c=a+ b;
//-> END$$
//
//mysql> DELIMITER ;
//
//mysql> CALL sp_add (1,2,@c);
//mysql> SELECT @c;
public class CallableStatementTest {
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement cstm = null;
        try {
            Class.forName(DRIVER_CLASS);

            connection = DriverManager.getConnection(URL, USERNAME,
                    PASSWORD);
            String sql = "{CALL sp_add(?,?,?)}"; // 调用存储过程
            cstm = connection.prepareCall(sql); // 实例化对象cstm
            cstm.setInt(1, 122);
            cstm.setInt(2, 2); //
            cstm.registerOutParameter(3, Types.INTEGER); // 设置返回值类型
            cstm.execute(); // 执行存储过程
            System.out.println(cstm.getInt(3));

        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                cstm.close();
            } catch (Exception e) {
                cstm = null;
            }
            try {
                connection.close();
            } catch (Exception e) {
                connection = null;
            }
        }
    }
}