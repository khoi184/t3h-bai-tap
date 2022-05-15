package string.excercise;

public class Bai6 {
    public static void main(String[] args) {
        String s = "abcin";
        if (s.length() < 3) {
            System.out.println(s);
        } else  {
            if ("ing".equals(s.substring(s.length() - 3)) ) {
                s = s.concat("ly");
            } else {
                s = s.concat("ing");
            }
        System.out.println(s);
        }
    }
}
