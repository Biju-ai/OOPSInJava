package OOPSFile;
abstract class Honda{
    public void drive(){
        System.out.println("thican fly");
    }

    //Once you declare the abstract class then you have to imolement in main class and the abstract class method should be implement in
 //   inheritate property or child class
   abstract public void ride();

}
class Car extends Honda{
    public void ride(){
        System.out.println("jfjrj");
    }
    public void sing(){
        System.out.println("it can jsin");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
     Car o=new Car();
         o.ride();
         o.sing();

    }
}
