package string.excercise;

public class Bai27 {
    public static void main(String[] args) {
        String s = "      i want to go to sleep now   \n      let's it go   \n                  bacbcncmcm";
        String[] arr = s.split("\n");
        String s1 = "";

        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i].trim() + "\n";
        }
        System.out.println(s1);
    }
}