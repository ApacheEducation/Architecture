package org.i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.ListResourceBundle;

public class myMess_en_US extends ListResourceBundle {
    private final Object myData[][] = {
                    {"msg", "{0}，hello！taday is {1}"}
            };

    public Object[][] getContents() {
        return myData;
    }
}
