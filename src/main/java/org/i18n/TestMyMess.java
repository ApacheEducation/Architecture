package org.i18n;

import java.text.MessageFormat;
import java.util.Date;

/**
 * Created by yanghai on 16-4-26.
 */
public class TestMyMess {
    public static void main(String[] args) {
        myMess_zh_CN m = new myMess_zh_CN();
        System.out.println(MessageFormat.format(m.getString("msg")
                , "xxx", new Date()));
        myMess_en_US m1 = new myMess_en_US();
        System.out.println(MessageFormat.format(m1.getString("msg")
                , "xxx", new Date()));
    }
}
