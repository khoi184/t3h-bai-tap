package array.arrayList;

import java.util.Arrays;

public class Bai7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        removeElement(arr, 7);
    }

    public static void removeElement(int[] arr, int removeValue) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == removeValue) {
                for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
