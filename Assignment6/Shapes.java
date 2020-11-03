import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Shapes<T extends Shape> {
    private ArrayList<T> shapeList;

    public Shapes() {
        shapeList = new ArrayList<T>();
    }

    // constructor
    public Shapes(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }

    public ArrayList<T> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<T> shapeList) {
        this.shapeList = shapeList;
    }

    public boolean add(T shape) {
        return shapeList.add(shape);
    }

    public boolean remove(T shape) {
        return shapeList.remove(shape);
    }

    public synchronized void compute() {
        for (T shape : shapeList) {
            Thread thread = new Thread(shape);
            thread.start();
        }
    }


    public void max() {
        T max = shapeList.get(0);
        for (T shape : shapeList) {
            if (shape.computeArea() > max.computeArea()) {
                max = shape;
            }
        }
        System.out.println("Biggest shape: " + max.toString());
    }

    public void min() {
        T min = shapeList.get(0);
        for (T shape : shapeList) {
            if (shape.computeArea() < min.computeArea()) {
                min = shape;
            }
        }
        System.out.println("Smallest shape: " + min.toString());
    }

    public void serialized() {
        try {
            for (int i = 0; i < shapeList.size(); i++) {
                FileOutputStream streamOut = new FileOutputStream("obj" + (i + 1) + ".ser");
                System.out.println("obj" + (i + 1) + ".ser is create!");
                ObjectOutputStream objOut = new ObjectOutputStream(streamOut);
                objOut.writeObject(shapeList.get(i));
                objOut.close();
                streamOut.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
