package OOPSFile;

class Q {
    double a = 3.8;
    int b = 2;

    public void typcas() {
        System.out.println(b);
    }
}
    class BC extends Q{

    public void typcas1(){
        System.out.println(b);
    }
}
public class UpcastingAndDownCasting {
    public static void main(String[] args) {

        Q ob=(Q)new BC();
        ob.typcas();

    }
}
