package org.language;

import java.util.HashMap;

/**
 * Created by yanghai on 16-7-27.
 */
public class YyyPlane extends Plane {
    @Override
    public boolean fly(int c, int b) {
        HashMap map=new HashMap();
        map.put("","");
        System.out.println("yyy fly");
        return false;
    }
}
