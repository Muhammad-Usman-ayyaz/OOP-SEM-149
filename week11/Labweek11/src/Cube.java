public class Cube extends Shape3D {
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        System.out.print("Cube area of :  " );
        return 6 * side * side ;
    }

    @Override
    public double volume() {
        System.out.print("volume of cube  : " );
        return side * side * side;
    }

    @Override
    public String toString() {
        return "" + area() + "\n" + volume() + " \n " + side;
    }

    @Override
    public void drawable() {
        System.out.println("Drawable of cube :  ");
    }
}
