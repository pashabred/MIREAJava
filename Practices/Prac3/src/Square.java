public class Square extends Rectangle{
    protected double side;
    Square() {}
    Square(double side) {}
    Square(double side, String color, boolean filled) {}

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
