import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("Circle 1", 5.0);
        Circle c2 = new Circle("Circle 2", 2.0);
        Rectangle r1 = new Rectangle("Rectangle 1", 1.0, 2.0);
        Rectangle r2 = new Rectangle("Rectangle 2", 3.0, 4.0);
        Triangle t1 = new Triangle("Triangle 1", 2.0, 4.0);
        Triangle t2 = new Triangle("Triangle 2", 3.0, 5.0);
        Hexagon h1 = new Hexagon("Hexagon 1", 3.0);
        Hexagon h2 = new Hexagon("Hexagon 2", 4.0);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(c1);

        Shapes shapes = new Shapes(list);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(t1);
        shapes.add(t2);
        shapes.add(h1);
        shapes.add(h2);

        shapes.compute();

        shapes.max();
        shapes.min();

        shapes.serialized();
    }

}
