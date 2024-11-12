import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = 10;

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int len = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < len; j++) {
                char c = str.charAt(j);
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            sb.append("#").append(i).append(" ");
            for (char c : stack) {
                sb.append(c);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}