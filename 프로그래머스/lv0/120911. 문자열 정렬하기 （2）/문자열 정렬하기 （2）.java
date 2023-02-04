import java.util.*;

class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] ch = str.toCharArray();
        
        Arrays.sort(ch);
        
        return String.valueOf(ch);
    }
}