import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[sc.nextInt()];

        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }

        for (int i = 0; i < strArr.length; i++) {
            int count = 0;
            int result = 0;

            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                result += count;
            }
            System.out.println(result);
        }
    }
}