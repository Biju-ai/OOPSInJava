package OOPSFile;

import jdk.dynalink.beans.StaticClass;

public class ClassAndMethod {

     static class animal{
        public void color(){
            System.out.println("vggg");
        }
        public int pri (int car){
            return 10;
        }

    }
    public static void main(String[] args) {
        animal obj =new animal();
obj.color();

int n=obj.pri(10);
        System.out.println(n);
    }
}
