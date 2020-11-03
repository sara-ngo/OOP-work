public class Hexagon extends Shape {
    private double side;

    public Hexagon(String n, double s) {
        super(n);
        this.side = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return (3 / 2) * Math.sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return getName() + ", side: " + getSide();
    }
}
