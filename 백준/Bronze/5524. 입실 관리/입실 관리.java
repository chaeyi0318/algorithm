import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            str.add(sc.next());
            System.out.println(str.get(i).toLowerCase());
        }
    }
}