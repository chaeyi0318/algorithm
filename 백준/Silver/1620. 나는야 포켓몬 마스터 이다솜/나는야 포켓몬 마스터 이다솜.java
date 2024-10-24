import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<String, Integer> pokemonName = new HashMap<>();
		HashMap<Integer, String> pokemonNum = new HashMap<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			pokemonName.put(name, i);
			pokemonNum.put(i, name);
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if (str.matches("[+-]?\\d*(\\.\\d+)?")) {
				int num = Integer.parseInt(str);
				
				sb.append(pokemonNum.get(num)).append("\n");
			} else {
				sb.append(pokemonName.get(str)).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
