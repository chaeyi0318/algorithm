import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());

        int result = people * area;

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st2.nextToken());
            bw.write(num - result + " ");
        }
        bw.close();
    }
}