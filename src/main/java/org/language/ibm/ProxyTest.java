package org.language.ibm;

/**
 * Created by yanghai on 16-10-20.
 */

public class ProxyTest {
    public static void main(String[] args) {
        org.language.ibm.ibmpro.IBM ibm=new org.language.ibm.ibmpro.IBM();
        ibm.saleComputer();
    }
}
