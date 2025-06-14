package OOPSFile;
enum Status{
    apple,ball,cat,dog
}
public class Enum {
    public static void main(String[] args) {
        Status s=Status.apple;

        switch (s){
            case apple:
                System.out.println("this is a app");
                break;

            case ball:
                   System.out.println("this is a ball");
                   break;

            case cat:
                System.out.println("this is a cat");

            default:
                    System.out.println("this is a dog");
                    break;
        }


         //This part is for using the if else condition

//        if(s== Status.apple){
//            System.out.println("this is a apple ");
//        }
//        else if(s==Status.ball){
//            System.out.println("this is a ball");
//        } else if (s==Status.cat) {
//            System.out.println("this is cat");
//
//        }
//        else{
//            System.out.println("this is a dog");
//        }
//

        // This part is printing for  all the consent variable of emums

            //        Status[] arr = Status.values();
            //
            //        for (Status a : arr) {
            //            System.out.print(a+" ");
            //
            //        }

    }

}
