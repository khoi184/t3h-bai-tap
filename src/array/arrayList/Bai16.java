package array.arrayList;

import java.util.Arrays;

public class Bai16 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 5, -6, 9, 12, 5, 7, 99, 66, 100, 33, 5};
//        int[] arr = {10, 22, 10, 20, 11, 22};

        removeDupElement(arr);
    }

    public static void removeDupElement(int[] arr) {
        int length = arr.length;
        int[] newArr = new int[length];
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                newArr[j++] = arr[i];
            }
        }
        newArr[j++] = arr[length - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = newArr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

