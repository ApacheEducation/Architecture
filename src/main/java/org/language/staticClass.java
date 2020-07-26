package org.language;

/**
 * Created by yanghai on 16-8-2.
 */
class CCC{
    private int myint;
    public CCC(int myint){
        this.myint=myint;
        System.out.println("ccc"+myint);}
    public void dis(){
        System.out.println(myint);}
}
class TestStatic{
    static {
        int i=0;
    }
    CCC ccc=new CCC(1);
    private int xxx=10;
    public static String str;
    static {
        str="bbb";}
//    public static String str="bbb";//=>
    public TestStatic(){
        System.out.println("xxx:"+xxx);
        ccc=new CCC(2);
        System.out.println("struct");
    }
    {System.out.println("aaaaaaaaa");}
}
public class staticClass {
    public static void main(String[] args) {
//        System.out.println(TestStatic.str);
        TestStatic st=new TestStatic();
//        st.ccc.dis();
//        System.out.println(TestStatic.str);
//        System.out.println(TestStatic.str);
    }
}
