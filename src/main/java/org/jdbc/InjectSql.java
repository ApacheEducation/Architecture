package org.jdbc;

/**
 * Created by yanghai on 16-7-16.
 */
public class InjectSql {
    public void login(String username,String password){
        String sql="select * from user where username='1\' or 1=1;' # and password=?";

        System.out.println(sql);
//        select * from user where username='1' or 1=1;

    }

    public static void main(String[] args) {
        InjectSql is=new InjectSql();
        String u="1' or 1=1; #";
        String p="ewfrwerwerfr";
        is.login(u,p);
    }
}
