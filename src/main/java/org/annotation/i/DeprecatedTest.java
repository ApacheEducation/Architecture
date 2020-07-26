package org.annotation.i;
@Deprecated
class Apple1 {
    @Deprecated
    public void info() {
        System.out.println("aaaa");
    }

    @Deprecated
    private String str;
}

public class DeprecatedTest {
    public static void main(String[] args) {

        new Apple1().info();
        
    }
}

