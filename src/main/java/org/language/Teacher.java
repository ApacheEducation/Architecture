package org.language;

/**
 * Created by yanghai on 16-4-24.
 */
public class Teacher extends Person implements IPerson,IOtherPerson {
    @Override
    public String print(){
        return "aaaaa";
    }

    @Override
    public void xxx() {
        System.out.println("xxxxxx");
    }


    public void dis(){
        System.out.println("bbbbbbbbbb");
    }

    @Override
    public void bbb() {

    }

    @Override
    public void aaa() {

    }
}
