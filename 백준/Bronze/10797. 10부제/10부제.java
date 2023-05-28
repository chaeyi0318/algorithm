import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int date = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        while (st.hasMoreTokens()) {
            if (date == Integer.parseInt(st.nextToken())) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}