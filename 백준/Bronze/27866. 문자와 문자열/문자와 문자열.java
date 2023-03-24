import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        int i = Integer.parseInt(bf.readLine());

        char ch = str.charAt(i - 1);

        System.out.println(ch);
    }
}