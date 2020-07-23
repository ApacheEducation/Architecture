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

   //构造方法 默认构造方法
    public Person() {

    }

//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(String name, int age, String address, String numberIdentify, String sex) {
//         this.name = name;
//         this.age = age;
//         this.sex = sex;
//    }

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
