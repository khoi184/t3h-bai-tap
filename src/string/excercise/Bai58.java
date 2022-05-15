package string.excercise;

public class Bai58 {
    public static void main(String[] args) {
        moveSpaces("This is a        bad \tdog");
    }

    public static void moveSpaces(String s) {
        String[] arr = s.split("\\W");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.insert(0, " ").append(arr[i]);
        }
        System.out.println(stringBuilder);
    }
}
