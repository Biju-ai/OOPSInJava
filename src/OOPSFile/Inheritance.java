package OOPSFile;

public class Inheritance {
    public static void main(String[] args) {
        CalculatorInheritance obj=new CalculatorInheritance();
        int a=obj.add(1,6);
        int b=obj.add(1,3,5);
        System.out.println(a);
        System.out.println(b);
        AdvanceCalculatorInheritance o=new AdvanceCalculatorInheritance();
        int c=o.add(2,5);
        System.out.println(c);
        int d=o.multiply(2,8);
        System.out.println("The multiplection number is :"+d);
    }
}
