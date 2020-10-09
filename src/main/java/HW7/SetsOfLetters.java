package HW7;

import java.util.*;

public class SetsOfLetters {

    public static void main(String[] args) {
        List<Character> alphabet = new ArrayList<>();
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
        Random random = new Random();
        while (set1.size() < 10) {
            set1.add(alphabet.get(random.nextInt(26)));
        }
        while (set2.size() < 10) {
            set2.add(alphabet.get(random.nextInt(26)));

        }


//==================================================================


        Set<Character> collectedSet = new TreeSet<>();
        for (Character element : set1) {
            collectedSet.add(element);
        }
        for (Character element : set2) {
            collectedSet.add(element);
        }

//==================================================================

        Set<Character> subscriptionOfSets = new TreeSet<>();

        for (Character elementOfSet1 : set1) {
            for (Character elementOfSet2 : set2) {
                if (elementOfSet1 == elementOfSet2) subscriptionOfSets.add(elementOfSet1);
            }


        }


//==================================================================

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(collectedSet);
        System.out.println(subscriptionOfSets);

//==================================================================
//        System.out.println(collectTwoSet(set1,set2));
//        System.out.println(subscribeSets(set1,set2));
//==================================================================
    }

//    public static Set collectTwoSet(Set set1, Set set2)  {
//        Set<Character> collectedSet = new TreeSet<>();
//        for(Character element : set1){
//            collectedSet.add( element);
//        }
//
//
//
//        return collectedSet;
//
//
//    }

//    public static Set subscribeSets(Set<Character> set1, Set<> set2)  {
//        Set<Character> subscriptionOfSets = new TreeSet<>();
//  for(Character elementOfSet1 : set1){
//        for (Character elementOfSet2: set2) {
//            if (elementOfSet1 == elementOfSet2)subscriptionOfSets.add( elementOfSet1);
//        }
//
//
//    }
//
//
//
//        return subscriptionOfSets;
//
//
//    }


}
