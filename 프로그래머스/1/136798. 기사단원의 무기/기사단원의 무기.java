import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= number; i++) {
            int count = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            list.add(count);
            
            if (list.get(i - 1) > limit) {
                answer += power;
            } else {
                answer += list.get(i - 1);
            }
        }
        
        return answer;
    }
}