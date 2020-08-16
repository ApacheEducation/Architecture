package org.homework.shenyilin.newoop;

import java.util.ArrayList;

public class Province {
    private String pName;
    private String pCode;
    private ArrayList<School> schools=null;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    public Province(String name, String code,ArrayList<School> schools){
        this.pName=name;
        this.pCode=code;
        this.schools=schools;
    }

    @Override
    public String toString() {
        return "Province{" +
                "pName='" + pName + '\'' +
                ", pCode='" + pCode + '\'' +
                ", schools=" + schools +
                '}';
    }
}
