import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int t = 0; t < tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][m];        // 배추밭
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    arr[x][y] = 1;
                }
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        bfs(arr, i, j, n, m, dx, dy);
                        cnt++;
                    }
                }
            }
            bw.write(String.valueOf(cnt));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    public static void bfs(int[][] arr, int x, int y, int n, int m, int[] dx, int[] dy) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        arr[x][y] = 0; // 방문 처리
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    arr[nx][ny] = 0; // 방문 처리
                }
            }
        }
    }
}