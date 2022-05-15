package string.excercise;

public class Bai46 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String[] arrStr = s.split(" ");
        String s1 = "";
        int len = arrStr.length;

        for (int i = 0; i < len - 1; i++) {
                s1 += "'" + arrStr[i] + "', ";
        }
        s1 += arrStr[len - 1];
        System.out.println("[" + s1 + "']");
    }
}
