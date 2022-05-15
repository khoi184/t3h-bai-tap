package string.excercise;

public class Bai21 {
    public static void main(String[] args) {
        convertStr("nAAaAAmABbnbnMBJEMWbn");
    }

    static void convertStr (String s) {
        char[] arr = s.substring(0,4).toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 64 && arr[i] < 91) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println(s.toUpperCase());
        }
    }
}
