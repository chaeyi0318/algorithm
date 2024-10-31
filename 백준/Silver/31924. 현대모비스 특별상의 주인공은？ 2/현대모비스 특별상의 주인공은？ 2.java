import java.io.*;
import java.util.*;

public class Main {
    static int n, cnt = 0;
    static char[] chars = new char[]{'O', 'B', 'I', 'S'};
    static char[][] map;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < n; j++) {
                char c = str.charAt(j);
                map[i][j] = c;
                if (c == 'M') q.offer(new Pair(i, j));
            }
        }

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            for (int dir = 0; dir < 8; dir++) {
                int nx = cur.x + dx[dir] * 4;
                int ny = cur.y + dy[dir] * 4;

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                int x = cur.x + dx[dir];
                int y = cur.y + dy[dir];

                for (int i = 0; i < 4; i++) {
                    if (map[x][y] != chars[i]) break;
                    x += dx[dir];
                    y += dy[dir];
                    if (i == 3) cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}