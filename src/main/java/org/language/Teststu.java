package org.language;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanghai on 16-11-27.
 */
class Sub{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
class Stu{
    private String id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Tea> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Tea> teachers) {
        this.teachers = teachers;
    }
    public List<Sub> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<Sub> subjects) {
        this.subjects = subjects;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String name;
    private List<Tea> teachers=new ArrayList<Tea>();
    private List<Sub> subjects=new ArrayList<Sub>();

}
class Tea{
    private String id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Stu> getStudents() {
        return students;
    }
    public void setStudents(List<Stu> students) {
        this.students = students;
    }
    public List<Sub> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<Sub> subjects) {
        this.subjects = subjects;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String name;
    private List<Stu> students=new ArrayList<Stu>();
    private List<Sub> subjects=new ArrayList<Sub>();
}
public class Teststu {
    public static void main(String[] args) {
        Sub s1=new Sub();
        s1.setName("ch");
        Sub s2=new Sub();
        s1.setName("en");
        Tea t1=new Tea();
        t1.getSubjects().add(s1);
        t1.getSubjects().add(s2);
        Stu stu1=new Stu();
        stu1.setName("aaa");
        stu1.getSubjects().add(s1);
        stu1.getSubjects().add(s2);

        t1.getStudents().add(stu1);
        stu1.getTeachers().add(t1);

        List<Stu> stulist=new ArrayList();
        stulist.add(stu1);

        List<Tea> tealist=new ArrayList();
        tealist.add(t1);


        for(Stu stu:stulist){
            List teas=stu.getTeachers();

        }
    }
}
