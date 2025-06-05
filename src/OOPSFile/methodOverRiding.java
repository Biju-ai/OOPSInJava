package OOPSFile;

import com.sun.security.jgss.GSSUtil;

class SmartPhone{
    public void f1(){
        System.out.println("callint,adding");
    }
}
class AdSmartPhone extends SmartPhone{
    public void f1(){
        System.out.println("callint,adding in f2");
    }

    public void f2(){
        System.out.println("video call,new feature");
    }
}
public class methodOverRiding {
    public static void main(String[] args) {
        AdSmartPhone a=new AdSmartPhone();
        a.f1();
        a.f2();

    }
}
