package OOPSFile;

public class GetterAndSetter {
   static class employ {

       private String name;
       private String Addresh;


       public String getName(){
           return name;
       }
       public void setName(String n){
           name=n;
       }
       public String getAddresh(){
           return Addresh;
       }
       public void setAddresh(String a){
           Addresh=a;
       }
   }
    public static void main(String[] args) {
       employ e=new employ();
       e.setName("biju");
       e.setAddresh("Ktm");
        System.out.println(e.getName()+" "+e.getAddresh());

    }
}
