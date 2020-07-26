package org.file.vi.custom;

import java.io.Serializable;

/**
 * Created by yanghai on 16-4-30.
 */
public class Person1 implements Serializable {
    private String name;

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
    public String toString(){
        return "";
    }
    private static final long serialVersionUID = 1L;
}
