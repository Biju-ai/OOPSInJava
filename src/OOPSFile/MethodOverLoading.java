package OOPSFile;

public class MethodOverLoading {
    static  class Calculator{
        public int add(int a,int b){
            return a+b;
        }
        public int add(int a,int b,int c){
            return a+b+c;
        }
        public  Double subtract(Double a,Double b){
            return a+b;
        }
        public int subtract(int a, int b){
            return a-b;
        }
    }
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        int a=obj.add(4,6);
        int b=obj.add(2,4,5);
        Double c=obj.subtract(8.1,2.1);
        int d=obj.subtract(6,2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
