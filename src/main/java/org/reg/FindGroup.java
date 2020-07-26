package org.reg;

import java.util.regex.*;

public class FindGroup {
    public static void main(String[] args) {
        String str = "姓名：a1；电话：13111111111"
                + "姓名：b1；电话：18611111111"
                + "姓名：c1；电话：13711111111"
                + "姓名：d1；电话：13511111111";
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}")
                .matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        m.find(30);//从第30个开始搜
        System.out.println(m.group());
        m.find(60);
        System.out.println(m.group());
    }
}

