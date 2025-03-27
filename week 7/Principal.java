public class Principal extends Person {
    private int experiance;
    public Principal(String name, int age, int experiance) {
        super(name, age);
        this.experiance = experiance;
    }
    public int getExperiance() {
        return experiance;
    }
    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    @Override
    public String toString() {
        System.out.println("Principal : ");
        return super.toString() + " Experience : " + experiance;
    }
}
