package OOPSFile;
abstract  class AA{
    public abstract void Show();

}
public class AnanymousInnerClass {
    public static void main(String[] args) {
        AA obj=new AA(){
            public   void Show(){
                System.out.println("way good for life");

            }
        };
        obj.Show();
    }
}
