public class Person{
    private String name;
    public Person(String name){
        this.name=name;

    }
    public String getname(){
        return name;
    }
   @Override
    public String toString(){
        return "\n"+name;
   }

}