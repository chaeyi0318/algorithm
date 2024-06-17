import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();

            if (num.equals("0")) {
                break;
            }

            String reversNum = new StringBuilder(num).reverse().toString();

            if (reversNum.equals(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
