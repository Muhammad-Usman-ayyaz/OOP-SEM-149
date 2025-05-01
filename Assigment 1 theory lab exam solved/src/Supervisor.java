public class Supervisor extends Person{
    public int experiance;
    public Supervisor(String name , int experiance){
        super(name);
        this.experiance=experiance;

    }
    @Override
    public String toString(){
        return "Supervisor: Name: " + getname() + ", Experience: " + experiance + " years";
    }

}