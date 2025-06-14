package OOPSFile;
class Z {
    private int i;

    public void first() {
        System.out.println("HEHE");
    }

 class X {
        public void second() {
            System.out.println("second file");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Z o= new Z();
        o.first();

        Z.X obj=o.new X();
        obj.second();

    }
}