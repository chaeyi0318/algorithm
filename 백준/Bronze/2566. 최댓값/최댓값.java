import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int arrI = 0;
        int arrJ = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                max = Math.max(max, arr[i][j]);

                if (arr[i][j] == max) {
                    arrI = i + 1;
                    arrJ = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(arrI + " " + arrJ);
    }
}