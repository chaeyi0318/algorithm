import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> burger = new ArrayList<>();
        ArrayList<Integer> drink = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            burger.add(sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            drink.add(sc.nextInt());
        }

        Collections.sort(burger);
        Collections.sort(drink);

        System.out.println(burger.get(0) + drink.get(0) - 50);
    }
}