package org.reflaction.i_2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by yanghai on 16-10-17.
 */
public class ObjToSQL {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "org.reflaction.i_2.Car";
        Class c = Class.forName(className);
        Field fields[] = c.getDeclaredFields();
        //create table car(id int,name varchar(30),color varchar(30));
        StringBuffer sqlb=new StringBuffer("create table car(");
        for (Field f : fields) {
            Class type = f.getType();
            String name=f.getName();
            switch (type.getName()){
                case "java.lang.String":
                    sqlb.append(name+" varchar("+30+"),");
                    break;
                case "int":
                    sqlb.append(name+" int,");
                    break;
            }
        }
        String sql=sqlb.toString();
        sql=sql.substring(0,sql.length()-1)+");";
        System.out.println(sql);
    }
}
