package string.excercise;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        String str = "restart";
        char tmp = str.charAt(0);
        String replaceStr = str.replace(tmp, '$');
        str = tmp + replaceStr.substring(1);
        System.out.println(str);
    }
}