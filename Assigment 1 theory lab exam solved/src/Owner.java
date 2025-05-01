public class Owner extends Person{
    public static int id = 0;
    public Owner(String name){
        super(name);

    }
    @Override
    public String getname(){
        return super.getname();
    }
    @Override
    public String toString(){
        System.out.print("Owner: ");
        return "[Name: " + getname() + ", Owner ID: 000" + (++id) + "]";
    }
}