import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M_sum = 0;
        int Y_sum = 0;
        int sec = 0;

        for (int i = 0; i < N; i++) {
            sec = sc.nextInt();
            Y_sum += ((sec / 30) + 1) * 10;
            M_sum += ((sec / 60) + 1) * 15;
        }

        if (M_sum == Y_sum) {
            System.out.println("Y M " + Y_sum);
        } else if (M_sum < Y_sum) {
            System.out.println("M " + M_sum);
        } else if (M_sum > Y_sum) {
            System.out.println("Y " + Y_sum);
        }

    }

 }