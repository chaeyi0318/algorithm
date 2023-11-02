import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                answer.add(i);
            }
        }
        return answer;
    }
}