package org.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author yanghai
 * @since 2020/8/23 16:27
 */
@Slf4j
public class JdbcClient {

    private final String DB_URL;
    private final String DB_USER;
    private final String DB_PASSWORD;
    private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private JdbcClient() {
        DB_URL = "jdbc:mysql://localhost:3306/myjdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        DB_USER = "root";
        DB_PASSWORD = "root";
        try {
            //加载JDBC驱动
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            log.error("加载失败");
        }
    }

    //饿汉式
    private final static JdbcClient instance = new JdbcClient();

    public static JdbcClient getInstance() {
        return instance;
    }

    /**
     * 获取连接
     */
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            log.error("获取链接失败");
        }
        return null;
    }

    /**
     * 关闭链接
     */
    public void closeConnection(Connection connection) {
        try {
            if (null == connection) {
                return;
            }
            connection.close();
        } catch (Exception e) {
            log.error("{} 关闭失败", connection.toString());
        }
    }
}
