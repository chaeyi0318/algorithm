import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num1 = (int) Math.pow(sc.nextInt(), 2);
            int num2 = (int) Math.pow(sc.nextInt(), 2);
            int num3 = (int) Math.pow(sc.nextInt(), 2);

            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }

            if (num1 == num2 + num3) {
                System.out.println("right");
            } else if (num2 == num1 + num3) {
                System.out.println("right");
            } else if (num3 == num1 + num2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}