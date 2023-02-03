import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < count; i++) {
            result += str.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
