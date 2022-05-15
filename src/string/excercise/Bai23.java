package string.excercise;

public class Bai23 {
    public static void main(String[] args) {
        String s = "I\nam\na\nboy";
        String s1 = "";
        String[] arr = s.split("\n");
        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i] + " ";
        }
        System.out.println(s1);
    }
}
