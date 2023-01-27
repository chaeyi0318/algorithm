import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String[] str = Long.toString(n).split("");

        Arrays.sort(str, Comparator.reverseOrder());

        String s = "";
        
        for (int i = 0; i < str.length; i++) {
            s += str[i];
            answer = Long.parseLong(s);
        }
        return answer;
    }
}