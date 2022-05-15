package string.excercise;

public class Bai20 {
    public static void main(String[] args) {
        reverseString("abcdaaaa");
    }

    static void reverseString(String s) {
        String s1 = "";
            if (s.length() % 4 == 0 ) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    s1 += s.charAt(i);
                }
            }
        System.out.println(s1);
    }
}
