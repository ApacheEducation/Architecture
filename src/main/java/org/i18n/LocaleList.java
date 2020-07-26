package org.i18n;

import java.util.*;

public class LocaleList {
    public static void main(String[] args) {
        // 国家和语言的数组
        Locale[] localeList = Locale.getAvailableLocales();
        for (int i = 0; i < localeList.length; i++) {
            System.out.println(localeList[i].getDisplayCountry()
                    + "=" + localeList[i].getCountry() + " "
                    + localeList[i].getDisplayLanguage()
                    + "=" + localeList[i].getLanguage());
        }

        dis("aaa","dddd","ccc","ddd");

    }
    public static void dis(String ... strs){
        for (String str:strs
             ) {
            System.out.println(str);

        }
    }
}

