import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int score1 = 0;
        int score2 = 0;

        while (st.hasMoreTokens()) {
            score1 += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            score2 += Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(Math.max(score1, score2)));
        bw.close();
    }
}