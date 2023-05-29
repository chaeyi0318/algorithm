import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int money = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        int chicken = Integer.parseInt(br.readLine()) * 2;

        if (money >= chicken) {
            bw.write(String.valueOf(money - chicken));
        } else {
            bw.write(String.valueOf(money));
        }
        bw.close();
    }
}