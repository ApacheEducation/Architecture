package org.i18n;

import java.util.*;
import java.text.*;

public class LocaleWithParamTest {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle
                .getBundle("myMess", currentLocale);
        String msg = bundle.getString("msg");
        System.out.println(msg);
        System.out.println(MessageFormat.format(msg
                , "xxx", new Date()));
//        String perstr="xxxx{0}aaaa{1}";
//        System.out.println(MessageFormat.format(perstr
//                , "xxx", new Date()));
    }
}
