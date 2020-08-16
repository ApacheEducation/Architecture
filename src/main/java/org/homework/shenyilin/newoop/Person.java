package org.homework.shenyilin.newoop;

public class Person {
    private String name;
    private String code;
    private int age;
    private String tel;
    private String sex;
//    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void Person(String name,String code){
        this.name=name;
        this.code=code;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                '}'+'\n';
    }
}
