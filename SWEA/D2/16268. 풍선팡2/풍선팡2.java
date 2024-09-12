import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[][] dxy = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int t = 1; t <= T; t++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int N = Integer.parseInt(st.nextToken());
    		int M = Integer.parseInt(st.nextToken());
    		
    		int[][] board = new int[N][M];
    		
    		for (int i = 0; i < board.length; i++) {
    			st = new StringTokenizer(br.readLine());
    			for (int j = 0; j < board[0].length; j++) {
    				board[i][j] = Integer.parseInt(st.nextToken());
    			}
    		}
    		
    		int result = 0;
    		
    		for (int i = 0; i < N; i++) {
    			for (int j = 0; j < M; j++) {
    				int cnt = board[i][j];
    				for (int d = 0; d < 4; d++) {
    					int nx = i + dxy[d][0];
    					int ny = j + dxy[d][1];
    					
    					if (0 <= nx && nx < N && 0 <= ny && ny < M) {
    						cnt += board[nx][ny];
    					}
    				}
    				if (result < cnt) {
    					result = cnt;
    				}
    			}
    		}
    		bw.write("#" + t + " " + result + "\n");
    	}
    	bw.close();
    }
}