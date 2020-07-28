package org.architecture.oop.oopextends.example;

/**
 * @author yanghai
 * @since 2020/7/23 00:43
 */
public class Elephant {

    private double width, height;
    private IceBox iceBox;
    private String name;

    public Elephant(String name) {
        super();
        this.name = name;
    }

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

    public IceBox getIceBox() {
        return iceBox;
    }

    public void setIceBox(IceBox iceBox) {
        this.iceBox = iceBox;
    }

    public void enter() {
        if ((width < iceBox.getWidth()) && (height < iceBox.getHeight())) {
            System.out.println(this.name + "笨重地进入");
            System.out.println(this.name + "的尺寸：");
            System.out.println(width);
            System.out.println(height);

            System.out.println(iceBox.getName() + "的尺寸：");
            System.out.println(iceBox.getWidth());
            System.out.println(iceBox.getHeight());
        }
    }
}

