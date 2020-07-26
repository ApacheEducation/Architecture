package org.reflaction.i.tools;

/**
 * Created by yanghai on 16-12-11.
 */
public class Tools {
    public static void start(String classname) throws Exception {
        Class c = Class.forName(classname);// X
        IRunanble t = (IRunanble) c.newInstance();
        t.run();
    }
}
