public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){}
    Rectangle(double width, double length){}
    Rectangle(double width, double length, String color, boolean filled){}

    @Override
    void getColor() {

    }

    @Override
    void setColor(String color) {

    }

    @Override
    boolean isFilled() {
        return false;
    }

    @Override
    void setFilled(boolean filled) {

    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
