package bai1;

public class Runner {
    public static void main(String[] args) {
        Time t1 = new Time(1,0,1);
        System.out.println("Current time: " + t1.toString());
        t1.nextSecond();
        System.out.println("The next time: " + t1.toString());
        t1.previousSecond();
        System.out.println("The previous time: " + t1.toString());
    }
}
