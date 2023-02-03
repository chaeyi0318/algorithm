import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        String reverseNum1 = "";
        String reverseNum2 = "";

        for (int i = 2; i >= 0; i--) {
            reverseNum1 += String.valueOf(num1.charAt(i));
            reverseNum2 += String.valueOf(num2.charAt(i));
        }

        int max = Math.max(Integer.parseInt(reverseNum1), Integer.parseInt(reverseNum2));

        System.out.println(max);
    }
}
