import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                idx++;
            }
        }
        if(idx == 0) {
           int answer[] = {-1};
           return answer;
        }
        
        int[] answer = new int[idx];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[j] = arr[i];
                j++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}