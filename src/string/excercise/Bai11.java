package string.excercise;

public class Bai11 {
    public static void main(String[] args) {
        String s = "a1b3c5d7e9";
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
