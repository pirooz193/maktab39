package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamSample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(5);
        myList.add(78);

//        Predicate<Integer> predicate =  s -> s > 2;

        Consumer<List<Integer>> myConsumer = myList1 -> {
            for (Integer e : myList1) {
                System.out.println(e);
            }
        };
        Consumer<List<Integer>> myConsumer1 = myList1 -> {
            for (int i = 0; i <myList1.size() ; i++) {
                myList1.set(i,myList1.get(i)*2);
            }
        };

        myConsumer.accept(myList);
        myConsumer1.accept(myList);
        System.out.println();

        myList.stream()
                .filter(val -> val > 4)
                .forEach(val -> System.out.println(val));
    }
}
