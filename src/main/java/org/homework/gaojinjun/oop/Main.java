package org.homework.gaojinjun.oop;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    private static Stu[] stu;
    private static int N;
    private static Scanner sc;
    public void search(String name) {
        int m=0;
        for(int i=0;i<N;i++) {
            if(stu[i].getStuNa().equals(name)) {
                System.out.println(stu[i].getProId()+"\t"+stu[i].getStuSch()+"\t"+stu[i].getStuNa());
                m=1;}
        }
        if(m==0)
            System.out.println("No this student!");

    }
    public void cha(String pro) {
        int p=0;
        for(int i=0;i<N;i++) {
            if(stu[i].getProId().equals(pro)) {
                System.out.println(stu[i].getProId()+"\t"+stu[i].getStuSch()+"\t"+stu[i].getStuNa());
                p=1;}
        }
        if(p==0)
            System.out.println("No this Province Id!");

    }
    public void insert(int m,String id,String name,String sex) {
        stu=Arrays.copyOf(stu,N+1);
        for(int i=N;i>m;i--)
            stu[i]=stu[i-1];
        stu[m]=new Stu(id,name,sex);
        N++;
        for(int i=0;i<N;i++)
            System.out.println(stu[i].getProId()+"\t"+stu[i].getStuSch()+"\t"+stu[i].getStuNa());
    }
    public void delete(String name) {
        int s=0;
        for(int i=0;i<N;i++)
            if(stu[i].getStuNa().equals(name))
                s=i;
        for(int i=s;i<N-s;i++) {
            stu[i]=stu[i+1];
        }
        N--;
        for(int i=0;i<N;i++) {
            System.out.println(stu[i].getProId()+"\t"+stu[i].getStuSch()+"\t"+stu[i].getStuNa());
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        N=sc.nextInt();
        stu=new Stu[N];
        stu[0]=new Stu("001","一中","赵一");
        stu[1]=new Stu("002","二中","钱二");
        stu[2]=new Stu("003","三中","孙三");
        stu[3]=new Stu("004","四中","李四");
        stu[4]=new Stu("005","五中","周五");
        stu[5]=new Stu("006","六中","郑六");
        for(int i=0;i<N;i++)
        {System.out.println(stu[i].getProId()+"\t"+stu[i].getStuSch()+"\t"+stu[i].getStuNa());}
        Main oc=new Main();
        System.out.println("请输入需查找学生姓名:");
        oc.search(sc.next());
        System.out.println("请输入需查找省编号:如001");
        oc.cha(sc.next());
        System.out.println("请输入要插入哪个后面及插入的学生信息：");
        oc.insert(sc.nextInt(), sc.next(), sc.next(), sc.next());
        System.out.println("请输入需删除学生姓名：");
        oc.delete(sc.next());
    }
}
