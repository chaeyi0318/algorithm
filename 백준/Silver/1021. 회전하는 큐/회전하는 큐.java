import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> Deq = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			Deq.add(i);
		}
        
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
        
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(Deq.getFirst() != num) {
				if(Deq.indexOf(num) <= (Deq.size() / 2)) {
					Deq.addLast(Deq.getFirst());
					Deq.removeFirst();
				}else {
					Deq.addFirst(Deq.getLast());
					Deq.removeLast();
				}
				count++;
			}

			if(Deq.getFirst() == num) {
				Deq.removeFirst();
			}
		}
		System.out.println(count);
	}

}