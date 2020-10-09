package lambdaExpretion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Average   {
    public static void main(String[] args) {
        String word = "carc";
        Calculator calculator = (a,b) -> (a+b)/2;
        System.out.println(calculator.calculate(3,5));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        Predicate<Integer> predicate = s -> s > 2 && s < 5;
        list.stream()
                .filter(predicate)
                .forEach(element -> System.out.println(element));





    }





}
