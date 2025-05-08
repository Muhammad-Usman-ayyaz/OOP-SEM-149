public class Rectangle extends Shape2D  {
    private double width;
    private double height;
    Point TopLeftcorner;
    Point TopRightcorner;
    Point BottomrightCorner;
    Point BottomleftCorner;
    public Rectangle(String name,double width, double height) {
        super(name);
        this.width=width;
        this.height=height;


    }
    public double area(){
        System.out.print("Area of Rectangle : ");
        return width * height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    public String toString() {
        return " " + area();
    }
    @Override
    public void drawable() {
        System.out.println("Drawable of rectangle :  ");
    }
    public void setcorners(){
        BottomleftCorner=new Point(0,0);
        BottomrightCorner=new Point((int)(BottomleftCorner.getX() +width),0);
        TopLeftcorner=new Point(0,(int)(BottomleftCorner.getY()+height));
        TopRightcorner=new Point((int)(BottomleftCorner.getX()+width),(int)(BottomleftCorner.getY()+height));

    }

    public void setBottomleftCorner(Point bottomleftCorner) {
        this.BottomleftCorner=bottomleftCorner;
    }

    public Point getBottomleftCorner() {
        return BottomleftCorner;
    }
}
