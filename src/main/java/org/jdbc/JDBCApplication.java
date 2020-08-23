package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author yanghai
 * @since 2020/8/23 17:14
 */
public class JDBCApplication {

    public static void main(String[] args) throws Exception {
//        Connection connection = JdbcClient.getInstance().getConnection();
//        JdbcClient.getInstance().closeConnection(connection);

        //创建表
//        String createTable = "CREATE TABLE IF NOT EXISTS `user`("
//                + "`id` INT UNSIGNED AUTO_INCREMENT,"
//                + " `user_name` VARCHAR(100),"
//                + " `user_password` VARCHAR(100),"
//                + " `user_age` INT(11),"
//                + "PRIMARY KEY ( `id` )"
//                + ")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
//        Connection connection = JdbcClient.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        PreparedStatement preparedStatement = connection.prepareStatement(createTable);
//        preparedStatement.execute();
//        connection.commit();
//        JdbcClient.getInstance().closeConnection(connection);

        //增加
//        String insertTable = "INSERT INTO USER (user_name,user_password,user_age) VALUES('MRsLi','123456',18)";
//        Connection connection = JdbcClient.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        PreparedStatement preparedStatement = connection.prepareStatement(insertTable);
//        preparedStatement.execute();
//        connection.commit();
//        JdbcClient.getInstance().closeConnection(connection);


        //修改
//        String updateTable = "UPDATE USER SET user_name = 'Li' WHERE USER.id = 1";
//        Connection connection = JdbcClient.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        PreparedStatement preparedStatement = connection.prepareStatement(updateTable);
//        preparedStatement.execute();
//        connection.commit();
//        JdbcClient.getInstance().closeConnection(connection);


        //查找
//        String querySql = "SELECT * FROM USER";
//        Connection connection = JdbcClient.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        PreparedStatement preparedStatement = connection.prepareStatement(querySql);
//        //执行查询语句并返回结果集
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            //注意：这里要与数据库里的字段对应
//            String username = resultSet.getString("user_name");
//            String password = resultSet.getString("user_password");
//            String age = resultSet.getString("user_age");
//            System.out.println(username + " " + password + " " + age);
//        }
//        connection.commit();
//        JdbcClient.getInstance().closeConnection(connection);

        //删除
        String deleteSql = "DELETE FROM USER WHERE USER.id = 1";
        Connection connection = JdbcClient.getInstance().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
        preparedStatement.execute();
        connection.commit();
        JdbcClient.getInstance().closeConnection(connection);
    }
}
