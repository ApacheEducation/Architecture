package org.file.vi.tran;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 3747102987888951148L;
    private String name;
    private transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}