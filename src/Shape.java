import org.w3c.dom.ls.LSOutput;

public class Shape {
    private String color;
    private boolean filled = false;

    public Shape(){

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        if (filled == false) {
            System.out.println(" Shape is not filled");
        }
        else
            System.out.println(" Shape is filled");

        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return "ShapeInfo : {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
