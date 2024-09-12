import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Solution
{
    public static void main(String args[]) throws Exception
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int t = 1; t <= T; t++) {
    		int result = 0;
    		String[] str = br.readLine().split(" ");
    		
    		for (int i = 0; i < 10; i++) {
    			result += Integer.parseInt(str[i]);
    		}
    		result = Math.round((float)result / 10);
    		bw.write("#" + t + " " + result + "\n");
    	}
    	bw.close();
    }
}