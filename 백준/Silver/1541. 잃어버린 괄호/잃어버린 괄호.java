import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        
        String str = br.readLine();
        String[] split = str.split("-");

        for (String s : split) {
            int sum = 0;
            String[] split1 = s.split("\\+");
            
            for (String sp : split1) {
                sum += Integer.parseInt(sp);
            }
            list.add(sum);
        }

        long answer = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            answer -= list.get(i);
        }
        System.out.println(answer);
        br.close();
    }
}