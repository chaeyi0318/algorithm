import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            char ch = str.charAt(0);
            char ch2 = str.charAt(str.length() - 1);

            String result = String.valueOf(ch) + String.valueOf(ch2);
            System.out.println(result);
        }
    }
}