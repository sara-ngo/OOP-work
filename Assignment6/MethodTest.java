import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodTest {
    private static <T> int count(ArrayList<T> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList("dog", "cat", "mouse", "fish", "bird");
        ArrayList<String> sList = new ArrayList<String>(s);
        System.out.println("String list: " + count(sList));

        List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 6);
        ArrayList<Integer> iList = new ArrayList<Integer>(i);
        System.out.println("Integer list: " + count(iList));

        List<Double> d = Arrays.asList(0.01, 0.10, 0.11, 1.00, 1.01, 1.10, 1.11, 10.00);
        ArrayList<Double> dList = new ArrayList<Double>(d);
        System.out.println("Double list: " + count(dList));


    }
}
