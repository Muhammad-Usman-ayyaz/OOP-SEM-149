
public class Main {
    public static void main(String[] args) {
        double g = 5.0;
        Shape shape ;
        Shape2D shape2D;
        Shape3D shape3D;
        Circle circle=new Circle("Circle",25.0);
        System.out.println(circle.area());
        Rectangle rectangle=new Rectangle("rectangle",5.0,5.9);
        Cube cube=new Cube("cube",5.0);
        rectangle.setHeight(10);
        rectangle.setWidth(10);
        System.out.println(rectangle.area());
        Sphere sphere= new Sphere("Sphere",5.6);
        System.out.println(sphere.area());
        System.out.println(sphere.volume());
        System.out.println(cube.area());
        System.out.println(cube.volume());
        Shape[] arr = new Shape[20];
        arr[0]=cube;
        arr[1]=rectangle;
        arr[2]=circle;
        arr[3]=sphere;
        for (int i=4; i<arr.length-10; i++){
            circle.setRadius(g+i);
            arr[i]=circle;
        }
        for (int i=10; i<arr.length-5; i++){
            sphere.setRadius(g+i);
            arr[i]=sphere;
        }
        for (int i=15; i<arr.length; i++){
            cube.setSide(g+i);
            arr[i]=cube;
        }
        ShapeUtils shapeUtils=new ShapeUtils();
        ShapeUtils.displayshapes(arr);
        shapeUtils.drawShapes(arr);
        Rectangle rectangle2 = new Rectangle("REC" , 6.9 ,7.1);
        System.out.println(shapeUtils.doRectanglesIntersect(rectangle,rectangle2));

    }


}