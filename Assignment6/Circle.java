public class Circle extends Shape {
    private double radius;
    private final double pi = 3.14159265;

    public Circle(String n, double r) {
        super(n);
        this.radius = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return getName() + ", radius: " + getRadius();
    }
}
