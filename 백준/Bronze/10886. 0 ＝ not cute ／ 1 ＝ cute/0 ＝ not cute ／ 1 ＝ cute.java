import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < n; i++) {
            int result = Integer.parseInt(br.readLine());

            if(result == 0) {
                zeroCount++;
            }
            if(result == 1) {
                oneCount++;
            }
        }
        if (zeroCount > oneCount) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}