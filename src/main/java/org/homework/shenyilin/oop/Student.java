package org.homework.shenyilin.oop;

public class Student extends Person{
    private String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public Student(String name,String code){
        this.setName(name);
        this.setCode(code);
    }

}
