public class Sphere extends Shape3D  {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Sphere(String name , double radius){
        super(name);
        this.radius=radius;
    }

    @Override
    public double area() {
        System.out.print("Sphere area : ");
        return  4*Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        System.out.print("Sphere volume : ");
        return (double) 4 /3 * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return " " +
                  area() + " \n " + volume() ;
    }
    @Override
    public void drawable() {
        System.out.println("Drawable of sphere :  ");
    }
}
