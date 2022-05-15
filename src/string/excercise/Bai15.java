package string.excercise;

public class Bai15 {
    public static void main(String[] args) {
        add_tags("b", "javaTutorial");
    }

    static void add_tags(String tag, String content) {
        String s = "";
        System.out.println("<" + tag + ">" + content +  "</" + tag + ">");
    }

}
