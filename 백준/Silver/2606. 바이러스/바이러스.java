import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N, M;
    static int result;

    public static void dfs(int start) {
        visited[start] = true;
        result++;

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[start][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[p][c] = graph[c][p] = 1;
        }

        dfs(1);
        bw.write(String.valueOf(result - 1));
        bw.flush();
    }
}