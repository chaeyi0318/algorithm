import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");

        Arrays.sort(str, Collections.reverseOrder());

        String s = "";

        for (int i = 0; i < str.length; i++) {
            s += str[i];
        }
        return Long.parseLong(s);
    }
}