package org.language;

/**
 * Created by yanghai on 16-5-7.
 */
public class Car implements Cloneable {
    private String name;
    public String getWheel() {
        return wheel;
    }

    private String wheel;

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
    public void run(){

    }
    public Car printmyself() throws CloneNotSupportedException {
        Car car = (Car) this.clone();
        car.setWheel("aaaa");
        return car;
    }
    public void test(){
        System.out.println("adfadfad");
        tewtss();
        System.out.println("adfadfad");
        System.out.println("adfadfadfadfda");
    }

    private void tewtss() {
        System.out.println("adfadfadfadfda");
        System.out.println("adfadfad");
        System.out.println("adfadfadfadfda");
        System.out.println("adfadfad");
        System.out.println("adfadfad");
        System.out.println("adfadfadfadfda");
        System.out.println("adfadfadfadfda");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
