public abstract class Shape2D extends Shape{
    private boolean filled;
    public Shape2D(String name) {
        super(name);
        this.filled = false;
    }
    public abstract double area();


}
