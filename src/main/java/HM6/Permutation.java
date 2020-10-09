package HM6;

import java.util.HashMap;


public class Permutation {


    public static void main(String[] args) {
        Permutation test = new Permutation();
//        String word = "CAT";
        String word1 = "book";
//        test.permutations(test.numOfLetters(word), "",word.length());
        test.permutations(test.numOfLetters(word1), "",word1.length());

    }

    public HashMap<Character, Integer> numOfLetters(String word) {
        HashMap<Character, Integer> letterCntr = new HashMap<>();
        for (char letter : word.toCharArray()) {
            if (letterCntr.get(letter) == null) letterCntr.put(letter, 1);
            else letterCntr.put(letter, letterCntr.get(letter) + 1);
        }

        return letterCntr;
    }

    public void permutations(HashMap<Character, Integer> letterCntr, String permute, int length) {
        if (length == 0) {
            System.out.println(permute);

        } else
            for (char letter : letterCntr.keySet()) {
                if (letterCntr.get(letter) > 0) {
                    String nextPermute = permute + letter;
                    letterCntr.put(letter, letterCntr.get(letter) -1);
                    permutations(letterCntr, nextPermute, length - 1);
                    letterCntr.put(letter, letterCntr.get(letter) + 1);
                }

            }

    }
}
