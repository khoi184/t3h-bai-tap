package string.excercise;

public class Bai40 {
    public static void main(String[] args) {
        String s = "This is a bad dog";
        String[] arr = s.split("\\W+");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
