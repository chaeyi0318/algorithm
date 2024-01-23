import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[3];
		int[] arr2 = new int[3];
		int[] arr3 = new int[3];
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for(int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 0; j < 3; j++) {
				arr2[j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 2; j >= 0; j--) {
				if(arr2[j] < arr[j]) {
					arr2[j - 1] -= 1;
					arr2[j] += 60;
				}
				arr3[j] = arr2[j] - arr[j];
			}

			for(int j = 0; j < 3; j++) {
				System.out.print(arr3[j] + " ");
			}
			System.out.println();
		}
	}

}