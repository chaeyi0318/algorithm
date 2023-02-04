import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        int result = (int) (money * 0.78);
        int result2 = (int) ((int) money - ((money * 0.2) * 0.22));
        System.out.println(result + " " + result2);
    }
}