package org.language;

/**
 * Created by yanghai on 16-11-20.
 */
public class MyHttp extends MyHttpServlet {
    @Override
    public void doPut(MyHttpRequest res, MyHttpResponse resp) throws Exception {
        System.out.println("extends ");
    }


}
