import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int price = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int result = (price * count) <= money ? 0 : (price * count) - money;

        System.out.println(result);
    }
}