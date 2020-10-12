import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManipulator {

    public static ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending) {
        if (ascending) {
            Collections.sort(myLst); // sort ascending
            return myLst;
        } else {
            Collections.sort(myLst, Collections.reverseOrder()); // sort descending
            return myLst;
        }

    }

    public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        int large = Integer.MIN_VALUE;
        int largeIndex = 0;
        int small = Integer.MAX_VALUE;
        int smallIndex = 0;

        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) < small) {
                small = myLst.get(i);
                smallIndex = i;
            }
            if (myLst.get(i) > large) {
                large = myLst.get(i);
                largeIndex = i;
            }
        }
        Collections.swap(myLst, largeIndex, smallIndex);
        return myLst;
    }

    public static void table(ArrayList<Integer> myLst) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer integer : myLst) {
            if (!freqMap.containsKey(integer)) {
                freqMap.put(integer, 0);
            }
            freqMap.put(integer, freqMap.get(integer) + 1);
        }

        for (int i : freqMap.keySet()) {
            System.out.println("Value: " + i + " appears " + freqMap.get(i) + " times");
        }
    }

    /* test client
    public static void main(String[] arg) {
        ArrayList<Integer> myLst = new ArrayList<Integer>();
        myLst.addAll(new ArrayList<Integer>(Arrays.asList(7, 6, 2, 8, 1, 3, 0, 10, 6, 14, 2)));

        System.out.println(sort(myLst, true));
        System.out.println(sort(myLst, false));
        System.out.println(swapLargestSmallest(myLst));
        table(myLst);
    }
    */

}
