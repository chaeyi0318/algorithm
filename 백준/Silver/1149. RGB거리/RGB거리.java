import java.io.*;
import java.util.*;

public class Main {
    static int[][] houses;
    static int[][] cost;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        houses = new int[N][3];
        cost = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                houses[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cost[0][0] = houses[0][0];
        cost[0][1] = houses[0][1];
        cost[0][2] = houses[0][2];

        System.out.println(Math.min(Math.min(dp(N-1,0), dp(N-1,1)), dp(N-1,2)));
    }

    public static int dp(int N, int color) {
        if (cost[N][color] == 0) {
            if (color == 0) {
                return cost[N][color] = Math.min(dp(N-1, 1), dp(N-1, 2)) + houses[N][color];
            }
            if (color == 1) {
                return cost[N][color] = Math.min(dp(N-1, 0), dp(N-1, 2)) + houses[N][color];
            }
            if (color == 2) {
                return cost[N][color] = Math.min(dp(N-1, 0), dp(N-1, 1)) + houses[N][color];
            }
        }
        return cost[N][color];
    }
}