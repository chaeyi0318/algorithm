import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int count = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);

            if(arr[i] == max) {
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count + 1);
    }
}