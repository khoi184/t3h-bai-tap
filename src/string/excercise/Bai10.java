package string.excercise;

public class Bai10 {
    public static void main(String[] args) {
        String s = "alohahoho";
        char c1 = s.charAt(0);
        char c2 = s.charAt(s.length() - 1);
        s = c2 + s.substring(1, s.length() - 1) + c1;
        System.out.println(s);

    }
}
