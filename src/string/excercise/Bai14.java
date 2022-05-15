package string.excercise;

public class Bai14 {
    public static void main(String[] args) {
        printStr("red, white, black, green, red, black");
    }

    static String[] sortWord(String[] arr) {
        String tmp = "";
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j].compareToIgnoreCase(arr[i]) > 0) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    static String printStr(String s) {
        String[] arr = s.split(", ");
        int len = arr.length;
        arr = sortWord(arr);
        s = "" + arr[0] + ", ";

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    s += arr[i] + ", ";
                }
            }
        }
        return s;
    }
}
