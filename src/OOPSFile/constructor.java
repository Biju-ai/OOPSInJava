package OOPSFile;
class employ{
    private String name;
    private int id;

    //Constructor

    public employ(){  //defalut constructor
        name="biu";
        id=3;

    }
    public employ(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class constructor {
    public static void main(String[] args) {
        employ ob=new employ();
        employ ob1=new employ("heheh",1);

        System.out.println(ob.getId()+" "+ob.getName());
        System.out.println(ob1.getId()+" "+ob1.getName());


    }
}
