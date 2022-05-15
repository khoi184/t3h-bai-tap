package array.arrayList;

public class Bai6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 9};
        findIndex(array, 5);

    }

    public static void findIndex(int[] array, int value)  {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("The index is: " + i);
            }
        }
    }
}
