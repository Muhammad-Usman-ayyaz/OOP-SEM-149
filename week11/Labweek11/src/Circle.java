public class Circle extends Shape2D {
    private double radius;
    Point center = new Point(0,0);
    public Circle(String name , double radius) {
        super(name);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        System.out.print("Circle area : ");
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return " " +
                  area() ;
    }
    @Override
    public void drawable() {
        System.out.println("Drawable of circle :  ");
    }

}
