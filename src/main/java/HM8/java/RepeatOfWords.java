package HM8.java;

import java.util.*;

import java.util.function.Function;
import java.util.stream.*;

import static javafx.scene.input.KeyCode.T;

public class RepeatOfWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays
                .asList("sina", "sina", "Ali", "Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen"));
        Function<String, Integer> function = s -> s.length();
        System.out.println(words.stream().collect(Collectors.groupingBy(function)));
//        System.out.println( words.stream().collect(Collectors.counting()));
        Set<String> mySet = new HashSet<>();
//=======================================
//sample:
        for (String s : words) {
            if (!mySet.add(s)) {
                System.out.println(s);
            }
        }
        findDuplicate3(words);


//=======================================


    }
    public static <T > void findDuplicate3 (List < T > list) {
        list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1L).map(e -> e.getKey())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
//==================================
}
