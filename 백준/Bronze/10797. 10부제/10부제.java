import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int date = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        while (st.hasMoreTokens()) {
            if (date == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
    }
}