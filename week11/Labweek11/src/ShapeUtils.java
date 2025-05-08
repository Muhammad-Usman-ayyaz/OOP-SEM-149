import org.w3c.dom.css.Rect;

public class ShapeUtils {
    public static void increaselenghths(Shape[] shapes , double length){
        for (Shape shape : shapes) {
            if(shape instanceof Rectangle){
                double gotlength = ((Rectangle) shape).getHeight();
                if (gotlength < length) {
                    double newLength = gotlength + length;
                    ((Rectangle) shape).setHeight(newLength);
                }

            }
        }

    }
    public static void displayshapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());

        }
    }
    public void drawShapes(Drawable[] drawables){
        for (Drawable drawable : drawables) {
            drawable.drawable();
        }
    }
    public boolean doRectanglesIntersect(Rectangle r1, Rectangle r2) {
        r1.setcorners();
        r2.setcorners();
        return !(r1.TopRightcorner.getX() < r2.BottomleftCorner.getX()||
                r2.TopRightcorner.getX() < r1.BottomleftCorner.getX() ||
                r1.TopRightcorner.getY()> r2.BottomleftCorner.getY() ||
                r2.TopRightcorner.getY() > r1.BottomleftCorner.getY());
    }

}
