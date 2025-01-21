import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		for(int i = 3; i < 10; i++) {
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[n - 1]);
		}
	}

}