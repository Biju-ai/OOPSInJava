package OOPSFile;

import org.w3c.dom.ls.LSOutput;

class A{
    public void aa(){
        System.out.println("aaaa");
    }
}
class B extends A{
    public void bb(){
        System.out.println("bbb");
    }
}
class C extends A{
    public void cc(){
        System.out.println("cccc");
    }
}
public class DynamicMethod {
    public static void main(String[] args) {
        A obj=new B();
        ((B) obj).bb();

        obj=new B();
        ((B) obj).bb();

        obj =new C();
        ((C) obj).cc();
    }
}
