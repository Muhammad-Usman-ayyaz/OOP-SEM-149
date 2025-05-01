public class PermitHolder extends Person{
    public static int id = 1000;
    public PermitHolder(String name){
        super(name);


    }

    @Override
    public String toString(){
        return "Name: " + getname() + ", Permit ID: " + (++id);
    }

}