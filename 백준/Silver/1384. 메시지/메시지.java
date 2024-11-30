import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		
		while(true) {
			
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			String[][] arr = new String[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = st.nextToken();
				}
			}
			
			System.out.println("Group " + num);
			
			int count = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j].equals("N")) {
						if(i < j) {
							System.out.println(arr[n - (j - i)][0] + " was nasty about " + arr[i][0]);
						}else {
							System.out.println(arr[i - j][0] + " was nasty about " + arr[i][0]);
						}
						count = 1;
					}
				}
			}
			num++;

			if(count == 0) {
				System.out.println("Nobody was nasty");
			}
			System.out.println();
		}
	}

}