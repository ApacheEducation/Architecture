package org.i18n;

import java.util.*;

public class LocaleTest {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);//native2ascii 中文资源文件 unicode目标资源文件
//		Locale otherLocale=Locale.US;

        ResourceBundle bundle = ResourceBundle
                .getBundle("mess", myLocale);//mess_zh_CN.properties_
//        ResourceBundle otherbundle = ResourceBundle
//                .getBundle("mess", otherLocale);

        System.out.println(bundle.getString("hello"));
//        System.out.println(otherbundle.getString("hello"));
    }
}
