package org.myenum.iv;

public enum Gender implements GenderDesc {
    MALE("n") {
        public void info() {
            System.out.println("n");
        }
    },
    FEMALE("nv") {
        public void info() {
            System.out.println("nv");
        }
    };
    private final String sex;

    private Gender(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void info() {
        System.out.println("xxxx");
    }
}
