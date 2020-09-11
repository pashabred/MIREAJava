public class Circle extends Shape{
    protected double radius;
    Circle() {}
    Circle(double radius) {}
    Circle(double radius, String color, boolean string) {}
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
