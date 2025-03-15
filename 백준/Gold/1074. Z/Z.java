import java.io.*;
import java.util.*;

public class Main {
    static int N, r, c, cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        find(r, c, (int) Math.pow(2, N));
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }

    static void find(int x, int y, int size) {
        if (size == 1)
            return;

        if (x < size / 2 && y < size / 2) {
            find(x, y, size / 2);
        } else if (x < size / 2 && size / 2 <= y) {
            cnt += (size * size / 4);
            find(x, y - size / 2, size / 2);
        } else if (x >= size / 2 && size / 2 > y) {
            cnt += (size * size / 4) * 2;
            find(x - size / 2, y, size / 2);
        } else {
            cnt += (size * size / 4) * 3;
            find(x - size / 2, y - size / 2, size / 2);
        }
    }
}
