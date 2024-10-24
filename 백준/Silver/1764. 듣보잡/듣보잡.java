import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> nameSet = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			nameSet.add(br.readLine());
		}
		
		ArrayList<String> nameList = new ArrayList<>();
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if (nameSet.contains(str)) {
				nameList.add(str);
			}
		}
		System.out.println(nameList.size());
		
		Collections.sort(nameList);
		
		for (String name : nameList) {
			System.out.println(name);
		}
	}
}
