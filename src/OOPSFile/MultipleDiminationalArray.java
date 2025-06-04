package OOPSFile;

public class MultipleDiminationalArray {
    public static void main(String[] args) {

//        int array[][] = {
//                {2, 4, 5},
//                {2, 4, 6},
//                {1, 3, 5}
//        };
//        System.out.println(array[1][1]);
//    }

        int array[][]=new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j]=(int)(Math.random()*10);
                    System.out.print(array[i][j] +" ");
                }
            System.out.println();
            }
        }
}
