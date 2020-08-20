package org.homework.gaojinjun.oop;

public class Stu {
    private String proId;
    private String stuSch;
    private String stuNa;
    public Stu(String proId, String stuSch, String stuNa) {
        super();
        this.proId = proId;
        this.stuSch = stuSch;
        this.stuNa = stuNa;
    }
    public String getProId() {
        return proId;
    }
    public void setProId(String proId) {
        this.proId = proId;
    }
    public String getStuSch() {
        return stuSch;
    }
    public void setStuSch(String stuSch) {
        this.stuSch = stuSch;
    }
    public String getStuNa() {
        return stuNa;
    }
    public void setStuNa(String stuNa) {
        this.stuNa = stuNa;
    }
}
