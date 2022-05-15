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
        int k = 0;

        for (int i = 0; i < length; i++) {
            boolean isExisted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isExisted = true;
                    break;
                }
            }
            if (!isExisted) {
                newArr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

