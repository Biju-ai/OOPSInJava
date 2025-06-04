package OOPSFile;
class Anonymous{
    public Anonymous(){
        System.out.println("Created");
    }
    public void show(){
        System.out.println("New Object");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new Anonymous().show();

    }
}
