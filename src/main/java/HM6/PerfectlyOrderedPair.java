package HM6;


import java.util.ArrayList;
import java.util.Arrays;


public class PerfectlyOrderedPair {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
        System.out.println(iterateOrderedPairs(arrayList));

        System.out.println(iterateOrderedPairs(new ArrayList<Integer>(Arrays.asList(10, 3, 4, 6, 1, 2, 3))));
        System.out.println(iterateOrderedPairs(new ArrayList<Integer>(Arrays.asList(3, 3, 4, 3, 1, 2, 3, 4, 5, 4, 1, 8, 8, 8, 9, 5, 0))));

    }


    private static ArrayList iterateOrderedPairs(ArrayList<Integer> orderedPairs) {
        ArrayList<Integer> perfectOrderedPairs = new ArrayList<>();

        if (orderedPairs.size() == 0) return orderedPairs;
        if (orderedPairs.size() % 2 != 0) orderedPairs.remove(orderedPairs.size() - 1);
        for (int i = 0, j = 1; i < orderedPairs.size(); i += 2, j += 2) {
            if (orderedPairs.get(i) <= orderedPairs.get(j)) {
                perfectOrderedPairs.add(orderedPairs.get(i));
                perfectOrderedPairs.add(orderedPairs.get(j));
            }
        }

        return perfectOrderedPairs;
    }

}
