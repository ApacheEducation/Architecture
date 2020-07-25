package org.architecture.oop.base;

/**
 * @author yanghai
 * @since 2020/7/23 20:52
 */
public class Person {

    private String name;

    private int age;

    private String address;

    private String numberIdentify;

    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberIdentify() {
        return numberIdentify;
    }

    public void setNumberIdentify(String numberIdentify) {
        this.numberIdentify = numberIdentify;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
