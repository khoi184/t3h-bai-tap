package array.arrayList;

public class Bai13 {
    public static void main(String[] args) {
        String[] strArr = {"bmasf", "hwebvr", "jnakwjehr", "amnbmr", "jkenek", "hwebvr"};

        findDupStrArr(strArr);
    }

    public static void findDupStrArr(String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j]) && i != j) {
                    System.out.println("The string is duplicated: " + strArr[j]);
                }
            }
        }
    }
}
