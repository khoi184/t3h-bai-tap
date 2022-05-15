package array.arrayList;

import java.util.Arrays;

public class Bai9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 9, 12, 3};

        System.out.println("Array after inserted value: " + Arrays.toString(addElement(arr, 5, 100)));
    }

    public static int[] addElement(int[] arr, int position, int insertValue) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            if (i < position - 1) {
                newArr[i] = arr[i];
            } else if (i == position - 1) {
                newArr[i] = insertValue;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
