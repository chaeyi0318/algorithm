import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        int S = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            if (str.equals("add")) {
                int num = Integer.parseInt(st.nextToken());
                S |= (1 << (num - 1));
            } else if (str.equals("remove")) {
                int num = Integer.parseInt(st.nextToken());
                S &= ~(1 << (num - 1));
            } else if (str.equals("check")) {
                int num = Integer.parseInt(st.nextToken());
                if ((S & (1 << (num - 1))) != 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (str.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());
                S ^= (1 << (num - 1));
            } else if (str.equals("all")) {
                S = (1 << 20) - 1;
            } else if (str.equals("empty")) {
                S = 0;
            }
        }
        System.out.println(sb.toString());
    }
}