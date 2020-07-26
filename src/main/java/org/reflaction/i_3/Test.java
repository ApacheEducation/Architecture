package org.reflaction.i_3;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by yanghai on 16-10-20.
 */
class Moble{
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Test {
    public static void main(String[] args) {
        Properties properties=new Properties();
        try {
            Class clazz = Class.forName("Moble");
            Moble moble = (Moble) clazz.newInstance();
            properties.load(new FileInputStream("xxx.properties"));
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                String propname = f.getName();
                String methodname = "set" +
                        propname.substring(0, 1).toUpperCase()
                        + propname.substring(1, propname.length());
                Method method = clazz.getMethod(methodname, f.getType());
                method.invoke(moble, properties.getProperty(propname));
//                Field field=clazz.getDeclaredField(str);
//                field.setAccessible(true);
//                field.set(moble,properties.get(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
