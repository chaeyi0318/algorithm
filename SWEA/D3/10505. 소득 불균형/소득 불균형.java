import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[st.countTokens()];

            int sum = 0;
            int i = 0;

            while (st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i++];
            }

            int avg = sum / N;
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] <= avg) {
                    cnt++;
                }
            }

            bw.write("#" + t + " " + cnt);
            bw.newLine();
        }
        bw.close();
    }
}