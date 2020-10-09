package generic;

import java.util.ArrayList;

public class Marks<M extends Number> {
    public static void main(String[] args) {
        ArrayList  arrayList =  new ArrayList<>();
        arrayList.add(10.);
        arrayList.add(20.);
        Marks marks =  new Marks();
        System.out.println(marks.orderAverage(arrayList));

    }


    public static<M extends Number> double orderAverage(ArrayList<M> arrayList) {
        double average = 0 , sum = 0;
        for (M element : arrayList) {
        sum += element.doubleValue();
        }
        average = sum/arrayList.size();


        return average;
    }
}
