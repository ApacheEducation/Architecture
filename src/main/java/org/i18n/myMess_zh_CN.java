package org.i18n;

import java.text.MessageFormat;
import java.util.*;

public class myMess_zh_CN extends ListResourceBundle {
    private final Object myData[][] = {
                    {"msg", "{0}，你好！今天是 {1}"}
            };

    public Object[][] getContents() {
        return myData;
    }


}

