package string.excercise;

public class Bai5 {
    public static void main(String[] args) {
        String s1 = "abcaaadfew", s2 = "xyzadfwet";
        char c1 = s1.charAt(s1.length() - 1);
        char c2 = s2.charAt(s2.length() - 1);
        s1 = s1.substring(0, s1.length() - 1) + c2;
        s2 = s2.substring(0, s2.length() - 1) + c1;
        System.out.println(s2 + " " + s1);
    }
}
