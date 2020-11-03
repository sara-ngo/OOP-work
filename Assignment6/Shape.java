import java.io.Serializable;

public abstract class Shape implements Runnable, Serializable {
    public String name;
    public double area;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computeArea();

    public abstract String toString();

    @Override
    public void run() {
        area = Math.round(computeArea());
        System.out.println("Area of " + name + ": " + area);
    }
    
}
