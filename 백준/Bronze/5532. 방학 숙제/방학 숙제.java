import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int ac = a % c == 0 ? a / c : (a / c) + 1;
        int db = b % d == 0 ? b / d : (b / d) + 1;

        int result = l - (Math.max(ac, db));

        bw.write(String.valueOf(result));
        bw.close();
    }
}