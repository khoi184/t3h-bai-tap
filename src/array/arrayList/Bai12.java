package array.arrayList;

import java.util.Arrays;

public class Bai12 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 0, -6, 9, 12, 5, 7, 99, 66, 100, 33};

        findDuplicateIntArr(arr);
    }

    public static void findDuplicateIntArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The value duplicated: " + arr[i]);
                }
            }
        }
    }
}
