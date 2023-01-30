import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int tmp = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                arrayList.add(arr[i]);
                tmp = arr[i];
            }
        }
        
       int[] answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}