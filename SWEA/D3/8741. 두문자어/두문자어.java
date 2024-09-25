import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            StringBuilder result = new StringBuilder();

            while (st.hasMoreTokens()) {
                result.append(st.nextToken().charAt(0));
            }

            System.out.println("#" + t + " " + result.toString().toUpperCase());
        }
    }
}