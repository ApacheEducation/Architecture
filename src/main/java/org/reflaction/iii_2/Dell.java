package org.reflaction.iii_2;

/**
 * Created by yanghai on 16-10-20.
 */
public class Dell implements Coper {
    @Override
    public int  sale(int i) {
        System.out.println("DELL sale "+i);
        return 999;
    }

    @Override
    public void product() {
        System.out.println("DELL product");
    }
}
