package string.excercise;

public class Bai24 {
    public static void main(String[] args) {
        String s = "@mbnenbmn";
        boolean checkChar = s.matches("^\\W.*");

        if (checkChar) {
            System.out.println("Have special character!");
        } else {
            System.out.println("NO!");
        }
    }
}
