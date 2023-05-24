import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String str = "long ";

        for (int i = 0; i < num / 4; i++) {
            System.out.print(str);
        }

        System.out.print("int");
    }
}