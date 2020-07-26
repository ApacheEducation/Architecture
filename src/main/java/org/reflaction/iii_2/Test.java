package org.reflaction.iii_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by yanghai on 16-10-20.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties p=new Properties();
        p.load(new FileInputStream("/disk/test/iotest/src/org/reflaction/iii_2/xxxx.properties"));

        Coper ibm= (Coper) Class.forName(p.get("target").toString()).newInstance();
        EJG e=new EJG();
        e.setTarget(ibm);
        Coper ejg=CoperProxyFactory.getProxy(ibm,e);
        int res=ejg.sale(1);
        System.out.println(res);
    }
}
