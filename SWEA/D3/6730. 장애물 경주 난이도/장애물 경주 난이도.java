import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[N];

            for (int n = 0; n < N; n++) {
                arr[n] = Integer.parseInt(st.nextToken());
            }

            int maxUp = 0;
            int maxDown = 0;

            for (int i = 0; i < arr.length - 1; i++) {
                int difference = arr[i + 1] - arr[i];

                if (difference > 0) {
                    maxUp = Math.max(maxUp, difference);
                }

                if (difference < 0) {
                    maxDown = Math.max(maxDown, -difference);
                }
            }
            bw.write(String.format("#%s %d %d", t, maxUp, maxDown));
            bw.newLine();
        }
        bw.close();
    }
}