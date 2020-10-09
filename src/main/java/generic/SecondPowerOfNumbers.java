package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondPowerOfNumbers {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        Function<Integer ,Integer> function = a -> a*a;
        List<Integer> list = new ArrayList<>();
        list = fromArrayToList(arr,function);
        System.out.println(list);

    }


    public static <T, G> List<G> fromArrayToList(T[] arr, Function<T, G> mapperFunction) {
        return Arrays.stream(arr).map(mapperFunction).collect(Collectors.toList());
    }
}
