import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int binarySearch (int element, int[] num) {
		int left = 0;
		int right = num.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (num[mid] == element) {
				return 1;
			} else if (num[mid] < element) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			if (st.hasMoreTokens()) {
				card[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(card);
		
		int M = Integer.parseInt(br.readLine());
		int[] numArr = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < M; i++) {
			if (st.hasMoreTokens()) {
				numArr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < M; i++) {
			int result = binarySearch(numArr[i], card);
			System.out.print(result + " ");
		}
	}
}