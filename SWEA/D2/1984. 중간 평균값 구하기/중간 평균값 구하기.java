import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int t = 1; t <= T; t++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int[] arr = new int[10];
    		
    		for (int i = 0; i < 10; i++) {
    			arr[i] = Integer.parseInt(st.nextToken());
    		}
    		Arrays.sort(arr);
    		
    		int sum = 0;
    		
    		for (int i = 1; i < 9; i++) {
    			sum += arr[i];
    		}
    		
    		int result = (int) Math.round(sum / 8.0);
    		
    		bw.write("#" + t + " " + result + "\n");
    	}
    	bw.close();

    }
}