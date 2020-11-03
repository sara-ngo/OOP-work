public class Rectangle extends Shape {
    private double height;
    private double length;

    public Rectangle(String n, double h, double l) {
        super(n);
        this.height = h;
        this.length = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double computeArea() {
        return height * length;
    }

    @Override
    public String toString() {
        return getName() + ", height: " + getHeight()
                + " length: " + getLength();
    }
}
