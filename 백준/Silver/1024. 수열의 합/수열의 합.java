import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> cardSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int n = L;
        int a = 0;
        
        while (n <= 100) {
            int child = 2*N+n-n*n;
            int parent = 2*n;
            if (child % parent == 0) {
                a = child/parent;
                if (a >= 0) {
                    break;
                }
            }
            n++;
        }

        if (n == 101) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a+i);
        }
    }
}