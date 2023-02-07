import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList();
        
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                arr.add((int) my_string.charAt(i) - '0');
            }
        }
        
        Collections.sort(arr);
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}