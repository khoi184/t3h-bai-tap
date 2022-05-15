package string.excercise;

import java.lang.reflect.Array;

public class Bai8 {
    public static void main(String[] args) {
        getWord("I want to go toaaaaaaaaa sleepaaaaa now");
    }

    static void getWord(String s) {
        String[] arr = s.split(" ");
        int max = arr[0].length();
        int id = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                id = i;
            }
        }
            System.out.println("Longest word: " + arr[id] + "\n" + "Length of longest word: " + max);
    }
}
