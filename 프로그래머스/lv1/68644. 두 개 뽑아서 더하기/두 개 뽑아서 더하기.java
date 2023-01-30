import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(arrayList.contains(numbers[i] + numbers[j])) {
                    continue;
                } else {
                    arrayList.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        answer = new int[arrayList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}