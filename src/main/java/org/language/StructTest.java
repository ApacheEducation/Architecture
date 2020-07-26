package org.language;

/**
 * Created by yanghai on 16-8-4.
 */
class Email{
    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String fromAddr;
    private String toAddr;
    private String title;
    private String context;
    public void send(){
        System.out.println(this.fromAddr+"  "+this.toAddr+"  "+this.title+"  "+this.context);
    }



}
public class StructTest {
    public static void main(String[] args) {
//        Email mail1=new Email();
//        mail1.send();
        Email email2=new Email();

        email2.send();
    }
}
