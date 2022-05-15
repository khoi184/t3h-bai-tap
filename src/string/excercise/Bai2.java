package string.excercise;

public class Bai2 {
    public static void main(String[] args) {
        count("google.com");
    }

    public static void count(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int id = compare(str, i);
            if (id == -1) {
                arr[i] = 1;
            } else {
                arr[id]++;
                arr[i] = 0;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != 0) {
                System.out.println("'" + str.charAt(i) + "': " + arr[i] + ", ");
            }
        }
    }

    public static int compare(String str, int id) {
        for (int i = 0; i < id; i++) {
            if (str.charAt(i) == str.charAt(id)) {
                return i;
            }
        }
        return -1;
    }
}

//    public static void main(String[] args) {
//        countChar("google.com");
//    }
//    static int existed(String s, int id) {
//        for (int i = 0; i < id; i++) {
//            if (s.charAt(i) == s.charAt(id)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    static void countChar(String s) {
//        int[] arr = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            int id = existed(s, i);
//            if (id == -1) {
//                arr[i] = 1;
//            } else {
//                arr[id]++;
//                arr[i] = 0;
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (arr[i] != 0) {
//                System.out.print("'" + s.charAt(i) + "': " + arr[i] + ", ");
//            }
//        }
//    }
//}
