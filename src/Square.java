public class Square extends Rectangle {


    public Square() {
    }

    public Square(double side) {
        super.setLenght(side);
        super.setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        super.setLenght(side);
        super.setWidth(side);
    }

    public double getSide() {
        return super.getLenght();
    }

    public void setSide(double side) {
        super.setLenght(side);
        super.setWidth(side);
    }

    public double getArea() {
        return Math.pow(super.getLenght(), 2);
    }

    public double getPerimeter() {
        return 4 * super.getLenght();
    }

    @Override
    public String toString() {
        return "SquareInfo :{" + " With side=" + super.getLenght() + " Which is a subclass of " + super.toString() + '}';
    }


}
