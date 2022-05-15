package string.excercise;

public class Bai57 {
    public static void main(String[] args) {
        String s = "This is a        \nbad \tdog";
        String[] arr = s.split("\\W");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        System.out.println(stringBuilder);
    }
}
