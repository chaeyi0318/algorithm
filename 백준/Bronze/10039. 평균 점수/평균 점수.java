import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 40;
        int result = 0;

        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int j = sc.nextInt();

            if (j < 40) {
                scores.add(score);
            } else {
                scores.add(j);
            }
            result += scores.get(i);
        }
        System.out.println(result / 5);
    }
}