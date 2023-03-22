import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] arr2 = new int[6];
        int[] result = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = sc.nextInt();
            result[i] = arr[i] - arr2[i];
            System.out.print(result[i] + " ");
        }
    }
}