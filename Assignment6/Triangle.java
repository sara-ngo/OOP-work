public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(String n, double h, double b) {
        super(n);
        this.height = h;
        this.base = b;
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double computeArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return getName() + ", height: " + getHeight()
                + " base: " + getBase();
    }
}
