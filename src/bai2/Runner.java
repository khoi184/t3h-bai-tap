package bai2;

public class Runner {
    public static void main(String[] args) {
        Ball b1 = new Ball(80, 35, 5, 4, 6);
        for (int i = 0; i < 16; i++) {
            b1.move();
            System.out.println(b1.toString());
        }
    }
}
