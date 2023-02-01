import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1000 - sc.nextInt();    //줘야할 돈
        int count = 0;

        while (i >= 1) {
            if (i >= 500) {
                count += i / 500;
                i %= 500;
            } else if (i >= 100) {
                count += i / 100;
                i %= 100;
            } else if (i >= 50) {
                count += i / 50;
                i %= 50;
            } else if (i >= 10) {
                count += i / 10;
                i %= 10;
            } else if (i >= 5) {
                count += i / 5;
                i %= 5;
            } else if (i >= 1) {
                count += i / 1;
                i %= 1;
            }
        }
        System.out.println(count);
    }
}