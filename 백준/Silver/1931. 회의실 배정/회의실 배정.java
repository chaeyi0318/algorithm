import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (i, j) -> {
            if (i[1] == j[1]) {
                return Integer.compare(i[0], j[0]);
            } else {
                return Integer.compare(i[1], j[1]);
            }
        });
		
		int cnt = 0;
		int end = 0;
		
		for (int i = 0; i < N; i++) {
			if (arr[i][0] >= end) {
				cnt++;
				end = arr[i][1];
			}
		}
		
		System.out.println(cnt);
	}

}