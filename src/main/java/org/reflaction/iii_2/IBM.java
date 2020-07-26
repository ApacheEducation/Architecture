package org.reflaction.iii_2;

/**
 * Created by yanghai on 16-10-20.
 */
public class IBM implements Coper {
    @Override
    public int sale(int i) {
        System.out.println("IBM sale "+i);
        return 10;
    }

    @Override
    public void product() {
        System.out.println("IBM product");
    }
}
