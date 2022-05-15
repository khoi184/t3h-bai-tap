package string.excercise;

public class Bai44 {
    public static void main(String[] args) {
        String s = "w3resource";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Current character " + arr[i] + " position at " + i);
        }
    }
}
