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
    		String[] num = br.readLine().split(" ");
    		
    		int num1 = Integer.parseInt(num[0]);
    		int num2 = Integer.parseInt(num[1]);

    		if (num1 > num2) {
    			bw.write("#" + t + " >\n");
    		} else if (num1 == num2) {
    			bw.write("#" + t + " =\n");
    		} else {
    			bw.write("#" + t + " <\n");
    		}
    	}
    	bw.close();
    }
}