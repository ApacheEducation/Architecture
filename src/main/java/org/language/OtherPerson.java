package org.language;

/**
 * Created by yanghai on 16-4-24.
 */
abstract public class OtherPerson {

    private int age;

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

    private String name;

    public String print(){
        return "name is: "+name+" and his age is: "+age;
    }
    abstract public void xxx();

}

