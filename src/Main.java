
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Red", true);
        Circle circle1 = new Circle("Red", true, 1.0);
        Rectangle rectangle1 = new Rectangle("Red", true, 1.0, 1.0);
        Square square1 = new Square("Red", true, 1.0);
        System.out.println(" The area of the Circle is: " + circle1.area());
        System.out.println(" The perimeter of the Circle is: " + circle1.perimeter());
        System.out.println(" The area of the Rectangle is: " + rectangle1.area());
        System.out.println(" The perimeter of the Rectangle is: " + rectangle1.perimeter());
        System.out.println(" The area of the Square is: " + square1.getPerimeter());
        System.out.println(shape1.toString());
        System.out.println(square1.toString());
        System.out.println(circle1.toString());
        System.out.println(rectangle1.toString());
        System.out.println(shape1.isFilled());
    }

}
