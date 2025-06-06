public abstract class Shape implements Drawable {
    private final String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double area();

}
