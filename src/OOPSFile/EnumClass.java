package OOPSFile;
enum Laptop{
    Macbook(2000),Acer(3000),Lenovo(4000),Hp(6000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop[] l=Laptop.values();
        for(Laptop lp:l){
            System.out.println(lp+" :"+lp.getPrice());
        }

    }
}
