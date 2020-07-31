package org.homework.shenyilin.oop;



public class Teacher extends Person{
    private String subject;
    public String getSubject1() {
        return subject;
    }

    public void setSubject1(String subject1) {
        this.subject = subject1;
    }
    public Teacher(){

    }
    public Teacher(String name,String code){
        this.setName(name);
        this.setCode(code);
    }
}
