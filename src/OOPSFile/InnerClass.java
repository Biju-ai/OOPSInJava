package OOPSFile;
class Z {
    private int i;

    public void first() {
        System.out.println("HEHE");
    }

    static class X {
        public void second() {
            System.out.println("second file");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
//        Z o= new Z();
//        o.first();
//
//        Z.X b=o.new X();
//        b.second();           //with out making the static inner clss

        Z.X p = new Z.X();       //with statis in inner calss


        Z o = new Z();
        o.first();

        Z.X g = o.new X();

        Z.X p = new Z.X();
    }
}