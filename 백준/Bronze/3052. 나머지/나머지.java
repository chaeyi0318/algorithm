import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remainder = new int[10];

        for (int i = 0; i < remainder.length; i++) {
            remainder[i] = sc.nextInt();
            remainder[i] = remainder[i] % 42;
        }

        Arrays.sort(remainder);

        int tmp = -1;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < remainder.length; i++) {
            if(remainder[i] != tmp) {
                arrayList.add(remainder[i]);
                tmp = remainder[i];
            }
        }
        System.out.println(arrayList.size());
    }
}