package org.jdbc;

import java.sql.*;

/**
 * Created by yanghai on 16-6-25.
 */
public class JDBCExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            stmt = conn.createStatement();
//            PreparedStatement pstm=conn.prepareStatement("select * from xxx where id=?");
//            pstm.setInt(1,1);
//            pstm.executeQuery();

            String sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);
            printRs(rs);

            // delete rows having ID grater than 104
            // But save point before doing so.
            Savepoint savepoint1 = conn.setSavepoint("ROWS_DELETED_1");
            System.out.println("Deleting row....");
            String SQL = "DELETE FROM Employees " +
                    "WHERE ID = 110";
            stmt.executeUpdate(SQL);
            // oops... we deleted too wrong employees!
            //Rollback the changes after save point 2.
            conn.rollback(savepoint1);

            //delete rows having ID grater than 104
            // But save point before doing so.
            Savepoint savepoint2 = conn.setSavepoint("ROWS_DELETED_2");
            System.out.println("Deleting row....");
            SQL = "DELETE FROM Employees " +
                    "WHERE ID = 95";
            stmt.executeUpdate(SQL);

            //Now list all the available records.
            sql = "SELECT id, first, last, age FROM Employees";
            rs = stmt.executeQuery(sql);
            System.out.println("List result set for reference....");
            printRs(rs);

            conn.commit();
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
            try{
                if(conn!=null)
                    conn.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public static void printRs(ResultSet rs) throws SQLException{
        rs.beforeFirst();
        while(rs.next()){
            int id = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");
            System.out.print("ID: " + id);
            System.out.print(", Age: " + age);
            System.out.print(", First: " + first);
            System.out.println(", Last: " + last);
        }
        System.out.println();
    }



}
