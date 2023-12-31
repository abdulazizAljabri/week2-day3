public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double area() {
        return width * lenght;
    }

    public double perimeter() {
        return 2 * (width + lenght);
    }

    @Override
    public String toString() {
        return "RectangleInfo :{" + " With Width =" + width + " lenght = " + lenght + " Which is a subclass of  = " +super.toString()+'}';
    }
}
