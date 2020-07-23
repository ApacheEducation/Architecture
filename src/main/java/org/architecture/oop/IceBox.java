package org.architecture.oop;

/**
 * @author yanghai
 * @since 2020/7/23 00:45
 */
public class IceBox {

    private String name;
    private double width;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void open() {
        System.out.println(this.name + "门被打开");
    }

    public void close() {
        System.out.println(this.name + "门被关闭");
    }

}


