import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int tmp = num1;

        int count = 0;

        while (true) {
            int firstNum = tmp / 10;
            int secondNum = tmp % 10;

            int sum = firstNum + secondNum;

            tmp = secondNum * 10 + sum % 10;
            count++;

            if(num1 == tmp)
                break;
        }
        System.out.println(count);
    }
}