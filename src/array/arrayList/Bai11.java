package array.arrayList;

import java.util.Arrays;

public class Bai11 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 0, -6, 9, 12, 5, 7, 99, 66, 100, 33};

        reverseArr(arr);
    }

    public static void reverseArr(int[] arr) {
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
