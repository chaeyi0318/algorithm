import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        double result = 0;
        int max = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            max = Math.max(max, score[i]);
        }

        for (int i = 0; i < score.length; i++) {
            result += (double) score[i] / max * 100;
        }
        result /= n;
        System.out.println(result);
    }
}