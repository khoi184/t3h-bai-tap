package array.arrayList;

import java.util.Arrays;

public class Bai10 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 0, -6, 9, 12, 5, 7, 99, 66, 100, 33};

        findMaxValue(arr);

        findMinValue(arr);
    }

    public static void findMaxValue(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void findMinValue(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
