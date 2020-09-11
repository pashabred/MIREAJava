abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape(){}
    Shape(String color, boolean filled){}
    abstract void getColor();
    abstract void setColor(String color);
    abstract boolean isFilled();
    abstract void setFilled(boolean filled);
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
