import java.util.*;

public class Solution {
    public int solution(int n) {
        long l = n;
        int answer = 0;

        while(l > 0) {
            answer += l % 10;
            l /= 10;
        }
        return answer;
    }
}